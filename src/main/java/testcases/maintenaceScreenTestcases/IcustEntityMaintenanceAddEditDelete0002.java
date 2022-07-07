package testcases.maintenaceScreenTestcases;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustEntityMaintenanceAddEditDelete0002 extends IcustSpecificMethods {
	@Test
	public void runEntityMaintenanceTestcase() {
		IcustTellerLogin login= new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickMaintenanceInDashboard()
		.clickIcustEntityMaintenance()
		.clickAddNew()
		.enterEntityCode()
		.enterEntityName()
		.selectDenominationRequired()
		.selectCountry()
		.selectState()
		.selectCity()
		.enterPincode()
		.enterMobileNumber()
		.enterPhoneNumber()
		.clickSaveButton()
		.clickEditButton()
		.editEntityCode()
		.editEntityName()
		.editDenominationRequired()
		.editPincode()
		.editMobileNumber()
		.editPhoneNumber()
		.clickUpdateButton()
		.clickDeleteButton()
		.clickDeleteOkButton()
		;
	}
}
