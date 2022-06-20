package testcases.dashboard360;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class DependentTestcases extends IcustSpecificMethods{
	@Test
	public void runAddDenominationTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickSearch()
	.enterAccountId()
	.clickOnFirstSearchedResult()
/**---------------------------------**/
	.clickAddnew()
	.clickExistingCustomer()
	.enterCifNumber()
//	.clickCustomerPrefix()
//	.enterFirstName()
//	.enterLastName()
//	.clickGenderdd()
//	.clickGender()
//	.selectDateofBirth()
//	.enterBirthPlace()
	.clickResidentStatusdd()
//	.clickResidentStatus()
	.clickCitizenshipBydd()
//	.clickCitizenshipBy()
//	.clickCountryofResidencedd()
//	.clickCountryofResidence()
//	.enterOccupationType()
//	.enterUniqueIdNumber()
//	.clickIdTypedd()
//	.clickIdType()
//	.selectIdvalidTill()
	.enterAddressLine1()
	.enterAddressLine2()
//	.enterResidenceType()
//	.clickCountrydd()
//	.clickCountry()
//	.clickStatedd()
//	.clickState()
//	.clickCitydd()
//	.clickCity()
//	.enterZipcode()
//	.enterMobileNumber()
//	.enterLandlineNumber()
//	.enterEmail()
//	.clickSaveApplicant()
	;
	}
}
