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

//Employment Details
WebUI.click(findTestObject('Object Repository/Loan Pages/Employment Details/Employment Tab'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.click(findTestObject('Loan Pages/Employment Details/input_loan_application_b_recen'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next'))

WebUI.setText(findTestObject('Loan Pages/Employment Details/input_loan_applicationb_employ'), 'Google')

WebUI.click(findTestObject('Loan Pages/Employment Details/button_No'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_No_1'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Salary'))

WebUI.selectOptionByValue(findTestObject('Loan Pages/Employment Details/select_MonthJanuaryFebruaryMar'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Loan Pages/Employment Details/select_Year2018201720162015201'), 
    '2009', true)

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Yes'))

WebUI.setText(findTestObject('Loan Pages/Employment Details/input_loan_applicationb_employ_1 (1)'), 
    'Engineer')

WebUI.setText(findTestObject('Loan Pages/Employment Details/input_loan_applicationb_employ_2 (1)'), 
    'NY')

//WebUI.selectOptionByValue(findTestObject('Loan Pages/Employment Details/select_AKALAZARCACOCTDEDCFLGAH'), 'NY', true)
WebUI.setText(findTestObject('Loan Pages/Employment Details/input_loan_applicationb_employ_3 (1)'), 
    '4567')

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next (1)'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Loan Pages/Employment Details/button_Back'), 
    3, FailureHandling.OPTIONAL)

