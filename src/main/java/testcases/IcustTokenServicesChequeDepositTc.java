package testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

@Test            
public class IcustTokenServicesChequeDepositTc extends IcustSpecificMethods{
	public void TokenServicesCashWithdrawal() throws IOException, AWTException {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickServicesToggleButtonforCashWithdrawal()
		.clickChequeDeposit()
		.enterAccountNumber()
		.clickFetchlink()
		.enterChequeNumber()
		.enterTransactionAmount()
		.clickSaveButton();
		}
 
}
