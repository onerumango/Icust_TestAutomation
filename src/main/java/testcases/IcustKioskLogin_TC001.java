package testcases;
import base.ICUSTKIOSKMethods;
import pages.IcustKioskLogin;

import org.testng.annotations.Test;

public class IcustKioskLogin_TC001 extends ICUSTKIOSKMethods {
	
	@Test
	public void runIcustKioskLogin() {
		IcustKioskLogin login =new IcustKioskLogin();
		
		login.enterPhoneNumber()
		.clickContinue()
		.clickNext()
		.clickSkip();
		
	}

}
