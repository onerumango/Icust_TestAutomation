package testcases;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustLoanMandateDetails extends IcustSpecificMethods{
	@Test
	public void runLoanCollateralDetailsTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickCreateLoanAccount()
	.clickMandate()
	. enterApplicantName()
	.enterCollateralshare()
	.clickNextButton();
	}
}

	