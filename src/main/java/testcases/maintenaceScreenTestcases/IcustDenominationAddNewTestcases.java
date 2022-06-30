package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustDenominationAddNewTestcases extends IcustSpecificMethods{
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
