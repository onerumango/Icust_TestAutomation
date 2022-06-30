package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustVaultDenominationMaintenanceEdit extends IcustSpecificMethods {
	public IcustVaultDenominationMaintenanceEdit editDenominationCode() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultDenominationMaintenance.DenominationCode.Xpath")),props.getProperty("DenomninationCode"));
		return this;
	}
	public IcustVaultDenominationMaintenanceEdit editUnits() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultDenominationMaintenance.Units.Xpath")),props.getProperty("Units"));
		return this;
	}
	public IcustVaultDenominationMaintenanceEdit clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EditVaultDenominationMaintenance.Save.Xpath")));
		return this;
	}

}
