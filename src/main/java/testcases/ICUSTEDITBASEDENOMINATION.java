package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class ICUSTEDITBASEDENOMINATION extends IcustSpecificMethods {
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectEditBaseDenomination()
		.selectMaintenance1()
		.selectCurrency()
		.clickSaveButton();
	}

}

