package pages;

import base.IcustSpecificMethods;
import pages.dashboard.maintenanceScreensSummary.MaintenanceMenus;

public class IcustMaintenance extends IcustSpecificMethods{
	public MaintenanceMenus clickMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		return new MaintenanceMenus();
		
	}
	

}
