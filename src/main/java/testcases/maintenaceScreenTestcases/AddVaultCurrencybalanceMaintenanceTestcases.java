package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class AddVaultCurrencybalanceMaintenanceTestcases extends IcustSpecificMethods {
	@Test
	public void runAddVaultCurrencybalanceMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickVaultCurrencybalanceMaintenance()
	.clickAddnew()
     .clickEntitycodeDropdown()
     .clickVaultCurrencyblanceEntitycodeValue()
     .clickVaultcurrencyBalanceBankcodeDropdown()
     .clickVaultcurrencyBalanceBankcodeValue()
     .clickBranchCode()
     .clickBranchCodeValue()
     .clickCurrency()
     .clickCurrencyValue()
     .enterOpenbalnceinACY()
     .enterOpenbalnceinLCY()
     .enterOpenbalnceinACY()
     .enterBalnceinLCY()
     .clickSave();
}
}
