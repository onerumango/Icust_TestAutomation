package pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustAddTillBranchingMaintenance extends IcustSpecificMethods{

	public IcustAddTillBranchingMaintenance selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillBranching.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TILLBranching.Xpath")));
		return this;
	}
	
	
	public IcustAddTillBranchingMaintenance selectEntitycode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Entitycode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Entitycode.Dropdown.TEST.Xpath")));
		return this;
	}
	
	public IcustAddTillBranchingMaintenance selectBankcode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Bankcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Bankcode.Dropdown.sd3.Xpath")));
		return this;
	}
	
	public IcustAddTillBranchingMaintenance selectBranchcode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Branchcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Branchcode.Dropdown.KR.Xpath")));
		return this;
	}
	
	public IcustAddTillBranchingMaintenance selecttillId() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.tillId.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.tillId.Dropdown.123.Xpath")));
		return this;
	}
	
	public IcustAddTillBranchingMaintenance selectparentVaultId() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.parentVaultId.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.parentVaultId.Dropdown.TMRoleDesc.Xpath")));
		return this;
	}
	
	
	public IcustAddTillBranchingMaintenance entername() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.name.Xpath")), props.getProperty("shortOvgGl"));
		return this;
	}
	
	
	public IcustAddTillBranchingMaintenance clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}

}
	
