package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustDeleteBranchMapping extends IcustSpecificMethods{

	public IcustDeleteBranchMapping selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillBranching.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.Edit.Entitycode.Xpath")));
		return this;
	}
	
	public IcustDeleteBranchMapping clickDeleteButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.Delete.Save.Xpath")));
		return this;
	}
}

