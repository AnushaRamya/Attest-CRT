package test.attest360.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.attest360.testCases.BaseClass;
import test.attest360.utilities.ExcelUtils;

public class FillData_Fresher extends BaseClass {
	public FillData_Fresher() {
		PageFactory.initElements(driver, this);
	}

	//Tabs
	@FindBy(xpath="verificationTabLinkBasics")// Basic Details tab
	WebElement basicDetailsTab;
	@FindBy(id="verificationTabLink0") //Education tab
	WebElement educationTab;
	@FindBy(id="verificationTabLink1") //AddressVerificationTab
	WebElement addressVerificationTab;
	@FindBy(id="verificationTabLink2") //identification tab
	WebElement identificationTab;
	@FindBy(id="verificationTabLink3") //Employment tab
	WebElement employementTab;
	@FindBy(id="verificationTabLink4") //Reference tab
	WebElement referenceTab;
	@FindBy(id="verificationTabLinkAuthForm")// authorization tab
	WebElement authorizationFormTab;
	@FindBy(id="app-logo-light")
	WebElement logo;
	@FindBy(id="reworkCount")
	WebElement reworkBucket;

	//insufficient
	@FindBy(id="insuffReason") //insufficiency reason
	WebElement insuffReason;
	@FindBy(id="insuffSubmitButton") //insufficiency reason
	WebElement btnInsufficient;

	//BasicDetails
	@FindBy(id="gender") //Gender Drop down
	WebElement gender;
	@FindBy(id="country") //Country drop down
	WebElement county;
	@FindBy(id="uploadPhotoId") //Photo Upload
	WebElement photoUpload;	
	//Education
	@FindBy(id="registers0insufficient") //insufficient document
	WebElement eduInsuffDoc;
	@FindBy(id="registers0fieldValue12") //do not have education details
	WebElement eduDoNotHaveDetails;
	@FindBy(id="registers0fieldValue1") //Name of College / School
	WebElement collageName;
	@FindBy(id="registers0fieldValue2") //Affiliated University / Board
	WebElement university;
	@FindBy(id="registers0fieldValue3") //City
	WebElement city;
	@FindBy(id="registers0fieldValue11") //Postcode
	WebElement postCode;
	@FindBy (id="registers0fieldValue5") //Qualification obtained
	WebElement qualification; 
	@FindBy (id="registers0fieldValue9") //Period of Study / Year of passing
	WebElement pasYear;
	@FindBy(id="registers0fieldValue6") //Roll Number/Enroll Number/Register Number/Student Id 
	WebElement rollNumber;
	@FindBy(id="registers0fieldValue10") //Class / Division / %
	WebElement percentage;
	@FindBy(id="registers0fieldValue14") //Year Attend From
	WebElement attendFrom;
	@FindBy(id="registers0fieldValue15") //Year Attend From
	WebElement attendTo;
	@FindBy(id="registers0fieldValue7tempFile") //Attach corresponding marksheet
	WebElement markSheetUpload;
	@FindBy(id="registers0fieldValue8tempFile") //Attach corresponding certificate
	WebElement certificateUpload;
	@FindBy(id="draftSubmitRegisters0") // Save draft
	WebElement eduDraftSave;
	@FindBy(id="finalSubmitRegisters0")// Final submit
	WebElement educationfinalSubmit;
	@FindBy(id="docFileName")// Cv Upload
	WebElement cvupload;

	//AddressVerification

	@FindBy(id="registers1insufficient") //Insufficient Documents
	WebElement curInsuffDoc;	
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
	@FindBy(id="registers1fieldValue10tempFile") //address Proof upload
	WebElement curAddressProofupload;
	@FindBy(id="registers1fieldValue12") //mobile
	WebElement mobile;
	@FindBy(id="draftSubmitRegisters1") // current address draft save
	WebElement curDraftsave;
	@FindBy(id="finalSubmitRegisters1") // current address draft save
	WebElement curfinalSubmit;

	//Permanent Address
	@FindBy(id="registers2insufficient") //Insufficient Documents
	WebElement perInsuffDoc;
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
	@FindBy(id="registers2fieldValue10tempFile") //address Proof upload
	WebElement perAddressProofupload;
	@FindBy(id="draftSubmitRegisters2") // current address draft save
	WebElement perDraftsave;
	@FindBy(id="finalSubmitRegisters2") // current address draft save
	WebElement perfinalSubmit;

	//Identification

	@FindBy(id="registers3insufficient") //Insufficient Documents
	WebElement ideninsuffDoc;
	@FindBy(id="registers3fieldValue9") //Do not have Identity check details
	WebElement identidoNotHaveDetails;
	@FindBy(id="registers3fieldValue1") //Id Type
	WebElement idtype;
	@FindBy(id="registers3fieldValue2") //Candidate Name
	WebElement candiName;
	@FindBy(id="registers3fieldValue8") // Location
	WebElement location;
	@FindBy(id="registers3fieldValue3") //Father Name
	WebElement fatherName;
	@FindBy(id="registers3fieldValue4") //dob
	WebElement Dob;
	@FindBy(id="registers3fieldValue5") //Id Number
	WebElement idnumber;
	@FindBy(id="registers3fieldValue7tempFile") // Upload ID document
	WebElement idUpload;
	@FindBy(id="draftSubmitRegisters3")
	WebElement draftSave;
	@FindBy(id="finalSubmitRegisters3")
	WebElement identificationfinalSubmit;

	//Employment
	@FindBy(id="registers4insufficient") //Insufficient Documents
	WebElement employinsuffDoc;
	@FindBy(id="registers4fieldValue30") //Do not have Identity check details
	WebElement employdoNotHaveDetails;
	@FindBy(id="registers4fieldValue1") //Are you fresher
	WebElement areYouFresher;
	@FindBy(id="registers4fieldValue2Yes") //Are you employed yes
	WebElement employedyes;
	@FindBy(id="registers4fieldValue2No") //Are you employed No
	WebElement employedNo;
	@FindBy(id="registers4fieldValue3Yes") //If yes,can we contact your current employer yes
	WebElement contactCurrentYes;
	@FindBy(id="registers4fieldValue3No") //If yes,can we contact your current employer no
	WebElement contactCurrentNo;
	@FindBy(id="registers4fieldValue4") //Name of the employer 
	WebElement employerName;
	@FindBy(id="registers4fieldValue5") // Location
	WebElement employerlocation;
	@FindBy(id="registers4fieldValue6") //Address 1
	WebElement employeraddress1;
	@FindBy(id="registers4fieldValue7") //Address 2
	WebElement employeraddress2;
	@FindBy(id="registers4fieldValue8") //Address 3
	WebElement employeraddress3;
	@FindBy(id="registers4fieldValue9") //City
	WebElement employercity;
	@FindBy(id="registers4fieldValue11") //jobTitle
	WebElement jobTitle;
	@FindBy(id="registers4fieldValue12") // EmployeeCode
	WebElement employeecode;
	@FindBy(id="registers4fieldValue14") // Joining date
	WebElement joiningDtae;
	@FindBy(id="registers4fieldValue16") // Reason for leaving 
	WebElement reasonforLeaving;
	@FindBy(id="registers4fieldValue23tempFile") // Upload offerletter document
	WebElement offerLetterUpload;
	@FindBy(id="draftSubmitRegisters4") // save draft
	WebElement employdraftSave;
	@FindBy(id="finalSubmitRegisters4") // 
	WebElement employfinalSubmit;
	//Emloyment 2
	@FindBy(xpath="//span[text()='Employment  - 2']")
	WebElement heading;

	@FindBy(id="registers5insufficient") //Insufficient Documents
	WebElement employinsuffDoc2;
	@FindBy(id="registers5fieldValue30") //Do not have Identity check details
	WebElement employdoNotHaveDetails2;
	@FindBy(id="registers5fieldValue1") //Are you fresher
	WebElement areYouFresher2;
	@FindBy(id="registers5fieldValue2Yes") //Are you employed yes
	WebElement employedyes2;
	@FindBy(id="registers5fieldValue2No") //Are you employed No
	WebElement employedNo2;
	@FindBy(id="registers5fieldValue3Yes") //If yes,can we contact your current employer yes
	WebElement contactCurrentYes2;
	@FindBy(id="registers5fieldValue3No") //If yes,can we contact your current employer no
	WebElement contactCurrentNo2;
	@FindBy(id="registers5fieldValue4") //Name of the employer 
	WebElement employerName2;
	@FindBy(id="registers5fieldValue5") // Location
	WebElement employerlocation2;
	@FindBy(id="registers5fieldValue6") //Address 1
	WebElement employeraddress12;
	@FindBy(id="registers5fieldValue7") //Address 2
	WebElement employeraddress22;
	@FindBy(id="registers5fieldValue8") //Address 3
	WebElement employeraddress32;
	@FindBy(id="registers5fieldValue9") //City
	WebElement employercity2;
	@FindBy(id="registers5fieldValue11") //jobTitle
	WebElement jobTitle2;
	@FindBy(id="registers5fieldValue12") // EmployeeCode
	WebElement employeecode2;
	@FindBy(id="registers5fieldValue14") // Joining date
	WebElement joiningDtae2;
	@FindBy(id="registers5fieldValue16") // Reason for leaving 
	WebElement reasonforLeaving2;
	@FindBy(id="registers5fieldValue23tempFile") // Upload offerletter document
	WebElement offerLetterUpload2;
	@FindBy(id="draftSubmitRegisters5") // save draft
	WebElement employdraftSave2;
	@FindBy(id="finalSubmitRegisters5") // 
	WebElement employfinalSubmit2;
	//Reference
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
	//Authorization
	@FindBy(id="textModalSubmit") //final submit Confirm
	WebElement finalSubmitConfirm;
	@FindBy(id="candidateConsentId") //candidateConsentId Check Box
	WebElement candidateConsent;
	@FindBy(id="candidateConsent") //candidateConsentId Submit
	WebElement candidateConsentSubmit;
	@FindBy(id="authenticationForm") //authorization upload
	WebElement authUpload;
	@FindBy(id="digital") //authorization upload
	WebElement btnupload;
	@FindBy(xpath="//button[@class='btn btn-sm btn-outline-dark ' and @id='finalSave']") //final save
	WebElement finalSave;	
	public void clickidDoNotHaveDetails() throws InterruptedException {
		Thread.sleep(1000);
		javaScriptExecutorClick(identificationTab);
		javaScriptExecutorClick(identidoNotHaveDetails);
	}
	public void clickDoNotHaveDetails() throws InterruptedException {
		Thread.sleep(1000);
		javaScriptExecutorClick(educationTab);
		javaScriptExecutorClick(eduDoNotHaveDetails);
	}
	public void setEducaion(String collage,String univ,String cit,String qualifi,String passYear,String rollnum,String path) throws InterruptedException {
		Thread.sleep(1000);
		javaScriptExecutorClick(educationTab);
		if(eduInsuffDoc.isSelected()) {
			eduInsuffDoc.click();
		}
		collageName.clear();
		collageName.sendKeys(collage);
		university.clear();
		university.sendKeys(univ);
		city.clear();
		city.sendKeys(cit);
		qualification.clear();
		qualification.sendKeys(qualifi);
		pasYear.clear();
		pasYear.sendKeys(passYear);
		rollNumber.clear();
		rollNumber.sendKeys(rollnum);
		uploadFile(markSheetUpload, path);
		Thread.sleep(1000);
		uploadFile(certificateUpload, path);
		Thread.sleep(2000);
		javaScriptExecutorClick(educationfinalSubmit);
		Thread.sleep(1000);
		javaScriptExecutorClick(finalSubmitConfirm);
		Thread.sleep(1500);
	}
	public void setCurrentAddressVerification(String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path ) throws InterruptedException {
		javaScriptExecutorClick(addressVerificationTab);
		if(curInsuffDoc.isSelected()) {
			curInsuffDoc.click();
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
		uploadFile(curAddressProofupload, path);
		Thread.sleep(2000);
		javaScriptExecutorClick(curfinalSubmit);
		Thread.sleep(1000);
		finalSubmitConfirm.click();
		Thread.sleep(1500);
	}
	public void setPermanentAddressVerification(String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path ) throws InterruptedException {

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
		uploadFile(perAddressProofupload, path);
		Thread.sleep(2000);
		javaScriptExecutorClick(perfinalSubmit);
		Thread.sleep(1000);
		javaScriptExecutorClick(finalSubmitConfirm);
		Thread.sleep(1500);


	}
	public void setIdentification(String type,String name,String number,String path) throws InterruptedException {

		javaScriptExecutorClick(identificationTab);
		if(ideninsuffDoc.isSelected()) {

			javaScriptExecutorClick(ideninsuffDoc);
		}
		selectDropdownOption(idtype, type);
		candiName.clear();
		candiName.sendKeys(name);
		idnumber.clear();
		idnumber.sendKeys(number);
		uploadFile(idUpload, path);
		Thread.sleep(2000);
		javaScriptExecutorClick(identificationfinalSubmit);
		Thread.sleep(1000);
		finalSubmitConfirm.click();
		Thread.sleep(1500);
	}
	public void setEmployment(String Employername,String address,String cit,String title,String code,String joindate,String reason,String path) throws InterruptedException {
		javaScriptExecutorClick(employementTab);
		javaScriptExecutorClick(employedyes);
		javaScriptExecutorClick(contactCurrentYes);
		scrollToElement(employerName);
		employerName.clear();
		employerName.sendKeys(Employername);
		employeraddress1.clear();
		employeraddress1.sendKeys(address);
		javaScriptExecutorSendKeys(cit, employercity);
		jobTitle.clear();
		jobTitle.sendKeys(title);
		employeecode.clear();
		employeecode.sendKeys(code);
		joiningDtae.clear();
		joiningDtae.sendKeys(joindate);
		reasonforLeaving.clear();
		reasonforLeaving.sendKeys(reason);
		uploadFile(offerLetterUpload, path);
		Thread.sleep(2000);
		try {
			if(heading.isDisplayed()) {
				javaScriptExecutorClick(employdoNotHaveDetails2);
				//				javaScriptExecutorClick(employedyes2);
				//				javaScriptExecutorClick(contactCurrentYes2);
				//				scrollToElement(employerName2);
				//				employerName2.clear();
				//				employerName2.sendKeys(Employername);
				//				employeraddress12.clear();
				//				employeraddress12.sendKeys(address);
				//				javaScriptExecutorSendKeys(cit, employercity2);
				//				jobTitle2.clear();
				//				jobTitle2.sendKeys(title);
				//				employeecode2.clear();
				//				employeecode2.sendKeys(code);
				//				joiningDtae2.clear();
				//				joiningDtae2.sendKeys(joindate);
				//				reasonforLeaving2.clear();
				//				reasonforLeaving2.sendKeys(reason);
				//				uploadFile(offerLetterUpload2, path);
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	} 
	public void setReference(String repondentName,String desig,String orgName) throws InterruptedException {
		javaScriptExecutorClick(referenceTab);
		respondentName.clear();
		respondentName.sendKeys(repondentName);
		designation.clear();
		designation.sendKeys(desig);
		organizationName.clear();
		organizationName.sendKeys(orgName);
		//		javaScriptExecutorClick(referencefinalSubmit);
		//		Thread.sleep(1000);
		//		finalSubmitConfirm.click();
		//		Thread.sleep(1500);
	}
	public void setAuthorization() throws InterruptedException {
		authorizationFormTab.click();
		scrollToElement(authUpload);
		authUpload.sendKeys("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		javaScriptExecutorClick(btnupload);
		Thread.sleep(1000);
		refresh();

	}
	public void setBasicDetails(String gen,String cou) throws InterruptedException {
		Thread.sleep(1500);
		selectDropdownOption(county, cou);
		selectDropdownOption(gender, gen);

	}
	public void finalSave() {
		javaScriptExecutorClick(authorizationFormTab);
		javaScriptExecutorClick(finalSave);

	}
	public void InsufficientFlowSelf(String Educa,String EduReason,String address,String addressReason,String id,String idReason) throws InterruptedException {
		if(Educa.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(educationTab);
			javaScriptExecutorClick(eduInsuffDoc);
			javaScriptExecutorClick(eduDraftSave);
			Thread.sleep(500);
			insuffReason.sendKeys(EduReason);
			javaScriptExecutorClick(btnInsufficient);
			Thread.sleep(1000);
			javaScriptExecutorClick(logo);
		}else if(address.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(addressVerificationTab);
			javaScriptExecutorClick(curInsuffDoc);
			javaScriptExecutorClick(curDraftsave);
			insuffReason.sendKeys(addressReason);
			javaScriptExecutorClick(btnInsufficient);
			Thread.sleep(1000);
			javaScriptExecutorClick(logo);

		}else if(id.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(identificationTab);
			javaScriptExecutorClick(ideninsuffDoc);
			javaScriptExecutorClick(draftSave);
			insuffReason.sendKeys(idReason);
			javaScriptExecutorClick(btnInsufficient);
			Thread.sleep(1000);
			javaScriptExecutorClick(logo);
		}
	}
	public void searchEmployeeInInsuffRejectionBucket() throws InterruptedException {
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\CandidateDetails-Fresher.xlsx");
		String crtNumber = ex.getCellData("CRTNumber", "CRTNumber", 2);
		reworkBucket.click();
		HomePage hp=new HomePage();
		hp.selectCrtNumber(crtNumber);
	}

	public void educationFinalSubmit() throws InterruptedException {
		Thread.sleep(2000);
		javaScriptExecutorClick(educationfinalSubmit);
		Thread.sleep(1000);
		javaScriptExecutorClick(finalSubmitConfirm);
		Thread.sleep(1500);
	}
	public void currentAddressFinalSubmit() throws InterruptedException {
		Thread.sleep(2000);
		javaScriptExecutorClick(curfinalSubmit);
		Thread.sleep(1000);
		javaScriptExecutorClick(finalSubmitConfirm);
		Thread.sleep(1500);
	}
	public void permanentAddressFinalSubmit() throws InterruptedException {
		Thread.sleep(2000);
		javaScriptExecutorClick(perfinalSubmit);
		Thread.sleep(1000);
		javaScriptExecutorClick(finalSubmitConfirm);
		Thread.sleep(1500);
	}
	public void idFinalSubmit() throws InterruptedException {
		Thread.sleep(2000);
		javaScriptExecutorClick(identificationfinalSubmit);
		Thread.sleep(1000);
		javaScriptExecutorClick(finalSubmitConfirm);
		Thread.sleep(1500);
	}
}

