package test.attest360.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.attest360.testCases.BaseClass;
import test.attest360.utilities.ExcelUtils;

public class FillDataPageNewUI extends BaseClass {
	public FillDataPageNewUI() {
		PageFactory.initElements(driver, this);
	}

	//Tabs
	@FindBy(xpath="verificationTabLinkBasics")// Basic Details tab
	WebElement basicDetailsTab;
	@FindBy(id="verificationTabLink0") // automation component tab
	WebElement automatioComponentTab;
	@FindBy(id="verificationTabLinkAuthForm") // Authorization tab
	WebElement authorizationTab;
	@FindBy(id="candidateConsentId") // authorization check box
	WebElement consent;
	@FindBy(id="candidateConsent") // authorization check box
	WebElement consentsubmit;
	//BasicDetails
	@FindBy(id="gender") //gender drop down
	WebElement gender;
	@FindBy(id="uploadPhotoId") //Photo upload
	WebElement photo;
	@FindBy(id="country")//Country drop down
	WebElement countr;
	//Automation component
	@FindBy(id="registers0insufficient")//Insufficient Documents check box
	WebElement insufdoc;
	@FindBy(id="registers0fieldValue1")//Do not have address details  check box
	WebElement donothavedetails;
	@FindBy(id="registers0fieldValue9")//fresher  check box
	WebElement fresh;
	@FindBy(id="registers0fieldValue8Yes")//employed yes button
	WebElement employYes;
	@FindBy(id="registers0fieldValue8No")//employed no  button
	WebElement employNo;
	@FindBy(id="registers0fieldValue10")// Name of College or school
	WebElement school;
	@FindBy(id="registers0fieldValue11")// city 
	WebElement city;
	@FindBy(id="registers0fieldValue12")// country
	WebElement country;
	@FindBy(id="registers0fieldValue2")// address
	WebElement address;
	@FindBy(id="registers0fieldValue3")// state
	WebElement state;
	@FindBy(id="registers0fieldValue4")// pin code
	WebElement pincode;
	@FindBy(id="tempFileregisters[0].fieldValue5")// Evidence upload
	WebElement uplo;
	@FindBy(id="registers0fieldValue6")// address type
	WebElement addtype;
	@FindBy(id="registers0fieldValue7")// stay period
	WebElement stayperiod;
	@FindBy(id="draftSubmitRegisters0")//  save Draft
	WebElement saveDraft;
	@FindBy(id="finalSubmitRegisters0")// final Submit
	WebElement finalsubmit;
	@FindBy(id="finalSave") // final Save
	WebElement finalsave;
	@FindBy(id="textModalSubmit")// final summit accept
	WebElement submit;
	@FindBy(id="textModalClose")// final summit error alert close
	WebElement alertclose;
	@FindBy(id="textModalContent")// final summit error Message
	WebElement alerterrorMessage;
	
	// Field Level Error Message\
	@FindBy(id="registers0fieldValue10Error")// School error Message
	WebElement SchoolErrorMessage;
	@FindBy(id="registers0fieldValue11Error")// City error Message
	WebElement CityErrorMessage;
	@FindBy(id="registers0fieldValue12Error")// Country error Message
	WebElement StateErrorMessage;
	@FindBy(id="registers0fieldValue2Error")// address error Message
	WebElement addressErrorMessage;
	@FindBy(id="registers0fieldValue3Error")// state error Message
	WebElement stateErrorMessage;
	@FindBy(id="registers0fieldValue4Error")// pin code error Message
	WebElement pincodeErrorMessage;
	@FindBy(id="registers0fieldValue6Error")// address error Message
	WebElement addressTypeErrorMessage;
	@FindBy(id="registers0fieldValue7Error")// stayPeriod error Message
	WebElement stayPeriodErrorMessage;
	
	
	
	
	
	
	
	public void enterBasicDetails(String firstname,String Dob,String FatherName,String mobileNumber,
			String Email,String State,String City,String location,String jobRole,String Recruiter,String referenceNum) throws InterruptedException{
		HomePage hp=new HomePage();
		BasicDetailsRegisterPageNewUI crp=new BasicDetailsRegisterPageNewUI();
		hp.clickCreateNew();
		crp.setFirstName(firstname);
		crp.setDOB(Dob);
		crp.setFatherName(FatherName);
		crp.setMobileNumber(mobileNumber);
		crp.setEmail(Email);
		crp.setState(State);
		crp.setCity(City);
		crp.SelectJoiningLocation(location);
		crp.SelectJobRole(jobRole);
		crp.SelectRecruiters(Recruiter);
		crp.setReferenceNumber(referenceNum);
		//	crp.clickCancel();
		crp.clickSave(); 
		if (isAlertPresent()) {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		Thread.sleep(1000);
		String crtNumber = crp.getCrtNumber();
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\NewUI.xlsx");
		ex.setCellData("Crt Number", "Crt Number", 2, crtNumber);

	}
	public void setBasicDetails(String Gender,String country) throws InterruptedException {
		Thread.sleep(1000);
		selectDropdownOption(gender, Gender);
		selectDropdownOption(countr, country);
	}
	public void setAutomationcomponent() throws InterruptedException  {
		HomePage hp=new HomePage();
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\NewUI.xlsx");
		String crtNumber = ex.getCellData("Crt Number", "Crt Number", 2);
		Thread.sleep(1000);
		hp.clickFillData();
		hp.selectCrtNumber(crtNumber);
		authorizationTab.click();
		Thread.sleep(1000);
		javaScriptExecutorClick(consent);
		javaScriptExecutorClick(consentsubmit);
		Thread.sleep(1500);
		refresh();
		setBasicDetails("Male","India");
		automatioComponentTab.click();
		Thread.sleep(1000);
		employYes.click();
		school.sendKeys("maharaja institute");
		city.sendKeys("coimbatore");
		country.sendKeys("india");
		address.sendKeys("56,vengadesapura");
		state.sendKeys("TamilNadu");
		pincode.sendKeys("641602");
		selectDropdownOption(addtype, "Aadhaar Card");
		stayperiod.sendKeys("18-12-1994");
		javaScriptExecutorClick(finalsubmit);
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
		javaScriptExecutorClick(authorizationTab);
		javaScriptExecutorClick(finalsave);
	}	
}

