package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustVaultCurrencyDenominationEdit extends IcustSpecificMethods {
	public IcustVaultCurrencyDenominationEdit enterDenominationcode() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultCurrencyDenomination.Denominationcode.Xpath")), props.getProperty("Denominationcode"));
		return  this;
	}
	public IcustVaultCurrencyDenominationEdit clickUpdate() {
		clickElement(locateElement("xpath", props.getProperty("EditVaultCurrencyDenomination.Update.Xpath")));
		return this;
	}
	
	

}
