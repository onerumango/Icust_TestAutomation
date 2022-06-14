package pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustEditTillMaintenance extends IcustSpecificMethods{

	public IcustEditTillMaintenance selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Edit.Entitycode.Xpath")));
		return this;
	}
	
	public IcustEditTillMaintenance selectBankCode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Edit.Bankcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Edit.Bankcode.Dropdown.32wd.Xpath")));
		return this;
	}
	
	
	public IcustEditTillMaintenance clickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Edit.Save.Xpath")));
		return this;
	}
}