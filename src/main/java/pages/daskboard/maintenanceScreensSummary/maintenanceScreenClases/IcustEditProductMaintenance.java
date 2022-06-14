package pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustEditProductMaintenance extends IcustSpecificMethods{

	public IcustEditProductMaintenance selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.ProductMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.Product.Edit.Maintenance.Xpath")));
		return this;
	}
	
	public IcustEditProductMaintenance selectProductCode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.ProductMaintenance.Edit.Productcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.ProductMaintenance.Edit.Productcode.Dropdown.CQW.Xpath")));
		return this;
	}
	
	
	public IcustEditProductMaintenance clickSaveButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.ProductMaintenance.Edit.Save.Xpath")));
		return this;
	}
}