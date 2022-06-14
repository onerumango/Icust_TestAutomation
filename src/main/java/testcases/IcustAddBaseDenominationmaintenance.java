package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.dashboard.IcustTellerLogin;

public class IcustAddBaseDenominationmaintenance extends IcustSpecificMethods {
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectMaintenance()
		.selectMaintenance1()
		.enterDenomination()
		.selectCurrency()
		.clickSaveButton();
	}

}
