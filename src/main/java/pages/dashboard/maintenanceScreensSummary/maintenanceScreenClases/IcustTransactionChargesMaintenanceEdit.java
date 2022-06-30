package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class IcustTransactionChargesMaintenanceEdit extends IcustSpecificMethods{
	
	public IcustTransactionChargesMaintenanceEdit editChargeDescription() {
		enterValue(locateElement("xpath", props.getProperty("EditTransactionChargesMaintenance.ChargeDescription.Xpath")), props.getProperty("EditChargeDescription"));
		return this;
      }	
	public IcustTransactionChargesMaintenanceEdit clickUpdateButton() {
		clickElement(locateElement("xpath", props.getProperty("EditTransactionChargesMaintenance.UpdateButton.Xpath")));
		return this;
      }	
	
	
}
