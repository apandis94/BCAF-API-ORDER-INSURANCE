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

calculate_ME = WS.sendRequest(findTestObject('Sprint 4/API/Kalkulasi_PS', [('mid') : i_mid, ('merk') : c_merk, ('model') : c_model
            , ('status') : c_status ,('type') : c_type, ('tujuan') : c_tujuan, ('thnkendaraan') : c_thnkendaraan, ('packet') : c_packet, ('otr') : c_otr
            , ('dp_percent') : c_dp_percent, ('adm_fee') : c_adm_fee, ('residual') : c_residual, ('tenor') : c_tenor, ('flat_rate') : c_flat_rate
            , ('eff_rate') : c_eff_rate, ('life_ins_branch') : c_life_ins_branch, ('life_ins_company') : c_life_ins_company
            , ('car_ins_branch') : c_car_ins_branch, ('life_ins_company') : c_life_ins_company, ('provisi_fee') : c_provisi_fee
            , ('adm_fee_combo') : c_adm_fee_combo, ('provisi_fee_combo') : c_provisi_fee_combo, ('carins_fee_combo') : c_carins_fee_combo
            , ('lifeins_fee_combo') : c_lifeins_fee_combo, ('lifeins_combo') : c_lifeins_combo]))

'verify response status code api calculate ME'
WS.verifyResponseStatusCode(calculate_ME, 200)

'show response to report in test suite'
response = calculate_ME.getResponseText()

KeywordUtil.markPassed('result kalkulasi data : ' + no)

'verifikasi response field jumlah pokok pinjaman'
WS.verifyElementPropertyValue(calculate_ME, 'GetKalkulasiResponse.JumlahPokokPinjaman', t_principal, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi response field total interest'
WS.verifyElementPropertyValue(calculate_ME, 'GetKalkulasiResponse.TotalInterest', t_total_interest, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi response field car insurance'
WS.verifyElementPropertyValue(calculate_ME, 'GetKalkulasiResponse.TotalInsurance', t_car_ins, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi response field car insurance fee'
WS.verifyElementPropertyValue(calculate_ME, 'GetKalkulasiResponse.AdminInsCar', t_adm_car_ins, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi response field life insurance'
WS.verifyElementPropertyValue(calculate_ME, 'GetKalkulasiResponse.JumlahAsuransiJiwa', t_life_ins, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi response field life insurance fee'
WS.verifyElementPropertyValue(calculate_ME, 'GetKalkulasiResponse.AdminInsLife', t_adm_life_ins, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi response field biaya proses pembiayaan'
WS.verifyElementPropertyValue(calculate_ME, 'GetKalkulasiResponse.BiayaProses', t_biaya_proses, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi response field instalment'
WS.verifyElementPropertyValue(calculate_ME, 'GetKalkulasiResponse.AngsuranPerbulan', t_instalment, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi response field rounded instalment'
WS.verifyElementPropertyValue(calculate_ME, 'GetKalkulasiResponse.RoundedInstallment', t_rounded_instalment, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi response field first payment'
WS.verifyElementPropertyValue(calculate_ME, 'GetKalkulasiResponse.FirstPayment', t_first_payment, FailureHandling.CONTINUE_ON_FAILURE)

KeywordUtil.logInfo("$response")


'store json response to variable'
def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(reqdata.getResponseBodyContent())

def reqid_kons = result.data.requestid1

def reqid_spouse = result.data.requestid2

println('requestid kons : ' + reqid_kons)

'store var to global variable'
GlobalVariable.response_searchME_kons = reqid_kons

GlobalVariable.response_searchME_spouse = reqid_spouse

println('kons req id is :' + GlobalVariable.response_searchME_kons)

println('spouse req id is : ' + GlobalVariable.response_searchME_spouse)

'verify response status code'
WS.verifyResponseStatusCode(reqdata, 200)

'show response to report in test suite'
response = reqdata.getResponseText()

KeywordUtil.logInfo("$response")

WS.delay(10)

'Engine Scoring - inquiry scoring result from req_id'
scoring = WS.sendRequest(findTestObject('EngineScore', [('response_searchME_kons') : GlobalVariable.response_searchME_kons
			, ('response_searchME_spouse') : GlobalVariable.response_searchME_spouse]))

'verify response status code'
WS.verifyResponseStatusCode(scoring, 200)

'show response to report in test suite'
response2 = scoring.getResponseText()

KeywordUtil.markPassed('result service data ke : ' + no)

KeywordUtil.logInfo("$response2")

'verify final result scoring'
WS.verifyElementPropertyValue(scoring, 'Final_result', final_result)

