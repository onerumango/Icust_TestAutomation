package pages;

import base.ICUSTKIOSKMethods;

public class IcustKioskChequeDeposit extends ICUSTKIOSKMethods{
	
	public IcustKioskChequeDeposit clickDashboardContinue1() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_DashBoard.Continue")));
		wait(1000);
		return this;
	}
	public IcustKioskChequeDeposit clickSavings() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_ChequeDeposit.Account_type_Dropdown")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_ChequeDeposit.Account_type_Dropdown_Savings")));
		return this;
	}
	public IcustKioskChequeDeposit clickAccountNumber() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_AccountNumber_Dropdown")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_AccountNumber_Dropdown_Number")));
		return this;
	}
	public IcustKioskChequeDeposit enterTransactionAmount() {
		enterValue(locateElement("xpath", props.getProperty("IcustKiosk_ChequeDeposit.Transaction_Amount1")),props.getProperty("TransactionAmount"));
		wait(1000);
		return this;
	}
	public IcustKioskChequeDeposit enterChequeNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustKiosk_ChequeDeposit.Cheque_Number")),props.getProperty("Cheque_Number"));	
		wait(1000);
		return this;
	}
	public IcustKioskChequeDeposit clicklastContinue() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_ChequeDeposit.Continue")));
		wait(1000);
		return this;
		}
	public IcustKioskChequeDeposit clickLogout() {
		clickElement(locateElement("xpath", props.getProperty("IcustKiosk_ChequeDeposit.clickLogout")));
		wait(1000);
		return this;
		}
	
	
	

}
