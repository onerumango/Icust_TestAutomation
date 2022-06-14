package pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustAddBaseDenominationmaintenance extends IcustSpecificMethods{

	public IcustAddBaseDenominationmaintenance selectMaintenance1() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.BaseDenominationMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.BaseDenominationMaintenance.Xpath")));
		return this;
	}
	
	public IcustAddBaseDenominationmaintenance enterDenomination() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.AddNew.Denomination.Xpath")), props.getProperty("denomination"));
		return this;
	}
	
	
	public IcustAddBaseDenominationmaintenance selectCurrency() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.AddNew.Currency.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.AddNew.Currency.Dropdown.CNY.Xpath")));
		return this;
	}
	
	
	public IcustAddBaseDenominationmaintenance clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}

}
	