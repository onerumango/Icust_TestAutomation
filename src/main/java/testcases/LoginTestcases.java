package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class LoginTestcases extends IcustSpecificMethods{
	@Test
	public void runLoginTestcases() {
		IcustTellerLogin login= new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton();
		
		
	}

}
