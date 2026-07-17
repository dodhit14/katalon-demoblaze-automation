package common

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class BrowserKeyword {

    @Keyword
    def openWebsite() {

        WebUI.openBrowser('')

        WebUI.navigateToUrl('https://www.demoblaze.com')

    }

    @Keyword
    def closeWebsite() {

        WebUI.closeBrowser()

    }

}