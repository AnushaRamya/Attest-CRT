package test.attest360.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.attest360.testCases.BaseClass;

public class DataEntryAddress extends BaseClass {
	public DataEntryAddress() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(@id,'verificationTabLink')]/span[text()='Address Verification']") //AddressVerificationTab
	WebElement addressVerificationTab;
	//Current Address
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/input[contains(@id,'insufficient')]") //Insufficient Documents
	WebElement currentAddressInsuffDoc;	
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/child::div/child::div/child::input[contains(@id,'noDetails')]/following-sibling::input[contains(@id,'fieldValue1')]") //Do not have address details
	WebElement currentAddressDoNotHaveDetails;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Address ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue2')]") // Address
	WebElement currentAddressAddress;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Land Mark ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue3')]")// LandMark
	WebElement currentAddressLandMark;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='City ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue4')]") //city
	WebElement currentAddressCity;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='City ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue4')]") //state
	WebElement currentAddressState;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Period of stay ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue6')]") // period of stay
	WebElement currentAddressPeriodOfStay;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Country ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue7')]") // country
	WebElement currentAddressCountry;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Postal Code ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue8')]") //Postal Code
	WebElement currentAddressPostalCode;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Address Proof Type ']/parent::label/following-sibling::div/select[contains(@id,'fieldValue9')]") //address Proof Type
	WebElement currentAddressProofType;
	@FindBy(xpath="registers1fieldValue12") //mobile
	WebElement mobile;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/following-sibling::div/child::div/following-sibling::div/child::div/label[contains(text(),'Address Proof')]/parent::div/child::div/child::div/div/child::input[contains(@id,'fieldValue10') and @type='file']") //Address Proof upload
	WebElement currentAddressProofUpload;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/parent::div/child::div/child::div/child::button[contains(@id,'draftSubmitRegisters')]") // current address draft save
	WebElement currentAddressDraftsave;
	@FindBy(xpath="//span[text()='Current Address ' or  text()='Current Address  - 1']/parent::div/parent::div/child::div/child::div/child::button[contains(@id,'finalSubmitRegisters')]") // current address finalSubmit
	WebElement currentAddressfinalSubmit;

	//Permanent Address
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/input[contains(@id,'insufficient')]") //Insufficient Documents
	WebElement permanentAddressInsuffDoc;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/child::div/child::div/child::input[contains(@id,'noDetails')]/following-sibling::input[contains(@id,'fieldValue1')]") //Do not have address details
	WebElement permanentAddressDoNotHaveDetails;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Address ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue2')]") // Address
	WebElement permanentAddressAddress;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Land Mark ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue3')]")// LandMark
	WebElement permanentAddressLandMark;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='City ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue4')]") //city
	WebElement permanentAddressCity;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='State ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue5')]") //state
	WebElement permanentAddressState;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Period of stay ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue6')]") // period of stay
	WebElement permanentAddressPeriodOfStay;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Country ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue7')]") // country
	WebElement permanentAddressCountry;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Postal Code ']/parent::label/following-sibling::div/input[contains(@id,'fieldValue8')]") //Postal Code
	WebElement permanentAddressPostalCode;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/child::div/label/span[text()='Address Proof Type ']/parent::label/following-sibling::div/select[contains(@id,'fieldValue9')]") //address Proof Type
	WebElement permanentAddressProofType;
	@FindBy(xpath="registers2fieldValue12") //mobile
	WebElement mobile1;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/following-sibling::div/child::div/following-sibling::div/child::div/label[contains(text(),'Address Proof')]/parent::div/child::div/child::div/div/child::input[contains(@id,'fieldValue10') and @type='file']") //Address Proof upload
	WebElement permanentAddressProofUpload;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/parent::div/child::div/child::div/child::button[contains(@id,'draftSubmitRegisters')]") // permanent address draft save
	WebElement permanentAddressDraftsave;
	@FindBy(xpath="//span[text()='Permanent Address ' or  text()='Permanent Address  - 1']/parent::div/parent::div/child::div/child::div/child::button[contains(@id,'finalSubmitRegisters')]") // permanent address draft save
	WebElement permanentAddressfinalSubmit;
	@FindBy(id="textModalSubmit") //final submit Confirm
	WebElement finalSubmitConfirm;

	public void clickAddressVerificationTab() {
		try {
			javaScriptExecutorClick(addressVerificationTab);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setCurAddress(String cuAdd) {
		currentAddressAddress.clear();
		currentAddressAddress.sendKeys(cuAdd);
	}
	public void setCurCity(String city) {
		currentAddressCity.clear();
		currentAddressCity.sendKeys(city);
	}
	public void setCurState(String state) {
		currentAddressState.clear();
		currentAddressState.sendKeys(state);
	}
	public void setCurPeriodOfStay(String stay) {
		currentAddressPeriodOfStay.clear();
		currentAddressPeriodOfStay.sendKeys(stay);
	}
	public void setCurCountry(String country) {
		currentAddressCountry.clear();
		currentAddressCountry.sendKeys(country);
	}
	public void setCurPostalCode(String postal) {
		currentAddressPostalCode.clear();
		currentAddressPostalCode.sendKeys(postal);
	}
	public void setCurAddressType(String addtype) {
		selectDropdownOption(currentAddressProofType, addtype);
	}
	public void clickCurrentAddressFinalSubmit() throws InterruptedException {
		javaScriptExecutorClick(currentAddressfinalSubmit);
		Thread.sleep(1000);
		finalSubmitConfirm.click();
	}
	public void setPermAddress(String cuAdd) {
		permanentAddressAddress.clear();
		permanentAddressAddress.sendKeys(cuAdd);
	}
	public void setPermCity(String city) {
		permanentAddressCity.clear();
		permanentAddressCity.sendKeys(city);
	}
	public void setPermState(String state) {
		permanentAddressState.clear();
		permanentAddressState.sendKeys(state);
	}
	public void setPermPeriodOfStay(String stay) {
		permanentAddressPeriodOfStay.clear();
		permanentAddressPeriodOfStay.sendKeys(stay);
	}
	public void setPermCountry(String country) {
		permanentAddressCountry.clear();
		permanentAddressCountry.sendKeys(country);
	}
	public void setPermPostalCode(String postal) {
		permanentAddressPostalCode.clear();
		permanentAddressPostalCode.sendKeys(postal);
	}
	public void setPermAddressType(String addtype) {
		selectDropdownOption(permanentAddressProofType, addtype);
	}
	public void clickPermAddressFinalSubmit() throws InterruptedException {
		javaScriptExecutorClick(permanentAddressfinalSubmit);
		Thread.sleep(1000);
		javaScriptExecutorClick(finalSubmitConfirm);	
	}
	public void setCurrentAddress(String cuAdd,String city,String state,String stay,String country,String postal,String addtype ) throws InterruptedException {
		clickAddressVerificationTab();
		setCurAddress(cuAdd);
		setCurCity(city);
		setCurState(state);
		setCurPeriodOfStay(stay);
		setCurCountry(country);
		setCurPostalCode(postal);
		setCurAddressType(addtype);
		clickCurrentAddressFinalSubmit();

	}
	public void setPermanentAddress(String cuAdd,String city,String state,String stay,String country,String postal,String addtype ) throws InterruptedException {
		clickAddressVerificationTab();
		setPermAddress(cuAdd);
		setPermCity(city);
		setPermState(state);
		setPermPeriodOfStay(stay);
		setPermCountry(country);
		setPermPostalCode(postal);
		setPermAddressType(addtype);
		clickPermAddressFinalSubmit();

	}
}

