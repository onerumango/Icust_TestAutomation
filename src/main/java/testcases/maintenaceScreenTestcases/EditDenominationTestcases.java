package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class EditDenominationTestcases extends IcustSpecificMethods{
	@Test
	public void runEditDenominationTestcases() {
		IcustTellerLogin login= new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickProfileIcon()
		.clickMaintenance()
		.clickDenominationMaintenance()
		.clickEdit()
		.editDenomCode()
		.editDenomDesc()
		.clickSave();
	}
		
		
	    

	}
