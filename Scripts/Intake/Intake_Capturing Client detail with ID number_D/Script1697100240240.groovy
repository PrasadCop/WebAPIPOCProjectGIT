import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testportal.dsd.gov.za/SDICMS_TEST/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Intake_ID_Deepika/Page_Home Page - SDICMS/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Intake_ID_Deepika/Page_Login - SDICMS/input_Username_Username'), 'Dkarthikeyan')

WebUI.setEncryptedText(findTestObject('Object Repository/Intake_ID_Deepika/Page_Login - SDICMS/input_Password_Password'), 
    'aIXAl78w3oZthhrKd/GaoA==')

WebUI.click(findTestObject('Object Repository/Intake_ID_Deepika/Page_Login - SDICMS/input_Change Password_ButtonSave'))

WebUI.click(findTestObject('Object Repository/Intake_ID_Deepika/Page_Home Page - SDICMS/a_Module'))

WebUI.click(findTestObject('Object Repository/Intake_ID_Deepika/Page_Home Page - SDICMS/a_Intake'))

WebUI.click(findTestObject('Object Repository/Intake_ID_Deepika/Page_Intake Page - SDICMS/a_Create'))

WebUI.setText(findTestObject('Object Repository/Intake_ID_Deepika/Page_Create Person - SDICMS/input__ReceptionRegister.Reason_For_Visit'), 
    'Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_ID_Deepika/Page_Create Person - SDICMS/select_- Please select -Walk-inIJS-HubTelep_93781e'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Intake_ID_Deepika/Page_Create Person - SDICMS/span__glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Object Repository/Intake_ID_Deepika/Page_Create Person - SDICMS/a_18'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_ID_Deepika/Page_Create Person - SDICMS/select_- Please select -Internal ReferralEx_4caf57'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Intake_ID_Deepika/Page_Create Person - SDICMS/input__Person.First_Name'), 
    'BAJABULISILE MEMORY')

WebUI.setText(findTestObject('Object Repository/Intake_ID_Deepika/Page_Create Person - SDICMS/input__Person.Last_Name'), 
    'MASUKU')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_ID_Deepika/Page_Create Person - SDICMS/select_- Please select -Permanent ResidentR_c0f2b7'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_ID_Deepika/Page_Create Person - SDICMS/select_Passport DocumentRSA ID Document'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Intake_ID_Deepika/Page_Create Person - SDICMS/input_ID Number_Person.Identification_Number'), 
    '8305060990087')

WebUI.takeScreenshotAsCheckpoint('The ID loaded successfully')

WebUI.click(findTestObject('Intake_ID_Deepika/Page_Create Person - SDICMS/input_Second Fingerprint_ButtonSave'))

WebUI.click(findTestObject('Intake_OR/Intake_Next_Deepika/Page_Create Person - SDICMS/a_Log off'))

WebUI.closeBrowser()

