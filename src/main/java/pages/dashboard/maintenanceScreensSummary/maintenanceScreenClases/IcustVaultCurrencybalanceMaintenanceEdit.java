package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustVaultCurrencybalanceMaintenanceEdit extends IcustSpecificMethods{
	
	public IcustVaultCurrencybalanceMaintenanceEdit editOpenbalnceinLCY() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultCurrencybalanceMaintenance.EditOpenbalnceinLCY.Xpath")),props.getProperty("OpenbalnceinLCY"));
		return this;
	}
	
	public IcustVaultCurrencybalanceMaintenanceEdit editBalnceinACY() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultCurrencybalanceMaintenance.EditBalnceinACY.Xpath")),props.getProperty("OpenbalnceinACY"));
		return this;
	}
	public IcustVaultCurrencybalanceMaintenanceEdit clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EditVaultCurrencybalanceMaintenance.Save.Xpath")));
		return this;
	}

}
