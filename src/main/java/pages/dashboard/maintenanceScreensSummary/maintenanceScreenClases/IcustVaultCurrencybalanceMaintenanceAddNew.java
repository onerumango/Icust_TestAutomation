package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustVaultCurrencybalanceMaintenanceAddNew extends IcustSpecificMethods {
	public IcustVaultCurrencybalanceMaintenanceAddNew clickEntitycodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.EntitycodeDropdown.Xpath")));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew clickVaultCurrencyblanceEntitycodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.VaultCurrencyblanceEntitycodeValue.Xpath")));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew clickVaultcurrencyBalanceBankcodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.VaultcurrencyBalanceBankcodeDropdown.Xpath")));
		return this;
}
	public IcustVaultCurrencybalanceMaintenanceAddNew clickVaultcurrencyBalanceBankcodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.VaultcurrencyBalanceBankcodeValue.Xpath")));
		return this;
	}
	
	public IcustVaultCurrencybalanceMaintenanceAddNew clickBranchCode() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.Branchcode.Xpath")));
		return this;
}
	public IcustVaultCurrencybalanceMaintenanceAddNew clickBranchCodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.BranchcodeDropdown.Xpath")));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew clickTillId() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.TillId.Xpath")));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew clickTillIdValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.TillIdDropdown.Xpath")));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew clickCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.Currency.Xpath")));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew clickCurrencyValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.CurrencyValue.Xpath")));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew enterGLAccount() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.Glaccount.Xpath")),props.getProperty("GLAccount"));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew enterOpenbalnceinACY() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.OpenbalnceinACY.Xpath")),props.getProperty("OpenbalnceinACY"));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew enterOpenbalnceinLCY() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.OpenbalnceinLCY.Xpath")),props.getProperty("OpenbalnceinLCY"));
		return this;
	}
	
	public IcustVaultCurrencybalanceMaintenanceAddNew enterBalnceinACY() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.BalnceinACY.Xpath")),props.getProperty("balnceinACY"));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew enterBalnceinLCY() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.BalnceinLCY.Xpath")),props.getProperty("balnceinLCY"));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceAddNew clickSave() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencybalanceMaintenance.Save.Xpath")));
		return this;
	}
	
}
