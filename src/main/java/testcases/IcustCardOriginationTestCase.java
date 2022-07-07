package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustCardOriginationTestCase extends IcustSpecificMethods{
	@Test
	public void runKYCBranchVerification() throws AWTException  {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickCardOrigination()
		.clickAddDetails()
		.FillCardInitiationDetails()
;
}
}
