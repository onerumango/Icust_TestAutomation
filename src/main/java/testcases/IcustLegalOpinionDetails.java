package testcases;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustLegalOpinionDetails extends IcustSpecificMethods {
	@Test
	public void runLoanCreditRatingsTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickCreateLoanAccount()
	.clickOpinionDropdown()
	.clickassetareaDropdown()
	.enterRemarks()
	.enterValueofasses()
	.enterLawyerName()
	.clickOpinionDate()
	.clickValuationDate()
	.enterDescription()
	.clickNextButton();
	}

}
