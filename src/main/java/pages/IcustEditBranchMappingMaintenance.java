package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustEditBranchMappingMaintenance extends IcustSpecificMethods{

	public IcustEditBranchMappingMaintenance selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillBranching.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.Edit.Entitycode.Xpath")));
		return this;
	}
	
	public IcustEditBranchMappingMaintenance selectTillId() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.Edit.TillID.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.Edit.TillID.Dropdown.666.Xpath")));
		return this;
	}
	
	
	public IcustEditBranchMappingMaintenance clickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.Edit.Save.Xpath")));
		return this;
	}
}