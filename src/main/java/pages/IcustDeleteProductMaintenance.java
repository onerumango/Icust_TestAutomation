package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustDeleteProductMaintenance extends IcustSpecificMethods{

	public IcustDeleteProductMaintenance selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.ProductMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.Product.Delete.Maintenance.Xpath")));
		return this;
	}
	
	public IcustDeleteProductMaintenance clickDeleteButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.Delete.Confirm.Xpath")));
		return this;
	}
}

