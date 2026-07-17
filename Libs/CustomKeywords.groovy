
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String



def static "common.AuthentificationKeyword.submitFormAuthentification"(
    	TestObject menuButton	
     , 	TestObject modal	
     , 	TestObject usernameField	
     , 	TestObject passwordField	
     , 	TestObject submitButton	
     , 	String username	
     , 	String password	) {
    (new common.AuthentificationKeyword()).submitFormAuthentification(
        	menuButton
         , 	modal
         , 	usernameField
         , 	passwordField
         , 	submitButton
         , 	username
         , 	password)
}


def static "common.BrowserKeyword.openWebsite"() {
    (new common.BrowserKeyword()).openWebsite()
}


def static "common.BrowserKeyword.closeWebsite"() {
    (new common.BrowserKeyword()).closeWebsite()
}


def static "common.AlertKeyword.verifyBrowserAlert"(
    	String expectedAlert	) {
    (new common.AlertKeyword()).verifyBrowserAlert(
        	expectedAlert)
}
