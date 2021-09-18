B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.7
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Dim ScrollView1 As ScrollView
	Dim Panel1 As Panel
	Dim lblBack As Label
	
	Dim OpenGalleryButton As Panel
	Dim Chooser As ContentChooser
	Dim rp As RuntimePermissions
	
	#if B4A
	Private tempImageFile As String = "tempimage.jpg"
	Private Provider As FileProvider
	Private ion As Object
	#Else If B4i
	Private Camera As Camera
	#end if
	
	Private ScanDocumentButton As Panel
	Private DocumentPropertiesButton As Panel
	Private SaveDocumentButton As Panel
	Private scanView As B4XView
	Private PropertiesPanel As Panel
	Private ScrollViewProperties As ScrollView
	
	Private OpenGalleryButton As Panel
	Private docID As EditText
	Private docName As EditText
	Private docType As EditText
	Private docExpiry As EditText
	Private SavePropertiesButton As Panel
	
	Dim documentID As String
	Dim documentName As String
	Dim documentType As String
	Dim documentExpiry As String
	
	'variable for BLOB (binary large object) operation'
	Dim bitMap As B4XBitmap
	Dim stringUtils As StringUtils
	Dim Buffer() As Byte
	Dim outputStream As OutputStream
	Dim imgStr As String
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("Header")
	lblBack.Visible=True
	Panel1.LoadLayout("scandocument")
	scanView.Visible=False
	PropertiesPanel.Visible = False
	#if B4A
	Provider.Initialize
	#Else If B4i
	Camera.Initialize("Camera", B4XPages.GetNativeParent(Me))
	#end if
	
End Sub

Sub lblBack_Click
	B4XPages.ClosePage(Me)
	scanView.SetBitmap(Null)
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub ScanDocumentButton_Click
	TakePicture (scanView.Width, scanView.Height)
	Wait For Image_Available(Success As Boolean, bmp As B4XBitmap)
	If Success Then
		PropertiesPanel.Visible = False
		scanView.Visible=True
		scanView.SetBitmap(bmp)
		bitMap = bmp
	End If
End Sub

#if B4A
Private Sub TakePicture (TargetWidth As Int, TargetHeight As Int)
	Dim i As Intent
	i.Initialize("android.media.action.IMAGE_CAPTURE", "")
	File.Delete(Provider.SharedFolder, tempImageFile)
	Dim u As Object = Provider.GetFileUri(tempImageFile)
	i.PutExtra("output", u) 'the image will be saved to this path
	Try
		StartActivityForResult(i)
		Wait For ion_Event (MethodName As String, Args() As Object)
		Dim bmp As B4XBitmap
		If -1 = Args(0) Then
			Try
				Dim in As Intent = Args(1)
				If File.Exists(Provider.SharedFolder, tempImageFile) Then
					Dim Exif As ExifData
					Exif.Initialize(Provider.SharedFolder, tempImageFile)
					bmp = LoadBitmapSample(Provider.SharedFolder, tempImageFile, Max(TargetWidth, TargetHeight), Max(TargetWidth, TargetHeight))
					Log("Orientation: " & Exif.getAttribute(Exif.TAG_ORIENTATION))
					Select Exif.getAttribute(Exif.TAG_ORIENTATION)
						Case Exif.ORIENTATION_ROTATE_180 '3
							bmp = bmp.Rotate(180)
						Case Exif.ORIENTATION_ROTATE_90 '6
							bmp = bmp.Rotate(90)
						Case Exif.ORIENTATION_ROTATE_270 '8
							bmp = bmp.Rotate(270)
					End Select
					bmp = bmp.Resize(TargetWidth, TargetHeight, True)
				Else If in.HasExtra("data") Then 'try to get thumbnail instead
					Dim jo As JavaObject = in
					bmp = jo.RunMethodJO("getExtras", Null).RunMethod("get", Array("data"))
				End If
			Catch
				Log(LastException)
			End Try
		End If
		CallSubDelayed3(Me, "Image_Available", bmp.IsInitialized, bmp)
	Catch
		ToastMessageShow("Camera is not available.", True)
		Log(LastException)
		CallSubDelayed3(Me, "Image_Available", False, Null)
	End Try
End Sub

Sub StartActivityForResult(i As Intent)
	Dim jo As JavaObject = Me
	jo = jo.RunMethod("getBA", Null)
	ion = jo.CreateEvent("anywheresoftware.b4a.IOnActivityResult", "ion", Null)
	jo.RunMethod("startActivityForResult", Array(ion, i))
End Sub
#else if B4i
Private Sub TakePicture (TargetWidth As Int, TargetHeight As Int)
	Camera.TakePicture
	Dim TopPage As String = B4XPages.GetManager.GetTopPage.Id
	Wait For Camera_Complete (Success As Boolean, Image As Bitmap, VideoPath As String)
	B4XPages.GetManager.mStackOfPageIds.Add(TopPage) 'this is required as the page will be removed from the stack when the external camera page appears.
	If Success Then
		Dim bmp As B4XBitmap = Image
		bmp.Resize(TargetWidth, TargetHeight, True)
		CallSubDelayed3(Me, "Image_Available", True, bmp)
	Else
		CallSubDelayed3(Me, "Image_Available", False, Null)
	End If
End Sub
#end if

Private Sub DocumentPropertiesButton_Click
	If PropertiesPanel.Visible == False Then
		PropertiesPanel.Visible = True
		ScrollViewProperties.Panel.LoadLayout("properties_panel")
	Else
		PropertiesPanel.Visible = False
	End If
End Sub



Private Sub SavePropertiesButton_Click
	'empty input check'
	If docName.Text="" Then
		MsgboxAsync("Please insert document name","Info")
		Return
	End If
	If docType.Text="" Then
		MsgboxAsync("Please insert document type", "Info")
		Return
	End If
	
	documentID = docID.Text
	documentName = docName.Text
	documentType = docType.Text
	documentExpiry = docExpiry.Text
	
	ToastMessageShow("properties saved", False)
	Log(documentID)
	Log(documentName)
	
	PropertiesPanel.Visible=False
End Sub

Sub saveBlob
	outputStream.InitializeToBytesArray(0)
	bitMap.WriteToStream(outputStream,100,"JPEG")
	outputStream.Close
	Buffer = outputStream.ToBytesArray
	imgStr = stringUtils.EncodeBase64(Buffer)
	Log(imgStr)
End Sub


Private Sub SaveDocumentButton_Click
	'empty input check'
	If documentName="" Then
		MsgboxAsync("Please insert document name properties","Info")
		Return
	End If
	If documentType="" Then
		MsgboxAsync("Please insert document type properties", "Info")
		Return
	End If
	'call saveBlob Sub'
	saveBlob
	'database write'
	MdlConnection.dbSQL.ExecNonQuery("INSERT INTO documents(DOCUMENT_ID, NAME, TYPE, EXPIRED, SCAN) VALUES('" & documentID & "','" & documentName& "','" & documentType & "','" & documentExpiry & "','" & imgStr & "')")
	ToastMessageShow("sucessfully saved document",False)
End Sub



Private Sub OpenGalleryButton_Click
	Log("clicked OpenGalleryButton")
	Chooser.Initialize("image_chooser")
	rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_STORAGE)
	Chooser.Show("image/*", "choose image")
End Sub

Sub image_chooser_Result (Success As Boolean, pDir As String, pFileName As String)
	Log("execute Chooser_Result")
	If Success = True Then
		Log("fileDir: " & pDir)
		Log("fileName: " & pFileName)
		
		Dim bmp As B4XBitmap
		Try
			bmp = LoadBitmapSample(pDir,pFileName, Max(scanView.Width, scanView.Height), Max(scanView.Width, scanView.Height))
			bmp = bmp.Resize(scanView.Width, scanView.Height, True)
			scanView.Visible = True
			scanView.SetBitmap(bmp)
			Log("success read image file")
		Catch
			Log(LastException)
		End Try
	Else
		ToastMessageShow("failed read image file",True)
	End If
End Sub