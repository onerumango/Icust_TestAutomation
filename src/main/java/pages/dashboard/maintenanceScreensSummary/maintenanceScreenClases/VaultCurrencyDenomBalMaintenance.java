package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class VaultCurrencyDenomBalMaintenance extends IcustSpecificMethods{
	
	public IcustVaultCurrencyDenominationAddNew clickAddNew() {
		clickElement(locateElement("xpath", props.getProperty("VaultCurrencyDenomBalMaintenance.Addnew.Xpath")));
		return new IcustVaultCurrencyDenominationAddNew();
		
	}
	public IcustVaultCurrencyDenominationEdit clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("VaultCurrencyDenomBalMaintenance.Edit.Xpath")));
		return new IcustVaultCurrencyDenominationEdit();
	}

}
