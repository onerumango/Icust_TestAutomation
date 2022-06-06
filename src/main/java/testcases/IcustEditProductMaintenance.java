package testcases;

import org.testng.annotations.Test;

import pages.IcustTellerLogin;
import base.IcustSpecificMethods;

public class IcustEditProductMaintenance extends IcustSpecificMethods {
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.EditProductMaintenance()
		.selectMaintenance1()
		.selectProductCode()
		.clickSaveButton();
	}

}