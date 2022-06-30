package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class TransactionChargesMaintenance extends IcustSpecificMethods{
	
	
	public IcustTransactionChargesMaintenanceAddNew clickAddnew(){
		clickElement(locateElement("xpath", props.getProperty("TransactionChargesMaintenance.Addnew.Xpath")));
		return new IcustTransactionChargesMaintenanceAddNew();	
	}
	public IcustTransactionChargesMaintenanceEdit clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("TransactionChargesMaintenance.Edit.Xpath")));
		return new IcustTransactionChargesMaintenanceEdit();
	}	


}
