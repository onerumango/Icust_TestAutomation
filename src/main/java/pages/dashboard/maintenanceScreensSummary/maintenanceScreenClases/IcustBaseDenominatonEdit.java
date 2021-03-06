package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustBaseDenominatonEdit extends IcustSpecificMethods{

	public IcustBaseDenominatonEdit selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.BaseDenominationMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.BaseDenomination.Edit.Maintenance.Xpath")));
		return this;
	}
	
	public IcustBaseDenominatonEdit selectCurrency() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.Edit.Currency.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.Edit.Currency.Dropdown.CNY.Xpath")));
		return this;
	}
	
	
	public IcustBaseDenominatonEdit clickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.AddNew.Save.Xpath")));
		return this;
	}
}