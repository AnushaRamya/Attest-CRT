package test.attest360.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.attest360.testCases.BaseClass;

public class CandidateFlow extends BaseClass {
	public CandidateFlow() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="searchName")   // search box txt field 
	WebElement txtsearch;
	@FindBy(id="toReview")   // search box txt field 
	WebElement toReviewBucket;

	//BasicDetails
	@FindBy(id="gender") //Gender Drop down
	WebElement gender;
	@FindBy(id="country") //Country drop down
	WebElement county;
	@FindBy(id="uploadPhotoId") //Photo Upload
	WebElement photoUpload;	

	//Current Address
	@FindBy(id="verificationTabLink1") //AddressVerificationTab
	WebElement addressVerificationTab;
	@FindBy(id="registers1fieldValue11") //Do not have address details
	WebElement curDoNotHaveDetails;
	@FindBy(id="registers1fieldValue2") // Address
	WebElement curAddress;
	@FindBy(id="registers1fieldValue3")// LandMark
	WebElement curLandMark;
	@FindBy(id="registers1fieldValue4") //city
	WebElement curCity;
	@FindBy(id="registers1fieldValue5") //state
	WebElement curState;
	@FindBy(id="registers1fieldValue6") // period of stay
	WebElement curPeriodOfStay;
	@FindBy(id="registers1fieldValue7") // country
	WebElement curCountry;
	@FindBy(id="registers1fieldValue8") //Postal Code
	WebElement curPostalCode;
	@FindBy(id="registers1fieldValue9") //address Proof Type
	WebElement curAddressProofType;
	@FindBy(id="registers1fieldValue12") //mobile
	WebElement mobile;
	@FindBy(id="registers1fieldValue10tempFile") //Address Proof upload
	WebElement curAddressProofUpload;
	@FindBy(id="draftSubmitRegisters1") // current address draft save
	WebElement curDraftsave;
	@FindBy(id="finalSubmitRegisters1") // current address draft save
	WebElement curfinalSubmit;

	//Permanent Address

	@FindBy(id="registers2fieldValue1") //Do not have address details
	WebElement perDoNotHaveDetails;
	@FindBy(id="registers2fieldValue2") // Address
	WebElement perAddress;
	@FindBy(id="registers2fieldValue3")// LandMark
	WebElement perLandMark;
	@FindBy(id="registers2fieldValue4") //city
	WebElement perCity;
	@FindBy(id="registers2fieldValue5") //state
	WebElement perState;
	@FindBy(id="registers2fieldValue6") // period of stay
	WebElement perPeriodOfStay;
	@FindBy(id="registers2fieldValue7") // country
	WebElement perCountry;
	@FindBy(id="registers2fieldValue8") //Postal Code
	WebElement perPostalCode;
	@FindBy(id="registers2fieldValue9") //address Proof Type
	WebElement perAddressProofType;
	@FindBy(id="registers2fieldValue12") //mobile
	WebElement mobile1;
	@FindBy(id="registers2fieldValue10tempFile") //Address Proof upload
	WebElement perAddressProofUpload;
	@FindBy(id="draftSubmitRegisters2") // current address draft save
	WebElement perDraftsave;
	@FindBy(id="finalSubmitRegisters2") // current address draft save
	WebElement perfinalSubmit;
	@FindBy(id="textModalSubmit") //final submit Confirm
	WebElement finalSubmitConfirm;

	//Education
	@FindBy(id="verificationTabLink0") //Education tab
	WebElement educationTab;
	@FindBy(id="registers0fieldValue7tempFile") //Attach corresponding marksheet
	WebElement markSheetUpload;
	@FindBy(id="registers0fieldValue8tempFile") //Attach corresponding certificate
	WebElement certificateUpload;
	//reference
	@FindBy(id="verificationTabLink4") //Reference tab
	WebElement referenceTab;
	@FindBy(id="registers5fieldValue5") //Do not have Identity check details
	WebElement refdoNotHaveDetails;
	@FindBy(id="registers6fieldValue1") //Name of Respondent 
	WebElement respondentName;
	@FindBy(id="registers6fieldValue2") // Designation
	WebElement designation;
	@FindBy(id="registers6fieldValue3") //Organization Name
	WebElement organizationName;
	@FindBy(id="draftSubmitRegisters5") // save draft
	WebElement refdraftSave;
	@FindBy(id="finalSubmitRegisters2")// final Submit
	WebElement referencefinalSubmit;
	// Employment
	@FindBy(id="verificationTabLink3") //Employment tab
	WebElement employementTab;
	@FindBy(id="registers4fieldValue23tempFile") // Offer letter / Current salary slip
	WebElement OfferLetter;
	@FindBy(id="registers5fieldValue23tempFile") // Offer letter / Current salary slip
	WebElement OfferLetter1;
	@FindBy(id="registers3fieldValue23tempFile") //Relieving / Service Letter
	WebElement serviceLetter;
	@FindBy(id="draftSubmitRegisters3") // save draft
	WebElement employdraftSave;

	//authorization
	@FindBy(id="verificationTabLinkAuthForm")// authorization tab
	WebElement authorizationFormTab;
	@FindBy(id="authenticationForm") //authorization upload
	WebElement authUpload;
	@FindBy(id="digital") //authorization upload
	WebElement btnupload;
	@FindBy(id="finalSave") //final save
	WebElement finalSave;	

	public void setCurrentAddress(String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path ) throws InterruptedException {

		try{
			javaScriptExecutorClick(addressVerificationTab);
		}catch (Exception e) {
			e.printStackTrace();
		}
		curAddress.clear();
		curAddress.sendKeys(cuAdd);
		curCity.clear();
		curCity.sendKeys(city);
		curState.clear();
		curState.sendKeys(state);
		curPeriodOfStay.clear();
		curPeriodOfStay.sendKeys(stay);
		curCountry.clear();
		curCountry.sendKeys(country);
		curPostalCode.clear();
		curPostalCode.sendKeys(postal);
		selectDropdownOption(curAddressProofType, addtype);
		uploadFile(curAddressProofUpload, path);
		Thread.sleep(1500);
	}
	public void setPermanentAddress(String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path ) throws InterruptedException {

		try {
			javaScriptExecutorClick(addressVerificationTab);
		}catch (Exception e) {
			e.printStackTrace();
		}
		scrollToElement(perAddress);
		perAddress.clear();
		perAddress.sendKeys(cuAdd);
		perCity.clear();
		perCity.sendKeys(city);
		perState.clear();
		perState.sendKeys(state);
		perPeriodOfStay.clear();
		perPeriodOfStay.sendKeys(stay);
		perCountry.clear();
		perCountry.sendKeys(country);
		perPostalCode.clear();
		perPostalCode.sendKeys(postal);
		selectDropdownOption(perAddressProofType, addtype);
		uploadFile(perAddressProofUpload, path);
	}
	
	public void setEmployment(String path) throws InterruptedException {

		javaScriptExecutorClick(employementTab);
		uploadFile(OfferLetter, path);
		Thread.sleep(1000);
		uploadFile(OfferLetter1, path);
		Thread.sleep(1500);
	} 
	public void setEducation(String path) throws InterruptedException {

		javaScriptExecutorClick(educationTab);
		uploadFile(markSheetUpload, path);
		Thread.sleep(1500);
		uploadFile(certificateUpload, path);
		Thread.sleep(1500);

	} 
	public void setReference(String repondentName,String desig,String orgName) throws InterruptedException {
		javaScriptExecutorClick(referenceTab);
		respondentName.clear();
		respondentName.sendKeys(repondentName);
		designation.clear();
		designation.sendKeys(desig);
		organizationName.clear();
		organizationName.sendKeys(orgName);
		Thread.sleep(1000);
	}
	public void setAuthorization() throws InterruptedException {
		javaScriptExecutorClick(authorizationFormTab);
		scrollToElement(authUpload);
		authUpload.sendKeys("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		javaScriptExecutorClick(btnupload);
		Thread.sleep(1000);

	}
	public void setBasicDetails(String gen,String cou) throws InterruptedException {
		Thread.sleep(1500);
//		uploadFile(photoUpload,"C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\Candidate image.jpg");
		Thread.sleep(1500);
		selectDropdownOption(county, cou);
		selectDropdownOption(gender, gen);
	}
	public void finalSave() {
		javaScriptExecutorClick(authorizationFormTab);
		javaScriptExecutorClick(finalSave);
	}
	public void searchEmployeeInToReviewBucket(String crtNumber) throws InterruptedException	{
		toReviewBucket.click();
		txtsearch.sendKeys(crtNumber,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+crtNumber+"']")).click();
	}
	public void candidateflow(String gen,String cou,String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path,String repondentName,String desig,String orgName) throws InterruptedException {
		setBasicDetails(gen, cou);
		setCurrentAddress(cuAdd, city, state, stay, country, postal, addtype, path);
		setPermanentAddress(cuAdd, city, state, stay, country, postal, addtype, path);
		setEducation(path);
		setReference(repondentName, desig, orgName);
		setEmployment(path);
		setAuthorization();
		Thread.sleep(1000);
		finalSave();
	}
	public void InsufficientFlowCandidate(String Educa,String EduReason,String address,String addressReason,String id,String idReason,String gen,String cou,String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path,String repondentName,String desig,String orgName) throws InterruptedException {
		if(Educa.equalsIgnoreCase("yes")) {
			setEducation(path);
			
			finalSave();
		}else if(address.equalsIgnoreCase("yes")) {
			setCurrentAddress(cuAdd, city, state, stay, country, postal, addtype, path);
			setPermanentAddress(cuAdd, city, state, stay, country, postal, addtype, path);
			finalSave();
		}
	}

}
