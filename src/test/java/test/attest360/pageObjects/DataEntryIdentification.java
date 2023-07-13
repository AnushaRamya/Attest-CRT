package test.attest360.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.attest360.testCases.BaseClass;

public class DataEntryIdentification extends BaseClass {
	public DataEntryIdentification() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="//a[contains(@id,'verificationTabLink')]/span[text()='Identification']") //identification tab
	WebElement identificationTab;
	//Identification
	@FindBy(xpath="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/following-sibling::div/child::div/input[contains(@id,'insufficient')]") //Insufficient Documents
	WebElement identificationinsuffDoc;
	@FindBy(xpath="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/following-sibling::div/child::div/child::div/child::div/child::input[contains(@id,'noDetails')]/following-sibling::input[contains(@id,'fieldValue9')]") //Do not have Identity check details
	WebElement identificationdoNotHaveDetails;
	@FindBy(id="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/following-sibling::div/child::div/child::div/following-sibling::div/child::label/span[text()='ID Type ']/parent::label/following-sibling::div/select[contains(@id,'fieldValue1')]") //Id Type
	WebElement idtype;	
	@FindBy(id="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/following-sibling::div/child::div/child::div/following-sibling::div/child::label/span[text()='Candidate Name ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue2')]") //Candidate Name
	WebElement candidateName;
	@FindBy(id="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/following-sibling::div/child::div/child::div/following-sibling::div/child::label/span[text()='Location ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue8')]") // Location
	WebElement location;
	@FindBy(id="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/following-sibling::div/child::div/child::div/following-sibling::div/child::label/span[text()='Father Name ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue3')]") //Father Name
	WebElement fatherName;
	@FindBy(id="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/following-sibling::div/child::div/child::div/following-sibling::div/child::label/span[text()='Date of Birth ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue4')]") //dob
	WebElement DateOfBirth;
	@FindBy(id="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/following-sibling::div/child::div/child::div/following-sibling::div/child::label/span[text()='ID Number ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue5')]") //Id Number
	WebElement idnumber;
	@FindBy(id="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/following-sibling::div/child::div/following-sibling::div/child::div/label[contains(text(),'Upload ID document')]/parent::div/child::div/child::div/div/child::input[contains(@id,'fieldValue7') and @type='file']") // Upload ID document
	WebElement idUpload;
	@FindBy(id="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/parent::div/child::div/child::div/child::button[contains(@id,'draftSubmitRegisters')]")//save Draft Button
	WebElement identificationSaveDraft;
	@FindBy(id="//span[text()='Identity Check ' or  text()='Identity Check  - 1']/parent::div/parent::div/child::div/child::div/child::button[contains(@id,'finalSubmitRegisters')]") //final SubmitBitton
	WebElement identificationfinalSubmit;
	@FindBy(id="textModalSubmit") //final submit Confirm
	WebElement finalSubmitConfirm;
	public void clickIdentificationTab() {
		try {
			javaScriptExecutorClick(identificationTab);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectIdType(String type) {
		selectDropdownOption(idtype, type);
	}
	public void setCandidateName(String name) {
		candidateName.clear();
		candidateName.sendKeys(name);
	}
	public void setIdNumber(String number) {
		idnumber.clear();
		idnumber.sendKeys(number);
	}
	public void clickIdentificationFinalSubmit() throws InterruptedException {
		javaScriptExecutorClick(identificationfinalSubmit);
		Thread.sleep(1000);
		finalSubmitConfirm.click();
	}
	public void setIdentification(String type,String name,String number) throws InterruptedException {

		javaScriptExecutorClick(identificationTab);
		selectDropdownOption(idtype, type);
		candidateName.clear();
		candidateName.sendKeys(name);
		idnumber.clear();
		idnumber.sendKeys(number);
		javaScriptExecutorClick(identificationfinalSubmit);
		Thread.sleep(1000);
		finalSubmitConfirm.click();
		Thread.sleep(1500);
	}

}

