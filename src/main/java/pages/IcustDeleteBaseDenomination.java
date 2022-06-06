package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustDeleteBaseDenomination extends IcustSpecificMethods{

	public IcustDeleteBaseDenomination selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.BaseDenominationMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.BaseDenomination.Delete.Maintenance.Xpath")));
		return this;
	}
	
	public IcustDeleteBaseDenomination clickDeleteButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.Delete.Confirm.Xpath")));
		return this;
	}
}
