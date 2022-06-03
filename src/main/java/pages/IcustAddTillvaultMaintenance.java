package pages;

import org.openqa.selenium.WebElement;

import base.IcustSpecificMethods;

public class IcustAddTillvaultMaintenance extends IcustSpecificMethods{

	public IcustAddTillvaultMaintenance selectMaintenance1() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(7000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillMaintenance.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("Icust.Maintenence.TillMaintenance.Xpath")));
		return this;
	}
	
	
	public IcustAddTillvaultMaintenance selectEntitycode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.AddNew.Entitycode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.AddNew.Entitycode.Dropdown.TEST.Xpath")));
		return this;
	}
	
	public IcustAddTillvaultMaintenance selectBankcode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.AddNew.Bankcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.AddNew.Bankcode.Dropdown.sdf3.Xpath")));
		return this;
	}
	
	public IcustAddTillvaultMaintenance selectTillcode() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.AddNew.Tillcode.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.AddNew.Tillcode.Dropdown.V.Xpath")));
		return this;
	}
	
	
	public IcustAddTillvaultMaintenance entertillVaultCode() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Denomination.Xpath")), props.getProperty("tillVaultCode"));
		return this;
	}
	
	public IcustAddTillvaultMaintenance entertillVaultDesc() {
		enterValue(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillconfigurationMaintenance.AddNew.Denomination.Xpath")), props.getProperty("tillVaultDesc"));
		return this;
	}
	
	public IcustAddTillvaultMaintenance selectprimaryVault() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.AddNew.Primaryvault.Dropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.AddNew.PrimaryVault.Dropdown.Y.Xpath")));
		return this;
	}
	
	public IcustAddTillvaultMaintenance clickSaveButton() {
		wait(2000);
		clickElement(locateElement("xpath",props.getProperty("IcustMaintenance.Maintenance.TillMaintenance.AddNew.Save.Xpath")));
		wait(5000);
        return this;
	}

}
	
