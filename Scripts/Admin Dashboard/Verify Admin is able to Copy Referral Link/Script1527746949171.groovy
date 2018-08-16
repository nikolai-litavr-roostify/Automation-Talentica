import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


/*Copy Referral Link*/
//WebUI.callTestCase(findTestCase('Common/Sign In'), [('email') : GlobalVariable.AdminEmail, ('password') : GlobalVariable.Password],    FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'com.common.util.LoginHelper.LoginWithAdmin'()

WebUI.click(findTestObject('Admin Dashboard/Copy Referral Link/tab_Copy Referral Link'))

WebUI.takeScreenshot('D:\\copylinkscreenshot1.png')

String url = WebUI.getAttribute(findTestObject('Admin Dashboard/Copy Referral Link/copy_Referral_url'), 
    'Value')

System.out.println(url)

WebUI.takeScreenshot()

WebUI.waitForElementClickable(findTestObject('Admin Dashboard/Copy Referral Link/button_Close'), 3)

WebUI.click(findTestObject('Admin Dashboard/Copy Referral Link/button_Close'), FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

CustomKeywords.'com.common.util.refreshBrowser.refreshPage'()

WebUI.callTestCase(findTestCase('Common/Sign Out'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(url)

WebUI.waitForPageLoad(2)

