package testcases;
import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.dashboard.IcustTellerLogin;


public class IcustLoanDisbursementDetailsTC extends IcustSpecificMethods{

	@Test
	public void runAddNewEntity()
	{
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectDisburesmentMode()
		.enterLoanAmount()
		.enterNumberOfDisbursement()
		.selectFirstDisbursementDate()
		.enterTotalDisbursement()
		.enterCustomerAccount()
		.enterBranchCode()
		.clickNextButton();
	}
}
