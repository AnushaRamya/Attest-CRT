package test.attest360.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.attest360.testCases.BaseClass;

public class DataEntryEmployment extends BaseClass {
	public DataEntryEmployment() {
		PageFactory.initElements(driver, this);
	}

	//Tabs
	@FindBy(xpath="//a[contains(@id,'verificationTabLink')]/span[text()='Employment']") //Employment Tab
	WebElement employementTab;
	
	//Employment 1
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
	@FindBy(id="draftSubmitRegisters4") // save draft
	WebElement employdraftSave;
	@FindBy(id="finalSubmitRegisters4") // 
	WebElement employfinalSubmit;
	@FindBy(id="textModalSubmit") //final submit Confirm
	WebElement finalSubmitConfirm;
	//Employment 2
	@FindBy(id="registers4insufficient") //Insufficient Documents
	WebElement employinsuffDoc2;
	@FindBy(id="registers4fieldValue30") //Do not have Identity check details
	WebElement employdoNotHaveDetails2;
	@FindBy(id="registers4fieldValue1") //Are you fresher
	WebElement areYouFresher2;
	@FindBy(id="registers4fieldValue2Yes") //Are you employed yes
	WebElement employedyes2;
	@FindBy(id="registers4fieldValue2No") //Are you employed No
	WebElement employedNo2;
	@FindBy(id="registers4fieldValue3Yes") //If yes,can we contact your current employer yes
	WebElement contactCurrentYes2;
	@FindBy(id="registers4fieldValue3No") //If yes,can we contact your current employer no
	WebElement contactCurrentNo2;
	@FindBy(id="registers4fieldValue4") //Name of the employer 
	WebElement employerName2;
	@FindBy(id="registers4fieldValue5") // Location
	WebElement employerlocation2;
	@FindBy(id="registers4fieldValue6") //Address 1
	WebElement employeraddress12;
	@FindBy(id="registers4fieldValue7") //Address 2
	WebElement employeraddress22;
	@FindBy(id="registers4fieldValue8") //Address 3
	WebElement employeraddress32;
	@FindBy(id="registers4fieldValue9") //City
	WebElement employercity2;
	@FindBy(id="registers4fieldValue11") //jobTitle
	WebElement jobTitle2;
	@FindBy(id="registers4fieldValue12") // EmployeeCode
	WebElement employeecode2;
	@FindBy(id="registers4fieldValue14") // Joining date
	WebElement joiningDtae2;
	@FindBy(id="registers4fieldValue16") // Reason for leaving 
	WebElement reasonforLeaving2;
	@FindBy(id="draftSubmitRegisters4") // save draft
	WebElement employdraftSave2;
	@FindBy(id="finalSubmitRegisters4") // 
	WebElement employfinalSubmit2;
	

	public void clickEmployementTab() {
		try {
			javaScriptExecutorClick(employementTab);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectAreYouCurrentlyEmployed(String option) {
		if (option.equalsIgnoreCase("yes")) {
			employedyes.click();
		}else if(option.equalsIgnoreCase("No")) {
			employedNo.click();
		}
	}
	public void selectContactYourCurrentEmployer(String option1) {
		if (option1.equalsIgnoreCase("yes")) {
			contactCurrentYes.click();
		}else if(option1.equalsIgnoreCase("No")) {
			contactCurrentNo.click();
		}
	}
	public void setEmployerName(String Employername ) {
		employerName.clear();
		employerName.sendKeys(Employername);
	}
	public void setEmployerAddress(String address ) {
		employeraddress1.clear();
		employeraddress1.sendKeys(address);
	}
	public void setEmployerCity(String cit ) {
		employercity.clear();
		employercity.sendKeys(cit);
	}
	public void setJobTitle(String title ) {
		jobTitle.clear();
		jobTitle.sendKeys(title);
	}
	public void setEmployeeCode(String code ) {
		employeecode.clear();
		employeecode.sendKeys(code);
	}
	public void setJoiningDate(String joindate ) {
		joiningDtae.clear();
		joiningDtae.sendKeys(joindate);
	}
	public void setReasonForLeaving(String reason ) {
		reasonforLeaving.clear();
		reasonforLeaving.sendKeys(reason);
	}
	public void clickEmploymentFinalSubmit() throws InterruptedException {
		javaScriptExecutorClick(employfinalSubmit);
		Thread.sleep(1000);
		finalSubmitConfirm.click();
	}

	public void setEmployment(String Employername,String address,String cit,String title,String code,String joindate,String reason) throws InterruptedException {
		javaScriptExecutorClick(employementTab);
		employedyes.click();
		contactCurrentYes.click();
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
		javaScriptExecutorClick(employfinalSubmit);
		Thread.sleep(1000);
		finalSubmitConfirm.click();
		Thread.sleep(1500);
	} 

}

