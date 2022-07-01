package pages;

import base.IcustSpecificMethods;

public class IcustTokenServicesChequeDeposit extends IcustSpecificMethods{
	
	public IcustTokenServicesChequeDeposit clickChequeDeposit() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.clickChequeDeposit.Xpath")));
		return this;
	}
	public IcustTokenServicesChequeDeposit enterAccountNumber() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CW.enterAccountNUmber.Xpath")), props.getProperty("AccountNumber"));
        return this;
	}
	public IcustTokenServicesChequeDeposit clickFetchlink() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CW.clickFetch.Xpath")));
		wait(20000);
		return this;
	}
	public IcustTokenServicesChequeDeposit enterChequeNumber() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CW.enterChequeNumber.Xpath")), props.getProperty("ChequeNumber"));
        return this;
	}
	public IcustTokenServicesChequeDeposit enterTransactionAmount() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CW.enterTrAmount.Xpath")), props.getProperty("TransactionAmount"));
        return this;
	}
	public IcustTokenServicesChequeDeposit clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CW.clickSaveButton.Xpath")));
		wait(5000);
        return this;
	}

}
