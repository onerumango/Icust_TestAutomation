package pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class EditVaultCurrencyDenomination extends IcustSpecificMethods {
	public EditVaultCurrencyDenomination enterDenominationcode() {
		enterValue(locateElement("xpath", props.getProperty("EditVaultCurrencyDenomination.Denominationcode.Xpath")), props.getProperty("Denominationcode"));
		return  this;
	}
	public EditVaultCurrencyDenomination clickUpdate() {
		clickElement(locateElement("xpath", props.getProperty("EditVaultCurrencyDenomination.Update.Xpath")));
		return this;
	}
	
	

}
