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

WebUI.openBrowser('gmail.com')
WebUI.setText(findTestObject('Common/Gmail/input_email'), GlobalVariable.GmailEmail)
WebUI.click(findTestObject('Common/Gmail/Next button email'))
WebUI.waitForPageLoad(5)
def element=findTestObject('Common/Gmail/Next button email')
waitElement(element, 3)
WebUI.waitForElementClickable(findTestObject('Common/Gmail/input_password'), 5)
WebUI.setText(findTestObject('Common/Gmail/input_password'), GlobalVariable.GmailPassword)
WebUI.waitForElementClickable(findTestObject('Common/Gmail/Next button pwd'), 5)
WebUI.click(findTestObject('Common/Gmail/Next button pwd'))
WebUI.waitForPageLoad(5)

public boolean waitElement(def element, def seconds) {
	int t = 0

	while (t < seconds) {
		if (WebUI.waitForElementVisible(element, seconds,FailureHandling.CONTINUE_ON_FAILURE)) {
			return true
		} else {
			Thread.sleep(100)
			t++
			continue
		}
	}

	System.out.println(((('waited for ' + seconds) + 'seconds. But couldn\'t find ') + element) + ' in the element specified')

	return false
}
