package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.IcustSpecificMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DenominationMaintenance extends IcustSpecificMethods {
public IcustDenominationAdd clickAddnew(){
	clickElement(locateElement("xpath", props.getProperty("DenominationMaintenance.Addnew.Xpath")));
	return new IcustDenominationAdd();	
}
public IcustDenominationMentainanceEdit clickEdit() {
	clickElement(locateElement("xpath", props.getProperty("DenominationMaintenance.Edit.Xpath")));
	return new IcustDenominationMentainanceEdit();
}
}


