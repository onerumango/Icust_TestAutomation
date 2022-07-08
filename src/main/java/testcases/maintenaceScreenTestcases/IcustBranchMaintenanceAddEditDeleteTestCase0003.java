package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustBranchMaintenanceAddEditDeleteTestCase0003 extends IcustSpecificMethods {
	@Test
	public void runBranchMaintenanceTestcase() {
		IcustTellerLogin login= new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickMaintenanceInDashboard()
		.clickIcustBranchMaintenance()
		.clickAddNew()
		.selectBankName()
		.enterBranchName()
		.enterBranchCode()
		.selectBranchCurency()
		.enterBranchDetails()
		.enterAddress1()
		.enterAddress2()
		.selectCountry()
		.selectState()
		.selectCity()
		.enterPincode()
		.clickSaveButton()
		;
	}
}
