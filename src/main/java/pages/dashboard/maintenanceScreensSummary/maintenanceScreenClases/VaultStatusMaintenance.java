package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

public class VaultStatusMaintenance extends IcustSpecificMethods{
	public IcustVaultStatusMaintenanceAddNew clickAddnew() {
		clickElement(locateElement("xpath", props.getProperty("VaultStatusMaintenance.Addnew.Xpath")));
		return new IcustVaultStatusMaintenanceAddNew();	
	}
	public IcustVaultStatusMaintenanceEdit clickEdit() {
		clickElement(locateElement("xpath", props.getProperty("VaultStatusMaintenance.Edit.Xpath")));
		return new IcustVaultStatusMaintenanceEdit();
	}
	}


