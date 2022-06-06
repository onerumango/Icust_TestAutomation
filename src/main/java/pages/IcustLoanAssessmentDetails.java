package pages;

import base.IcustSpecificMethods;

public class IcustLoanAssessmentDetails extends IcustSpecificMethods{
	
		
	public IcustLoanAssessmentDetails clickNextButton() {
		clickElement(locateElement("xpath", props.getProperty("AssessmentDetails.Next.Xpath")));
		return this;
	}
}
