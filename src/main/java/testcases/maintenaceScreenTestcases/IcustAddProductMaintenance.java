package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustAddProductMaintenance extends IcustSpecificMethods {
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectaddMaintenance()
		.selectMaintenance1()
		.selectEntitycode()
		.selectBankcode()
		.selectProductcode()
		.enterProductname()
		.clickSaveButton();
	}

}


