package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustDeleteTillMaintenance extends IcustSpecificMethods{

	public IcustDeleteTillMaintenance selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Delete.Xpath")));
		return this;
	}
	
	public IcustDeleteTillMaintenance clickDeleteButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Delete.Save.Xpath")));
		return this;
	}
}

