package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.IcustSpecificMethods;
import pages.IcustTellerLogin;

public class IcustCardOriginationTestCase extends IcustSpecificMethods{
	@Test
	public void runKYCBranchVerification() throws AWTException  {
		IcustTellerLogin login = new IcustTellerLogin();
		login.enterUsername()
		.enterPassword()
		.clickSignInButton()
		.clickCardOrigination()
		.clickAddDetails()
		//Card Initiation Details		
		.FillCardInitiationDetails()
		//Customer Information Page	
        .ClickNextCustomerInformationPage()
       //Financial Details Page	
      .enterCurrentlyWorking()  
      .selectLastUpdateon()
      .selectEmploymentDetails()
      .selectEmploymentCategory()
      .enterEmployeeNumber()
      .enterOfficeName()
      .enterDesignation()
      .selectStartDate()
      .selectEndtDate()
      //Monthly Income
      .enterBonus()
      .enterBusiness()
      .enterInterestIncome()
      .enterpension()
      .enterSalary()
      .enterRentals()
      .enterCashGift()
      .enterOthers()
    //Monthly Expenses
      .enterHousehold()
      .enterMedical()
      .enterEducation()
      .enterTravel()
      .enterVehicleMaintenance()
      .enterRentals2()
      .enterOthers2()
    //Annual Liabilities
      .enterPropertyLoan()
      .enterVehicleLoan()
      .enterPersonalLoan()
      .enterCardsOutstandings()
      .enterOverdrafts()
      .enterOther()
      //Asset
      .enterSavingsDeposits()
      .enterStockFunds()
      .enterProperties()
      .enterAutomobiles()
      .enterFixedDeposits()
      .enterLands()
      .enterOthers3()
      .ClickNextFinancialDetailsPage();
}
}
