package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustBranchMappingMaintenanceEdit extends IcustSpecificMethods{

	public IcustBranchMappingMaintenanceEdit selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillBranching.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.Edit.Entitycode.Xpath")));
		return this;
	}
	
	public IcustBranchMappingMaintenanceEdit selectTillId() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.Edit.TillID.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.Edit.TillID.Dropdown.666.Xpath")));
		return this;
	}
	
	
	public IcustBranchMappingMaintenanceEdit clickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.Edit.Save.Xpath")));
		return this;
	}
}