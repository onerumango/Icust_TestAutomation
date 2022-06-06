package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustDeleteTillConfiguration extends IcustSpecificMethods{

	public IcustDeleteTillConfiguration selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillconfigurationMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.Edit.Entitycode.Xpath")));
		return this;
	}
	
	public IcustDeleteTillConfiguration clickDeleteButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Save.Xpath")));
		return this;
	}
}

