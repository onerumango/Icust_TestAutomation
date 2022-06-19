package pages.dashBoard360;

import base.IcustSpecificMethods;

public class RecentTransaction360 extends IcustSpecificMethods{
	
	

	public RecentTransaction360 clickClose() {
		clickElement(locateElement("xpath", props.getProperty("RecentTransaction360.Close.Xpath")));
		return this;
		}

}