package testcases;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustLoanAssessmentDetails extends IcustSpecificMethods{
	@Test
	public void runLoanCollateralDetailsTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickCreateLoanAccount()
	.clickNextButton();
	}
}

	