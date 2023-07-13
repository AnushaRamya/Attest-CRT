package test.attest360.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.attest360.testCases.BaseClass;

public class DataEntryBasicDetails extends BaseClass {
	public DataEntryBasicDetails() {
		PageFactory.initElements(driver, this);
	}

	//Tabs
	@FindBy(xpath="verificationTabLinkBasics")// Basic Details tab
	WebElement basicDetailsTab;
	//BasicDetailsz
	@FindBy(id="gender") //Gender Drop down
	WebElement gender;
	@FindBy(id="country") //Country drop down
	WebElement county;
	@FindBy(id="uploadPhotoId") //Photo Upload
	WebElement photoUpload;
	
	public void clickBasicDetailsTab() {
		try {
			javaScriptExecutorClick(basicDetailsTab);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setGender(String gen) {
		selectDropdownOption(gender, gen);
	}
	public void setCountry(String cou) {
		selectDropdownOption(county, cou);
	}
	public void setCandidatePhoto(String path) {
		uploadFile(photoUpload, path);
	}

	public void setBasicDetails(String gen,String cou) {
		setGender(gen);
		setCountry(cou);
	}


}

