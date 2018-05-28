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

/*Create Loan Manually*/

CustomKeywords.'com.common.util.LoginHelper.LoginWithAdmin'()

WebUI.click(findTestObject('Admin Dashboard/Create Loan Manually/tab_Add Loan Manually'))

WebUI.waitForElementVisible(findTestObject('Admin Dashboard/Create Loan Manually/input_email'), 10)

WebUI.setText(findTestObject('Admin Dashboard/Create Loan Manually/input_email'), Email)

WebUI.setText(findTestObject('Admin Dashboard/Create Loan Manually/input_first_name'), FirstName)

WebUI.setText(findTestObject('Admin Dashboard/Create Loan Manually/input_last_name'), LastName)

WebUI.waitForElementVisible(findTestObject('Admin Dashboard/Create Loan Manually/button_create'), 10)

WebUI.click(findTestObject('Object Repository/Admin Dashboard/Create Loan Manually/button_create'))

WebUI.verifyElementPresent(findTestObject('Admin Dashboard/Create Loan Manually/msg_Loan created successfully'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(3)
