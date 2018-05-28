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

//Loan Details
WebUI.click(findTestObject('Object Repository/Loan Pages/Loan Details/Loan Tab'))

WebUI.waitForPageLoad(3)

WebUI.waitForElementClickable(findTestObject('Loan Pages/Loan Details/button_Next'), 2)

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next'))

WebUI.click(findTestObject('Loan Pages/Loan Details/input_home_purchase_checkbox'))

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Loan Pages/Loan Details/input_loan_application_lead_st'))

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next (1)'))

WebUI.selectOptionByValue(findTestObject('Loan Pages/Loan Details/select_State_Loan'), 'AL', true, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Loan Pages/Loan Details/input_loan_City'), 'vegas')

WebUI.waitForElementNotHasAttribute(findTestObject('Loan Pages/Loan Details/select_Country_Targetmarket'), 
    'disabled', 3)

WebUI.selectOptionByValue(findTestObject('Loan Pages/Loan Details/select_Country_Targetmarket'), '001', 
    true)

WebUI.sendKeys(findTestObject('Object Repository/Loan Pages/Loan Details/input_Ideal purchase price'), 
    '330000')

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next (1)'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Loan Pages/Loan Details/input_real estate agent check'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next (1)'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Loan Pages/Loan Details/input_Down Payment Percentage (1)'), '5', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next (1)'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Loan Pages/Loan Details/input_loan_application_mortgag'))

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next (1)'))

WebUI.click(findTestObject('Loan Pages/Loan Details/input_loan_application_loan_ty'))

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next (1)'))

WebUI.click(findTestObject('Loan Pages/Loan Details/input_loan_application_propert'))

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next (1)'))

WebUI.click(findTestObject('Loan Pages/Loan Details/input_loan_application_down_pa'))

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next (1)'))

WebUI.click(findTestObject('Loan Pages/Loan Details/input_loan_application_amortiz'))

WebUI.click(findTestObject('Loan Pages/Loan Details/button_Next (1)'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Loan Pages/Loan Details/button_Back'), 
    3, FailureHandling.OPTIONAL)

