package pages.dashboard.maintenanceScreensSummary.maintenanceClass;

import base.IcustSpecificMethods;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustBankMaintenanceAdd;

public class IcustBankMaintenanceAddEditDelete extends IcustSpecificMethods {
	
	public IcustBankMaintenanceAddEditDelete clickAddNew() {
		clickElement(locateElement("xpath",props.getProperty("maintenance.BankMaintenance.AddNewButton.xpath")));
		return this;
	}
	public IcustBankMaintenanceAddEditDelete enterBankName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.BankName.Xpath")), props.getProperty("BankName"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete enterBankCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.BankCode.Xpath")), props.getProperty("BankCode"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete enterSwiftCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.SwiftCode.Xpath")), props.getProperty("SwiftCode"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete selectBankCurrency() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.BankCurrency.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.BankCurrency.Dropdown.INR.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete selectDefaultLanguage() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.DefaultLanguage.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.DefaultLanguage.Dropdown.English.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete enterHeadOfficeBranch() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.HeadOfficeBranch.Xpath")), props.getProperty("HeadOfficeBranch"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete selectDenominationRequired() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.DenominationRequired.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.DenominationRequired.Dropdown.Yes.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete selectEntityCode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.EntityCode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.EntityCode.Dropdown.2353.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete enterAddress1() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Address1.Xpath")), props.getProperty("Address1"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete enterAddress2() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Address2.Xpath")), props.getProperty("Address2"));
		return this;
	}
	public IcustBankMaintenanceAddEditDelete selectCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Country.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Country.Dropdown.India.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete selectState() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.State.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.State.Dropdown.Karnataka.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete selectCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.City.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.City.Dropdown.Bangalore.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete enterPincode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Pincode.Xpath")), props.getProperty("Pincode"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete enterMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.MobileNumber.Xpath")), props.getProperty("MobileNumber"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete enterPhoneNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.PhoneNumber.Xpath")), props.getProperty("PhoneNumber"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}
	
}
