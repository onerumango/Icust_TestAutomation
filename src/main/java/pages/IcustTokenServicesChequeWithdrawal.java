package pages;

import base.IcustSpecificMethods;

public class IcustTokenServicesChequeWithdrawal extends IcustSpecificMethods{
	public IcustTokenServicesChequeWithdrawal clickChequeWithdrawal() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.clickChequeWithdrawal.Xpath")));
		return this;
	}
	public IcustTokenServicesChequeWithdrawal enterAccountNumber() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CW.enterAccountNUmber.Xpath")), props.getProperty("AccountNumber"));
        return this;
	}
	public IcustTokenServicesChequeWithdrawal clickFetchlink() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CW.clickFetch.Xpath")));
		wait(20000);
		return this;
	}
	public IcustTokenServicesChequeWithdrawal enterChequeNumber() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CW.enterChequeNumber.Xpath")), props.getProperty("ChequeNumber"));
        return this;
	}
	public IcustTokenServicesChequeWithdrawal enterTransactionAmount() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.CW.enterTrAmount.Xpath")), props.getProperty("TransactionAmount"));
        return this;
	}
	public IcustTokenServicesChequeWithdrawal clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustTellerDashboard.TokenServices.CW.clickSaveButton.Xpath")));
		wait(5000);
        return this;
	}

}
