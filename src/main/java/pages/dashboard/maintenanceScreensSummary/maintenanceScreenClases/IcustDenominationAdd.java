package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustDenominationAdd extends IcustSpecificMethods{
	
	public  IcustDenominationAdd clickEntityCode() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.Entitycode.Xpath")));
		return this;
	}
	public IcustDenominationAdd clickEntityValue() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.EntityDropdown.Xpath")));
		return this;
	}
	public IcustDenominationAdd clickBankCode() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.Bankcode.Xpath")));
		return this;
	}
	public IcustDenominationAdd clickBankCodeValue() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.BankcodeDropdown.Xpath")));
		return this;
	}
	public IcustDenominationAdd clickCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.Currency.Xpath")));
		return this;
		}
	public IcustDenominationAdd clickCurrencyValue() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.CurrencyDropdown.Xpath")));
		return this;
	}
	public IcustDenominationAdd enterDenomCode() {
		enterValue(locateElement("xpath", props.getProperty("AddDenomination.Denomcode.Xpath")), props.getProperty("Denomcode"));
		return this;
	}
	public IcustDenominationAdd enterDenomDesc() {
		enterValue(locateElement("xpath", props.getProperty("AddDenomination.Denomdesc.Xpath")), props.getProperty("Denomdesc"));
		return this;
	}
	public IcustDenominationAdd enterDenomValue() {
		enterValue(locateElement("xpath", props.getProperty("AddDenomination.Denomvalue.Xpath")), props.getProperty("Denomvalue"));
		return this;
		}
	public IcustDenominationAdd clickSave() {
		clickElement(locateElement("xpath", props.getProperty("AddDenomination.save.Xpath")));
		return this;
	}
	
}
