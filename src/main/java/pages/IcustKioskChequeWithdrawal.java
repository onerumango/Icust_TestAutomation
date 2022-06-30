package pages;

import base.ICUSTKIOSKMethods;

public class IcustKioskChequeWithdrawal extends ICUSTKIOSKMethods {
	
	public IcustKioskChequeWithdrawal clickDashboardContinue2() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_DashBoard.ContinueChequeWithdrawal")));
		wait(1000);
		return this;
	}
	public IcustKioskChequeWithdrawal clickSavings() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_ChequeWithdrawal.Account_type_Dropdown")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_ChequeWithdrawal.Account_type_Dropdown_Savings")));
		return this;
	}
	public IcustKioskChequeWithdrawal clickCQWDAccountNumber() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CQWD_AccountNumber_Dropdown")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CQWD_AccountNumber_Dropdown_Number")));
		return this;
	}
	public IcustKioskChequeWithdrawal enterCQWDTransactionAmount() {
		enterValue(locateElement("xpath", props.getProperty("IcustKiosk_CQWD.Transaction_Amount1")),props.getProperty("CQWDTransactionAmount"));
		wait(1000);
		return this;
	}
	public IcustKioskChequeWithdrawal enterCQWDChequeNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustKiosk_CQWD.Cheque_Number")),props.getProperty("CQWDCheque_Number"));	
		wait(1000);
		return this;
	}
	public IcustKioskChequeWithdrawal clickCQWDDenomination() {
		enterValue(locateElement("xpath", props.getProperty("IcustKiosk_CQWD_Denomination")),props.getProperty("CQWDDenominationNumber"));
		wait(1000);
		return this;
	}
	public IcustKioskChequeWithdrawal clickCQWDContinue() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_CQWD.Continue")));
		wait(1000);
		return this;
		}
}
