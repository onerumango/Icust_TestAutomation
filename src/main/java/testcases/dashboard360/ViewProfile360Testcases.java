package testcases.dashboard360;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class ViewProfile360Testcases extends IcustSpecificMethods {
	@Test
	public void runViewProfile360Testcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickSearch()
	.enterAccountId()
	.clickOnFirstSearchedResult()
	.clickViewProfile()
	.closeViewProfile();
	

}
}
