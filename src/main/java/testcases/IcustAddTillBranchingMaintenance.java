package testcases;

import org.testng.annotations.Test;

import pages.IcustTellerLogin;
import base.IcustSpecificMethods;

public class IcustAddTillBranchingMaintenance extends IcustSpecificMethods {
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectBranchMaintenance()
		.selectMaintenance1()
		.selectEntitycode()
		.selectBankcode()
		.selectBranchcode()
		.selecttillId()
		.selectparentVaultId()
		.entername()
		.clickSaveButton();
	}

}



