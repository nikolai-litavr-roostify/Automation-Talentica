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

//Borrower Details
WebUI.click(findTestObject('Loan Pages/Borrower Details/button_Continue'))

WebUI.click(findTestObject('Loan Pages/Borrower Details/button_Next'))

WebUI.setText(findTestObject('Loan Pages/Borrower Details/input_Primary_Phone'), '3456789324')

WebUI.click(findTestObject('Loan Pages/Borrower Details/button_Next'))

WebUI.selectOptionByValue(findTestObject('Loan Pages/Borrower Details/select_Birth_Month'), '10', true)

WebUI.selectOptionByValue(findTestObject('Loan Pages/Borrower Details/select_Birth_Date'), '6', true)

WebUI.selectOptionByValue(findTestObject('Loan Pages/Borrower Details/select_Birth_Year'), '1990', true)

WebUI.click(findTestObject('Loan Pages/Borrower Details/button_Next'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Loan Pages/Borrower Details/input_Address1'), '452 Holly Lane  Hopewell')

WebUI.setText(findTestObject('Loan Pages/Borrower Details/input_Address2'), 'Hopewell')

WebUI.selectOptionByValue(findTestObject('Loan Pages/Borrower Details/select_State'), 'VT', true)

WebUI.setText(findTestObject('Loan Pages/Borrower Details/input_Zipcode'), '23860')

WebUI.selectOptionByValue(findTestObject('Loan Pages/Borrower Details/select_Month_Starting_from'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Loan Pages/Borrower Details/select_Year_Starting_from'), '2016', 
    true)

WebUI.click(findTestObject('Loan Pages/Borrower Details/button_Yes'))

WebUI.click(findTestObject('Loan Pages/Borrower Details/button_Next'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Loan Pages/Borrower Details/checkbox_other_mailing_address'))

//WebUI.click(findTestObject('Loan Pages/Borrower Details/checkbox_other_mailing_address'))
WebUI.click(findTestObject('Loan Pages/Borrower Details/button_Next'))

WebUI.click(findTestObject('Loan Pages/Borrower Details/checkbox_has_coborrower'))

WebUI.click(findTestObject('Loan Pages/Borrower Details/button_Next'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Loan Pages/Borrower Details/button_Back'), 
    3, FailureHandling.OPTIONAL)

