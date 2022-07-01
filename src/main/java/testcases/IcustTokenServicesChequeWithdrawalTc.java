package testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustTokenServicesChequeWithdrawalTc extends IcustSpecificMethods{
	@Test
	public void TokenServicesCashWithdrawal() throws IOException, AWTException {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickServicesToggleButtonforCashWithdrawal()
		.clickChequeWithdrawal()
		.enterAccountNumber()
		.clickFetchlink()
		.enterChequeNumber()
		.enterTransactionAmount()
		.clickSaveButton();
		}

}
