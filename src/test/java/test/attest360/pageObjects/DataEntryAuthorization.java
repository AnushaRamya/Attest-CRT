package test.attest360.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.attest360.testCases.BaseClass;

public class DataEntryAuthorization extends BaseClass {
	public DataEntryAuthorization() {
		PageFactory.initElements(driver, this);
	}



	@FindBy(id="verificationTabLinkAuthForm")// authorization tab
	WebElement authorizationFormTab;


	//Authorization
	@FindBy(id="textModalSubmit") //final submit Confirm
	WebElement finalSubmitConfirm;
	@FindBy(id="candidateConsentId") //candidateConsentId Check Box
	WebElement candidateConsent;
	@FindBy(id="candidateConsent") //candidateConsentId Submit
	WebElement candidateConsentSubmit;
	@FindBy(id="finalSave") //final save
	WebElement finalSave;	

	public void setAuthorization() throws InterruptedException {
		authorizationFormTab.click();
		javaScriptExecutorClick(candidateConsent);
		javaScriptExecutorClick(candidateConsentSubmit);
		Thread.sleep(1000);
		refresh();
	}
	public void finalSave() {
		javaScriptExecutorClick(authorizationFormTab);
		javaScriptExecutorClick(finalSave);

	}



}

