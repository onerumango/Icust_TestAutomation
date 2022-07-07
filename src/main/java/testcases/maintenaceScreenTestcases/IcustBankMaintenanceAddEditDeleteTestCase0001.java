package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustBankMaintenanceAddEditDeleteTestCase0001 extends IcustSpecificMethods {
	@Test
	public void runBankMaintenanceTestcase() {
		IcustTellerLogin login= new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickMaintenanceInDashboard()
		.clickIcustBankMaintenance()
		.clickAddNew()
		.enterBankName()
		.enterBankCode()
		.enterSwiftCode()
		.selectBankCurrency()
		.selectDefaultLanguage()
		.enterHeadOfficeBranch()
		.selectDenominationRequired()
		.selectEntityCode()
		.enterAddress1()
		.enterAddress2()
		.selectCountry()
		.selectState()
		.selectCity()
		.enterPincode()
		.enterMobileNumber()
		.enterPhoneNumber()
		.clickSaveButton()
		.clickEditButton()
		.editBankName()
		.editBankCode()
		.editSwiftCode()
		.editHeadOfficeBranch()
		.editAddress1()
		.editAddress2()
		.editPincode()
		.editPhoneNumber()
		.clickUpdateButton()
		.clickDeleteButton()
		.clickOkButton()
		;
	}

}
