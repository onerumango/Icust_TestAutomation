package testcases;

import org.testng.annotations.Test;

import base.ICUSTKIOSKMethods;
import pages.IcustKioskCashDeposit;

public class IcustKioskChequeDepositTc extends ICUSTKIOSKMethods{
	@Test
	public void runIcustKioskLogin() {
		IcustKioskCashDeposit deposit =new IcustKioskCashDeposit();
		
		deposit.enterPhoneNumber()
		.clickLoginContinue()
		.clickNext()
		.clickSkip()
		.clickChequeDeposit()
		.clickDashboardContinue1()
		.clickSavings()
		.clickAccountNumber()
		.enterTransactionAmount()
		.enterChequeNumber()
		.clicklastContinue()
		.clickLogout();
		
		
	}

}
