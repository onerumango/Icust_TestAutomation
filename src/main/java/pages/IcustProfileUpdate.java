package pages;


import base.IcustSpecificMethods;

public class IcustProfileUpdate extends IcustSpecificMethods{
	


	public IcustProfileUpdate clickProfileEdit() {
		clickElement(locateElement("xpath", props.getProperty("Icust.ProfileUpdate2.Xpath")));
		wait(5000);
		return this;
	}

		public IcustProfileUpdate enterEmail() {
			enterValue(locateElement("xpath", props.getProperty("Icust.ProfileUpdate3.Xpath")), props.getProperty("ProfileUpdate_Email"));
			return this;
		}
		public IcustProfileUpdate selectLanguage() {
			clickElement(locateElement("xpath", props.getProperty("IcustProfileUpdate4.selectLanguage1.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("IcustProfileUpdate5.selectLanguage2.Xpath")));
			return this;
		
		}
		public IcustProfileUpdate clickSaveButton() {
			clickElement(locateElement("xpath", props.getProperty("IcustProfileUpdate.clickSaveButton.Xpath")));
			wait(2000);
			return this;
		}
	}	
	


