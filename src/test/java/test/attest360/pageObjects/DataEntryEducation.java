package test.attest360.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.attest360.testCases.BaseClass;
import test.attest360.utilities.ExcelUtils;

public class DataEntryEducation extends BaseClass {
	public DataEntryEducation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(@id,'verificationTabLink')]/span[text()='Basic Details']")// Basic Details tab
	WebElement basicDetailsTab;
	
	@FindBy(xpath="//a[contains(@id,'verificationTabLink')]/span[text()='Education']") //Education tab
	WebElement educationTab;
	
	@FindBy(id="app-logo-light")
	WebElement logo;
	
	@FindBy(id="reworkCount")
	WebElement reworkBucket;
	
	//Education
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/following-sibling::div/child::div/input[contains(@id,'insufficient')]") //insufficient document
	WebElement educationInsuffDoc;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/following::label/span[text()='Do not have Education Details']/preceding::input[@class='form-check-input no-details']") //do not have education details
	WebElement educationDoNotHaveDetails;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/parent::div/parent::div/child::div/child::div/child::div/child::div/label/span[text()='Name of College / School ']/parent::label/following-sibling::div/child::input[contains(@id,'fieldValue1')]") //Name of College / School
	WebElement collageName;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/parent::div/parent::div/child::div/child::div/child::div/child::div/label/span[text()='Affiliated University / Board ']/parent::label/following-sibling::div/child::input[contains(@id,'fieldValue2')]") //Affiliated University / Board
	WebElement university;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/parent::div/parent::div/child::div/child::div/child::div/child::div/label/span[text()='City ']/parent::label/following-sibling::div/child::input[contains(@id,'fieldValue3')]") //City
	WebElement city;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/parent::div/parent::div/child::div/child::div/child::div/child::div/label/span[text()='Postal code ']/parent::label/following-sibling::div/child::input[contains(@id,'fieldValue11')]") //Post Code
	WebElement postCode;
	
	@FindBy (xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/parent::div/parent::div/child::div/child::div/child::div/child::div/label/span[text()='Qualification obtained ']/parent::label/following-sibling::div/child::input[contains(@id,'fieldValue5')]") //Qualification obtained
	WebElement qualification; 
	
	@FindBy (xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/parent::div/parent::div/child::div/child::div/child::div/child::div/label/span[text()='Period of Study / Year of passing ']/parent::label/following-sibling::div/child::input[contains(@id,'fieldValue9')]") //Period of Study / Year of passing
	WebElement pasYear;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/parent::div/parent::div/child::div/child::div/child::div/child::div/label/span[text()='Roll Number/Enroll Number/Register Number/Student Id ']/parent::label/following-sibling::div/child::input[contains(@id,'fieldValue6')]") //Roll Number/Enroll Number/Register Number/Student Id 
	WebElement rollNumber;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/parent::div/parent::div/child::div/child::div/child::div/child::div/label/span[text()='Class / Division / % ']/parent::label/following-sibling::div/child::input[contains(@id,'fieldValue10')]") //Class / Division / %
	WebElement percentage;
	
	@FindBy(id="registers0fieldValue14") //Year Attend From
	WebElement attendFrom;
	
	@FindBy(id="registers0fieldValue15") //Year Attend From
	WebElement attendTo;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/following-sibling::div/child::div/following-sibling::div/child::div/label[contains(text(),'Attach corresponding marksheet')]/parent::div/child::div/child::div/div/child::input[contains(@id,'fieldValue7') and @type='file']") //Attach corresponding marksheet
	WebElement markSheetUpload;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/following-sibling::div/child::div/following-sibling::div/child::div/label[contains(text(),'Attach corresponding certificate')]/parent::div/child::div/child::div/div/child::input[contains(@id,'fieldValue8') and @type='file']") //Attach corresponding certificate
	WebElement certificateUpload;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/parent::div/child::div/child::div/child::button[contains(@id,'draftSubmitRegisters')]") // Save draft
	WebElement educationSaveDraft;
	
	@FindBy(xpath="//span[text()='Highest Qualification ' or text()='Highest Qualification  - 1']/parent::div/parent::div/child::div/child::div/child::button[contains(@id,'finalSubmitRegisters')]")// Final submit
	WebElement educationfinalSubmit;
	
	@FindBy(id="textModalSubmit") //final submit Confirm
	WebElement finalSubmitConfirm;
	
	public void clickEducationTab() {
		try {
			javaScriptExecutorClick(educationTab);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void clickSaveDraft() {
		javaScriptExecutorClick(educationSaveDraft);
	}
	public void clickEducationInsufficientDocuments() {
		educationInsuffDoc.click();
	}
	public void setCollageName(String collage) {
		collageName.clear();
		collageName.sendKeys(collage);
	}
	public void setUniversity(String univ) {
		university.clear();
		university.sendKeys(univ);
	}
	public void setCity(String cit) {
		city.clear();
		city.sendKeys(cit);
	}
	public void setQualification(String qualifi) {
		qualification.clear();
		qualification.sendKeys(qualifi);
	}
	public void setYearOfPassing(String passYear) {
		pasYear.clear();
		pasYear.sendKeys(passYear);
	}
	public void setRollNumber(String rollnum) {
		rollNumber.clear();
		rollNumber.sendKeys(rollnum);
	}
	public void clickInsuffRejectionBucket() {
		reworkBucket.click();
	}
	public void clickEducationFinalSubmit() throws InterruptedException {
		javaScriptExecutorClick(educationfinalSubmit);
		Thread.sleep(1000);
		javaScriptExecutorClick(finalSubmitConfirm);
	}

	public void setEducaion(String collage,String univ,String cit,String qualifi,String passYear,String rollnum) throws InterruptedException {
		clickEducationTab();
		if(educationInsuffDoc.isSelected()) {
			educationInsuffDoc.click();
		}
		setCollageName(collage);
		setUniversity(univ);
		setCity(cit);
		setQualification(qualifi);
		setYearOfPassing(passYear);
		setRollNumber(rollnum);	
		
	}
	public void searchEmployeeInInsuffRejectionBucket() throws InterruptedException {
		
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\CandidateDetails-Fresher.xlsx");
		String crtNumber = ex.getCellData("CRTNumber", "CRTNumber", 2);
		clickInsuffRejectionBucket();
		HomePage hp=new HomePage();
		hp.selectCrtNumber(crtNumber);
		
	}

}

