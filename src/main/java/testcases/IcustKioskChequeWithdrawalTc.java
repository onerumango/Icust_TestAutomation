package testcases;

import org.testng.annotations.Test;

import base.ICUSTKIOSKMethods;
import pages.IcustKioskCashDeposit;

public class IcustKioskChequeWithdrawalTc extends ICUSTKIOSKMethods {
	
	@Test
	public void runIcustKioskLogin() {
		IcustKioskCashDeposit deposit =new IcustKioskCashDeposit();
		deposit.enterPhoneNumber()
		.clickLoginContinue()
		.clickNext()
		.clickSkip()
		.clickChequeWithdrawal()
		.clickDashboardContinue2()
		.clickSavings()
		.clickCQWDAccountNumber()
		.enterCQWDTransactionAmount()
		.enterCQWDChequeNumber()
		.clickCQWDDenomination()
		.clickCQWDContinue();
		
	}

	

}
