package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustCustomerOnboardingTaskSummary extends IcustSpecificMethods{
	
	public IcustCustomerOnboardingTaskSummary enterSearchValue() {
		enterValue(locateElement("xpath", props.getProperty("IcustCustomerOnboardingTaskSummary.Search.Xpath")),
				props.getProperty("SearchCustomerOnboardingTaskSummary"));
		wait(20000);
		return this;
	}
	
	public IcustCustomerOnboardingTaskSummary clickCustomerID() {
		clickElement(locateElement("xpath", props.getProperty("IcustCustomerOnboardingTaskSummary.SearchText.Xpath")));
		wait(5000);
		return this;
	}
	
	public IcustCustomerOnboardingTaskSummary clickApproveButton() {
		WebElement approveButton =locateElement("xpath", props.getProperty("IcustCustomerOnboardingTaskSummary.Approve.Xpath"));
		jsExecutor(approveButton);
		clickElement(approveButton);
		wait(7000);
		driver.close();
		driver.switchTo().window(firstWindow);
		return this;
	}

//	public IcustCorporateOnboardingTaskSummary corporateOnboardingButton() {
//		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboardingtTaskSummary.TellerButton.Xpath")));
//		wait(30000);
//		return this;
//	}

	public IcustCorporateOnboardingTaskSummary corporateOnboardingButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboardingtTaskSummary.TellerButton.Xpath")));
		wait(30000);
		return new IcustCorporateOnboardingTaskSummary();
	}
}
