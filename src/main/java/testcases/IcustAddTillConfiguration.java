package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustAddTillConfiguration extends IcustSpecificMethods {
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.selectprodMaintenance()
		.selectMaintenance1()
		.selectEntitycode()
		.selectBankcode()
		.selectBranchcode()
		.selectcurrency() 
		.enterminCashHolding()
		.entermaxCashHolding()
		.selecttillId()
		.clickSaveButton();
	}

}


