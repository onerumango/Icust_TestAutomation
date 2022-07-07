package pages.dashboard.maintenanceScreensSummary.maintenanceClass;

import base.IcustSpecificMethods;
public class IcustEntityMaintenanceAddEditDelete extends IcustSpecificMethods {
	
	public IcustEntityMaintenanceAddEditDelete clickAddNew() {
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Xpath")));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete enterEntityCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.EntityCode.Xpath")), props.getProperty("EntityCode"));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete enterEntityName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.EntityName.Xpath")), props.getProperty("EntityName"));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete selectDenominationRequired() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.DenominationRequired.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.DenominationRequired.Dropdown.Yes.Xpath")));
		return this;
	}
	
	
	public IcustEntityMaintenanceAddEditDelete selectCountry() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Country.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Country.Dropdown.India.Xpath")));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete selectState() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.State.Dropdown.Xpath")));
		wait(3000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.State.Dropdown.Karnataka.Xpath")));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete selectCity() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.City.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.City.Dropdown.Bangalore.Xpath")));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete enterPincode() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Pincode.Xpath")), props.getProperty("Pincode"));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete enterMobileNumber() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.MobileNumber.Xpath")), props.getProperty("MobileNumber"));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete enterPhoneNumber() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.PhoneNumber.Xpath")), props.getProperty("PhoneNumber"));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Entity.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete clickEditButton() {
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.Xpath")));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete editEntityCode() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.EntityCode.Xpath")), props.getProperty("Edit_EntityCode"));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete editEntityName() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.EntityName.Xpath")), props.getProperty("Edit_EntityName"));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete editDenominationRequired() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.DenominationRequired.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.DenominationRequired.Dropdown.No.Xpath")));
		return this;
	}
	
	
	public IcustEntityMaintenanceAddEditDelete editPincode() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.Pincode.Xpath")), props.getProperty("Edit_Pincode"));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete editMobileNumber() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.MobileNumber.Xpath")), props.getProperty("Edit_MobileNumber"));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete editPhoneNumber() {
		wait(2000);
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.PhoneNumber.Xpath")), props.getProperty("Edit_PhoneNumber"));
		return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete clickUpdateButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Entity.Edit.Update.Xpath")));
		wait(5000);
        return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete clickDeleteButton() {
		wait(5000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Entity.Delete.Xpath")));
		wait(2000);
        return this;
	}
	
	public IcustEntityMaintenanceAddEditDelete clickDeleteOkButton() {
		wait(5000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Entity.Delete.ok.Xpath")));
		wait(5000);
        return this;
	}


}
