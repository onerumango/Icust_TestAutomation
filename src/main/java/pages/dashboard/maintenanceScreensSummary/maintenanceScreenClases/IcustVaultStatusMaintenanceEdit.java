package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustVaultStatusMaintenanceEdit extends IcustSpecificMethods {
	public IcustVaultStatusMaintenanceEdit editUserid() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultStatusMaintenance.EditUserid.Xpath")),props.getProperty("Userid"));
		return this;
	}
	
	public IcustVaultStatusMaintenanceEdit editTillvaultstatus() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultStatusMaintenance.editTillvaultstatus.Xpath")),props.getProperty("TillVaultStatus"));
		return this;
	}
	public IcustVaultStatusMaintenanceEdit clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EditVaultCurrencyDenomination.Save.Xpath")));
		return this;
	}
	

}
