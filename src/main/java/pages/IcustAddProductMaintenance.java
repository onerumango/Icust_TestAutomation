package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustAddProductMaintenance extends IcustSpecificMethods{

	public IcustAddProductMaintenance selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.ProductMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.ProductMaintenance.Xpath")));
		return this;
	}
	
		
	public IcustAddProductMaintenance selectEntitycode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.ProductMaintenance.AddNew.Entitycode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.ProductMaintenance.AddNew.Entitycode.Dropdown.TEST.Xpath")));
		return this;
	}
	
	public IcustAddProductMaintenance selectBankcode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.ProductMaintenance.AddNew.Bankcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.ProductMaintenance.AddNew.Bankcode.Dropdown.sd3.Xpath")));
		return this;
	}
	
	public IcustAddProductMaintenance selectProductcode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.ProductMaintenance.AddNew.Productcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.ProductMaintenance.AddNew.Productcode.Dropdown.CQD.Xpath")));
		return this;
	}
	
	public IcustAddProductMaintenance enterProductname() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.ProductMaintenance.AddNew.Productname.Xpath")), props.getProperty("productName"));
		return this;
	}
	
	public IcustAddProductMaintenance clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.BaseDenominationMaintenance.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}

}
	