package pages;

import base.IcustSpecificMethods;

public class ICustCardOriginationApplicationEntryStage extends IcustSpecificMethods{
	
	public ICustCardOriginationApplicationEntryStage clickAddDetails() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CardInitiation.AddDetails.Xpath")));
		return this;
		}
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
	    public ICustCardOriginationApplicationEntryStage ClickNextCustomerInformationPage() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("Icust.CardOrigination.ApplicationEntryStage.CustomerInformation.NextButton.Xpath")));
		return this;
	    }
	    public ICustCardOriginationApplicationEntryStage FillFinancialDetailsPage() {
			wait(2000);
			clickElement(locateElement("xpath", props.getProperty("")));
			return this;
		    }
}
