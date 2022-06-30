package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustTillConfigurationAddNew extends IcustSpecificMethods{

	public IcustTillConfigurationAddNew selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillconfigurationMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillconfigurationMaintenance.Xpath")));
		return this;
	}
	
	
	public IcustTillConfigurationAddNew selectEntitycode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Entitycode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Entitycode.Dropdown.TEST.Xpath")));
		return this;
	}
	
	public IcustTillConfigurationAddNew selectBankcode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Bankcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Bankcode.Dropdown.sd3.Xpath")));
		return this;
	}
	
	public IcustTillConfigurationAddNew selectBranchcode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Branchcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Branchcode.Dropdown.KR.Xpath")));
		return this;
	}
	

	public IcustTillConfigurationAddNew selectcurrency() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.currency.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.currency.Dropdown.RUB.Xpath")));
		return this;
	}
	
	
	public IcustTillConfigurationAddNew enterminCashHolding() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.minCashHolding.Xpath")), props.getProperty("minCashHolding"));
		return this;
	}
	
	public IcustTillConfigurationAddNew entermaxCashHolding() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.maxCashHolding.Xpath")), props.getProperty("maxCashHolding"));
		return this;
	}
	
	public IcustTillConfigurationAddNew selecttillId() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.tillId.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.tillId.Dropdown.123.Xpath")));
		return this;
	}
	
	public IcustTillConfigurationAddNew clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}

}
	