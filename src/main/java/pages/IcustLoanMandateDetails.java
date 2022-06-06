package pages;

import base.IcustSpecificMethods;

public class IcustLoanMandateDetails extends IcustSpecificMethods{
	public IcustLoanMandateDetails clickMandate() {
		clickElement(locateElement("xpath", props.getProperty("MandateDetails.Toggle.Xpath")));
		wait(1000);
		return this;
	}
	
			public IcustLoanMandateDetails enterApplicantName() {
				enterValue(locateElement("xpath", props.getProperty("MandateDetails.ApplicantName.Xpath")),props.getProperty("applicantName"));
				return this;
			}
			
			public IcustLoanMandateDetails enterCollateralshare() {
				enterValue(locateElement("xpath", props.getProperty("MandateDetails.collateralShare.Xpath")),props.getProperty("collateralShare"));
				return this;
			}
			
	public IcustLoanMandateDetails clickNextButton() {
		clickElement(locateElement("xpath", props.getProperty("MandateDetails.Next.Xpath")));
		return this;
	}
}
