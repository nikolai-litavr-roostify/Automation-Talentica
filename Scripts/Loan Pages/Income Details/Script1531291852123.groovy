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

//Income Details
WebUI.click(findTestObject('Object Repository/Loan Pages/Income Details/Income Tab'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Loan Pages/Income Details/button_Next'))

WebUI.setText(findTestObject('Loan Pages/Income Details/input_loan_applicationb_employ'), '55500')

WebUI.click(findTestObject('Loan Pages/Income Details/button_Next'))

WebUI.setText(findTestObject('Loan Pages/Income Details/input_loan_applicationb_income'), '5555')

WebUI.click(findTestObject('Loan Pages/Income Details/button_Next'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Loan Pages/Income Details/button_Back'), 
    3, FailureHandling.OPTIONAL)

