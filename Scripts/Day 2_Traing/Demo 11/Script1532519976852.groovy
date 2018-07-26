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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html')

WebUI.click(findTestObject('Object Repository/Demo 11_EasySelenium/Page_Selenium Easy - Best Demo webs/a_Input Forms'))

WebUI.waitForElementPresent(findTestObject(null), 4)

WebUI.click(findTestObject('Object Repository/Demo 11_EasySelenium/Page_Selenium Easy - Best Demo webs/a_Select Dropdown List'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo 11_EasySelenium/Page_Selenium Easy Demo - Automate/select_Please select Sunday  M'), 
    'Sunday', true)

WebUI.click(findTestObject('Object Repository/Demo 11_EasySelenium/Page_Selenium Easy Demo - Automate/p_Day selected - Sunday'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo 11_EasySelenium/Page_Selenium Easy Demo - Automate/select_CaliforniaFloridaNew Je'), 
    'Ohio', true)

WebUI.click(findTestObject('Object Repository/Demo 11_EasySelenium/Page_Selenium Easy Demo - Automate/button_First Selected'))

