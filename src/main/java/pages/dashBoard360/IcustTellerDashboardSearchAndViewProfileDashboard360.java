package pages.dashBoard360;

import base.IcustSpecificMethods;


public class IcustTellerDashboardSearchAndViewProfileDashboard360 extends IcustSpecificMethods{
	
	
	public IcustTellerDashboardSearchAndViewProfileDashboard360 enterAccountId() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.AccountId.Xpath")),props.getProperty("AccountId"));
		return this;
	}
	/**public IcustTellerDashboardSearchAndViewProfileDashboard360 enterName() {
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.enterName.Xpath")), props.getProperty("Profile_Name"));
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.clickProfileSearch.Xpath")));
		wait(5000);
		return this;		
	}**/
	public IcustTellerDashboardSearchAndViewProfileDashboard360 clickOnFirstSearchedResult() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.clickOnFirstSearchedResult.Xpath")));
		wait(5000);
		windowsHandling();
		wait(5000);
		return this;
	}
	
	public IcustTellerDashboardSearchAndViewProfileDashboard360 clickViewProfile() {
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Dashboard360.ViewProfile.Xpath")));
		wait(5000);
		return this;
	}
	public IcustTellerDashboardSearchAndViewProfileDashboard360 closeViewProfile() {
		clickElement(locateElement("xpath", props.getProperty("ViewProfile360.Close.Xpath")));
		wait(5000);
		return this;
	}
	public Dependent clickAddnew() {
		explicitWaitTillElementClickable(locateElement("xpath", props.getProperty("Dashboard360.circle.Xpath")));
		clickElement(locateElement("xpath", props.getProperty("Dashboard360.AddNew.Xpath")));
		wait(5000);
		return new Dependent();
	}
	public RecentTransaction360 clickViewReport() {
		clickElement(locateElement("xpath", props.getProperty("Dashboard360.ViewReport.Xpath")));
		return new RecentTransaction360();
	}
	
	
	
	
	
}