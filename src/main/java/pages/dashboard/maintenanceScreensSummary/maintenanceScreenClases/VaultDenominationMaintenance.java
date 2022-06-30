package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class VaultDenominationMaintenance extends IcustSpecificMethods {
	public IcustVaultDenominationMaintenanceAddNew clickAddnew(){
		clickElement(locateElement("xpath", props.getProperty("VaultDenominationMaintenance.Addnew.Xpath")));
		return new IcustVaultDenominationMaintenanceAddNew();	
	}
	public IcustVaultDenominationMaintenanceEdit clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("VaultDenominationMaintenance.Edit.Xpath")));
		return new IcustVaultDenominationMaintenanceEdit();
	}
	

}
