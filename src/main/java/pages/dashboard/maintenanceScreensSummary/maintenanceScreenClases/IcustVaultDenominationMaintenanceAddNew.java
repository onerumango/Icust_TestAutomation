package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustVaultDenominationMaintenanceAddNew extends IcustSpecificMethods {
	public IcustVaultDenominationMaintenanceAddNew clickEntitycodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.EntitycodeDropdown.Xpath")));
		return this;
	}
	public IcustVaultDenominationMaintenanceAddNew clickVaultDenominationMaintenanceEntitycodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.VaultDenominationEntitycodeValue.Xpath")));
		return this;
	}
	public IcustVaultDenominationMaintenanceAddNew clickVaultDenominationMaintenanceBankcodeDropdown() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.VaultDenominationBankcodeDropdown.Xpath")));
		return this;
}
	public IcustVaultDenominationMaintenanceAddNew clickVaultDenominationMaintenanceBankcodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.VaultDenominationBankcodeValue.Xpath")));
		return this;
	}
	
	public IcustVaultDenominationMaintenanceAddNew clickBranchCode() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.Branchcode.Xpath")));
		return this;
}
	public IcustVaultDenominationMaintenanceAddNew clickBranchCodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.BranchcodeDropdown.Xpath")));
		return this;
	}
	public IcustVaultDenominationMaintenanceAddNew clickTillId() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.TillId.Xpath")));
		return this;
	}
	public IcustVaultDenominationMaintenanceAddNew clickTillIdValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.TillIdDropdown.Xpath")));
		return this;
	}
	public IcustVaultDenominationMaintenanceAddNew clickCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.Currency.Xpath")));
		return this;
	}
	public IcustVaultDenominationMaintenanceAddNew clickCurrencyValue() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.CurrencyValue.Xpath")));
		return this;
	}
	public IcustVaultDenominationMaintenanceAddNew enterDenominationCode() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.DenominationCode.Xpath")),props.getProperty("DenomninationCode"));
		return this;
	}
	public IcustVaultDenominationMaintenanceAddNew enterUnits() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.Units.Xpath")),props.getProperty("Units"));
		return this;
	}
	public IcustVaultDenominationMaintenanceAddNew clickSave() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultDenominationMaintenance.Save.Xpath")));
		return this;
	}
	
}
