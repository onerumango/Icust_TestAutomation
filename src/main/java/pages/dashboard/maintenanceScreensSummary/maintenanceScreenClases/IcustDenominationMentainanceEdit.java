package pages.dashboard.maintenanceScreensSummary.maintenanceScreenClases;

import base.IcustSpecificMethods;

/**
 * @author Shilpa Venkatappa
 *
 */
public class IcustDenominationMentainanceEdit extends IcustSpecificMethods {

	public IcustDenominationMentainanceEdit editDenomCode() {
		enterValue(locateElement("xpath", props.getProperty("EditDenomination.EditDenomcode.Xpath")),
				props.getProperty("EditDenomcode"));
		return this;
	}

	public IcustDenominationMentainanceEdit editDenomDesc() {
		enterValue(locateElement("xpath", props.getProperty("EditDenomination.EditDenomdesc.Xpath")),
				props.getProperty("EditDenomdesc"));
		return this;
	}

	public IcustDenominationMentainanceEdit clickSave() {
		clickElement(locateElement("xpath", props.getProperty("EditDenomination.save.Xpath")));
		return this;
	}
}
