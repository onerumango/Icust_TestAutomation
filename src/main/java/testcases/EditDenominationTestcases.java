package testcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.dashboard.IcustTellerLogin;

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
