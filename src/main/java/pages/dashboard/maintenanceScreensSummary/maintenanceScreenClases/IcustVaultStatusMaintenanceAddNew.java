package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustVaultStatusMaintenanceAddNew extends IcustSpecificMethods{
	public IcustVaultStatusMaintenanceAddNew clickEntitycodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.EntitycodeDropdown.Xpath")));
		return this;
	}
	public IcustVaultStatusMaintenanceAddNew clickVaultstatusEntitycodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.VaultStatusEntitycode.Xpath")));
		return this;
	}
	public IcustVaultStatusMaintenanceAddNew clickVaultstatusBankcodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.BankcodeDropdown.Xpath")));
		return this;
}
	public IcustVaultStatusMaintenanceAddNew clickVaultstatusBankcodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.VaultStatusBankcode.Xpath")));
		return this;
	}
	
	public IcustVaultStatusMaintenanceAddNew clickBranchCode() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.Branchcode.Xpath")));
		return this;
}
	public IcustVaultStatusMaintenanceAddNew clickBranchCodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.BranchcodeDropdown.Xpath")));
		return this;
	}
	public IcustVaultStatusMaintenanceAddNew clickTillId() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.TillId.Xpath")));
		return this;
	}
	public IcustVaultStatusMaintenanceAddNew clickTillIdValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.TillIdDropdown.Xpath")));
		return this;
	}
	public IcustVaultStatusMaintenanceAddNew enterVaultStatusUserid() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.VaultstatusUserid.Xpath")),props.getProperty("Userid"));
		return this;
	}
	public IcustVaultStatusMaintenanceAddNew enterTillVaultStatus() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.TillVaultstatus.Xpath")),props.getProperty("TillVaultStatus"));
		return this;
	}
	public IcustVaultStatusMaintenanceAddNew clickTvOpentime() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultStatusMaintenance.Tvopentime.Xpath")));
		return this;
	}
	
}
