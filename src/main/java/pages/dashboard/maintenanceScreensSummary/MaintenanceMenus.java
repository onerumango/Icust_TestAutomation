package pages.dashboard.maintenanceScreensSummary;

import base.IcustSpecificMethods;
import pages.dashboard.maintenanceScreensSummary.maintenanceClass.IcustBankMaintenanceAddEditDelete;
import pages.dashboard.maintenanceScreensSummary.maintenanceClass.IcustBranchMaintenanceAddEditDelete;
import pages.dashboard.maintenanceScreensSummary.maintenanceClass.IcustEntityMaintenanceAddEditDelete;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.DenominationMaintenance;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.TransactionCashMasterMaintenance;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.TransactionChargesMaintenance;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.VaultCurrencyDenomBalMaintenance;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.VaultCurrencybalanceMaintenance;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.VaultDenominationMaintenance;
import pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases.VaultStatusMaintenance;

public class MaintenanceMenus extends IcustSpecificMethods{
	public DenominationMaintenance clickDenominationMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("MaintenanceMenus.Denomination.Xpath")));
		return new DenominationMaintenance();
		
	}
	public VaultCurrencyDenomBalMaintenance clickVaultCurrencyMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("MaintenanceMenus.VaultCurrencyDenom.Xpath")));
		return new VaultCurrencyDenomBalMaintenance();

}
	public VaultStatusMaintenance clickVaultStatusMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("MaintenanceMenus.VaultStatus.Xpath")));
		return new VaultStatusMaintenance();
	}
	public VaultCurrencybalanceMaintenance clickVaultCurrencybalanceMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("MaintenanceMenus.VaultCurrency.Xpath")));
		return new VaultCurrencybalanceMaintenance();
}
	public VaultDenominationMaintenance clickVaultDenominationMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("MaintenanceMenus.VaultDenomination.Xpath")));
		return new VaultDenominationMaintenance();
}
	

	public TransactionChargesMaintenance clickTransactionChargesMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("Maintenance.clickTransactionChargesMaintenance.Xpath")));
		return new TransactionChargesMaintenance();
	}
/**---------------------------------------------------------------------------------------**/
	public IcustBankMaintenanceAddEditDelete clickIcustBankMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("maintenance.BankMaintenance.xpath")));
		return new IcustBankMaintenanceAddEditDelete();
	}
	public IcustEntityMaintenanceAddEditDelete clickIcustEntityMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("IcustMaintenance.Maintenance.Entity.Xpath")));
		return new IcustEntityMaintenanceAddEditDelete();
	}
	
	public IcustBranchMaintenanceAddEditDelete clickIcustBranchMaintenance() {
		clickElement(locateElement("xpath", props.getProperty("maintenance.BranchMaintenance.xpath")));
		return new IcustBranchMaintenanceAddEditDelete();
	}
}
