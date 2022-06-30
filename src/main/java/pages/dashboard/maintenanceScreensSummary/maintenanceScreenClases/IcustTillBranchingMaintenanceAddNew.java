package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustTillBranchingMaintenanceAddNew extends IcustSpecificMethods{

	public IcustTillBranchingMaintenanceAddNew selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillBranching.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TILLBranching.Xpath")));
		return this;
	}
	
	
	public IcustTillBranchingMaintenanceAddNew selectEntitycode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Entitycode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Entitycode.Dropdown.TEST.Xpath")));
		return this;
	}
	
	public IcustTillBranchingMaintenanceAddNew selectBankcode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Bankcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Bankcode.Dropdown.sd3.Xpath")));
		return this;
	}
	
	public IcustTillBranchingMaintenanceAddNew selectBranchcode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Branchcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Branchcode.Dropdown.KR.Xpath")));
		return this;
	}
	
	public IcustTillBranchingMaintenanceAddNew selecttillId() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.tillId.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.tillId.Dropdown.123.Xpath")));
		return this;
	}
	
	public IcustTillBranchingMaintenanceAddNew selectparentVaultId() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.parentVaultId.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.parentVaultId.Dropdown.TMRoleDesc.Xpath")));
		return this;
	}
	
	
	public IcustTillBranchingMaintenanceAddNew entername() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.name.Xpath")), props.getProperty("shortOvgGl"));
		return this;
	}
	
	
	public IcustTillBranchingMaintenanceAddNew clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.TillBranching.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}

}
	
