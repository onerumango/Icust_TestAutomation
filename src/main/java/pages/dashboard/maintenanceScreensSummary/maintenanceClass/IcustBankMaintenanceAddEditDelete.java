package pages.dashboard.maintenanceScreensSummary.maintenanceClass;

import base.IcustSpecificMethods;


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
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.State.Dropdown.Xpath")));
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.AddNew.State.Dropdown.Karnataka.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete selectCity() {
		wait(3000);
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
	public IcustBankMaintenanceAddEditDelete clickEditButton() {
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Xpath")));
		return this;
	}
	public IcustBankMaintenanceAddEditDelete editBankName() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.BankName.Xpath")), props.getProperty("Edit_BankName"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editBankCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.BankCode.Xpath")), props.getProperty("Edit_BankCode"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editSwiftCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.SwiftCode.Xpath")), props.getProperty("Edit_SwiftCode"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editBankCurrency() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.BankCurrency.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.BankCurrency.Dropdown.INR.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editDefaultLanguage() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.DefaultLanguage.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.DefaultLanguage.Dropdown.English.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editHeadOfficeBranch() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.HeadOfficeBranch.Xpath")), props.getProperty("Edit_HeadOfficeBranch"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editDenominationRequired() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.DenominationRequired.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.DenominationRequired.Dropdown.Yes.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editEntityCode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.EntityCode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.EntityCode.Dropdown.2353.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editAddress1() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Address1.Xpath")), props.getProperty("Edit_Address1"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editAddress2() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Address2.Xpath")), props.getProperty("Edit_Address2"));
		return this;
	}
	public IcustBankMaintenanceAddEditDelete editCountry() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Country.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Country.Dropdown.India.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editState() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.State.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.State.Dropdown.Karnataka.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editCity() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.City.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.City.Dropdown.Bangalore.Xpath")));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editPincode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Pincode.Xpath")), props.getProperty("Edit_Pincode"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editMobileNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.MobileNumber.Xpath")), props.getProperty("Edit_MobileNumber"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete editPhoneNumber() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.PhoneNumber.Xpath")), props.getProperty("Edit_PhoneNumber"));
		return this;
	}
	
	public IcustBankMaintenanceAddEditDelete clickUpdateButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.Bank.Edit.Update.Xpath")));
		wait(5000);
        return this;
	}

	
}
