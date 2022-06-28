package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class EditVaultDenominationMaintenanceTestcases extends IcustSpecificMethods{
	@Test
	public void runEditVaultDenominationMaintenanceTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickVaultDenominationMaintenance()
	.clickEdit()
	.editDenominationCode()
	.editUnits()
	.clickSave();

}
}
