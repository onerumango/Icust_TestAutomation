package pages.dashboard.maintenanceScreensSummary.maintenanceClass;

import base.IcustSpecificMethods;

public class IcustBranchMaintenanceAddEditDelete extends IcustSpecificMethods{

	public IcustBranchMaintenanceAddEditDelete clickAddNew() {
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.AddNewButton.xpath")));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete selectBankName() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.BankName.Dropdown.xpath")));
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.BankName.Dropdown.12AB.xpath")));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete enterBranchName() {
		enterValue(locateElement("xpath", props.getProperty("maintenance.BranchMaintenance.BranchName.xpath")), props.getProperty("BranchName"));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete enterBranchCode() {
		enterValue(locateElement("xpath", props.getProperty("maintenance.BranchMaintenance.BranchCode.xpath")), props.getProperty("BranchCode"));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete selectBranchCurency() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.BranchCurrency.Dropdown.xpath")));
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.BranchCurrency.INR.xpath")));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete enterBranchDetails() {
		enterValue(locateElement("xpath", props.getProperty("maintenance.BranchMaintenance.BranchDetails.xpath")), props.getProperty("BranchDetails"));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete enterAddress1() {
		enterValue(locateElement("xpath", props.getProperty("maintenance.BranchMaintenance.address1.xpath")), props.getProperty("Address1"));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete enterAddress2() {
		enterValue(locateElement("xpath", props.getProperty("maintenance.BranchMaintenance.address2.xpath")), props.getProperty("Address2"));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete selectCountry() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.Country.Dropdown.xpath")));
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.Country.Dropdown.India.xpath")));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete selectState() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.State.Dropdown.xpath")));
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.Country.Dropdown.Karnataka.xpath")));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete selectCity() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.City.Dropdown.xpath")));
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.City.Dropdown.Bangalore.xpath")));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete enterPincode() {
		enterValue(locateElement("xpath", props.getProperty("maintenance.BranchMaintenance.Pincode.xpath")), props.getProperty("Pincode"));
		return this;
	}
	public IcustBranchMaintenanceAddEditDelete clickSaveButton() {
		clickElement(locateElement("xpath",props.getProperty("maintenance.BranchMaintenance.Save.xpath")));
		return this;
	}
}
