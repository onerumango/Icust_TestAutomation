package pages;

import base.IcustSpecificMethods;

public class IcustLoanGuranatorDetails extends IcustSpecificMethods{
		public IcustLoanGuranatorDetails selectProductCode() {
		clickElement(locateElement("xpath", props.getProperty("LoanGuranatorDetails.RelationshipTypeDropdown.Xpath")));
		wait(1000);
		clickElement(locateElement("xpath", props.getProperty("LoanGuranatorDetails.RelationshipTypeDropdown.Sister.Xpath")));
		return this;
	}
	public IcustLoanGuranatorDetails clickNextButton() {
		clickElement(locateElement("xpath", props.getProperty("LoanGuranatorDetails.Next.Xpath")));
		return this;
	}
}