package pages;

import base.IcustSpecificMethods;
import pages.createAccount.IcustCreateAccountDetails;
import pages.dashBoard360.IcustTellerDashboardSearchAndViewProfileDashboard360;
import pages.dashboard.maintenanceScreensSummary.MaintenanceMenus;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustBaseDenominationDelete;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustBaseDenominationmaintenanceAddNew;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustBaseDenominatonEdit;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustBranchMappingDelete;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustBranchMappingMaintenanceEdit;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustProductMaintenanceAddNew;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustProductMaintenanceEdit;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustTillConfigurationAddNew;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustTillConfigurationDelete;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustTillConfigurationEdit;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustTillMaintenanceDelete;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustTillMaintenanceEdit;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.IcustTillvaultMaintenanceAddNew;

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
	
	public IcustTellerDashboard clickCorpoclickCorporateCustomerrateCustomer() {
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
	public IcustRecentTransactionandReverseTransaction clickReverseTransaction() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.ReverseTransaction.Xpath")));
		wait(5000);
		return new IcustRecentTransactionandReverseTransaction();

	}
	public IcustProfileUpdate clickProfileUpdate() {
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.ProfileUpdate1.Xpath")));
		wait(5000);
		return new IcustProfileUpdate();

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
	public ICustCardOriginationApplicationEntryStage clickCardOrigination() {
		
		clickElement(locateElement("xpath", props.getProperty("IcustTellerDashboard.CardOrigination.Xpath")));
		wait(1000);
		windowsHandling();
		wait(1000);
		return new ICustCardOriginationApplicationEntryStage();
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
	
	public MaintenanceMenus clickMaintenanceInDashboard() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(5000);
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Xpath")));
		wait(1000);
		return new MaintenanceMenus();
	}
	
	
	
	public IcustBaseDenominationmaintenanceAddNew selectMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustBaseDenominationmaintenanceAddNew();
	}

	public IcustProductMaintenanceAddNew selectaddMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustProductMaintenanceAddNew();
	}

	public IcustTillConfigurationAddNew selectprodMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustTillConfigurationAddNew();
	}
	
	public IcustTillvaultMaintenanceAddNew selectTillMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustTillvaultMaintenanceAddNew();
	}

	public IcustBaseDenominatonEdit selectEditBaseDenomination() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustBaseDenominatonEdit();
	}

	public IcustBaseDenominationDelete selectDeleteBaseDenomination() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustBaseDenominationDelete();
	}

	public IcustProductMaintenanceEdit EditProductMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustProductMaintenanceEdit();
	}

	public IcustBaseDenominationDelete selectDeleteProductDenomination() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustBaseDenominationDelete();
	}

	public IcustTillConfigurationEdit EditTillConfiguration() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustTillConfigurationEdit();
	}

	public IcustTillConfigurationDelete selectDeleteTillDenomination() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustTillConfigurationDelete();
	}

	public IcustTillMaintenanceEdit EditTillMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustTillMaintenanceEdit();
	}

	public IcustTillMaintenanceDelete selectDeleteTillMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustTillMaintenanceDelete();
	}

	public IcustBranchMappingMaintenanceEdit EditBranchMappingMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustBranchMappingMaintenanceEdit();
	}

	public IcustBranchMappingDelete selectDeleteBranchMapping() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Dropdown.Xpath")));
		wait(7000);
		return new IcustBranchMappingDelete();
	}
}
