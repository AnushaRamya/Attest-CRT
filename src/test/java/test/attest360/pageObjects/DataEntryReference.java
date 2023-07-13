package test.attest360.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.attest360.testCases.BaseClass;

public class DataEntryReference extends BaseClass {
	public DataEntryReference() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="verificationTabLink4") //Reference tab
	WebElement referenceTab;
	@FindBy(id="registers6insufficient") //Insufficient Documents
	WebElement refinsuffDoc;
	@FindBy(id="registers6fieldValue5") //Do not have Identity check details
	WebElement refdoNotHaveDetails;
	@FindBy(id="registers6fieldValue1") //Name of Respondent 
	WebElement respondentName;
	@FindBy(id="registers6fieldValue2") // Designation
	WebElement designation;
	@FindBy(id="registers6fieldValue3") //Organization Name
	WebElement organizationName;
	@FindBy(id="draftSubmitRegisters6") // save draft
	WebElement refdraftSave;
	@FindBy(id="finalSubmitRegisters6")// final Submit
	WebElement referencefinalSubmit;
	@FindBy(id="textModalSubmit") //final submit Confirm
	WebElement finalSubmitConfirm;
	
	
	public void clickReferenceTab() {
		try {
			javaScriptExecutorClick(referenceTab);
		}	catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setRespondentName(String repondentName) {
		respondentName.clear();
		respondentName.sendKeys(repondentName);
	}
	public void setDesignation(String desig) {
		designation.clear();
		designation.sendKeys(desig);
	}
	public void setOrganizationName(String orgName) {
		organizationName.clear();
		organizationName.sendKeys(orgName);
	}
	public void clickReferenceFinalSubmit() throws InterruptedException {
		javaScriptExecutorClick(referencefinalSubmit);
		Thread.sleep(1000);
		finalSubmitConfirm.click();
	}

	public void setReference(String repondentName,String desig,String orgName) throws InterruptedException {
		javaScriptExecutorClick(referenceTab);
		respondentName.clear();
		respondentName.sendKeys(repondentName);
		designation.clear();
		designation.sendKeys(desig);
		organizationName.clear();
		organizationName.sendKeys(orgName);
		javaScriptExecutorClick(referencefinalSubmit);
		Thread.sleep(1000);
		finalSubmitConfirm.click();
		Thread.sleep(1500);
	}




}

