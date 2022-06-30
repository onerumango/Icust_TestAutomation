package testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustProfileUpdateTc extends IcustSpecificMethods{
	
@Test
	public void runIcustPickAToken() throws IOException, AWTException {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickProfileUpdate()
		.clickProfileEdit()
		.enterEmail()
		.selectLanguage()
		.clickSaveButton();
}
}
