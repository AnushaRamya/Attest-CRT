package test.attest360.pageObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.attest360.testCases.BaseClass;
import test.attest360.utilities.ExcelUtils;

public class BasicDetailsRegisterPageNewUI extends BaseClass {
	public BasicDetailsRegisterPageNewUI() {
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
	@FindBy(id="docFileName")// Cv Upload
	WebElement cvupload;

	public void setFirstName(String firstname){
		txtFirstName.clear();
		txtFirstName.sendKeys(firstname);
	}
	public String getFirstname(){
		String name = txtFirstName.getAttribute("value");
		return name;
	}
	public void setLastName(String lastname){
		txtlsatName.clear();
		txtlsatName.sendKeys(lastname);
	}
	public void setDOB(String Dob){
		dob.clear();
		dob.sendKeys(Dob);
	}
	public String getDOB() {
		String DOB = dob.getAttribute("value");
		return DOB;
	}
	public void setMobileNumber(String mobileNumber){
		mobile.clear();
		mobile.sendKeys(mobileNumber);
	}	
	public String getMobileNumber(){
		String mob = mobile.getAttribute("value");
		return mob;
	}		
	public void setFatherName(String FatherName){
		fathername.clear();
		fathername.sendKeys(FatherName);
	}
	public String getFatherName() {
		String fatherName = fathername.getAttribute("value");
		return fatherName;
	}
	public void setEmail(String Email){
		email.clear();
		email.sendKeys(Email);
	}
	public String getEmail(){
		String Email = email.getAttribute("value");
		return Email;
		
	}	
	public void setState(String State){
		state.clear();
		state.sendKeys(State);
	}	
	public String getState(){
		String State = state.getAttribute("value");
		return State;
	}		
	public void setCity(String City){
		city.clear();
		city.sendKeys(City);
	}
	public String getCity(){
		String City = city.getAttribute("value");
		return City;
	}
	public void SelectJoiningLocation(String location){
		selectDropdownOption(joinloca, location);

	}
	public String getLocation(){
		String location = joinloca.getAttribute("value");
		return location;
	}
	public void SelectJobRole(String jobRole){
		selectDropdownOption(jobrole, jobRole);
	}
	public String getJobRole(){
		String jobRole = jobrole.getAttribute("value");
		return jobRole;
	}
	public void SelectRecruiters(String Recruiter){
		selectDropdownOption(recruiter, Recruiter);
	}
	public String getRecuriter(){
		String Recruiter = recruiter.getAttribute("value");
		return Recruiter;
	}
	public void setRecruiterName(String RecruiterName){
		recruiterName.clear();
		recruiterName.sendKeys(RecruiterName);
	}
	public String getRecuriterName(){
		String RecruiterName = recruiterName.getAttribute("value");
		return RecruiterName;
	}
	public void setRecruiterEmail(String RecruiterEmail){
		recruiterEmail.clear();
		recruiterEmail.sendKeys(RecruiterEmail);
	}
	public String getRecuriterEmail(){
		String RecruiterEmail = recruiterEmail.getAttribute("value");
		return RecruiterEmail;
	}
	public void setReferenceNumber(String referenceNum){
		referenceNumber.clear();
		referenceNumber.sendKeys(referenceNum);
	}
	public void uploadCV(String referenceNum){
		uploadFile(cvupload, referenceNum);
	}
	public void setRequestionId(String requestId){
		requestid.clear();
		requestid.sendKeys(requestId);

	}	
	public String getEmployeeCode(){
		String emp = referenceNumber.getAttribute("value");
		return emp;

	}
	public void clickSave() {
		javaScriptExecutorClick(btnsave);
	}
	public void clickCancel(){
		//	scrollToElement(btncancel);
		javaScriptExecutorClick(btncancel);
	}
	public String  getCrtNumber(){
		String SuccessMessage = successMessage.getText();
		String crtNum = SuccessMessage.split(":")[1].replaceAll("[^0-9a-zA-Z]","");
		return crtNum;
	}

	public void enterBasicDetails(String firstname,String lastname,String Dob,String fatherName,String mobileNumber,String Email,String State,String City, String location, String jobRole, String Recruiter,String referenceNum) throws InterruptedException {
		setFirstName(firstname);
		setLastName(lastname);
		setDOB(Dob);
		setFatherName(fatherName);
		setMobileNumber(mobileNumber);
		setEmail(Email);
		setState(State);
		setCity(City);
		SelectJoiningLocation(location);
		SelectJobRole(jobRole);
		SelectRecruiters(Recruiter);
		setReferenceNumber(referenceNum);
//		uploadCV(referenceNum);
		clickSave();
		Thread.sleep(1000);
//		HomePageNewUI hp=new HomePageNewUI();
//				hp.CreateNew();
		String crtNumber = getCrtNumber();
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\CandidateDetails-Fresher.xlsx");
		ex.setCellData("CRTNumber", "CRTNumber",2, crtNumber);

	}
	public void changeFirstName(String jobRole) {
		ExcelUtils ex=new ExcelUtils();
		String randomName = randomName();
		if(jobRole.equalsIgnoreCase("Fresher")) {
			ex.setCellData("Basic Details-Fresher", "First Name", 2, randomName);
		}else if(jobRole.equalsIgnoreCase("Package additional")) {
			ex.setCellData("Basic Details-Fresher", "First Name", 2, randomName);
		}else  {
			ex.setCellData("Basic Details-Experienced", "First Name", 2, randomName);
		}
	}
	public void FirstNameValidation(String testCaseNo){
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\AutomationFieldData.xlsx");
		String first = txtFirstName.getAttribute("value");
		if(first.isEmpty()) {
			javaScriptExecutorClick(btnsave);
			String actual = txtFirstName.getAttribute("validationMessage");
			int cellRowNum = ex.getCellRowNum("ComponentDataEntry", "Test Case Num", testCaseNo);
			ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
			javaScriptExecutorClick(btncancel);
			String Expected = ex.getCellData("Testcases", "Expected result", cellRowNum);
			if (actual.contains(Expected) ) {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
			} else {
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
			}
		}
	}
	public void successMessageValidation(String testCaseNo) {
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\AutomationFieldData.xlsx");
		String actual = successMessage.getText();
		int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num", testCaseNo);
		ex.setCellData("Testcases", "Actual result", cellRowNum, actual);
		String expect = ex.getCellData("Testcases", "Expected result", cellRowNum);
		if (actual.contains(expect)) {
			ex.setCellData("Testcases", "Test Result",cellRowNum, "Pass");
		} else {
			ex.setCellData("Testcases", "Test Result",cellRowNum, "Fail");
		}
	}
	public int getAge(String dob1) throws ParseException {
		    Date date = null;
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    try {
		        date = sdf.parse(dob1);
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }

		    if(date == null) return 0;

		    Calendar dob = Calendar.getInstance();
		    Calendar today = Calendar.getInstance();

		    dob.setTime(date);

		    int year = dob.get(Calendar.YEAR);
		    int month = dob.get(Calendar.MONTH);
		    int day = dob.get(Calendar.DAY_OF_MONTH);

		    dob.set(year, month+1, day);

		    int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

		    if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)){
		        age--;
		    }
		    
		    return age;
		}}







