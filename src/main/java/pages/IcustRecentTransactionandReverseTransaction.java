package pages;

import base.IcustSpecificMethods;

public class IcustRecentTransactionandReverseTransaction  extends IcustSpecificMethods {
	
	public IcustRecentTransactionandReverseTransaction clickReverseTransactionButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.Icust.ReverseTransaction.clickReverseTransaction.Xpath")));
		return this;
	}

}
