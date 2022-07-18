package pages;

import base.IcustSpecificMethods;

public class ICustCardOriginationApplicationEntryStage extends IcustSpecificMethods{
	
	public ICustCardOriginationApplicationEntryStage clickAddDetails() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.AddDetails.Xpath")));
		return this;
		}
	
//Card Initiation Details	
	public ICustCardOriginationApplicationEntryStage FillCardInitiationDetails() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.ExistingCustomerToggleButton.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.CardType.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.SelectCardType.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.EnterCIFNumber.Xpath")), props.getProperty("EnterCIFNumber"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.EmploymentType.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.SelectEmploymentType.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.AffinityProgram.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.SelectAffinityProgram.Xpath")));
		wait(1000);
		enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.NameOnCard.Xpath")), props.getProperty("NameOnCard"));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.NextButton.Xpath")));
		wait(4000);
		return this;
		}
	
//Customer Information Page	
	    public ICustCardOriginationApplicationEntryStage ClickNextCustomerInformationPage() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CustomerInformation.NextButton.Xpath")));
		return this;
	    }
	    
//Financial Details Page	    
	    public ICustCardOriginationApplicationEntryStage enterCurrentlyWorking() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.EnterCurrentlyWorking.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_EnterCurrentlyWorking"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage selectLastUpdateon() {
			clickElement(locateElement("xpath", props.getProperty("ICustCardOriginationApplicationEntryStage.selectLastUpdateon.drop.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("ICustCardOriginationApplicationEntryStage.selectLastUpdateon.click.Xpath")));
			return this;
		}
	    public ICustCardOriginationApplicationEntryStage selectEmploymentDetails() {
			clickElement(locateElement("xpath", props.getProperty("ICustCardOriginationApplicationEntryStage.selectEmploymentDetails.drop.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("ICustCardOriginationApplicationEntryStage.selectEmploymentDetails.click.Xpath")));
			wait(3000);
			return this;
		}
	    public ICustCardOriginationApplicationEntryStage selectEmploymentCategory() {
			clickElement(locateElement("xpath", props.getProperty("ICustCardOriginationApplicationEntryStage.selectEmploymentCategory.drop.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("ICustCardOriginationApplicationEntryStage.selectEmploymentCategory.click.Xpath")));
			wait(3000);
			return this;
		}
	    public ICustCardOriginationApplicationEntryStage enterEmployeeNumber() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterEmployeeNumber.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterEmployeeNumber"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterOfficeName() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterOfficeName.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterOfficeName"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterDesignation() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterDesignation.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterDesignation"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage selectStartDate() {
			clickElement(locateElement("xpath", props.getProperty("ICustCardOriginationApplicationEntryStage.selectStartDate.drop.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("ICustCardOriginationApplicationEntryStage.selectStartDate.click.Xpath")));
			return this;
		}
	    public ICustCardOriginationApplicationEntryStage selectEndtDate() {
			clickElement(locateElement("xpath", props.getProperty("ICustCardOriginationApplicationEntryStage.selectEndDate.drop.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("ICustCardOriginationApplicationEntryStage.selectEndDate.click.Xpath")));
			return this;
		}
//Monthly Income	    
	    public ICustCardOriginationApplicationEntryStage enterBonus() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterBonus.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterBonus"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterBusiness() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterBusiness.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterBusiness"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterInterestIncome() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterInterestIncome.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterInterestIncome"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterpension() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterpension.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterpension"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterSalary() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterSalary.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterSalary"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterRentals() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterRentals.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterRentals"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterCashGift() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterCashGift.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterCashGift"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterOthers() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterOthers.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterOthers"));
			wait(1000);
			return this;
		    }
//Monthly Expenses	    
	    public ICustCardOriginationApplicationEntryStage enterHousehold() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterHousehold.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterHousehold"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterMedical() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterMedical.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterMedical"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterEducation() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterEducation.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterEducation"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterTravel() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterTravel.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterTravel"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterVehicleMaintenance() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterVehicleMaintenance.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterVehicleMaintenance"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterRentals2() {
	 			wait(2000);
	 			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterRentals2.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterRentals2"));
	 			wait(1000);
	 			return this;
	 		    }
	    public ICustCardOriginationApplicationEntryStage enterOthers2() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterOthers2.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterOthers2"));
			wait(1000);
			return this;
		    }
	  //Annual Liabilities
	    
	    public ICustCardOriginationApplicationEntryStage enterPropertyLoan() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterPropertyLoan.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterPropertyLoan"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterVehicleLoan() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterVehicleLoan.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterVehicleLoan"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterPersonalLoan() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterPersonalLoan.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterPersonalLoan"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterCardsOutstandings() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterCardsOutstandings.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterCardsOutstandings"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterOverdrafts() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterOverdrafts.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterOverdrafts"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterOther() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterOther.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterOther"));
			wait(1000);
			return this;
		    }
	  //Asset
	    public ICustCardOriginationApplicationEntryStage enterSavingsDeposits() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterSavingsDeposits.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterSavingsDeposits"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterStockFunds() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterStockFunds.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterStockFunds"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterProperties() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterProperties.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterProperties"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterAutomobiles() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterAutomobiles.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterAutomobiles"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterFixedDeposits() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterFixedDeposits.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterFixedDeposits"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterLands() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterLands.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterLands"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage enterOthers3() {
			wait(2000);
			enterValue(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.FinancialDetails.enterOthers3.Xpath")), props.getProperty("ICustCardOriginationApplicationEntryStage_enterOthers3"));
			wait(1000);
			return this;
		    }
	    public ICustCardOriginationApplicationEntryStage ClickNextFinancialDetailsPage() {
			wait(2000);
			clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.ClickNextFinancialDetailsPage.NextButton.Xpath")));
			return this;
		    }
}
