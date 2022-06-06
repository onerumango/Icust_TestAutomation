package pages;

import base.IcustSpecificMethods;

public class IcustLegalOpinionDetails extends IcustSpecificMethods{
	
	
	public IcustLegalOpinionDetails clickassetareaDropdown() {
		clickElement(locateElement("xpath", props.getProperty("Legalopinion.AssestareaDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Legalopinion.AssestareaDropdown.Sq.Xpath")));
		return this;
	}
	
	public IcustLegalOpinionDetails enterRemarks() {
		enterValue(locateElement("xpath", props.getProperty("Legalopinion.Remarks.Xpath")),props.getProperty("remarks"));
		return this;
	}

	public IcustLegalOpinionDetails enterValueofasses() {
		enterValue(locateElement("xpath", props.getProperty("Legalopinion.mkvalue.Xpath")),props.getProperty("mktValOfAsset"));
		return this;
	}
	
	public IcustLegalOpinionDetails enterLawyerName() {
		enterValue(locateElement("xpath", props.getProperty("Legalopinion.Lawyername.Xpath")),props.getProperty("lawyerName"));
		return this;
	}
	public IcustLegalOpinionDetails clickOpinionDate() {
		clickElement(locateElement("xpath", props.getProperty("Legalopinion.Date.OpinionDate.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Legalopinion.Date.OpinionDate.Date.Xpath")));
		return this;
	}
	
	public IcustLegalOpinionDetails clickValuationDate() {
		clickElement(locateElement("xpath", props.getProperty("Legalopinion.Date.ValuationDate.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("Legalopinion.Date.ValuationDate.Date.Xpath")));
		return this;
	}
	
	public IcustLegalOpinionDetails enterDescription() {
		enterValue(locateElement("xpath", props.getProperty("Legalopinion.Description.Xpath")),props.getProperty("description"));
		return this;
	}

		public IcustLegalOpinionDetails clickNextButton() {
			clickElement(locateElement("xpath", props.getProperty("Legalopinion.Next.Xpath")));
			return this;
		}
		public IcustQualitativeScoreboarddetails selectComboDropdown() {
			clickElement(locateElement("xpath", props.getProperty("QualitativeScoreBoard.ComboDropdown.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("QualitativeScoreBoard.ComboDropdown.Morethanyears.Xpath")));
			return new IcustQualitativeScoreboarddetails();
		}
}
