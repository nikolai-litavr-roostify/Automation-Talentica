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

WebUI.callTestCase(findTestCase('Admin Dashboard/Verify Admin is able to Copy Referral Link'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Sign Up'), [('Email') : GlobalVariable.BorrowerEmail1, ('FirstName') : GlobalVariable.Borrower1FirstName
        , ('LastName') : GlobalVariable.Borrower1LastName, ('Password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

/*Borrower Details*/
WebUI.callTestCase(findTestCase('Loan Pages/Borrower Details'), [:], FailureHandling.CONTINUE_ON_FAILURE)

/*Loan Details*/
WebUI.callTestCase(findTestCase('Loan Pages/Loan Details'), [:], FailureHandling.CONTINUE_ON_FAILURE)

/*Employment Details*/
WebUI.callTestCase(findTestCase('Loan Pages/Employment Details'), [:], FailureHandling.CONTINUE_ON_FAILURE)

/*Assets n Liabilities*/
WebUI.callTestCase(findTestCase('Loan Pages/Assets n Liabilities'), [:], FailureHandling.CONTINUE_ON_FAILURE)

/*Income Details*/
WebUI.callTestCase(findTestCase('Loan Pages/Income Details'), [:], FailureHandling.CONTINUE_ON_FAILURE)

/*Declarations*/
WebUI.callTestCase(findTestCase('Loan Pages/Declarations'), [:], FailureHandling.CONTINUE_ON_FAILURE)

/*Application Release*/
WebUI.callTestCase(findTestCase('Loan Pages/Application Release'), [:], FailureHandling.STOP_ON_FAILURE)

/*Econsent*/
WebUI.callTestCase(findTestCase('Loan Pages/Econsent page'), [:], FailureHandling.STOP_ON_FAILURE)

