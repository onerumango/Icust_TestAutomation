package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustTransactionChargesMaintenanceAddNew extends IcustSpecificMethods{
	
	public IcustTransactionChargesMaintenanceAddNew enterChargeAmount() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.ChargeAmount.Xpath")), props.getProperty("ChargeAmount"));
		return this;
	}
	
	public  IcustTransactionChargesMaintenanceAddNew clickChargeCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.ChargeCurrency.Xpath")));
		return this;
	}
	public  IcustTransactionChargesMaintenanceAddNew SelectChargeCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.ChargeCurrencySelectValue.Xpath")));
		return this;
	}
	public IcustTransactionChargesMaintenanceAddNew enterChargeDescription() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.ChargeDescription.Xpath")), props.getProperty("ChargeDescription"));
		return this;
	}
	
	public  IcustTransactionChargesMaintenanceAddNew clickTransactionDate() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.TransactionDate.Xpath")));
		return this;
	}
	public  IcustTransactionChargesMaintenanceAddNew SelectTransactionDate() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.TransactionDateSelectValue.Xpath")));
		return this;
	}
	public IcustTransactionChargesMaintenanceAddNew enterTransactionReference() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.TransactionReference.Xpath")), props.getProperty("TransactionReference"));
		return this;
	}
	public  IcustTransactionChargesMaintenanceAddNew ClickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionChargesMaintenance.SaveButton.Xpath")));
		return this;
	}
	
}