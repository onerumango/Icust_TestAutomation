
package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustStateMaintenanceEdit extends IcustSpecificMethods{

	public IcustStateMaintenanceEdit selectMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.CountryAndState.Edit.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.Xpath")));
		return this;
	}
	
	public IcustStateMaintenanceEdit enterStateCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.StateCode.Xpath")), props.getProperty("Edit_StateCode"));
		return this;
	}
	
	public IcustStateMaintenanceEdit enterStateCode2() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.StateCode2.Xpath")), props.getProperty("Edit_StateCode2"));
		return this;
	}
	public IcustStateMaintenanceEdit enterStateName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.StateName.Xpath")), props.getProperty("Edit_StateName"));
		return this;
	}
	
	public IcustStateMaintenanceEdit enterStateNumericCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.StateNumericCode.Xpath")), props.getProperty("Edit_StateNumericCode"));
		return this;
		
	}
	
	public IcustStateMaintenanceEdit enterRecordStatus() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.RecordStatus.Xpath")), props.getProperty("Edit_RecordStatus"));
		return this;
		
	}
	
	
	public IcustStateMaintenanceEdit selectUpdate() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.State.Edit.Update.Xpath")));
		return this;
	}
}
