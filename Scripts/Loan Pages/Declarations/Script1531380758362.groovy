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

WebUI.click(findTestObject('Object Repository/Loan Pages/Declaration/Declaration Tab'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Loan Pages/Declaration/button_Next'))

WebUI.click(findTestObject('Loan Pages/Declaration/input_loan_application_b_citiz'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_Next'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_No'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_No_1'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_No_2'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_No_3'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_Next'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_No_4'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_No_5'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_No_6'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_No_7'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_Next'))

WebUI.click(findTestObject('Loan Pages/Declaration/input_loan_application_b_hmda_'))

WebUI.click(findTestObject('Loan Pages/Declaration/input_loan_application_b_hmda__1'))

WebUI.click(findTestObject('Loan Pages/Declaration/input_loan_application_b_hmda__2'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_Next'))

WebUI.click(findTestObject('Loan Pages/Declaration/input_loan_applicationp1_b_ssn'))

WebUI.setText(findTestObject('Loan Pages/Declaration/input_loan_applicationp1_b_ssn'), '991')

WebUI.setText(findTestObject('Loan Pages/Declaration/input_loan_applicationp2_b_ssn'), '91')

WebUI.setText(findTestObject('Loan Pages/Declaration/input_loan_applicationp3_b_ssn'), '991')

WebUI.click(findTestObject('Loan Pages/Declaration/button_Next'))

WebUI.click(findTestObject('Loan Pages/Declaration/input_loan_application_b_allow'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_Next'))

WebUI.click(findTestObject('Loan Pages/Declaration/input_loan_application_b_estim'))

WebUI.click(findTestObject('Loan Pages/Declaration/button_Next'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Loan Pages/Declaration/button_Back'), 
    3, FailureHandling.OPTIONAL)

