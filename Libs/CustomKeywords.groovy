
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject


def static "com.common.util.LoginHelper.loginWith"(
    	String email	
     , 	String password	
     , 	String fname	
     , 	String lname	) {
    (new com.common.util.LoginHelper()).loginWith(
        	email
         , 	password
         , 	fname
         , 	lname)
}

def static "com.common.util.LoginHelper.LoginWithAdmin"() {
    (new com.common.util.LoginHelper()).LoginWithAdmin()
}

def static "com.common.util.refreshBrowser.refreshPage"() {
    (new com.common.util.refreshBrowser()).refreshPage()
}

def static "com.common.util.refreshBrowser.clickElement"(
    	TestObject to	) {
    (new com.common.util.refreshBrowser()).clickElement(
        	to)
}

def static "com.common.util.refreshBrowser.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new com.common.util.refreshBrowser()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "com.common.util.waitForElement.waitForEle"(
    	Object element	
     , 	Object seconds	) {
    (new com.common.util.waitForElement()).waitForEle(
        	element
         , 	seconds)
}
