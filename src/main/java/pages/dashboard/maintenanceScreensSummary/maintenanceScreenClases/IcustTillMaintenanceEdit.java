package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustTillMaintenanceEdit extends IcustSpecificMethods{

	public IcustTillMaintenanceEdit selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Edit.Entitycode.Xpath")));
		return this;
	}
	
	public IcustTillMaintenanceEdit selectBankCode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Edit.Bankcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Edit.Bankcode.Dropdown.32wd.Xpath")));
		return this;
	}
	
	
	public IcustTillMaintenanceEdit clickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Edit.Save.Xpath")));
		return this;
	}
}