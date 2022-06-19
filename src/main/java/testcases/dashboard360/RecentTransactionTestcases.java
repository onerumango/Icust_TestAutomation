package testcases.dashboard360;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class RecentTransactionTestcases extends IcustSpecificMethods{
	@Test
	public void runRecentTransactionTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickSearch()
	.enterAccountId()
	.clickOnFirstSearchedResult()
	.clickViewReport()
	.clickClose()	
	;

}
}
