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

CustomKeywords.'common.BrowserKeyword.openWebsite'()

//Form Login
CustomKeywords.'common.AuthentificationKeyword.submitForm'(

	findTestObject('Login/btn_Login_Menu'),
	
	findTestObject('Login/form_Sigin'),
	
	findTestObject('Object Repository/Login/txt_Username'),
	
	findTestObject('Object Repository/Login/txt_Password'),
	
	findTestObject('Login/btn_Login'),
	
	username,
	
	password
)

// Verify Response
if (resultType == 'SUCCESS') {
    WebUI.verifyElementVisible(findTestObject('Login/btn_Welcome_User'))

    String actualWelcome = WebUI.getText(
		findTestObject('Login/btn_Welcome_User')
	)

    WebUI.verifyMatch(actualWelcome, expected, false)
} else {
	
    	CustomKeywords.'common.AlertKeyword.verifyBrowserAlert'(expected)
}

CustomKeywords.'common.BrowserKeyword.closeWebsite'()

