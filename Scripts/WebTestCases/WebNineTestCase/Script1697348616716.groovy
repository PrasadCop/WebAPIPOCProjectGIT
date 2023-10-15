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

WebUI.navigateToUrl('https://webdriveruniversity.com/')

WebUI.click(findTestObject('Object Repository/WebOR/Page_WebDriverUniversity.com/h1_CONTACT US'))

WebUI.switchToWindowTitle('WebDriver | Contact Us')

WebUI.setText(findTestObject('Object Repository/WebOR/Page_WebDriver  Contact Us/input_CONTACT US_first_name'), 'TestName')

WebUI.setText(findTestObject('Object Repository/WebOR/Page_WebDriver  Contact Us/input_CONTACT US_last_name'), 'TestLastName')

WebUI.click(findTestObject('Object Repository/WebOR/Page_WebDriver  Contact Us/input_CONTACT US_email'))

WebUI.setText(findTestObject('Object Repository/WebOR/Page_WebDriver  Contact Us/input_CONTACT US_email'), 'testemail@gmail.com')

WebUI.setText(findTestObject('Object Repository/WebOR/Page_WebDriver  Contact Us/textarea_CONTACT US_message'), 'TESTING KATALON')

WebUI.verifyElementPresent(findTestObject('Object Repository/WebOR/Page_Gianni Bruno - Designer/h1_Thank You for your Message'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/WebOR/Page_Gianni Bruno - Designer/h1_Thank You for your Message'))

WebUI.closeBrowser()

