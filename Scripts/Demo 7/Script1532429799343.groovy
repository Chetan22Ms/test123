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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/input_txtUsername'), 'Admin')

WebUI.click(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/input_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/input_Submit'))

WebUI.click(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/b_Recruitment'))

WebUI.click(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/input_btnSrch'))

WebUI.click(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/input_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/input_addCandidatefirstName'), 'MS123')

WebUI.setText(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/input_addCandidatelastName'), '456')

WebUI.setText(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/input_addCandidateemail'), 'MS@slk.com')

WebUI.setText(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/textarea_addCandidatecomment'), 'Demo purpose')

WebUI.click(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/input_btnSave'))

WebUI.click(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/a_Candidates'))

WebUI.click(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/a_MS123  456'))

WebUI.doubleClick(findTestObject('Object Repository/Validation_Demo 7/Page_OrangeHRM/textarea_Demo purpose'))

