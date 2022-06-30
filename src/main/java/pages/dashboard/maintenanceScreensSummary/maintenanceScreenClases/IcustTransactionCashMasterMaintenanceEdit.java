package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustTransactionCashMasterMaintenanceEdit extends IcustSpecificMethods{
	
	
	public IcustTransactionCashMasterMaintenanceEdit editRemark() {
		enterValue(locateElement("xpath", props.getProperty("EditTransactionCashMasterMaintenance.editRemark.Xpath")), props.getProperty("EditRemark"));
		return this;
      }
	
	public IcustTransactionCashMasterMaintenanceEdit clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EditTransactionCashMasterMaintenance.clickSave.Xpath")));
		return this;
      }
}
