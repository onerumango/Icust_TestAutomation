package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustVaultCurrencyDenominationAddNew extends IcustSpecificMethods {
	public IcustVaultCurrencyDenominationAddNew enterDenominationcode() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencyDenomination.Denominationcode.Xpath")), props.getProperty("Denominationcode"));
		return  this;
	}
	
	public IcustVaultCurrencyDenominationAddNew enterOpenunitsbalance() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencyDenomination.Openunitsbalance.Xpath")), props.getProperty("OpenUnitsBlance"));
		return  this;

}
	
	public IcustVaultCurrencyDenominationAddNew enterUnitsbalance() {
		enterValue(locateElement("xpath", props.getProperty("AddVaultCurrencyDenomination.Unitsbalance.Xpath")), props.getProperty("UnitsBlance"));
		return  this;
}
	public IcustVaultCurrencyDenominationAddNew clickSave() {
		clickElement(locateElement("xpath", props.getProperty("AddVaultCurrencyDenomination.save.Xpath")));
		return this;
	}
	
}