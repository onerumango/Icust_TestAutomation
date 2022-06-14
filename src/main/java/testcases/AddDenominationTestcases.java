package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.dashboard.IcustTellerLogin;

public class AddDenominationTestcases extends IcustSpecificMethods{
	@Test
	public void runAddDenominationTestcases() {
		IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickProfileIcon()
	.clickMaintenance()
	.clickDenominationMaintenance()
	.clickAddnew()
	.clickEntityCode()
	.clickEntityValue()
	.clickBankCode()
	.clickBankCodeValue()
	.clickCurrency()
	.clickCurrencyValue()
	.enterDenomCode()
	.enterDenomDesc()
	.enterDenomValue()
	.clickSave();
	}

}
