package pages;

import base.IcustSpecificMethods;

public class LoanCreditRatingDetails extends IcustSpecificMethods{
	public LoanCreditRatingDetails clickScore() {
		clickElement(locateElement("xpath", props.getProperty("LoanCreditRatingDetails.Score.Xpath")));
		return this;
		}
	public LoanCreditRatingDetails clickSelectAgencydd() {
		clickElement(locateElement("xpath", props.getProperty("LoanCreditRatingDetails.SelectAgencydd.Xpath")));
		return this;
		}
	public LoanCreditRatingDetails clickSelectAgency() {
		clickElement(locateElement("xpath", props.getProperty("LoanCreditRatingDetails.SelectAgency.Xpath")));
		return this;
		}
	public LoanCreditRatingDetails enterRatings() {
		enterValue(locateElement("xpath", props.getProperty("LoanCreditRatingDetails.Ratings.Xpath")),props.getProperty("Ratings"));
		return this;
	}
	public LoanCreditRatingDetails enterRemarks() {
		enterValue(locateElement("xpath", props.getProperty("LoanCreditRatingDetails.Remarks.Xpath")),props.getProperty("Remarks"));
		return this;
	}

	public IcustLegalOpinionDetails clickOpinionDropdown() {
		clickElement(locateElement("xpath", props.getProperty("Legalopinion.OpinionDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Legalopinion.OpinionDropdown.Favourable.Xpath")));
		return new IcustLegalOpinionDetails();
	}
	
	public IcustLoanVAluationAsset selectBankValuation() {
		clickElement(locateElement("xpath", props.getProperty("Valuationasset.BankvaluationDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Valuationasset.BankvaluationDropdown.Internal.Xpath")));
		return new IcustLoanVAluationAsset();
	}


}

