package testcases;

import org.testng.annotations.Test;

import pages.IcustTellerLogin;
import base.IcustSpecificMethods;

public class IcustEditTillMaintenance extends IcustSpecificMethods {
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.EditTillMaintenance()
		.selectMaintenance1()
		.selectBankCode()
		.clickSaveButton();
	}

}