package test.attest360.pageObjects;


import java.text.ParseException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.attest360.testCases.BaseClass;
import test.attest360.testData.DataProvidersAuto;
import test.attest360.utilities.ExcelUtils;

public class AutoComponent extends BaseClass {

	@Test(priority =-1)
	public void critirionDataEntryLogin() {
		LoginPage lp=new LoginPage();
		LanchUrl(NewUrl);
		lp.setNewUser(dataEntry);
		lp.setNewPassword(NewPass);
		lp.clickLogin();
	}

	@Test(priority=0)
	@Parameters("customerName")
	public void select_customer(String customerName) throws InterruptedException{
		HomePage hp=new HomePage();
		hp.selectCustomer(customerName);
		hp.clickCreateNew();
	}	
	@Test(dataProvider ="AutoBasic", dataProviderClass= DataProvidersAuto.class,priority=1)
	public void enterBasicDetails(String testCaseNo,String CrtNumber,String firstname,String midName,String lastName,String Dob,String FatherName,String mobileNumber,
			String Email,String State,String City,String location,String jobRole,String Recruiter,String RecruiterName,String RecruiterEmail,String employeecode,String requestId,String reHire) throws InterruptedException, ParseException {
		FieldValidation fdp= new FieldValidation();
		fdp.enterBasicDetails(testCaseNo, CrtNumber, firstname, midName, lastName, Dob, FatherName, mobileNumber, Email, State, City, location, jobRole, Recruiter, RecruiterName, RecruiterEmail, employeecode, requestId, reHire);
	}
	@Test(dataProvider ="basic-Candidate", dataProviderClass= DataProvidersAuto.class,priority=1)
	public void enterBasicDetailsCandidateFlow(String crtNum,String firstname,String lastname,String Dob,String fatherName,String mobileNumber,String Email,String State,String City, String location, String jobRole, String Recruiter,String referenceNum) throws InterruptedException{
		FieldValidation fv=new FieldValidation();
		fv.enterBasicDetailsCandidateFlow(firstname, lastname, Dob, fatherName, mobileNumber, Email, State, City, location, jobRole, Recruiter, referenceNum);
		fv.changeFirstName();
		logoutAsDataEntry();
	}
	@Test(priority =2)
	public void loginAsCandidate() {
		LoginPage lp=new LoginPage();
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\AutomationFieldData.xlsx");
		String crtNumber = ex.getCellData("CandidateBasic", "Crt Number", 2);
		String CandidatePass = OutlookMailReader("inbox", "Password Mail", "is <strong><span style=3D\"color: #ff0000;\">",12);
		lp.setNewUser(crtNumber);
		lp.setNewPassword(CandidatePass);
		lp.clickLogin();
	}
	@Test(dataProvider="FieldValidation-Candidate",dataProviderClass= DataProvidersAuto.class,priority=3)
	public void CandidateFieldValidation(String testcaseNO,String auth, String gender,String insuffDoc,String donotAdd,String fresher,String currentlyemply,String Schoo,String City,String Country,String Address,
			String State,String Pincode,String adtype,String stayPeriod,String path,String addmor,String reset) throws InterruptedException {
		FieldValidation fdp= new FieldValidation();
		fdp.setAutomationComponentCandidateFlow(testcaseNO, auth, gender, Country, donotAdd, fresher, currentlyemply, Schoo, City, Country, Address, State, Pincode, adtype, stayPeriod, path, addmor, reset);

	}
	@Test(dataProvider="FilldataAutoComponent",dataProviderClass= DataProvidersAuto.class,priority=2)
	public void enterComponenetDetails(String testcaseNO,String Number,String auth,String gender,String Photo,String insuffDoc,String donotAdd,String fresher,String currentlyemply,String Schoo,String City,String Country,String Address,
			String State,String Pincode,String adtype,String stayPeriod,String path,String addmore,String reset) throws InterruptedException {
		FieldValidation fdp= new FieldValidation();
		fdp.setAutomationcomponent(testcaseNO, Number,auth,gender, Photo, insuffDoc, donotAdd, fresher, currentlyemply, Schoo, City, Country, Address, State, Pincode, adtype, stayPeriod, path,addmore,reset);
	}
	@Test(priority=3)
	public void logoutAsDataEntry() throws InterruptedException {
		LoginPage lp=new LoginPage();
		lp.clickprofileLogout();
	}






}
