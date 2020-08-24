import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLSTG)

WebUI.click(findTestObject('Object Repository/STG_Test_Objects/Page_Rappi Colombia Entregas a domicilio en_39be2d/div_Pide en Supermercados Restaurantes y mu_9220dd'))

WebUI.setText(findTestObject('Object Repository/STG_Test_Objects/Page_Rappi Colombia Entregas a domicilio en_39be2d/input_Pide en Supermercados Restaurantes y _bdfb2b'), 
    'ave')

WebUI.click(findTestObject('Object Repository/STG_Test_Objects/Page_Rappi Colombia Entregas a domicilio en_39be2d/p_Avenida Boyac Bogota Colombia'))

WebUI.click(findTestObject('Object Repository/STG_Test_Objects/Page_Rappi Colombia Entregas a domicilio en_39be2d/button_Buscar'))

WebUI.closeBrowser()

