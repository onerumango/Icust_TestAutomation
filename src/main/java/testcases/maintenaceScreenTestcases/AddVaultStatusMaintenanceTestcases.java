package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class AddVaultStatusMaintenanceTestcases extends IcustSpecificMethods {
	@Test
	public void runAddVaultStatusMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickVaultStatusMaintenance()
	.clickAddnew()
	.clickEntitycodeDropdown()
	.clickVaultstatusEntitycodeValue()
	.clickVaultstatusBankcodeDropdown()
	.clickVaultstatusBankcodeValue()
	.clickBranchCode()
	.clickBranchCodeValue()
	.clickTillId()
	.clickTillIdValue()
	.enterVaultStatusUserid()
	.enterTillVaultStatus()
	.clickTvOpentime();
}
}
