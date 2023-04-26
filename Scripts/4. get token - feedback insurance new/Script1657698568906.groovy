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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

token = WS.sendRequest(findTestObject('1. Get-Token'))

'store json response to variable'
def slurper = new groovy.json.JsonSlurper()

def get_token = slurper.parseText(token.getResponseBodyContent())

'define / field api'
def private_token = get_token.access_token

'store var to global variable'
GlobalVariable.global_token = private_token

println('token is :' + GlobalVariable.global_token)

'show response to report in test suite'
response_token = token.getResponseText()

KeywordUtil.logInfo("$response_token")

feedback = WS.sendRequest(findTestObject('4. Feedback-ins2', [('s_key') : GlobalVariable.global_token, ('batchid') : batchid
            , ('norek') : norek, ('nopin') : nopin, ('custname') : custname, ('pemohon') : pemohon, ('branchid') : branchid
            , ('ins_val') : ins_val, ('merk') : merk, ('type') : type, ('jenis_mobil') : jenis_mobil, ('year') : year, ('warna') : warna
            , ('no_rangka') : no_rangka, ('no_mesin') : no_mesin, ('nopol') : nopol, ('nama_bpkb') : nama_bpkb, ('perluasan') : perluasan
            , ('acc') : acc, ('tjh_header') : tjh_header, ('tjh_val') : tjh_val, ('amount2') : amount2, ('text2') : text2
            , ('purpose') : purpose, ('ins_type') : ins_type, ('kondisi') : kondisi, ('ins_from') : ins_from, ('ins_to') : ins_to
            , ('polis_no') : polis_no, ('rate') : rate, ('gross_premi') : gross_premi, ('discount') : discount
            , ('adm') : adm, ('net_premi') : net_premi, ('polis_year') : polis_year, ('tjh') : tjh, ('rscc') : rscc, ('banjir') : banjir
            , ('cbg_maskapai') : cbg_maskapai, ('batchid2') : batchid2
            , ('norek2') : norek2, ('nopin2') : nopin2, ('custname2') : custname2, ('pemohon2') : pemohon2, ('branchid2') : branchid2
            , ('ins_val2') : ins_val2, ('merk2') : merk2, ('type2') : type2, ('jenis_mobil2') : jenis_mobil2, ('year2') : year2, ('warna2') : warna2
            , ('no_rangka2') : no_rangka2, ('no_mesin2') : no_mesin2, ('nopol2') : nopol2, ('nama_bpkb2') : nama_bpkb2, ('perluasan2') : perluasan2
            , ('acc') : acc2, ('tjh_header2') : tjh_header2, ('tjh_val2') : tjh_val2, ('amount22') : amount22, ('text22') : text22
            , ('purpose2') : purpose2, ('ins_type2') : ins_type2, ('kondisi2') : kondisi2, ('ins_from2') : ins_from2, ('ins_to2') : ins_to2
            , ('polis_no2') : polis_no2, ('rate2') : rate2, ('gross_premi2') : gross_premi2, ('discount2') : discount2
            , ('adm2') : adm2, ('net_premi2') : net_premi2, ('polis_year2') : polis_year2, ('tjh2') : tjh2, ('rscc2') : rscc2, ('banjir2') : banjir2
            , ('cbg_maskapai2') : cbg_maskapai2]))

'show response to report in test suite'
response_feedback = feedback.getResponseText()

KeywordUtil.markPassed((((('result feedback data : ' + no) + ' norek : ') + norek) + ' nopin : ') + nopin)

KeywordUtil.logInfo("$response_feedback")

WS.verifyElementPropertyValue(feedback, 'ResponseHeader.MessageName', 'Data Sudah Pernah Disubmit', FailureHandling.CONTINUE_ON_FAILURE)

