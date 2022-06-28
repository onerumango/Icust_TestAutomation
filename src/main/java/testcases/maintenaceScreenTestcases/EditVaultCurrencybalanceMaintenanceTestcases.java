package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class EditVaultCurrencybalanceMaintenanceTestcases extends IcustSpecificMethods{
	@Test
	public void runEditVaultCurrencybalanceMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickVaultCurrencybalanceMaintenance()
	.clickEdit()
	.editOpenbalnceinLCY()
	.editBalnceinACY()
	.clickSave();

}
}
