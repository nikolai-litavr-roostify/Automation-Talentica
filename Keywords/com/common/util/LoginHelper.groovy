package com.common.util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI


public class LoginHelper {
	@Keyword
	public void loginWith(String email,String password,String fname,String lname) {
		WebUI.openBrowser(GlobalVariable.BaseURL)
		WebUI.maximizeWindow()
		WebUI.waitForPageLoad(10)
		WebUI.setText(findTestObject('Common/Sign In/input_useremail'), email)
		WebUI.setText(findTestObject('Common/Sign In/input_userpassword'), password)
		WebUI.click(findTestObject('Common/Sign In/button_Sign in'))
		if(WebUI.verifyElementPresent(findTestObject('Common/Sign In/div_Login_Popup'), 5,FailureHandling.OPTIONAL)) {

			WebUI.click(findTestObject('Common/Sign In/button_Close_popup'))
		}

		WebUI.waitForElementPresent(findTestObject('Common/Sign In/text_Dashboard Name'), 5)
		WebUI.verifyElementPresent(findTestObject('Common/Sign In/text_Dashboard Name'), 5)
		/*String dashboardName= WebUI.getText(findTestObject('Common/Sign In/text_Dashboard Name'))
		 String fullName=WebUI.concatenate([fname, ' ', lname] as String[], FailureHandling.STOP_ON_FAILURE)
		 WebUI.verifyMatch(dashboardName, fullName, true)*/
	}


	@Keyword
	public void LoginWithAdmin() {
		loginWith(GlobalVariable.AdminEmail,GlobalVariable.Password,GlobalVariable.AdminFirstName, GlobalVariable.AdminLastName)
	}
}