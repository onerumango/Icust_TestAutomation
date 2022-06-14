package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.dashboard.IcustTellerLogin;

public class IcustDeleteProductMaintenance extends IcustSpecificMethods {
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectDeleteBaseDenomination()
		.selectMaintenance1()
		.clickDeleteButton();
	}

}

