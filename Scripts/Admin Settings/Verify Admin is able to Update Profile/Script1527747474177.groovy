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

CustomKeywords.'com.common.util.LoginHelper.LoginWithAdmin'()

WebUI.waitForPageLoad(10)
WebUI.click(findTestObject('Admin Settings/Admin settings dropdown/Top_User name'))

WebUI.click(findTestObject('Admin Settings/Admin settings dropdown/Profile'))

WebUI.setText(findTestObject('Admin Settings/AdminProfile/input_userfirst_name'), 'Kalyani')

WebUI.setText(findTestObject('Admin Settings/AdminProfile/input_userlast_name'), 'Admin')

WebUI.setText(findTestObject('Admin Settings/AdminProfile/input_useremail'), 'kkachhi+admin@roostify.com')

WebUI.setText(findTestObject('Admin Settings/AdminProfile/input_usermobile_phone'),'4567890983')

WebUI.setText(findTestObject('Admin Settings/AdminProfile/input_userhome_phone'),'5431234563')

WebUI.click(findTestObject('Admin Settings/AdminProfile/button_Save'))

WebUI.verifyElementPresent(findTestObject('Admin Settings/AdminProfile/msg_Changes successfully saved'),5)

WebUI.sendKeys(findTestObject('Object Repository/Admin Settings/AdminProfile/button_Upload Profile Photo'), 'D:/1_Roostify/images/pic2.jpg')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin Settings/AdminProfile/msg_User photo upload successful'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()