package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class EditVaultCurrencyDenominationTestcases extends IcustSpecificMethods {
	@Test
	public void runEditVaultCurrencyDenominationTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickVaultCurrencyMaintenance()
	.clickEdit()
	.enterDenominationcode()
	.clickUpdate();
	}

}
