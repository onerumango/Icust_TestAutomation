package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustAddTillvaultMaintenance extends IcustSpecificMethods {
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectTillMaintenance()
		.selectMaintenance1()
		.selectEntitycode()
		.selectBankcode()
		.selectTillcode()
		.entertillVaultCode() 
		.entertillVaultDesc()
		.selectprimaryVault()
		.clickSaveButton();
	}

}


