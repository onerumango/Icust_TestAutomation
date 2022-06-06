package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustEditTillConfiguration extends IcustSpecificMethods{

	public IcustEditTillConfiguration selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillconfigurationMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.Edit.Entitycode.Xpath")));
		return this;
	}
	
	public IcustEditTillConfiguration selectEntitycode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.Edit.Entitycode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Entitycode.Dropdown.AUD.Xpath")));
		return this;
	}
	
	
	public IcustEditTillConfiguration clickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Save.Xpath")));
		return this;
	}
	}
