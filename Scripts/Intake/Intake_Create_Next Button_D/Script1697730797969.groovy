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

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Home Page - SDICMS/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Intake_Next_Deepika/Page_Login - SDICMS/input_Username_Username'), 'Dkarthikeyan')

WebUI.setEncryptedText(findTestObject('Object Repository/Intake_Next_Deepika/Page_Login - SDICMS/input_Password_Password'), 'aIXAl78w3oZthhrKd/GaoA==')

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Login - SDICMS/input_Change Password_ButtonSave'))

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Home Page - SDICMS/a_Module'))

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Home Page - SDICMS/a_Intake'))

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Intake Page - SDICMS/a_Create'))

WebUI.setText(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/input__ReceptionRegister.Reason_For_Visit'), 
    'Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/select_- Please select -Walk-inIJS-HubTelep_93781e'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/input__ReceptionRegister.Visit_Date'))

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/a_23'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/select_- Please select -Internal ReferralEx_4caf57'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/input__Person.First_Name'), 'RED')

WebUI.setText(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/input__Person.Last_Name'), 'MNU')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/select_- Please select -Permanent ResidentR_c0f2b7'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/input_ID Number_Person.Identification_Number'), 
    'V56879')

WebUI.setText(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/input__Person.Date_Of_Birth'), '10 Oct 2006')

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/select_- Please select -FemaleMale'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/select_- Please select -AfghanAlbanianAlger_539764'), 
    '20', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/select_- Please select -AfarAfrikaansAkanAm_65536a'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/select_- Please select -BisexualGayHetero S_d0c270'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/select_- Please select -AnyAsianBlackColour_ee2822'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/select_- Please select -DivorcedLiving with_a7bd96'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/input__chosen-search-input default'))

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/li_Developmental Disability'))

WebUI.click(findTestObject('Intake_Passport1_Deepika/Page_Create Person - SDICMS/input__chosen-search-input default valid'))

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/li_Asperger Syndrome'))

WebUI.takeScreenshotAsCheckpoint('The user view the Next button')

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/a_Next'))

WebUI.setText(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/input_Phone Number_Person.Phone_Number'), 
    '012345678')

WebUI.takeScreenshotAsCheckpoint('The user navigating to the next page by clicking next button')

WebUI.click(findTestObject('Object Repository/Intake_Next_Deepika/Page_Create Person - SDICMS/a_Log off'))

WebUI.closeBrowser()

