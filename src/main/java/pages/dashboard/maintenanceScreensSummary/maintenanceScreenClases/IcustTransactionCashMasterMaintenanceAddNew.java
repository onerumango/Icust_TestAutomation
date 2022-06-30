package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustTransactionCashMasterMaintenanceAddNew extends IcustSpecificMethods{
	
	public  IcustTransactionCashMasterMaintenanceAddNew clickEntityCode() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.EntityCode.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew selectEntityValue() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.EntityCodeSelectValue.Xpath")));
		return this;
	}
	public  IcustTransactionCashMasterMaintenanceAddNew clickBankCode() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.BankCode.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew selectBankCode() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.BankCodeSelectValue.Xpath")));
		return this;
	}
	public  IcustTransactionCashMasterMaintenanceAddNew clickBranchCode() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.BranchCode.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew selectBranchCode() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.BranchCodeSelectValue.Xpath")));
		return this;
	}
	public  IcustTransactionCashMasterMaintenanceAddNew clickTillId() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TillId.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew selectTillId() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TillIdSelectValue.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterTransactionProduct() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionProduct.Xpath")), props.getProperty("EnterTransactionProduct"));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterTransactionReference() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionReference.Xpath")), props.getProperty("EnterTransactionReference"));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterAmount() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.Amount.Xpath")), props.getProperty("EnterAmount"));
		return this;
	}
	public  IcustTransactionCashMasterMaintenanceAddNew clickAccountCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.AccountCurrency.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew selectAccountCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.AccountCurrencySelectValue.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterAccountBalance() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.AccountBalance.Xpath")), props.getProperty("AccountBalance"));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterInstrument() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.Instrument.Xpath")), props.getProperty("Instrument"));
		return this;
	}
	public  IcustTransactionCashMasterMaintenanceAddNew clickTransactionCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionCurrency.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew selectTransactionCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionCurrencySelectValue.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterTransactionAmount() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionAmount.Xpath")), props.getProperty("TransactionAmount"));
		return this;
	}
	public  IcustTransactionCashMasterMaintenanceAddNew clickOfsCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.OfsCurrency.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew selectOfsCurrency() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.OfsCurrencySelectValue.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterOfsAmount() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.OfsAmount.Xpath")), props.getProperty("OfsAmount"));
		return this;
	}
	public  IcustTransactionCashMasterMaintenanceAddNew clickTransactionDate() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionDate.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew selectTransactionDate() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.TransactionDateSelectValue.Xpath")));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterForexRate() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.ForexRate.Xpath")), props.getProperty("ForexRate"));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterForexNegotiationRate() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.ForexNegotiationRate.Xpath")), props.getProperty("ForexNegotiationRate"));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterChargeAmount() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.ChargeAmount.Xpath")), props.getProperty("ChargeAmount"));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew enterRemark() {
		enterValue(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.Remark.Xpath")), props.getProperty("Remark"));
		return this;
	}
	public IcustTransactionCashMasterMaintenanceAddNew clickSave() {
		clickElement(locateElement("xpath", props.getProperty("AddTransactionCashMasterMaintenance.clickSave.Xpath")));
		return this;
	}
	
}
