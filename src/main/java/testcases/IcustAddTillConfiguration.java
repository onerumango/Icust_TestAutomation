package testcases;

import org.testng.annotations.Test;

import pages.IcustTellerLogin;
import base.IcustSpecificMethods;

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


