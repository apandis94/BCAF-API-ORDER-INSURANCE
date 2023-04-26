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

order = WS.sendRequest(findTestObject('3. Get-data-order', [('s_key') : GlobalVariable.global_token, ('c_id') : c_id, ('order_date') : order_date
            , ('page') : page, ('rows') : rows]))

'show response to report in test suite'
get_order = order.getResponseText()

KeywordUtil.markPassed ('data ke : ' + no)

'verifikasi data loan'
WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].TipeOrder', o_tipeorder, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].BatchID', o_batchid, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].NoRek', o_norek, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].NoPin', o_nopin, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].CustName', o_custname, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Pemohon', o_pemohon, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].HargaPembelian', o_otr, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Cabang', o_branchid, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].MerkID', o_merk, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].TypeMobil', o_type, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].JenisMobil', o_jenis, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].TahunMobil', o_tahun, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Warna', o_warna, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].NoRangka', o_norangka, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].NoMesin', o_nomesin, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].NoPolisi', o_nopol, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].NamaBPKB', o_namabpkb, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].KategoriMobil', o_kategori, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].PenggunaanKendaraan', o_purpose, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Kondisi', o_kondisi, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Accessories1', o_acc1, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Accessories2', o_acc2, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Accessories3', o_acc3, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Accessories4', o_acc4, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Accessories5', o_acc5, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].HargaAccessories1', o_harga_acc1, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].HargaAccessories2', o_harga_acc2, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].HargaAccessories3', o_harga_acc3, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].HargaAccessories4', o_harga_acc4, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].HargaAccessories5', o_harga_acc5, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].OverKredit', o_overkredit, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Restructure', o_restructure, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].NoPolisLama', o_nopol_lama, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].MailAddress', o_mail_addr, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].KabKodya', o_kab_kodya, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].PostalCode', o_postal_code, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].PaketMobil', o_packet, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].CustType', o_cust_type, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].IdentityNo', o_nik, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].BirthPlace', o_birth_place, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].BirthDate', o_birth_date, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].Occupation', o_occp, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].AlamatKTP', o_ktp_addr, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].KelurahanKTP', o_ktp_kel, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].KecamatanKTP', o_ktp_kec, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].KabKodyaKTP', o_ktp_kabkodya, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].ProvinsiKTP', o_ktp_prov, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].PostalCodeKTP', o_ktp_postal_code, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].DealerName', o_ktp_dealer_name, FailureHandling.CONTINUE_ON_FAILURE)

'verifikasi tenor'
switch (tenor) {
    case '1':
	
	order2 = WS.sendRequest(findTestObject('3. Get-data-order', [('s_key') : GlobalVariable.global_token, ('c_id') : c_id, ('order_date') : order_date
				, ('page') : page, ('rows') : rows]))
	
	'show response to report in test suite'
	get_order2 = order.getResponseText()
	
        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].KondisiPertanggungan', 
            o_kond_pertanggungan_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].TJH', o_tjh_header_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredValue', o_ins_val_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredFrom', o_ins_form_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredTo', o_ins_to_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Rate', o_rate_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].GrossPremi', o_gross_premi_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Discount', o_discount_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Adm', o_adm_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].NetPremi', o_netpremi_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.TJH', 
            o_tjh_val_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.RSCC', 
            o_rscc_val_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Banjir', 
            o_rsmb_val_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Accessories', 
            o_acc_val_0, FailureHandling.CONTINUE_ON_FAILURE)

        break
    case '2':
	
	order2 = WS.sendRequest(findTestObject('3. Get-data-order', [('s_key') : GlobalVariable.global_token, ('c_id') : c_id, ('order_date') : order_date
				, ('page') : page, ('rows') : rows]))
	
	'show response to report in test suite'
	get_order2 = order.getResponseText()
	
        'verifikasi tenor 1'
        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].KondisiPertanggungan', 
            o_kond_pertanggungan_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].TJH', o_tjh_header_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredValue', o_ins_val_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredFrom', o_ins_form_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredTo', o_ins_to_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Rate', o_rate_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].GrossPremi', o_gross_premi_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Discount', o_discount_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Adm', o_adm_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].NetPremi', o_netpremi_0, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.TJH', 
            o_tjh_val_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.RSCC', 
            o_rscc_val_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Banjir', 
            o_rsmb_val_0, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Accessories', 
            o_acc_val_0, FailureHandling.CONTINUE_ON_FAILURE)

        'verifikasi tenor 2'
        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].KondisiPertanggungan', 
            o_kond_pertanggungan_1, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].TJH', o_tjh_header_1, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredValue', o_ins_val_1, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredFrom', o_ins_form_1, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredTo', o_ins_to_1, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Rate', o_rate_1, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].GrossPremi', o_gross_premi_1, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Discount', o_discount_1, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Adm', o_adm_1, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].NetPremi', o_netpremi_1, 
            FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.TJH', 
            o_tjh_val_1, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.RSCC', 
            o_rscc_val_1, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.Banjir', 
            o_rsmb_val_1, FailureHandling.CONTINUE_ON_FAILURE)

        WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.Accessories', 
            o_acc_val_1, FailureHandling.CONTINUE_ON_FAILURE)
break
	case '3':
	
	order2 = WS.sendRequest(findTestObject('3. Get-data-order', [('s_key') : GlobalVariable.global_token, ('c_id') : c_id, ('order_date') : order_date
				, ('page') : page, ('rows') : rows]))
	
	'show response to report in test suite'
	get_order2 = order.getResponseText()
	
	'verifikasi tenor 1'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].KondisiPertanggungan',
		o_kond_pertanggungan_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].TJH', o_tjh_header_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredValue', o_ins_val_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredFrom', o_ins_form_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredTo', o_ins_to_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Rate', o_rate_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].GrossPremi', o_gross_premi_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Discount', o_discount_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Adm', o_adm_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].NetPremi', o_netpremi_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.TJH',
		o_tjh_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.RSCC',
		o_rscc_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Banjir',
		o_rsmb_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Accessories',
		o_acc_val_0, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 2'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].KondisiPertanggungan',
		o_kond_pertanggungan_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].TJH', o_tjh_header_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredValue', o_ins_val_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredFrom', o_ins_form_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredTo', o_ins_to_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Rate', o_rate_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].GrossPremi', o_gross_premi_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Discount', o_discount_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Adm', o_adm_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].NetPremi', o_netpremi_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.TJH',
		o_tjh_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.RSCC',
		o_rscc_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.Banjir',
		o_rsmb_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.Accessories',
		o_acc_val_1, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 3'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].KondisiPertanggungan',
		o_kond_pertanggungan_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].TJH', o_tjh_header_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredValue', o_ins_val_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredFrom', o_ins_form_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredTo', o_ins_to_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Rate', o_rate_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].GrossPremi', o_gross_premi_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Discount', o_discount_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Adm', o_adm_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].NetPremi', o_netpremi_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.TJH',
		o_tjh_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.RSCC',
		o_rscc_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.Banjir',
		o_rsmb_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.Accessories',
		o_acc_val_2, FailureHandling.CONTINUE_ON_FAILURE)
break
	case '4':
	
	order2 = WS.sendRequest(findTestObject('3. Get-data-order', [('s_key') : GlobalVariable.global_token, ('c_id') : c_id, ('order_date') : order_date
				, ('page') : page, ('rows') : rows]))
	
	'show response to report in test suite'
	get_order2 = order.getResponseText()
	
	'verifikasi tenor 1'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].KondisiPertanggungan',
		o_kond_pertanggungan_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].TJH', o_tjh_header_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredValue', o_ins_val_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredFrom', o_ins_form_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredTo', o_ins_to_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Rate', o_rate_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].GrossPremi', o_gross_premi_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Discount', o_discount_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Adm', o_adm_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].NetPremi', o_netpremi_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.TJH',
		o_tjh_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.RSCC',
		o_rscc_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Banjir',
		o_rsmb_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Accessories',
		o_acc_val_0, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 2'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].KondisiPertanggungan',
		o_kond_pertanggungan_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].TJH', o_tjh_header_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredValue', o_ins_val_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredFrom', o_ins_form_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredTo', o_ins_to_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Rate', o_rate_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].GrossPremi', o_gross_premi_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Discount', o_discount_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Adm', o_adm_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].NetPremi', o_netpremi_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.TJH',
		o_tjh_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.RSCC',
		o_rscc_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.Banjir',
		o_rsmb_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.Accessories',
		o_acc_val_1, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 3'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].KondisiPertanggungan',
		o_kond_pertanggungan_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].TJH', o_tjh_header_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredValue', o_ins_val_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredFrom', o_ins_form_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredTo', o_ins_to_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Rate', o_rate_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].GrossPremi', o_gross_premi_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Discount', o_discount_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Adm', o_adm_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].NetPremi', o_netpremi_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.TJH',
		o_tjh_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.RSCC',
		o_rscc_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.Banjir',
		o_rsmb_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.Accessories',
		o_acc_val_2, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 4'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].KondisiPertanggungan',
		o_kond_pertanggungan_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].TJH', o_tjh_header_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].InsuredValue', o_ins_val_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].InsuredFrom', o_ins_form_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].InsuredTo', o_ins_to_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].Rate', o_rate_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].GrossPremi', o_gross_premi_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].Discount', o_discount_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].Adm', o_adm_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].NetPremi', o_netpremi_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.TJH',
		o_tjh_val_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.RSCC',
		o_rscc_val_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.Banjir',
		o_rsmb_val_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.Accessories',
		o_acc_val_3, FailureHandling.CONTINUE_ON_FAILURE)
break
	case '5':
	
	order2 = WS.sendRequest(findTestObject('3. Get-data-order', [('s_key') : GlobalVariable.global_token, ('c_id') : c_id, ('order_date') : order_date
				, ('page') : page, ('rows') : rows]))
	
	'show response to report in test suite'
	get_order2 = order.getResponseText()
	
	'verifikasi tenor 1'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].KondisiPertanggungan',
		o_kond_pertanggungan_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].TJH', o_tjh_header_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredValue', o_ins_val_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredFrom', o_ins_form_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredTo', o_ins_to_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Rate', o_rate_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].GrossPremi', o_gross_premi_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Discount', o_discount_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Adm', o_adm_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].NetPremi', o_netpremi_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.TJH',
		o_tjh_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.RSCC',
		o_rscc_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Banjir',
		o_rsmb_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Accessories',
		o_acc_val_0, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 2'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].KondisiPertanggungan',
		o_kond_pertanggungan_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].TJH', o_tjh_header_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredValue', o_ins_val_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredFrom', o_ins_form_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredTo', o_ins_to_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Rate', o_rate_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].GrossPremi', o_gross_premi_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Discount', o_discount_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Adm', o_adm_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].NetPremi', o_netpremi_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.TJH',
		o_tjh_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.RSCC',
		o_rscc_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.Banjir',
		o_rsmb_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.Accessories',
		o_acc_val_1, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 3'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].KondisiPertanggungan',
		o_kond_pertanggungan_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].TJH', o_tjh_header_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredValue', o_ins_val_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredFrom', o_ins_form_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredTo', o_ins_to_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Rate', o_rate_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].GrossPremi', o_gross_premi_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Discount', o_discount_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Adm', o_adm_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].NetPremi', o_netpremi_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.TJH',
		o_tjh_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.RSCC',
		o_rscc_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.Banjir',
		o_rsmb_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.Accessories',
		o_acc_val_2, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 4'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].KondisiPertanggungan',
		o_kond_pertanggungan_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].TJH', o_tjh_header_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].InsuredValue', o_ins_val_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].InsuredFrom', o_ins_form_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].InsuredTo', o_ins_to_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].Rate', o_rate_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].GrossPremi', o_gross_premi_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].Discount', o_discount_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].Adm', o_adm_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].NetPremi', o_netpremi_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.TJH',
		o_tjh_val_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.RSCC',
		o_rscc_val_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.Banjir',
		o_rsmb_val_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.Accessories',
		o_acc_val_3, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 5'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].KondisiPertanggungan',
		o_kond_pertanggungan_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].TJH', o_tjh_header_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].InsuredValue', o_ins_val_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].InsuredFrom', o_ins_form_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].InsuredTo', o_ins_to_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].Rate', o_rate_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].GrossPremi', o_gross_premi_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].Discount', o_discount_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].Adm', o_adm_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].NetPremi', o_netpremi_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].PerluasanJaminan.TJH',
		o_tjh_val_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].PerluasanJaminan.RSCC',
		o_rscc_val_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].PerluasanJaminan.Banjir',
		o_rsmb_val_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].PerluasanJaminan.Accessories',
		o_acc_val_4, FailureHandling.CONTINUE_ON_FAILURE)
break	
	case '6':
	
	order2 = WS.sendRequest(findTestObject('3. Get-data-order', [('s_key') : GlobalVariable.global_token, ('c_id') : c_id, ('order_date') : order_date
				, ('page') : page, ('rows') : rows]))
	
	'show response to report in test suite'
	get_order2 = order.getResponseText()
	
	'verifikasi tenor 1'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].KondisiPertanggungan',
		o_kond_pertanggungan_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].TJH', o_tjh_header_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredValue', o_ins_val_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredFrom', o_ins_form_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].InsuredTo', o_ins_to_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Rate', o_rate_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].GrossPremi', o_gross_premi_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Discount', o_discount_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].Adm', o_adm_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].NetPremi', o_netpremi_0,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.TJH',
		o_tjh_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.RSCC',
		o_rscc_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Banjir',
		o_rsmb_val_0, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[0].PerluasanJaminan.Accessories',
		o_acc_val_0, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 2'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].KondisiPertanggungan',
		o_kond_pertanggungan_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].TJH', o_tjh_header_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredValue', o_ins_val_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredFrom', o_ins_form_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].InsuredTo', o_ins_to_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Rate', o_rate_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].GrossPremi', o_gross_premi_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Discount', o_discount_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].Adm', o_adm_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].NetPremi', o_netpremi_1,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.TJH',
		o_tjh_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.RSCC',
		o_rscc_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.Banjir',
		o_rsmb_val_1, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[1].PerluasanJaminan.Accessories',
		o_acc_val_1, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 3'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].KondisiPertanggungan',
		o_kond_pertanggungan_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].TJH', o_tjh_header_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredValue', o_ins_val_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredFrom', o_ins_form_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].InsuredTo', o_ins_to_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Rate', o_rate_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].GrossPremi', o_gross_premi_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Discount', o_discount_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].Adm', o_adm_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].NetPremi', o_netpremi_2,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.TJH',
		o_tjh_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.RSCC',
		o_rscc_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.Banjir',
		o_rsmb_val_2, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[2].PerluasanJaminan.Accessories',
		o_acc_val_2, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 4'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].KondisiPertanggungan',
		o_kond_pertanggungan_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].TJH', o_tjh_header_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].InsuredValue', o_ins_val_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].InsuredFrom', o_ins_form_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].InsuredTo', o_ins_to_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].Rate', o_rate_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].GrossPremi', o_gross_premi_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].Discount', o_discount_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].Adm', o_adm_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].NetPremi', o_netpremi_3,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.TJH',
		o_tjh_val_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.RSCC',
		o_rscc_val_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.Banjir',
		o_rsmb_val_3, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[3].PerluasanJaminan.Accessories',
		o_acc_val_3, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 5'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].KondisiPertanggungan',
		o_kond_pertanggungan_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].TJH', o_tjh_header_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].InsuredValue', o_ins_val_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].InsuredFrom', o_ins_form_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].InsuredTo', o_ins_to_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].Rate', o_rate_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].GrossPremi', o_gross_premi_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].Discount', o_discount_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].Adm', o_adm_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].NetPremi', o_netpremi_4,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].PerluasanJaminan.TJH',
		o_tjh_val_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].PerluasanJaminan.RSCC',
		o_rscc_val_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].PerluasanJaminan.Banjir',
		o_rsmb_val_4, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[4].PerluasanJaminan.Accessories',
		o_acc_val_4, FailureHandling.CONTINUE_ON_FAILURE)
	
	'verifikasi tenor 6'
	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].KondisiPertanggungan',
		o_kond_pertanggungan_5, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].TJH', o_tjh_header_5, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].InsuredValue', o_ins_val_5,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].InsuredFrom', o_ins_form_5,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].InsuredTo', o_ins_to_5,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].Rate', o_rate_5, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].GrossPremi', o_gross_premi_5,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].Discount', o_discount_5,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].Adm', o_adm_5, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].NetPremi', o_netpremi_5,
		FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].PerluasanJaminan.TJH',
		o_tjh_val_5, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].PerluasanJaminan.RSCC',
		o_rscc_val_5, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].PerluasanJaminan.Banjir',
		o_rsmb_val_5, FailureHandling.CONTINUE_ON_FAILURE)

	WS.verifyElementPropertyValue(order, 'GetDataOrderResponse.ListDataOrder[0].InsuranceData[5].PerluasanJaminan.Accessories',
		o_acc_val_5, FailureHandling.CONTINUE_ON_FAILURE)
break
		}

