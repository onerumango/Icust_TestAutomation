package pages;

import base.IcustSpecificMethods;

public class IcustQualitativeScoreboarddetails extends IcustSpecificMethods{
		
	public IcustQualitativeScoreboarddetails clickNextButton() {
		clickElement(locateElement("xpath", props.getProperty("QualitativeScoreBoard.Next.Xpath")));
		return this;
	}
	
	public IcustLoanAssessmentDetails enterApprovedloan() {
		enterValue(locateElement("xpath", props.getProperty("AssessmentDetails.LoanAmount")),props.getProperty("approvedLoanAmount"));
		return new IcustLoanAssessmentDetails();
	}
}