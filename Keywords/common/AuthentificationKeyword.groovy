package common

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class AuthentificationKeyword {
	
	@Keyword
	def submitForm(
		TestObject menuButton,
		TestObject modal,
		TestObject usernameField,
		TestObject passwordField,
		TestObject submitButton,
		String username,
		String password
	) {
		WebUI.click(menuButton)
		
		WebUI.verifyElementVisible(modal)
		
		WebUI.setText(usernameField, username)
		
		WebUI.setText(passwordField, password)
		
		WebUI.click(submitButton)
	};
	
	@Keyword
	def loginForm(
		String username,
		String password
	) {
		submitForm(
			findTestObject('Login/btn_Login_Menu'),
			
			findTestObject('Login/form_Sigin'),
			
			findTestObject('Object Repository/Login/txt_Username'),
			
			findTestObject('Object Repository/Login/txt_Password'),
			
			findTestObject('Login/btn_Login'),
			
			username,
			
			password
		)		
	}
	
	@Keyword 
	def registerForm(
		String username,
		String password
	) {
		submitForm(
			findTestObject('Register/btn_SignUp_Menu'),

			findTestObject('Register/Form_SignUp'),
		
			findTestObject('Register/txt_Username'),
		
			findTestObject('Register/txt_Password'),
		
			findTestObject('Register/btn_SigUp'),
			
			username,
			
			password
		)
	}
}
