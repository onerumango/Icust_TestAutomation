package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;


public class IcustCorporateOnboardingTaskSummaryTC extends IcustSpecificMethods{

	@Test
	public void runCreateAccountTaskSummary() throws AWTException  {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickCustomerOnboardingTaskSummary()
		.corporateOnboardingButton()
		.corporateEnterSearchValue()
		.CorporateClickAccountID()
		.corporateClickApproveButton();
		
		
	}
}