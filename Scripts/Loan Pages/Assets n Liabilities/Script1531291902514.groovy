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

//Employment Details
WebUI.click(findTestObject('Object Repository/Loan Pages/Assets n Liabilities/Assets n Liabilites Tab'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next (1)'))

WebUI.click(findTestObject('Loan Pages/Assets n Liabilities/input_loan_application_b_curre'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next (1)'))

WebUI.click(findTestObject('Loan Pages/Assets n Liabilities/input_loan_application_b_recen_1'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next (1)'))

WebUI.setText(findTestObject('Loan Pages/Assets n Liabilities/input_loan_applicationb_assets'), 'Admac')

WebUI.selectOptionByValue(findTestObject('Loan Pages/Assets n Liabilities/select_Savings AccountChecking'), 
    'stock', true)

WebUI.doubleClick(findTestObject('Loan Pages/Assets n Liabilities/input_loan_applicationb_assets_1'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next (1)'))

WebUI.click(findTestObject('Loan Pages/Assets n Liabilities/input_loan_application_b_ongoi'))

WebUI.click(findTestObject('Loan Pages/Employment Details/button_Next (1)'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Loan Pages/Assets n Liabilities/button_Back'), 
    3, FailureHandling.OPTIONAL)

