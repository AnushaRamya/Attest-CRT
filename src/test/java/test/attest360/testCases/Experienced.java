package test.attest360.testCases;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import test.attest360.pageObjects.BasicDetailsRegisterPageNewUI;
import test.attest360.pageObjects.CandidateFlow;
import test.attest360.pageObjects.FillData_Fresher;
import test.attest360.pageObjects.HomePage;
import test.attest360.pageObjects.LoginPage;
import test.attest360.pageObjects.QADecision_Fresher;
import test.attest360.pageObjects.Verifier_Fresher;
import test.attest360.testCases.BaseClass;
import test.attest360.testData.DataProviders;
import test.attest360.utilities.ExcelUtils;

public class Experienced extends BaseClass {
	@Test(priority =-1)
	public void critirionDataEntryLogin() {
		LoginPage lp=new LoginPage();
		LanchUrl(NewUrl);
		lp.setNewUser(dataEntry);
		lp.setNewPassword(NewPass);
		lp.clickLogin();
	}
	@Test(priority=0,groups={"fresher","Experienced"})
	@Parameters("customerName")
	public void select_customer(String customerName) throws InterruptedException{
		HomePage hp=new HomePage();
		hp.selectCustomer(customerName);
		hp.clickCreateNew();
	}
	@Test(dataProvider ="basicDetailsExperienced", dataProviderClass= DataProviders.class,priority=1)
	public void enterBasicDetails(String firstname,String lastname,String Dob,String fatherName,String mobileNumber,String Email,String State,String City, String location, String jobRole, String Recruiter,String referenceNum) throws InterruptedException{
		BasicDetailsRegisterPageNewUI bdr=new BasicDetailsRegisterPageNewUI();
		bdr.enterBasicDetails(firstname, lastname, Dob, fatherName, mobileNumber, Email, State, City, location, jobRole, Recruiter, referenceNum);
		bdr.changeFirstName(jobRole);
	}
	@Test(dataProvider ="CandidateFlow", dataProviderClass= DataProviders.class,priority=2)
	public void candidateFlow(String gen,String cou,String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path,String repondentName,String desig,String orgName) throws InterruptedException {
		CandidateFlow cf=new CandidateFlow();
		FillData_Fresher fdf= new FillData_Fresher();
		LoginPage lp=new LoginPage();
		logoutAsDataEntry();
		String CandidatePass = OutlookMailReader("inbox", "Password Mail", "is <strong><span style=3D\"color: #ff0000;\">",12);
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\CandidateDetails-Fresher.xlsx");
		String crtNumber = ex.getCellData("CRTNumber", "CRTNumber", 2);
		lp.setNewUser(crtNumber);
		lp.setNewPassword(CandidatePass);
		lp.clickLogin();
		cf.candidateflow(gen, cou, cuAdd, city, state, stay, country, postal, addtype, path, repondentName, desig, orgName);
		lp.clickprofileLogout();
		critirionDataEntryLogin();
		cf.searchEmployeeInToReviewBucket(crtNumber);
		fillDataSetEducation("Maharaja Institute", "Anna Univ", "Coimbatore", "B.E", "2017", "7120122132","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.setPermanentAddressVerification(cuAdd, city, state, stay, country, postal, addtype, path);
		fdf.setIdentification("Aadhaar Card", "sathish", "566922875610", path);
		fdf.setEmployment("TCS", "coimbatore", "coimbatore", "Engineer", "tcoo1", "18-12-1994", "Carrer Upgrade","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.finalSave();
	}
	@Test(dataProvider ="CandidateFlow", dataProviderClass= DataProviders.class,priority=2)
	public void InsuffCandidateFlow1(String gen,String cou,String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path,String repondentName,String desig,String orgName) throws InterruptedException {
		CandidateFlow cf=new CandidateFlow();
		FillData_Fresher fdf= new FillData_Fresher();
		LoginPage lp=new LoginPage();
		logoutAsDataEntry();
		String CandidatePass = OutlookMailReader("inbox", "Password Mail", "is <strong><span style=3D\"color: #ff0000;\">",12);
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\CandidateDetails-Fresher.xlsx");
		String crtNumber = ex.getCellData("CRTNumber", "CRTNumber", 2);
		lp.setNewUser(crtNumber);
		lp.setNewPassword(CandidatePass);
		lp.clickLogin();
		cf.candidateflow(gen, cou, cuAdd, city, state, stay, country, postal, addtype, path, repondentName, desig, orgName);
		lp.clickprofileLogout();
		critirionDataEntryLogin();
		cf.searchEmployeeInToReviewBucket(crtNumber);
		fdf.InsufficientFlowSelf("yes","Insuff Rised for Education","","","","");
		lp.clickprofileLogout();
		lp.setNewUser(crtNumber);
		lp.setNewPassword(CandidatePass);
		lp.clickLogin();
		cf.InsufficientFlowCandidate("yes", "", "", "", "", "", gen, cou, cuAdd, city, state, stay, country, postal, addtype, path, repondentName, desig, orgName);
		lp.clickprofileLogout();
		critirionDataEntryLogin();
		cf.searchEmployeeInToReviewBucket(crtNumber);
		fillDataSetEducation("Maharaja Institute", "Anna Univ", "Coimbatore", "B.E", "2017", "7120122132","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.setPermanentAddressVerification(cuAdd, city, state, stay, country, postal, addtype, path);
		fdf.setIdentification("Aadhaar Card", "sathish", "566922875610", path);
		fdf.setEmployment("TCS", "coimbatore", "coimbatore", "Engineer", "tcoo1", "18-12-1994", "Carrer Upgrade","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.finalSave();
	}
	@Test(dataProvider ="CandidateFlow", dataProviderClass= DataProviders.class,priority=2)
	public void InsuffCandidateFlow2(String gen,String cou,String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path,String repondentName,String desig,String orgName) throws InterruptedException {
		CandidateFlow cf=new CandidateFlow();
		FillData_Fresher fdf= new FillData_Fresher();
		LoginPage lp=new LoginPage();
		logoutAsDataEntry();
		String CandidatePass = OutlookMailReader("inbox", "Password Mail", "is <strong><span style=3D\"color: #ff0000;\">",12);
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\CandidateDetails-Fresher.xlsx");
		String crtNumber = ex.getCellData("CRTNumber", "CRTNumber", 2);
		lp.setNewUser(crtNumber);
		lp.setNewPassword(CandidatePass);
		lp.clickLogin();
		cf.candidateflow(gen, cou, cuAdd, city, state, stay, country, postal, addtype, path, repondentName, desig, orgName);
		lp.clickprofileLogout();
		critirionDataEntryLogin();
		cf.searchEmployeeInToReviewBucket(crtNumber);
		fdf.InsufficientFlowSelf("yes","Insuff Rised for Education","","","","");
		fdf.searchEmployeeInInsuffRejectionBucket();
		fillDataSetEducation("Maharaja Institute", "Anna Univ", "Coimbatore", "B.E", "2017", "7120122132","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.educationFinalSubmit();
		fdf.setPermanentAddressVerification(cuAdd, city, state, stay, country, postal, addtype, path);
		fdf.setIdentification("Aadhaar Card", "sathish", "566922875610", path);
		fdf.setEmployment("TCS", "coimbatore", "coimbatore", "Engineer", "tcoo1", "18-12-1994", "Carrer Upgrade","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.finalSave();
	}
	@Test(dataProvider ="CandidateFlow", dataProviderClass= DataProviders.class,priority=2)
	public void InsuffCandidateFlow3(String gen,String cou,String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path,String repondentName,String desig,String orgName) throws InterruptedException {
		CandidateFlow cf=new CandidateFlow();
		FillData_Fresher fdf= new FillData_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		LoginPage lp=new LoginPage();
		logoutAsDataEntry();
		String CandidatePass = OutlookMailReader("inbox", "Password Mail", "is <strong><span style=3D\"color: #ff0000;\">",12);
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\CandidateDetails-Fresher.xlsx");
		String crtNumber = ex.getCellData("CRTNumber", "CRTNumber", 2);
		lp.setNewUser(crtNumber);
		lp.setNewPassword(CandidatePass);
		lp.clickLogin();
		cf.candidateflow(gen, cou, cuAdd, city, state, stay, country, postal, addtype, path, repondentName, desig, orgName);
		lp.clickprofileLogout();
		critirionDataEntryLogin();
		cf.searchEmployeeInToReviewBucket(crtNumber);
		fillDataSetEducation("Maharaja Institute", "Anna Univ", "Coimbatore", "B.E", "2017", "7120122132","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.setPermanentAddressVerification(cuAdd, city, state, stay, country, postal, addtype, path);
		fdf.setIdentification("Aadhaar Card", "sathish", "566922875610", path);
		fdf.setEmployment("TCS", "coimbatore", "coimbatore", "Engineer", "tcoo1", "18-12-1994", "Carrer Upgrade","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.finalSave();
		logoutAsDataEntry();
		critirionQaLogin();
		runAutoDeligate("Billing Changes");
		logoutAsQA();
		critirinverifierLogin();
		vf.searchEmployee();
		vf.VerifierToDataEntryInsufficiency("yes", "Insuff Raised for Education ", "", "", "", "");
		Thread.sleep(1000);
		logoutAsVerifier();
		lp.setNewUser(crtNumber);
		lp.setNewPassword(CandidatePass);
		lp.clickLogin();
		cf.InsufficientFlowCandidate("yes", "", "", "", "", "", gen, cou, cuAdd, city, state, stay, country, postal, addtype, path, repondentName, desig, orgName);
		lp.clickprofileLogout();
	}
	@Test(dataProvider ="CandidateFlow", dataProviderClass= DataProviders.class,priority=2)
	public void InsuffCandidateFlow4(String gen,String cou,String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path,String repondentName,String desig,String orgName) throws InterruptedException {
		CandidateFlow cf=new CandidateFlow();
		FillData_Fresher fdf= new FillData_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		LoginPage lp=new LoginPage();
		logoutAsDataEntry();
		String CandidatePass = OutlookMailReader("inbox", "Password Mail", "is <strong><span style=3D\"color: #ff0000;\">",12);
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\CandidateDetails-Fresher.xlsx");
		String crtNumber = ex.getCellData("CRTNumber", "CRTNumber", 2);
		lp.setNewUser(crtNumber);
		lp.setNewPassword(CandidatePass);
		lp.clickLogin();
		cf.candidateflow(gen, cou, cuAdd, city, state, stay, country, postal, addtype, path, repondentName, desig, orgName);
		lp.clickprofileLogout();
		critirionDataEntryLogin();
		cf.searchEmployeeInToReviewBucket(crtNumber);
		fillDataSetEducation("Maharaja Institute", "Anna Univ", "Coimbatore", "B.E", "2017", "7120122132","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.setPermanentAddressVerification(cuAdd, city, state, stay, country, postal, addtype, path);
		fdf.setIdentification("Aadhaar Card", "sathish", "566922875610", path);
		fdf.setEmployment("TCS", "coimbatore", "coimbatore", "Engineer", "tcoo1", "18-12-1994", "Carrer Upgrade","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.finalSave();
		logoutAsDataEntry();
		critirionQaLogin();
		runAutoDeligate("Billing Changes");
		logoutAsQA();
		critirinverifierLogin();
		vf.searchEmployee();
		vf.VerifierToDataEntryInsufficiency("yes", "Insuff Raised for Education ", "", "", "", "");
		Thread.sleep(1000);
		logoutAsVerifier();
		critirionDataEntryLogin();
		fdf.searchEmployeeInInsuffRejectionBucket();
		fdf.setEducaion("Maharaja Institute", "Anna Univ", "Coimbatore", "B.E", "2017", "7120122132","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		fdf.educationFinalSubmit();
		logoutAsDataEntry();
	}
	@Test(dataProvider= "Authorization",dataProviderClass= DataProviders.class,priority=2)
	public void fillDataAuthorization(String path) throws InterruptedException {
		FillData_Fresher fdf=new FillData_Fresher();
		HomePage hp=new HomePage();
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\CandidateDetails-Fresher.xlsx");
		String crtNumber = ex.getCellData("CRTNumber", "CRTNumber", 2);
		//		hp.clickFillData();
		hp.selectCrtNumber(crtNumber);
		fdf.setAuthorization();
	}
	
	@Test(dataProvider= "Insufficent",dataProviderClass= DataProviders.class,priority=3)
	public void InsufficientFlowSelf(String Educa,String EduReason,String address,String addressReason,String id,String idReason) throws InterruptedException  {
		FillData_Fresher fdf=new FillData_Fresher();
		fdf.InsufficientFlowSelf(Educa, EduReason, address, addressReason, id, idReason);
		fdf.searchEmployeeInInsuffRejectionBucket();
	}

	@Test(dataProvider= "FilldataBasic",dataProviderClass= DataProviders.class,priority=3)
	public void fillDataSetBasic(String gen,String cou) throws InterruptedException {
		FillData_Fresher fdf=new FillData_Fresher();
		fdf.setBasicDetails(gen, cou);

	}
	@Test(dataProvider= "FilldataEducation",dataProviderClass= DataProviders.class,priority=4)
	public void fillDataSetEducation(String collage,String univ,String cit,String qualifi,String passYear,String rollnum,String path) throws InterruptedException {
		FillData_Fresher fdf=new FillData_Fresher();
//		fdf.clickDoNotHaveDetails();
		fdf.setEducaion(collage, univ, cit, qualifi, passYear, rollnum,path);
	}
	@Test(dataProvider= "FillDataAddress",dataProviderClass= DataProviders.class,priority=6)
	public void fillDataSetAddress(String cuAdd,String city,String state,String stay,String country,String postal,String addtype,String path) throws InterruptedException {
		FillData_Fresher fdf=new FillData_Fresher();
		fdf.setCurrentAddressVerification(cuAdd, city, state, stay, country, postal, addtype, path);
		fdf.setPermanentAddressVerification(cuAdd, city, state, stay, country, postal, addtype, path);

	}
	@Test(dataProvider= "FillDataIdentification",dataProviderClass= DataProviders.class,priority=7)
	public void fillDataIdentificationVerification(String type,String name,String number,String path) throws InterruptedException {
		FillData_Fresher fdf= new FillData_Fresher();
		fdf.setIdentification(type, name, number,path);

	}
	@Test(dataProvider="FillDataEmployment",dataProviderClass= DataProviders.class,priority=8)
	public void fillDataEmployement(String Employername,String address,String cit,String title,String code,String joindate,String reason,String repondentName,String desig,String orgName,String path) throws InterruptedException {
		FillData_Fresher fdf= new FillData_Fresher();
		fdf.setEmployment(Employername, address, cit, title, code, joindate, reason,path);
		fdf.setReference(repondentName, desig, orgName);
		Thread.sleep(1000);
		fdf.finalSave();
	}
	/*
	 * Stop BGV flow1
	 * All component dataEntry completed
	 * Verifier 1 component not accepted,accept other components
	 * QA click Stop Check,After that one component stop with billing yes,one component stop with billing no
	 * One component proceed to verifier
	 * verifier take decision And QAtake decision
	 * generate final report
	 * */
	@Test(priority=8)
	public void stopBgvFlow1() throws InterruptedException {
		QADecision_Fresher qhp=new QADecision_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		logoutAsDataEntry();
		critirionQaLogin();
		runAutoDeligate("Billing Changes");
		logoutAsQA();
		critirinverifierLogin();
		vf.searchEmployee();
		vf.acceptCurAddress();
		vf.acceptPerAddress();
		vf.acceptId();
		logoutAsVerifier();
		critirionQaLogin();
		qhp.searchEmployee();
		qhp.stopBgv("client requested to do the stop check for the case");
		qhp.stopBGVReviewEmployeeSearch();
		qhp.proceedForbillingYes("currentaddress");
		qhp.proceedForbillingNo("permanentAddress");
		qhp.proceedToVerifier1("id");
		logoutAsQA();
		critirinverifierLogin();
		vf.searchEmployee();
		vf.verifyIdentification("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		logoutAsVerifier();
		critirionQaLogin();
		qhp.stopBGVEmployeeSearch();
		qhp.qaDecisionIdentification();
		qhp.generateFinalReport();
		
	}
	/*
	 * Stop BGV flow2
	 * All component dataEntry completed
	 * In Verifier 1 component marked as Insufficient,verifier Decision taken for other components
	 * QA decision taken for other component after that QA click on stopCheck 
	 * generate final report
	 * */
	@Test(priority=8)
	public void stopBgvFlow2() throws InterruptedException {
		QADecision_Fresher qhp=new QADecision_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		logoutAsDataEntry();
		critirionQaLogin();
		runAutoDeligate("Billing Changes");
		logoutAsQA();
		critirinverifierLogin();
		vf.searchEmployee();
		vf.acceptEducation();
		vf.clickEducationinsuff();
		vf.verifyAddress("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		vf.verifyIdentification("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		logoutAsVerifier();
		critirionQaLogin();
		qhp.searchEmployee();
		qhp.qaDecisionAddress();
		qhp.qaDecisionIdentification();
		qhp.stopBgv("client requested to do the stop check for the case");
		qhp.stopBGVEmployeeSearch();
		qhp.generateFinalReport();
	}
	/*
	 * Stop BGV flow3
	 * All component dataEntry completed
	 * In Verifier 1 component marked as OnHold,verifier Decision taken for other components
	 * QA decision taken for other component after that QA click on stopCheck 
	 * generate final report
	 * */
	@Test(priority=8)
	public void stopBgvFlow3() throws InterruptedException {
		QADecision_Fresher qhp=new QADecision_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		logoutAsDataEntry();
		critirionQaLogin();
		runAutoDeligate("Billing Changes");
		logoutAsQA();
		critirinverifierLogin();
		vf.searchEmployee();
		vf.acceptEducation();
		vf.clickEducationOnHold();
		vf.verifyAddress("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		vf.verifyIdentification("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		logoutAsVerifier();
		critirionQaLogin();
		qhp.searchEmployee();
		qhp.qaDecisionAddress();
		qhp.qaDecisionIdentification();
		qhp.stopBgv("client requested to do the stop check for the case");
		qhp.stopBGVEmployeeSearch();
		qhp.generateFinalReport();
	}
	/*
	 * Stop BGV flow 4
	 * All component dataEntry completed
	 * In Verifier just accept one case,verifier Decision taken for other components
	 * QA decision taken for other component after that QA click on stopCheck and proceed to verifier
	 * verifier marked as NA
	 * generate final report
	 * */
	@Test(priority=8)
	public void stopBgvFlow4() throws InterruptedException {
		QADecision_Fresher qhp=new QADecision_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		logoutAsDataEntry();
		critirionQaLogin();
		runAutoDeligate("Billing Changes");
		logoutAsQA();
		critirinverifierLogin();
		vf.searchEmployee();
		vf.acceptEducation();
		vf.verifyAddress("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		vf.verifyIdentification("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		logoutAsVerifier();
		critirionQaLogin();
		qhp.searchEmployee();
		qhp.qaDecisionAddress();
		qhp.qaDecisionIdentification();
		qhp.stopBgv("client requested to do the stop check for the case");
		qhp.stopBGVReviewEmployeeSearch();
		qhp.proceedToVerifier1("Education");
		logoutAsQA();
		critirinverifierLogin();
		vf.searchEmployee();
		vf.clickEducationNotAppicable();
		logoutAsVerifier();
		critirionQaLogin();
		qhp.stopBGVEmployeeSearch();
		qhp.generateFinalReport();
	}
	/*
	 * Stop BGV flow 5
	 * All component dataEntry completed
	 * In Verifier Decision taken for all components
	 * QA decision taken for one component and one component Rejected to verifier,one component rejected to data entry
	 * QA click on StopCheck
	 * generate final report
	 * */
	@Test(priority=8)
	public void stopBgvFlow5() throws InterruptedException {
		QADecision_Fresher qhp=new QADecision_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		logoutAsDataEntry();
		critirionQaLogin();
		runAutoDeligate("Billing Changes");
		logoutAsQA();
		critirinverifierLogin();
		vf.searchEmployee();
		vf.VerifyEducation("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		vf.verifyAddress("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		vf.verifyIdentification("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		logoutAsVerifier();
		critirionQaLogin();
		qhp.searchEmployee();
		qhp.rejectToVerifierFromQA("yes", "Update Correct Data", "", "", "", "");
		qhp.qaDecisionAddress();
		qhp.rejectToDataEntryFromQA("", "", "", "", "yes", "Update Correct Data");
		qhp.stopBgv("client requested to do the stop check for the case");
		qhp.generateFinalReport();
		logoutAsQA();
	}
	/*
	 * Stop BGV flow 6
	 * All component dataEntry completed
	 * QA click on StopCheck
	 * */
	@Test(priority=8)
	public void stopBgvFlow6() throws InterruptedException {
		QADecision_Fresher qhp=new QADecision_Fresher();
		logoutAsDataEntry();
		critirionQaLogin();
		qhp.searchEmployee();
		qhp.stopBgv("client requested to do the stop check for the case");
	}

	@Test(priority=9)
	public void logoutAsDataEntry() throws InterruptedException {
		LoginPage lp=new LoginPage();
		lp.clickprofileLogout();
	}
	@Test(priority=10)
	public void critirionQaLogin() {
		LoginPage lp=new LoginPage();
		lp.setNewUser(QA);
		lp.setNewPassword(NewPass);
		lp.clickLogin();
	}
	@Test(priority=11)
	@Parameters("customerName")
	public void runAutoDeligate(String customername) throws InterruptedException {
		QADecision_Fresher qp=new QADecision_Fresher();
		qp.runAutoDeligate(customername);
	}
	@Test(priority=12)
	public void logoutAsQA() throws InterruptedException {
		LoginPage lp=new LoginPage();
		lp.clickprofileLogout();
	}
	@Test(priority=13)
	public void critirinverifierLogin() {
		LoginPage lp=new LoginPage();
				LanchUrl(NewUrl);
		lp.setNewUser(Verifier);
		lp.setNewPassword(NewPass);
		lp.clickLogin();
	}
	@Test(dataProvider= "Insufficent",dataProviderClass= DataProviders.class,priority=13)
	public void verifiertoDataentryInsufficiency(String Educa,String EduReason,String address,String addressReason,String id,String idReason) throws InterruptedException{
		FillData_Fresher fdf=new FillData_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		vf.searchEmployee();
		vf.VerifierToDataEntryInsufficiency(Educa, EduReason, address, addressReason, id, idReason);
		Thread.sleep(1000);
		logoutAsVerifier();
		critirionDataEntryLogin();
		fdf.searchEmployeeInInsuffRejectionBucket();
		if(Educa.equalsIgnoreCase("yes")) {
			fdf.setEducaion("Maharaja Institute", "Anna Univ", "Coimbatore", "B.E", "2017", "7120122132","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}else if(address.equalsIgnoreCase("yes")) {
			fdf.setCurrentAddressVerification("56,vengadesa", "Coimbatore", "tamilnadu", "2 years", "india", "641602", "Pan Card", "C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}else if(id.equalsIgnoreCase("yes")) {
			fdf.setIdentification("Aadhaar Card", "Satha1", "566922875610", "C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}
		logoutAsDataEntry();
		critirinverifierLogin();
	}
	@Test(dataProvider= "Rejection",dataProviderClass= DataProviders.class,priority=13)
	public void verifiertoDataEntryRejection(String Educa,String EduReason,String address,String addressReason,String id,String idReason) throws InterruptedException{
		FillData_Fresher fdf=new FillData_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		vf.searchEmployee();
		vf.VerifierToDataEntryEducationRejection(Educa, EduReason, address, addressReason, id, idReason);
		Thread.sleep(1000);
		logoutAsVerifier();
		critirionDataEntryLogin();
		fdf.searchEmployeeInInsuffRejectionBucket();
		if(Educa.equalsIgnoreCase("yes")) {
			fdf.setEducaion("Maharaja Institute", "Anna Univ", "Coimbatore", "B.E", "2017", "7120122132","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}else if(address.equalsIgnoreCase("yes")) {
			fdf.setCurrentAddressVerification("56,vengadesa", "Coimbatore", "tamilnadu", "2 years", "india", "641602", "Pan Card", "C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}else if(id.equalsIgnoreCase("yes")) {
			fdf.setIdentification("Aadhaar Card", "Satha1", "566922875610", "C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}
		Thread.sleep(1000);
		logoutAsDataEntry();
		critirinverifierLogin();
	}
	@Test(priority=13)
	public void notAppicableAndOnHoldFlow() throws InterruptedException {
		Verifier_Fresher vf=new Verifier_Fresher();
		QADecision_Fresher qdf=new QADecision_Fresher();
		vf.searchEmployee();
		vf.clickNotApplicable("education");
		vf.verifyAddress("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		vf.clickOnHold("id");
		vf.verifyEmployment("C:\\\\Users\\\\Durga Prasad\\\\eclipse-workspace\\\\Attest360\\\\Attachments\\\\7777.pdf");
		vf.verifyReference("C:\\\\Users\\\\Durga Prasad\\\\eclipse-workspace\\\\Attest360\\\\Attachments\\\\7777.pdf");
		logoutAsVerifier();
		critirionQaLogin();
		qdf.searchEmployee();
		qdf.qaDecisionAddress();
		if(qdf.isfinalReportDisplayed()) {
		System.out.println("final report button is Displayed");
		}else {
			logoutAsQA();
			critirinverifierLogin();
			vf.searchEmployee();
			vf.clickOnHold("id");
			vf.verifyIdentification("C:\\\\Users\\\\Durga Prasad\\\\eclipse-workspace\\\\Attest360\\\\Attachments\\\\7777.pdf");
			logoutAsVerifier();
			critirionQaLogin();
			qdf.qaDecisionIdentification();
			qdf.generateFinalReport();
		}
	}
	@Test(dataProvider= "Authorization",dataProviderClass= DataProviders.class,priority=14)
	public void verifierDecision(String path) throws InterruptedException {
		Verifier_Fresher vf=new Verifier_Fresher();
		vf.searchEmployee();
//		vf.acceptEducation();
//		vf.clickEducationNotAppicable();
		vf.VerifyEducation(path);
//		vf.clickEducationinsuff();
		
		vf.verifyAddress(path);
		vf.verifyIdentification(path);
		vf.verifyEmployment(path);
		vf.verifyReference(path);
	}

	@Test(priority=15)
	public void logoutAsVerifier() throws InterruptedException {
		LoginPage lp=new LoginPage();
		lp.clickprofileLogout();
	}

	@Test(priority=16)
	public void critirionQaVerifiLogin() {
		LoginPage lp=new LoginPage();
		//		LanchUrl(NewUrl);
		lp.setNewUser(QA);
		lp.setNewPassword(NewPass);
		lp.clickLogin();
	}
	@Test(dataProvider= "Rejection",dataProviderClass= DataProviders.class,priority=16)
	public void rejectToVerifierfromQA(String Educa,String EduReason,String address,String addressReason,String id,String idReason) throws InterruptedException {
		QADecision_Fresher qhp=new QADecision_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		qhp.searchEmployee();
		qhp.rejectToVerifierFromQA(Educa, EduReason, address, addressReason, id, idReason);
		logoutAsQA();
		critirinverifierLogin();
		vf.searchEmployee();
		if(Educa.equalsIgnoreCase("yes")) {
			vf.VerifyEducation("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}else if(address.equalsIgnoreCase("yes")) {
			vf.verifyAddress("C:\\\\Users\\\\Durga Prasad\\\\eclipse-workspace\\\\Attest360\\\\Attachments\\\\7777.pdf");
		}else if(id.equalsIgnoreCase("yes")) {
			vf.verifyIdentification("C:\\\\Users\\\\Durga Prasad\\\\eclipse-workspace\\\\Attest360\\\\Attachments\\\\7777.pdf");
		}
		Thread.sleep(1000);
		logoutAsVerifier();
		critirionQaLogin();
	}
	@Test(dataProvider= "Rejection",dataProviderClass= DataProviders.class,priority=16)
	public void rejectToDataEntryfromQA(String Educa,String EduReason,String address,String addressReason,String id,String idReason) throws InterruptedException {
		FillData_Fresher fdf=new FillData_Fresher();
		QADecision_Fresher qhp=new QADecision_Fresher();
		Verifier_Fresher vf=new Verifier_Fresher();
		qhp.searchEmployee();
		qhp.rejectToDataEntryFromQA(Educa, EduReason, address, addressReason, id, idReason);
		logoutAsQA();
		critirionDataEntryLogin();
		fdf.searchEmployeeInInsuffRejectionBucket();
		if(Educa.equalsIgnoreCase("yes")) {
			fdf.setEducaion("Maharaja Institute", "Anna Univ", "Coimbatore", "B.E", "2017", "7120122132","C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}else if(address.equalsIgnoreCase("yes")) {
			fdf.setCurrentAddressVerification("56,vengadesa", "Coimbatore", "tamilnadu", "2 years", "india", "641602", "Pan Card", "C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}else if(id.equalsIgnoreCase("yes")) {
			fdf.setIdentification("Aadhaar Card", "Satha1", "566922875610", "C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}
		logoutAsDataEntry();
		critirinverifierLogin();
		vf.searchEmployee();
		if(Educa.equalsIgnoreCase("yes")) {
			vf.VerifyEducation("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}else if(address.equalsIgnoreCase("yes")) {
			vf.verifyAddress("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}else if(id.equalsIgnoreCase("yes")) {
			vf.verifyIdentification("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\Attachments\\7777.pdf");
		}
		Thread.sleep(1000);
		logoutAsVerifier();
		critirionQaLogin();
	}
	@Test(priority=17)
	public void QADecision() throws InterruptedException {
		QADecision_Fresher qhp=new QADecision_Fresher();
		qhp.searchEmployee();
		qhp.qaDecisionEducation();
		qhp.qaDecisionAddress();
		qhp.qaDecisionIdentification();
		qhp.qaDecisionEmployment();
		qhp.qaDecisionReference();
		qhp.generateFinalReport();
	}


}
