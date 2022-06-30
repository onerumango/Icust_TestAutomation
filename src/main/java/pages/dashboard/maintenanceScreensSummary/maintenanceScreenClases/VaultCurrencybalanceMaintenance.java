package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class VaultCurrencybalanceMaintenance extends IcustSpecificMethods {
	public IcustVaultCurrencybalanceMaintenanceAddNew clickAddnew() {
		clickElement(locateElement("xpath", props.getProperty("VaultCurrencybalanceMaintenance.Addnew.Xpath")));
		return new IcustVaultCurrencybalanceMaintenanceAddNew();	
	}
	public IcustVaultCurrencybalanceMaintenanceEdit clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("VaultCurrencybalanceMaintenance.Edit.Xpath")));
		return new IcustVaultCurrencybalanceMaintenanceEdit();
	}
	

}
