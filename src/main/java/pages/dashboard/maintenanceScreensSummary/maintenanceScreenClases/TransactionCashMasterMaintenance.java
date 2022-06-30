package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class TransactionCashMasterMaintenance extends IcustSpecificMethods{

	
	public IcustTransactionCashMasterMaintenanceAddNew clickAddnew(){
		clickElement(locateElement("xpath", props.getProperty("TransactionCashMasterMaintenance.Addnew.Xpath")));
		return new IcustTransactionCashMasterMaintenanceAddNew();	
	}
	public IcustTransactionCashMasterMaintenanceEdit clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("TransactionCashMasterMaintenance.Edit.Xpath")));
		return new IcustTransactionCashMasterMaintenanceEdit();
	}	


}
