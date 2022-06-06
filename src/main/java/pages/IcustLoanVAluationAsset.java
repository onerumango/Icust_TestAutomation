package pages;

import base.IcustSpecificMethods;

public class IcustLoanVAluationAsset extends IcustSpecificMethods{
		
		public IcustLoanVAluationAsset selectassetType() {
			clickElement(locateElement("xpath", props.getProperty("Valuationasset.assetTypeDropdown.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("Valuationasset.assetTypeDropdown.Personal.Xpath")));
			return this;
		}
		
		public IcustLoanVAluationAsset enterRemarks() {
			enterValue(locateElement("xpath", props.getProperty("Valuationasset.Remarks.Xpath")),props.getProperty("remarks"));
			return this;
		}

		public IcustLoanVAluationAsset enterborrowersMktValOfAsset() {
			enterValue(locateElement("xpath", props.getProperty("Valuationasset.borrowersMktValOfAsset.Xpath")),props.getProperty("borrowersMktValOfAsset"));
			return this;
		}

		public IcustLoanVAluationAsset selectAssetvalue() {
			clickElement(locateElement("xpath", props.getProperty("Valuationasset.AssetvalueDropdown.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("Valuationasset.AssetvalueDropdown.Bank Managerl.Xpath")));
			return this;
		}
		
		public IcustLoanVAluationAsset selectValuationDate() {
			clickElement(locateElement("xpath", props.getProperty("(//mat-datepicker-toggle)[2]")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("Valuationasset.ValuationDate.Date.Xpath")));
			return this;
		}
		
		public IcustLoanVAluationAsset ActualpropertyDropdown() {
			clickElement(locateElement("xpath", props.getProperty("Valuationasset.ActualpropertyDropdown.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("Valuationasset.ActualpropertyDropdown.Acr.Xpath")));
			return this;
		}
		
		public IcustLoanVAluationAsset enterActualpropertyArea() {
			enterValue(locateElement("xpath", props.getProperty("Valuationasset.ActualpropertyArea.Xpath")),props.getProperty("actualPropertyAreaSize"));
			return this;
		}
		
		public IcustLoanVAluationAsset enterFacevalue() {
			enterValue(locateElement("xpath", props.getProperty("Valuationasset.Facevalue.Xpath")),props.getProperty("faceValOfAsset"));
			return this;
		}
		
		public IcustLoanVAluationAsset enterMktvalue() {
			enterValue(locateElement("xpath", props.getProperty("Valuationasset.Mktvalue.Xpath")),props.getProperty("mktValOfAsset"));
			return this;
		}
		
		public IcustLoanVAluationAsset enterForcedvalue() {
			enterValue(locateElement("xpath", props.getProperty("Valuationasset.Forcedvalue.Xpath")),props.getProperty("forcedSaleValue"));
			return this;
		}
		
		public IcustLoanVAluationAsset  clickNextButton() {
			clickElement(locateElement("xpath", props.getProperty("Valuationasset.Next.Xpath")));
			return this;
		}
		
		public IcustLegalOpinionDetails clickOpinionDropdown() {
			clickElement(locateElement("xpath", props.getProperty("Legalopinion.OpinionDropdown.Xpath")));
			wait(1000);
			clickElement(locateElement("xpath", props.getProperty("Legalopinion.OpinionDropdown.Favourable.Xpath")));
			return new IcustLegalOpinionDetails();
		}
}