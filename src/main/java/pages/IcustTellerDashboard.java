package pages;

import base.IcustSpecificMethods;
import pages.createAccount.IcustCreateAccountDetails;
import pages.dashBoard360.IcustTellerDashboardSearchAndViewProfileDashboard360;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.ICUSTEDITBASEDENOMINATION;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustAddBaseDenominationmaintenance;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustAddProductMaintenance;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustAddTillConfiguration;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustAddTillvaultMaintenance;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustDeleteBaseDenomination;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustDeleteBranchMapping;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustDeleteTillConfiguration;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustDeleteTillMaintenance;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustEditBranchMappingMaintenance;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustEditProductMaintenance;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustEditTillConfiguration;
import pages.daskboard.maintenanceScreensSummary.maintenanceScreenClases.IcustEditTillMaintenance;

public class IcustTellerDashboard extends IcustSpecificMethods{

	public IcustTellerDashboard clickNewCustomerOnboardingLink() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.NewCustomer.Xpath")));
		windowsHandling();
		webDriverWait("Rumango");
		wait(1000);
		return this;
	}
	
	public IcustTellerDashboard clickIndividualCustomer() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.IndividualCustomer.Xpath")));
		wait(1000);
		return this;
	}
	
	public IcustTellerDashboard clickCorporateCustomer() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.CorporateCustomer.Xpath")));
		wait(1000);
		return this;
	}
	
	public IcustNewCustomerOnboarding1 clickCustomerProceed() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVerification.Proceed.Xpath")));
		return new IcustNewCustomerOnboarding1();
	}
	
	public ICustCorporateBasicInformation clickCorporateProceed() {
		clickElement(locateElement("xpath", props.getProperty("IcustKYCVerification.Proceed.Xpath")));
		wait(2000);
		return new ICustCorporateBasicInformation();
	}
	
	public IcustCustomerOnboardingTaskSummary clickCustomerOnboardingTaskSummary() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.OnboardingTaskSummary.Xpath")));
		windowsHandling();
		webDriverWait("Rumango");
		wait(5000);
		return new IcustCustomerOnboardingTaskSummary();
	}
	
	public IcustKYCVerification clickKYCScreening() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.KYCScreening.Xpath")));
		wait(3000);
		windowsHandling();
		/* webDriverWait("Rumango"); */
		//wait(2000);
		//driver.findElementByXPath("//mat-hint[text()='Customer Onboarding']").click();
		//clickElement(locateElement("xpath", props.getProperty("//mat-hint[text()='Customer Onboarding']")));
		//wait(2000);
		//driver.findElementByXPath("//span[text()=' CONTINUE ']").click();
		//clickElement(locateElement("xpath", props.getProperty("//span[text()=' CONTINUE ']")));
		wait(5000);
		return new IcustKYCVerification();
	}
	
	public IcustKYCTaskSummary clickKYCTaskSummary() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.KYCTaskSummary.Xpath")));
		windowsHandling();
		webDriverWait("Rumango");
		wait(10000);
		return new IcustKYCTaskSummary();
	}
	
	public ICustCreateAccountTaskSummary clickCreateAccountTaskSummary() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.CreateAccountTaskSummary.Xpath")));
		windowsHandling();
		webDriverWait("Rumango");
		wait(10000);
		return new ICustCreateAccountTaskSummary();
	}
	
	public IcustCreateAccountDetails clickCreateDeposit() {
		wait(2000);
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.CreateDeposit.Xpath")));
		windowsHandling();
		webDriverWait("Home > Home | Rumango");
		return new IcustCreateAccountDetails();
	}
	
	public IcustPickAToken clickToken() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.PickAToken.Xpath")));
		wait(20000);
		return new IcustPickAToken();

	}
	
	public IcustTokenServicesCashDeposit clickServicesToggleButtonforCashDeposit() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.clickToggleButton.Xpath")));	
		wait(1000);
		return new IcustTokenServicesCashDeposit();
	}
	public IcustTokenServicesCashWithdrawal clickServicesToggleButtonforCashWithdrawal() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.clickToggleButton.Xpath")));	
		wait(1000);
		return new IcustTokenServicesCashWithdrawal();
	}
	
	public IcustTokenServices clickServicesToggleButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.TokenServices.clickToggleButton.Xpath")));		
		return new IcustTokenServices();
	}
	

	public IcustCorporateOnboardingTaskSummary corporateOnboardingButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustCorporateCustomerOnboardingtTaskSummary.TellerButton.Xpath")));
		wait(5000);
		return new IcustCorporateOnboardingTaskSummary();
	}

	public pages.IcustLoanAccountAdmissionDetails IcustLoanAccountAdmissionDetailsNextButton() {
		clickElement(locateElement("xpath", props.getProperty("IcustLoanAccountAdmissionDetails.nextButton.Xpath")));
		wait(30000);
		return new IcustLoanAccountAdmissionDetails();
	}
	public IcustMaintenance clickProfileIcon() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.profile.Xpath")));
		return new IcustMaintenance();
	}
	public LoanCollateralDetails clickCreateLoanAccount() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.Createloanaccount.Xpath")));
		return new LoanCollateralDetails();
	}
	
//	public IcustTellerDashboard clickSearch() {
//		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.Search.Xpath")));
//		return this;
//	}
	
	
	
	public IcustTellerDashboardSearchAndViewProfileDashboard360 clickSearch() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.clickSearch.Xpath")));
		wait(3000);
		return new IcustTellerDashboardSearchAndViewProfileDashboard360();
	}
	
	
	public IcustAddBaseDenominationmaintenance selectMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustAddBaseDenominationmaintenance();
	}

	public IcustAddProductMaintenance selectaddMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustAddProductMaintenance();
	}

	public IcustAddTillConfiguration selectprodMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustAddTillConfiguration();
	}
	
	public IcustAddTillvaultMaintenance selectTillMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustAddTillvaultMaintenance();
	}

	public ICUSTEDITBASEDENOMINATION selectEditBaseDenomination() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new ICUSTEDITBASEDENOMINATION();
	}

	public IcustDeleteBaseDenomination selectDeleteBaseDenomination() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustDeleteBaseDenomination();
	}

	public IcustEditProductMaintenance EditProductMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustEditProductMaintenance();
	}

	public IcustDeleteBaseDenomination selectDeleteProductDenomination() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustDeleteBaseDenomination();
	}

	public IcustEditTillConfiguration EditTillConfiguration() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustEditTillConfiguration();
	}

	public IcustDeleteTillConfiguration selectDeleteTillDenomination() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustDeleteTillConfiguration();
	}

	public IcustEditTillMaintenance EditTillMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustEditTillMaintenance();
	}

	public IcustDeleteTillMaintenance selectDeleteTillMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustDeleteTillMaintenance();
	}

	public IcustEditBranchMappingMaintenance EditBranchMappingMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustEditBranchMappingMaintenance();
	}

	public IcustDeleteBranchMapping selectDeleteBranchMapping() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustDeleteBranchMapping();
	}
}
