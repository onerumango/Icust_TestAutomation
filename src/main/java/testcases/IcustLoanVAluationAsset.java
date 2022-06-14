package testcases;

import org.testng.annotations.Test;


import base.IcustSpecificMethods;
import pages.dashboard.IcustTellerLogin;

public class IcustLoanVAluationAsset extends IcustSpecificMethods {
	@Test
	public void runLoanCreditRatingsTestcases() {
	IcustTellerLogin login= new IcustTellerLogin();
	login.enterUsername()
	.enterPassword()
	.clickSignInButton()
	.clickCreateLoanAccount()
	.selectassetType()
	.enterRemarks()
	.enterborrowersMktValOfAsset()
	.selectAssetvalue()
	.selectValuationDate()
	.ActualpropertyDropdown()
	.enterActualpropertyArea()
	.enterFacevalue()
	.enterMktvalue()
	.enterForcedvalue()
	.clickNextButton();
	}

}
