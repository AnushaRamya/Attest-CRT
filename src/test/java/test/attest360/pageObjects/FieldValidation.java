package test.attest360.pageObjects;
import static org.testng.Assert.assertTrue;

import java.text.ParseException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import test.attest360.testCases.BaseClass;
import test.attest360.utilities.ExcelUtils;

public class FieldValidation extends BaseClass {
	public FieldValidation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="name") //first name 
	WebElement txtFirstName;
	@FindBy(id="middleName") //Middle name 
	WebElement txtMidName;
	@FindBy(id="lastName") // last name
	WebElement txtlsatName;
	@FindBy(id="dob") //dob
	WebElement dob;
	@FindBy(id="fatherName") //father name
	WebElement fathername;
	@FindBy(id="mobileNo") //mobile number
	WebElement mobile;
	@FindBy(id="email") //email
	WebElement email;
	@FindBy(id="state") // state
	WebElement state;
	@FindBy(id="city") // city
	WebElement city;
	@FindBy(id="location") // joining location dropdown
	WebElement joinloca;
	@FindBy(id="jobRole") // jobRole dropdown
	WebElement jobrole;
	@FindBy(id="recruiterUsername") // Recruiters dropdown
	WebElement recruiter;
	@FindBy(id="recruiterName") // Recruiters Name
	WebElement recruiterName;
	@FindBy(id="recruiterEmail") // Recruiters Email
	WebElement recruiterEmail;
	@FindBy(id="requisitionId") // Requisition Number
	WebElement requestid;
	@FindBy(id="candidateReferenceId") // Reference Number
	WebElement referenceNumber;
	@FindBy(xpath="//div[@class='float-end']//button[@type='submit']") //Tick Button
	WebElement btnsave;
	@FindBy(xpath="//a[@class='btn btn-outline-secondary btn-lg']")// X Button
	WebElement btncancel;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") //Success Message
	WebElement successMessage;
	@FindBy(id="dobError") 
	WebElement dobError;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") //duplicate error Message
	WebElement duplicateMessage;
	//**********************
	@FindBy(id="verificationTabLinkBasics")
	WebElement basicdetailsTab;
	@FindBy(id="verificationTabLink0")
	WebElement autoComponentTab;
	@FindBy(id="verificationTabLinkAuthForm")
	WebElement authlink;
	@FindBy(id="//div[@id='basicDetails']")
	WebElement basiclink;

	//******basicDetails***********	
	@FindBy(id="gender")
	WebElement sex;
	@FindBy(id="country")
	WebElement country1;
	@FindBy(id="uploadPhotoId")
	WebElement photo;
	@FindBy(id="nextIdBasic")
	WebElement btnnext;

	//**********Automation component******************
	@FindBy(id="registers0insufficient")//Insufficient Documents check box
	WebElement insufdoc;
	@FindBy(id="registers0fieldValue1")//Do not have address details  check box
	WebElement donothavedetails;
	@FindBy(id="registers0fieldValue9")//fresher  check box
	WebElement fresh;
	@FindBy(id="registers0fieldValue8Yes")//employed yes button
	WebElement employYes;
	@FindBy(id="registers0fieldValue8No")//employed no  button
	WebElement employno;
	@FindBy(xpath="//input[@id='registers0fieldValue10']")// Name of College or school
	WebElement school;
	@FindBy(id="registers0fieldValue11")// city 
	WebElement city1;
	@FindBy(id="registers0fieldValue12")// country
	WebElement country;
	@FindBy(id="registers0fieldValue2")// address
	WebElement address;
	@FindBy(id="registers0fieldValue3")// state
	WebElement state1;
	@FindBy(id="registers0fieldValue4")// pin code
	WebElement pincode;
	@FindBy(id="registers0fieldValue5tempFile")// upload
	WebElement uplo;
	@FindBy(id="registers0fieldValue6")// address type
	WebElement atype;
	@FindBy(id="registers0fieldValue7")// stay period
	WebElement stayperiod;
	@FindBy(id="draftSubmitRegisters0")//  Draft save
	WebElement autosave;
	@FindBy(id="finalSubmitRegisters0")// final type
	WebElement finalsub;
	@FindBy(id="registers0cloneBtn")// add more type
	WebElement addmore;
	@FindBy(xpath="//span[text()='Automation component - 2']")// add more type
	WebElement addmore1;
	@FindBy(xpath="//h4[normalize-space()='Final Submit']")// 
	WebElement alert;
	@FindBy(xpath="//h4[normalize-space()='Final Submit Confirmation']")// 
	WebElement finalSubmitAlert;
	@FindBy(id="textModalSubmit")// 
	WebElement finalSubmit;
	@FindBy(id="textModalContent")
	WebElement alertmess;
	@FindBy(id="textModalClose")
	WebElement alertClose;
	@FindBy(id="registers0fieldValue11Error")
	WebElement cityerror;
	@FindBy(id="registers0fieldValue10Error")
	WebElement schoolerror;
	@FindBy(id="registers0fieldValue12Error")
	WebElement countryerror;
	@FindBy(id="registers0fieldValue2Error")
	WebElement addresserror;
	@FindBy(id="registers0fieldValue3Error")
	WebElement stateerror;
	@FindBy(id="registers0fieldValue4Error")
	WebElement pincodeerror;
	@FindBy(id="registers[0].fieldValue5Error")
	WebElement fileerror;
	@FindBy(id="registers0fieldValue7Error")
	WebElement stayerror;
	@FindBy(xpath="//span[contains(text(),'Automation component - 2')]")
	WebElement chlidcomp;
	@FindBy(id="sentVerifierregisters0")
	WebElement success;
	@FindBy(id="resetComponentRegisters0")
	WebElement resetco;
	@FindBy(id="fileFormatError")
	WebElement fileerr;
	@FindBy(xpath="//strong[contains(text(),'Well done!')]")
	WebElement successmsg;
	@FindBy(id="registers0FinalSubmitLabel")
	WebElement verificationsubmitted;

	//*************Authorization***************
	@FindBy(id="authenticationForm")
	WebElement authupload;
	@FindBy(id="digital")
	WebElement btnupload;
	@FindBy(id="finalSave")
	WebElement fullsave;
	@FindBy(xpath="//span[@class='logo-lg']//img[@id='app-logo-light']")
	WebElement fullcancel;

	//**********finalSubmit*************
	@FindBy(id="finalSubmitIdregisters0")
	WebElement edufinal;
	@FindBy(id="textModalSubmit")
	WebElement finalSubmitConfirm;

	public void enterBasicDetailsCandidateFlow(String firstname,String lastname,String Dob,String fatherName,String mobileNumber,String Email,String State,String City, String location, String jobRole, String Recruiter,String referenceNum) throws InterruptedException {
		BasicDetailsRegisterPageNewUI bdr=new BasicDetailsRegisterPageNewUI();
		bdr.setFirstName(firstname);
		bdr.setLastName(lastname);
		bdr.setDOB(Dob);
		bdr.setFatherName(fatherName);
		bdr.setMobileNumber(mobileNumber);
		bdr.setEmail(Email);
		bdr.setState(State);
		bdr.setCity(City);
		bdr.SelectJoiningLocation(location);
		bdr.SelectJobRole(jobRole);
		bdr.SelectRecruiters(Recruiter);
		bdr.setReferenceNumber(referenceNum);
		//		uploadCV(referenceNum);
		bdr.clickSave();
		Thread.sleep(1000);
		//		HomePageNewUI hp=new HomePageNewUI();
		//				hp.CreateNew();
		String crtNumber = bdr.getCrtNumber();
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\AutomationFieldData.xlsx");
		ex.setCellData("CandidateBasic", "Crt Number",2, crtNumber);

	}

	public void enterBasicDetails(String testCaseNo,String CrtNumber,String firstname,String midName,String lastName,String Dob,String FatherName,String mobileNumber,
			String Email,String State,String City,String location,String jobRole,String Recruiter,String RecruiterName,String RecruiterEmail,String employeecode,String requestId,String reHire) throws InterruptedException, ParseException{
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\AutomationFieldData.xlsx");
		HomePage hp=new HomePage();
		BasicDetailsRegisterPageNewUI bdr=new BasicDetailsRegisterPageNewUI();
		bdr.setFirstName(firstname);
		String firstname2 = bdr.getFirstname();
		bdr.setLastName(lastName);
		bdr.setDOB(Dob);
		String dob2 = bdr.getDOB();
		int age = bdr.getAge(dob2);
		System.out.println(age);
		bdr.setFatherName(FatherName);
		String fatherName2 = bdr.getFatherName();
		bdr.setMobileNumber(mobileNumber);
		String mobileNumber2 = bdr.getMobileNumber();
		int length = mobileNumber2.length();
		bdr.setEmail(Email);
		String email2 = bdr.getEmail();
		bdr.setState(State);
		String state2 = bdr.getState();
		bdr.setCity(City);
		String city2 = bdr.getCity();
		bdr.SelectJoiningLocation(location);
		String location2 = bdr.getLocation();
		bdr.SelectJobRole(jobRole);
		String jobRole2 = bdr.getJobRole();
		bdr.SelectRecruiters(Recruiter);
		bdr.setRecruiterName(RecruiterName);
		String recuriterName = bdr.getRecuriterName();
		bdr.setRecruiterEmail(RecruiterEmail);
		String recuriterEmail = bdr.getRecuriterEmail();
		bdr.setRequestionId(requestId);
		bdr.setReferenceNumber(employeecode);
		bdr.clickSave();
		Thread.sleep(1000);
		if(firstname2.isEmpty()) {
			String actual = txtFirstName.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
		if(fatherName2.isEmpty()) {
			String actual = fathername.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
		if(email2.isEmpty()) {
			String actual = email.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
		if(state2.isEmpty()) {
			String actual = state.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
		if(city2.isEmpty()) {
			String actual = city.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
		if(location2.isEmpty()) {
			String actual = joinloca.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
		if(jobRole2.isEmpty()) {
			String actual = jobrole.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
		if(recuriterName.isEmpty()) {
			String actual = recruiterName.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
		if(recuriterEmail.isEmpty()) {
			String actual = recruiterEmail.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
		if(dob2.isEmpty()) {
			String actual = dob.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}else if(age>60||age<14)  {
			try {
				String actual = dobError.getText();
				int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
				ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
				javaScriptExecutorClick(btncancel);
				String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
				if (actual.contains(Expected)) {
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				} else {
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(mobileNumber2.isEmpty()||!mobileNumber2.matches("[0-9]+")) {
			String actual = mobile.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}else if(length<10) {
			String actual = mobile.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
		if(isSuccessMessageDisplayed()) {
			String actual = successMessage.getText();
			String crtNumber = actual.split(":")[1].replaceAll("[^0-9a-zA-Z]","");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("ComponentDataEntry", "Crt Number", cellRowNum, crtNumber);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			if (actual.contains("Candidate has been created")) {
				ex.setCellData("Testcases", "Test Result",cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result",cellRowNum, "Fail");
			}
		}else if(isDuplicateErrorMessageDisplayed()) {
			String actual = duplicateMessage.getText();
			String crtNumber = actual.split("Number")[1].replaceAll("[^0-9a-zA-Z]","");
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
			ex.setCellData("ComponentDataEntry", "Crt Number", cellRowNum, crtNumber);
			String cellData = ex.getCellData("Testcases", "Expected result", cellRowNum);
			ex.setCellData("Testcases","Actual result", cellRowNum,actual);
			if (actual.contains(cellData)) {
				ex.setCellData("Testcases", "Test Result",cellRowNum,"Pass");
			} else {
				ex.setCellData("Testcases", "Test Result",cellRowNum, "Fail");
			}
		}
		try {
			hp.CreateNew();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setAutomationComponentCandidateFlow(String testcaseNO,String auth, String gender,String Country1,String donotAdd,String fresher,String currentlyemply,String Schoo,String City,String Country,String Address,
			String State,String Pincode,String adtype,String stayPeriod,String path,String addmor,String reset) throws InterruptedException {
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\AutomationFieldData.xlsx");
		fullcancel.click();
		Thread.sleep(1000);
		selectDropdownOption(country1, Country1);
		selectDropdownOption(sex,gender);
		try {
			autoComponentTab.click();
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(donotAdd.equalsIgnoreCase("yes")) {
			Thread.sleep(1000);
			javaScriptExecutorClick(donothavedetails);
			boolean enabled = school.isEnabled();
			System.out.println(enabled);
			if (enabled) {
				int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases","Test Case Num ", testcaseNO);
				ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum, "cell is Enabled");
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();

			}else {
				int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases", "Test Case Num ", testcaseNO);
				System.out.println(cellRowNum);
				ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum, "Cell is Disabled");
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}
		}
		if (fresher.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(fresh);
			boolean enabled = school.isEnabled();
			if (enabled) {
				int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases", "Test Case Num ", testcaseNO);
				ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum, "Cell is Enabled");
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}else {
				int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases", "Test Case Num ", testcaseNO);
				System.out.println(cellRowNum);
				ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum, "Cell is Disabled");
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}
		}
		if(currentlyemply.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(employYes);
		} else if(currentlyemply.equalsIgnoreCase("no")) {
			javaScriptExecutorClick(employno);
		}
		Thread.sleep(500);
		school.clear();
		school.sendKeys(Schoo,Keys.TAB);
		String School = school.getAttribute("value");
		if(School.isEmpty()||School.length()>250||School.length()<3) {
			String actual = schoolerror.getText();
			int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases", "Test Case Num ",testcaseNO);
			String expected = ex.getCellData("CandidateFlowTestcases","Expected result",cellRowNum);
			ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}else {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}
		}
		city1.clear();
		city1.sendKeys(City,Keys.TAB);
		String city = city1.getAttribute("value");
		if(city.isEmpty()||city.length()>250||city.length()<3) {
			String actual = cityerror.getText();
			int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases","Test Case Num ",testcaseNO);
			String expected = ex.getCellData("CandidateFlowTestcases","Expected result",cellRowNum);
			ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}else {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}
		} 
		country.clear();
		country.sendKeys(Country,Keys.TAB);
		String countr = country.getAttribute("value");
		if(countr.isEmpty()||countr.length()>250||countr.length()<3) {
			String actual = countryerror.getText();
			int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases","Test Case Num ",testcaseNO);
			String expected = ex.getCellData("CandidateFlowTestcases","Expected result",cellRowNum);
			ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}else {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}
		} 
		address.clear();
		address.sendKeys(Address,Keys.TAB);
		String addres = address.getAttribute("value");
		if(addres.isEmpty()||addres.length()>250||addres.length()<3) {
			String actual = addresserror.getText();
			int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases","Test Case Num ",testcaseNO);
			String expected = ex.getCellData("CandidateFlowTestcases","Expected result",cellRowNum);
			ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}else {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}
		} 
		state1.clear();
		state1.sendKeys(State,Keys.TAB);
		String stat = state1.getAttribute("value");
		if(stat.isEmpty()||stat.length()>250||stat.length()<3) {
			String actual = stateerror.getText();
			int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases","Test Case Num ",testcaseNO);
			String expected = ex.getCellData("CandidateFlowTestcases","Expected result",cellRowNum);
			ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}else {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}
		}
		pincode.clear();
		pincode.sendKeys(Pincode,Keys.TAB);
		String pinc = pincode.getAttribute("value");
		if(testcaseNO.equalsIgnoreCase("TC066")) {
			String cit = city1.getAttribute("value");
			String cou = country.getAttribute("value");
			String sta = state1.getAttribute("value");
			if(cit.equalsIgnoreCase("Coimbatore")&&cou.equalsIgnoreCase("India")&&sta.equalsIgnoreCase("Tamil Nadu")) {
				int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases","Test Case Num ",testcaseNO);
				ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,"City,State,County auto fetched");
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}else {
				int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases","Test Case Num ",testcaseNO);
				ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,"City,State,County Not fetched");
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}
		}
		if(pinc.isEmpty()||pinc.length()>25||pinc.length()<3) {
			String actual = pincodeerror.getText();
			if(!actual.isEmpty()) {
				int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases","Test Case Num ",testcaseNO);
				String expected = ex.getCellData("CandidateFlowTestcases","Expected result",cellRowNum);
				ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,actual);
				if(expected.contains(actual)) {
					ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
					javaScriptExecutorClick(authlink);
					assertTrue(false);
					fullcancel.click();
				}else {
					ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
					javaScriptExecutorClick(authlink);
					assertTrue(false);
					fullcancel.click();
				}}else {
					int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases","Test Case Num ",testcaseNO);
					ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,"Error Message Not Displayed");
					ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
					javaScriptExecutorClick(authlink);
					assertTrue(false);
					fullcancel.click();
				}
		}
		Thread.sleep(1000);
		selectDropdownOption(atype, adtype);
		stayperiod.clear();
		stayperiod.sendKeys(stayPeriod,Keys.TAB);
		if(path!="") {
			uploadFile(uplo, path);
			Thread.sleep(1000);
		}
		if(addmor.equalsIgnoreCase("yes")) {
			try {
				if(isAddMoreButtonDisplayed()) {
					System.out.println("displayed");
					javaScriptExecutorClick(addmore);
					Thread.sleep(1500);
					scrollToElement(chlidcomp);
					String text = chlidcomp.getText();
					System.out.println(text);
					int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases", "Test Case Num ",testcaseNO);
					if(text.contains("component - 2")) {
						ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,text);
						ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
						javaScriptExecutorClick(authlink);
						assertTrue(false);
						fullcancel.click();
					}else {
						ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
						javaScriptExecutorClick(authlink);
						assertTrue(false);
						fullcancel.click();
					}
				}else {
					int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases", "Test Case Num ",testcaseNO);
					ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,"Add More button is not displayed");
					ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
					javaScriptExecutorClick(authlink);
					assertTrue(false);
					fullcancel.click();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(isAlertPresent()) {
			System.out.println("ss");
			Alert alert2 = driver.switchTo().alert();
			String actual = alert2.getText();
			acceptAlert();
			int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases","Test Case Num ",testcaseNO);
			String expected = ex.getCellData("CandidateFlowTestcases","Expected result",cellRowNum);
			ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
				try {
					alertClose.click();
				}catch (Exception e) {
					e.printStackTrace();
				}
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}else {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
				javaScriptExecutorClick(authlink);
				assertTrue(false);
				fullcancel.click();
			}
		}
		javaScriptExecutorClick(authlink);
		Thread.sleep(1000);
		fullsave.click();
		Thread.sleep(1000);
		if (alert.isDisplayed()) {	
			int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases", "Test Case Num ",testcaseNO);
			System.out.println(cellRowNum);
			String actual = alertmess.getText();
			ex.setCellData("CandidateFlowTestcases", "Actual result", cellRowNum,actual);
			String expected = ex.getCellData("CandidateFlowTestcases","Expected result",cellRowNum);
			if(expected.contains(actual)) {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Pass");
				Thread.sleep(500);
				alertClose.click();
				fullcancel.click();
			}else {
				ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
				alertClose.click();
				fullcancel.click();
			}
		}else {
			int cellRowNum = ex.getCellRowNum("CandidateFlowTestcases", "Test Case Num ",testcaseNO);
			ex.setCellData("CandidateFlowTestcases", "Expected result", cellRowNum, "Error Message Not Displayed");
			ex.setCellData("CandidateFlowTestcases", "Test Result", cellRowNum, "Fail");
			fullcancel.click();
		}
	}
	public void setAutomationcomponent(String testcaseNO,String Number,String auth, String gender,String Country1,String insuffDoc,String donotAdd,String fresher,String currentlyemply,String Schoo,String City,String Country,String Address,
			String State,String Pincode,String adtype,String stayPeriod,String path,String addmor,String reset) throws InterruptedException {
		HomePage hp=new HomePage();
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\AutomationFieldData.xlsx");
		int num = Integer.parseInt(Number);
		String crtNumber = ex.getCellData("ComponentDataEntry", "Crt Number", num+1);
		hp.clickFillData();
		hp.selectCrtNumber(crtNumber);
		try {
			authlink.click();
			if (isElementPresent("authenticationForm")) {
				scrollToElement(authupload);
				if(auth=="") {
					fullsave.click();
					if(isAlertPresent()) {
						acceptAlert();
					}
					Thread.sleep(500);
					if (isAlertPresent()) {
						Alert alert2 = driver.switchTo().alert();
						String text = alert2.getText();
						acceptAlert();
						Thread.sleep(1000);
						WebElement popup = driver.findElement(By.xpath("//div[@id='alertEmptyRegister']//button[@type='button'][normalize-space()='Ok']"));
						popup.click();
						int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ", testcaseNO);
						ex.setCellData("Testcases", "Actual result", cellRowNum, text);
						ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
						fullcancel.click();
					}
				}
				authupload.sendKeys(auth);
				javaScriptExecutorClick(btnupload);
				if(testcaseNO.equalsIgnoreCase("TC083")) {
					WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
					wait.until(ExpectedConditions.alertIsPresent());
				}
				if(isAlertPresent()) {
					System.out.println("entere1");
					Alert alert2 = driver.switchTo().alert();
					String text = alert2.getText();
					acceptAlert();
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ", testcaseNO);
					ex.setCellData("Testcases", "Actual result", cellRowNum, text);
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
					fullcancel.click();
				}
				try {
					if(fileerr.isDisplayed()) {
						System.out.println("enter");
						String text = fileerr.getText();
						int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ", testcaseNO);
						ex.setCellData("Testcases", "Actual result", cellRowNum, "Please upload only pdf,jpg files");
						ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
						fullcancel.click();
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			Thread.sleep(1000);

		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			scrollToElement(basicdetailsTab);
			javaScriptExecutorClick(basicdetailsTab);
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(gender=="") {
			authlink.click();
			Thread.sleep(1000);
			fullsave.click();
			Thread.sleep(1000);
			if (alert.isDisplayed()) {
				int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ",testcaseNO);
				String actual = alertmess.getText();
				alertClose.click();
				String expected = ex.getCellData("Testcases","Expected result",cellRowNum);
				ex.setCellData("Testcases", "Actual result", cellRowNum,actual);
				if(expected.contains(actual)) {
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
					fullcancel.click();
				}else {
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
					fullcancel.click();
				}
			}else {
				int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ",testcaseNO);
				ex.setCellData("Testcases", "Actual result", cellRowNum, "Error Message Not Displayed");
				fullcancel.click();
			}
		}
		selectDropdownOption(sex,gender);
		selectDropdownOption(country1, Country1);
		javaScriptExecutorClick(autoComponentTab);
		if(insuffDoc.equalsIgnoreCase("yes")) {
			if(insufdoc.isDisplayed()) {
				insufdoc.click();
				if(finalsub.isEnabled()) {
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ", testcaseNO);
					ex.setCellData("Testcases", "Actual result", cellRowNum, "Final submit button is Enabled");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
					fullcancel.click();
				}else {
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ", testcaseNO);
					ex.setCellData("Testcases", "Actual result", cellRowNum, "Final submit button is Disabled");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
					fullcancel.click();
				}
			}else {
				int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ", testcaseNO);
				ex.setCellData("Testcases", "Actual result", cellRowNum, "Insuff Checkbox is Not Displayed");
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();
			}
		}

		if(donotAdd.equalsIgnoreCase("yes")) {
			Thread.sleep(1000);
			donothavedetails.click();
			if(reset.equalsIgnoreCase("yes")) {
				javaScriptExecutorClick(finalsub);
				Thread.sleep(1000);
				finalSubmitConfirm.click();
				Thread.sleep(1000);
				refresh();
				autoComponentTab.click();
				if(resetco.isDisplayed()) {
					javaScriptExecutorClick(resetco);
					//				Thread.sleep(1000);
					//				autoComponentTab.click();
					if(school.isEnabled()) {
						if(finalsub.isEnabled()) {
							int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ", testcaseNO);
							ex.setCellData("Testcases", "Actual result", cellRowNum, "Fields And final submit button is enabled");
							ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
							fullcancel.click();
						}
					}
				}else {
					int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ", testcaseNO);
					ex.setCellData("Testcases", "Actual result", cellRowNum, "Reset component is not there");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
					fullcancel.click();
				}
			}
			boolean enabled = school.isEnabled();
			System.out.println(enabled);
			if (enabled) {
				int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ", testcaseNO);
				ex.setCellData("Testcases", "Actual result", cellRowNum, "cell is Enabled");
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();

			}else {
				int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ", testcaseNO);
				System.out.println(cellRowNum);
				ex.setCellData("Testcases", "Actual result", cellRowNum, "Cell is Disabled");
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				fullcancel.click();
			}

		}
		if (fresher.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(fresh);
			boolean enabled = school.isEnabled();
			if (enabled) {
				int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ", testcaseNO);
				ex.setCellData("Testcases", "Actual result", cellRowNum, "Cell is Enabled");
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();
			}else {
				int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ", testcaseNO);
				System.out.println(cellRowNum);
				ex.setCellData("Testcases", "Actual result", cellRowNum, "Cell is Disabled");
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				fullcancel.click();
			}
		}

		if(currentlyemply.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(employYes);
		} else if(currentlyemply.equalsIgnoreCase("no")) {
			javaScriptExecutorClick(employno);
		}
		Thread.sleep(500);
		school.clear();
		school.sendKeys(Schoo,Keys.TAB);
		String School = school.getAttribute("value");
		if(School.isEmpty()||School.length()>250||School.length()<3) {
			String actual = schoolerror.getText();
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ",testcaseNO);
			String expected = ex.getCellData("Testcases","Expected result",cellRowNum);
			ex.setCellData("Testcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				fullcancel.click();
			}else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();
			}

		}
		city1.clear();
		city1.sendKeys(City,Keys.TAB);
		String city = city1.getAttribute("value");
		if(city.isEmpty()||city.length()>250||city.length()<3) {
			String actual = cityerror.getText();
			int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ",testcaseNO);
			String expected = ex.getCellData("Testcases","Expected result",cellRowNum);
			ex.setCellData("Testcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				fullcancel.click();
			}else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();
			}
		} 
		country.clear();
		country.sendKeys(Country,Keys.TAB);
		String countr = country.getAttribute("value");
		if(countr.isEmpty()||countr.length()>250||countr.length()<3) {
			String actual = countryerror.getText();
			int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ",testcaseNO);
			String expected = ex.getCellData("Testcases","Expected result",cellRowNum);
			ex.setCellData("Testcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				fullcancel.click();
			}else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();
			}
		} 
		address.clear();
		address.sendKeys(Address,Keys.TAB);
		String addres = address.getAttribute("value");
		if(addres.isEmpty()||addres.length()>250||addres.length()<3) {
			String actual = addresserror.getText();
			int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ",testcaseNO);
			String expected = ex.getCellData("Testcases","Expected result",cellRowNum);
			ex.setCellData("Testcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				fullcancel.click();
			}else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();
			}
		} 
		state1.clear();
		state1.sendKeys(State,Keys.TAB);
		String stat = state1.getAttribute("value");
		if(stat.isEmpty()||stat.length()>250||stat.length()<3) {
			String actual = stateerror.getText();
			int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ",testcaseNO);
			String expected = ex.getCellData("Testcases","Expected result",cellRowNum);
			ex.setCellData("Testcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				fullcancel.click();
			}else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();
			}
		}
		pincode.clear();
		pincode.sendKeys(Pincode,Keys.TAB);
		String pinc = pincode.getAttribute("value");
		if(testcaseNO.equalsIgnoreCase("TC066")) {
			String cit = city1.getAttribute("value");
			String cou = country.getAttribute("value");
			String sta = state1.getAttribute("value");
			if(cit.equalsIgnoreCase("Coimbatore")&&cou.equalsIgnoreCase("India")&&sta.equalsIgnoreCase("Tamil Nadu")) {
				int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ",testcaseNO);
				ex.setCellData("Testcases", "Actual result", cellRowNum,"City,State,County auto fetched");
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				fullcancel.click();
			}else {
				int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ",testcaseNO);
				ex.setCellData("Testcases", "Actual result", cellRowNum,"City,State,County Not fetched");
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();
			}
		}
		if(pinc.isEmpty()||pinc.length()>25||pinc.length()<3) {
			String actual = pincodeerror.getText();
			if(!actual.isEmpty()) {
				int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ",testcaseNO);
				String expected = ex.getCellData("Testcases","Expected result",cellRowNum);
				ex.setCellData("Testcases", "Actual result", cellRowNum,actual);
				if(expected.contains(actual)) {
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
					fullcancel.click();
				}else {
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
					fullcancel.click();
				}}else {
					int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ",testcaseNO);
					ex.setCellData("Testcases", "Actual result", cellRowNum,"Error Message Not Displayed");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
					fullcancel.click();
				}
		}

		selectDropdownOption(atype, adtype);
		stayperiod.clear();
		stayperiod.sendKeys(stayPeriod,Keys.TAB);
		if(path!="") {
			uploadFile(uplo, path);
			Thread.sleep(1000);
		}
		if(addmor.equalsIgnoreCase("yes")) {
			try {
				if(isAddMoreButtonDisplayed()) {
					System.out.println("displayed");
					javaScriptExecutorClick(addmore);
					Thread.sleep(1500);
					scrollToElement(chlidcomp);
					String text = chlidcomp.getText();
					System.out.println(text);
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ",testcaseNO);
					if(text.contains("component - 2")) {
						ex.setCellData("Testcases", "Actual result", cellRowNum,text);
						ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
						fullcancel.click();
					}else {
						ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
						fullcancel.click();
					}
				}else {
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ",testcaseNO);
					ex.setCellData("Testcases", "Actual result", cellRowNum,"Add More button is not displayed");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
					fullcancel.click();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		javaScriptExecutorClick(finalsub);
		Thread.sleep(1500);
		if(isAlertPresent()) {
			System.out.println("ss");
			Alert alert2 = driver.switchTo().alert();
			String actual = alert2.getText();
			acceptAlert();
			int cellRowNum = ex.getCellRowNum("Testcases","Test Case Num ",testcaseNO);
			String expected = ex.getCellData("Testcases","Expected result",cellRowNum);
			ex.setCellData("Testcases", "Actual result", cellRowNum,actual);
			if(expected.contains(actual)) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				try {
					alertClose.click();
				}catch (Exception e) {
					e.printStackTrace();
				}
				fullcancel.click();
			}else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();
			}
		}
		try {
			if (alert.isDisplayed()) {	
				int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ",testcaseNO);
				System.out.println(cellRowNum);
				String actual = alertmess.getText();
				ex.setCellData("Testcases", "Actual result", cellRowNum,actual);
				String expected = ex.getCellData("Testcases","Expected result",cellRowNum);
				if(expected.contains(actual)) {
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
					Thread.sleep(500);
					alertClose.click();
					fullcancel.click();
				}else {
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
					alertClose.click();
					fullcancel.click();
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		//		autosave.click();

		if(finalSubmitAlert.isDisplayed()) {
			finalSubmitConfirm.click();
			Thread.sleep(1000);
			String actual = verificationsubmitted.getText();	
			int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ",testcaseNO);
			ex.setCellData("Testcases", "Actual result", cellRowNum,actual);
			String expected = ex.getCellData("Testcases","Expected result",cellRowNum);
			Thread.sleep(1000);
			if(actual.contains(expected)) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				fullcancel.click();
			}else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				fullcancel.click();
			}
		}
		javaScriptExecutorClick(authlink);
		Thread.sleep(1000);
		fullsave.click();
	}
	public boolean isAutharizationSubmitted() {

		try {
			List<WebElement> element = driver.findElements(By.xpath("//p[@class='float-end text-success me-2']"));
			if(element.size()==0) {
				return false;
			}
			return true;
		}catch (Exception e) {

			System.out.println("element is not there");
			return true;
		} 
	}

	public boolean isSuccessMessageDisplayed() {

		try {
			List<WebElement> element = driver.findElements(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
			if(element.size()==0) {
				return false;
			}
			return true;
		}catch (Exception e) {

			System.out.println("element is not there");
			return true;
		} 
	}
	public boolean isDuplicateErrorMessageDisplayed() {
		try {
			List<WebElement> element = driver.findElements(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
			if(element.size()==0) {
				return false;
			}
			return true;
		}catch (Exception e) {

			System.out.println("element is not there");
			return true;
		} 
	}
	public boolean isAddMoreButtonDisplayed() {
		try {
			List<WebElement> element = driver.findElements(By.id("registers0cloneBtn"));
			if(element.size()==0) {
				return false;
			}
			return true;
		}catch (Exception e) {

			System.out.println("element is not there");
			return true;
		} 
	}
	public boolean isIsuffDisplayed() {
		try {
			List<WebElement> element = driver.findElements(By.id("registers0insufficient"));
			if(element.size()==0) {
				return false;
			}
			return true;
		}catch (Exception e) {

			System.out.println("element is not there");
			return true;
		} 
	}
	public void changeFirstName() {
		ExcelUtils ex=new ExcelUtils("C:\\\\Users\\\\Durga Prasad\\\\eclipse-workspace\\\\Attest360\\\\src\\\\test\\\\resources\\\\TestData\\\\AutomationFieldData.xlsx");
		String randomName = randomName();
		ex.setCellData("CandidateBasic", "First Name", 2, randomName);

	}

}

