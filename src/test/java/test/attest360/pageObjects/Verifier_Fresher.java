package test.attest360.pageObjects;


import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.attest360.testCases.BaseClass;
import test.attest360.utilities.ExcelUtils;

public class Verifier_Fresher extends BaseClass {
	public Verifier_Fresher() {
		PageFactory.initElements(driver, this);
	}
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

	@FindBy(xpath="//span[text()=' Click Here']")
	WebElement clickHere;
	@FindBy(id="searchName")
	WebElement txtsearch;
	@FindBy(id="button-addon2")
	WebElement btnsearch;
	@FindBy(xpath="//span[@class='logo-lg']//img[@id='app-logo-light']")
	WebElement logo;

	//insufficient flow
	@FindBy(id="insuffReason")
	WebElement txtinsuffReason;
	@FindBy(id="raiseInsuffBtn")
	WebElement btninsuff;
	@FindBy(id="insuff")
	WebElement uncheckInsuff;

	//rejection flow
	@FindBy(id="rejectReason")
	WebElement txtrejectReason;
	@FindBy(id="raiseRejectBtn")
	WebElement btnreject;

	//tabs
	@FindBy(id="verificationTabLink0") //education tab
	WebElement educationTab;
	@FindBy(id="verificationTabLink1") // address verification tab
	WebElement addressVerificationTab;
	@FindBy(id="verificationTabLink2") // identification Tab
	WebElement identificationTab;
	@FindBy(id="verificationTabLink3") //Employment tab
	WebElement employementTab;
	@FindBy(id="verificationTabLink4") //Reference tab
	WebElement referenceTab;
	//Education
	@FindBy(id="insuffBtn0")
	WebElement educationinsuff;
	@FindBy(id="acceptRegisterBtn0")
	WebElement educationAccept;
	@FindBy(id="rejectRegisterBtn0")
	WebElement educationRejection;
	@FindBy(xpath="//input[contains(@onchange,'EDUCATION_CHECKS')]")
	WebElement educationEvidenceUpload;
	@FindBy(xpath="(//input[contains(@onchange,'EDUCATION_CHECKS')]//following::textarea)[1]")
	WebElement educationComments;
	@FindBy(xpath="//div[@id='componentStatus0']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement educationApprove;
	@FindBy(xpath="//div[@id='componentStatus0']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement educationDiscrepancy;
	@FindBy(xpath="//div[@id='componentStatus0']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement educationReject;
	@FindBy(xpath="//div[@id='componentStatus0']//input[@id='notApplicable']")
	WebElement educationNotApplicable;
	@FindBy(xpath="//div[@id='componentStatus0']//input[@id='onHoldId']")
	WebElement educationOnHold;

	//Address Verification
	@FindBy(id="acceptRegisterBtn1")
	WebElement curaddressAccept;
	@FindBy(id="insuffBtn1")
	WebElement curaddressinsuff;
	@FindBy(id="rejectRegisterBtn1")
	WebElement curaddressRejection;
	@FindBy(xpath="//input[contains(@onchange,'ADDRESS_CHECKS')]")
	WebElement curaddressEvidenceUpload;
	@FindBy(xpath="//div[@id='componentStatus1']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement curaddressApprove;
	@FindBy(xpath="//div[@id='componentStatus1']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement curaddressDiscrepancy;
	@FindBy(xpath="//div[@id='componentStatus1']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement curaddressReject;
	@FindBy(xpath="//div[@id='componentStatus1']//input[@id='notApplicable']")
	WebElement currentAddressNotApplicable;
	@FindBy(xpath="//div[@id='componentStatus1']//input[@id='onHoldId']")
	WebElement currentAddressOnHold;
	@FindBy(id="acceptRegisterBtn2")
	WebElement peraddressAccept;
	@FindBy(id="insuffBtn2")
	WebElement peraddressInsuff;
	@FindBy(id="rejectRegisterBtn2")
	WebElement peraddressRejection;
	@FindBy(xpath="//input[contains(@onchange,'ADDRESS_CHECKS')]")
	WebElement peraddressEvidenceUpload;
	@FindBy(xpath="(//input[contains(@onchange,'ADDRESS_CHECKS')]//following::textarea)[1]")
	WebElement peraddressComments;
	@FindBy(xpath="//div[@id='componentStatus2']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement peraddressApprove;
	@FindBy(xpath="//div[@id='componentStatus2']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement peraddressDiscrepancy;
	@FindBy(xpath="//div[@id='componentStatus2']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement peraddressReject;
	@FindBy(xpath="//div[@id='componentStatus2']//input[@id='notApplicable']")
	WebElement permanentAddressNotApplicable;
	@FindBy(xpath="//div[@id='componentStatus2']//input[@id='onHoldId']")
	WebElement permanentAddressOnHold;
	//Identification
	@FindBy(id="acceptRegisterBtn3")
	WebElement identificationAccept;
	@FindBy(id="rejectRegisterBtn3")
	WebElement identificationRejection;
	@FindBy(id="insuffBtn3")
	WebElement idinsuff;
	@FindBy(xpath="//input[contains(@onchange,'OTHER_CHECKS')]")
	WebElement identificationEvidenceUpload;
	@FindBy(xpath="(//input[contains(@onchange,'OTHER_CHECKS')]//following::textarea)[1]")
	WebElement identificationComments;
	@FindBy(xpath="//div[@id='componentStatus3']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement identificationApprove;
	@FindBy(xpath="//div[@id='componentStatus3']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement identificationDiscrepancy;
	@FindBy(xpath="//div[@id='componentStatus3']//div[@class='row ms-0']//div[@class='col-md-6 mt-1']//div//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement identificationReject;
	@FindBy(xpath="//div[@id='componentStatus3']//input[@id='notApplicable']")
	WebElement idNotApplicable;
	@FindBy(xpath="//div[@id='componentStatus3']//input[@id='onHoldId']")
	WebElement idOnHold;

	//Employment
	@FindBy(id="acceptRegisterBtn4")
	WebElement employmentAccept;
	@FindBy(id="rejectRegisterBtn4")
	WebElement employmentRejection;
	@FindBy(xpath="//input[contains(@onchange,'EMPLOYMENT_CHECKS')]")
	WebElement employmentEvidenceUpload;
	@FindBy(xpath="(//input[contains(@onchange,'EMPLOYMENT_CHECKS')]//following::textarea)[1]")
	WebElement employmentComments;
	@FindBy(xpath="//div[@id='componentStatus4']//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement employmentApprove;
	@FindBy(xpath="//div[@id='componentStatus4']//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement employmentDiscrepancy;
	@FindBy(xpath="//div[@id='componentStatus4']//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement employmentReject;

	//Reference
	@FindBy(id="acceptRegisterBtn5")
	WebElement referenceAccept;
	@FindBy(id="rejectRegisterBtn5")
	WebElement referenceRejection;
	@FindBy(xpath="//input[contains(@onchange,'OTHER_CHECKS')]")
	WebElement referenceEvidenceUpload;
	@FindBy(xpath="//div[@id='componentStatus5']//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement referenceApprove;
	@FindBy(xpath="//div[@id='componentStatus5']//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement referenceDiscrepancy;
	@FindBy(xpath="//div[@id='componentStatus5']//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement referenceReject;

	//*********************

	@FindBy(xpath="//input[contains(@id,'evidenceDocument')]")
	WebElement eveidenceupl;
	@FindBy(xpath="//Strong[text()='Please Select Vendor Closure Details']")
	WebElement vendorclosour;
	@FindBy(xpath="//a[@class='btn pull-right']")
	WebElement cancel;
	@FindBy(xpath="//span[@class='d-none d-sm-inline-block'][normalize-space()='All']")
	WebElement all;
	@FindBy(xpath="//a[normalize-space()='View Form']")
	WebElement viewfor;
	@FindBy(id="orgSearchId")
	WebElement orgSear;
	@FindBy(xpath="//th[@aria-label='JobRole: activate to sort column ascending']")
	WebElement jobrol;
	@FindBy(xpath="//a[@class='btn']")
	WebElement btncan;

	//*****************************
	@FindBy(id="internalId")
	WebElement clickinternal;
	@FindBy(id="externalId")
	WebElement clickExternal;
	@FindBy(id="vendorUserSelect")
	WebElement selectVendor;
	@FindBy(id="vendorRemarks")
	WebElement vendorRemarks;
	@FindBy(id="digitalCostId")
	WebElement clickDigitalCost;
	@FindBy(id="submitVendorModal")
	WebElement vendorSubmit;
	//comparison form element
	@FindBy(xpath="//button[@id='submitComparisonForm']")
	WebElement compSubmit;
	public void educationDecision(String decision) {
		if (decision.equalsIgnoreCase("approve")) {
			javaScriptExecutorClick(educationApprove);
		} else if(decision.equalsIgnoreCase("UTV")) {
			javaScriptExecutorClick(educationDiscrepancy);
		}else if(decision.equalsIgnoreCase("Reject")) {
			javaScriptExecutorClick(educationReject);
		}
	}
	public void CurrentAddressDecision(String decision) {
		if (decision.equalsIgnoreCase("approve")) {
			javaScriptExecutorClick(curaddressApprove);
		} else if(decision.equalsIgnoreCase("UTV")) {
			javaScriptExecutorClick(curaddressDiscrepancy);
		}else if(decision.equalsIgnoreCase("Reject")) {
			javaScriptExecutorClick(curaddressReject);
		}
	}
	public void permanentAddressDecision(String decision) {
		if (decision.equalsIgnoreCase("approve")) {
			javaScriptExecutorClick(peraddressApprove);
		} else if(decision.equalsIgnoreCase("UTV")) {
			javaScriptExecutorClick(peraddressDiscrepancy);
		}else if(decision.equalsIgnoreCase("Reject")) {
			javaScriptExecutorClick(peraddressReject);
		}
	}
	public void IdDecision(String decision) {
		if (decision.equalsIgnoreCase("approve")) {
			javaScriptExecutorClick(identificationApprove);
		} else if(decision.equalsIgnoreCase("UTV")) {
			javaScriptExecutorClick(identificationDiscrepancy);
		}else if(decision.equalsIgnoreCase("Reject")) {
			javaScriptExecutorClick(identificationReject);
		}
	}
	public void SelectVendorClosureForm(String vendor) throws InterruptedException {
		if(vendor.equalsIgnoreCase("internal")) {
			javaScriptExecutorClick(clickinternal);
			Thread.sleep(1500);
			javaScriptExecutorClick(vendorSubmit);
		}else if(vendor.equalsIgnoreCase("External")) {
			javaScriptExecutorClick(clickExternal);
			Thread.sleep(500);
			selectDropdownOption(selectVendor, "Arun Vendor S(new_new_new_vendor)");
			vendorRemarks.sendKeys("External Vendor Selected");
			javaScriptExecutorClick(vendorSubmit);
		}else if(vendor.equalsIgnoreCase("digital")) {
			javaScriptExecutorClick(clickDigitalCost);
			Thread.sleep(1500);
			javaScriptExecutorClick(vendorSubmit);
		}
	}

	public void searchEmployee() throws InterruptedException{
		ExcelUtils ex=new ExcelUtils();
		String crtNum = ex.getCellData("CRTNumber", "CRTNumber", 2);
		try {
			javaScriptExecutorClick(clickHere);
		}catch (Exception e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(txtsearch));
		txtsearch.sendKeys(crtNum);
		Thread.sleep(500);
		javaScriptExecutorClick(btnsearch);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td/a[text()='"+crtNum+"']")));
		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+crtNum+"']")).click();
		Thread.sleep(1000);
	}
	public void acceptCurAddress() {
		javaScriptExecutorClick(addressVerificationTab);
		javaScriptExecutorClick(curaddressAccept);
	}
	public void acceptPerAddress() {
		try {
			javaScriptExecutorClick(addressVerificationTab);
		}catch (Exception e) {
			e.printStackTrace();
		}
		javaScriptExecutorClick(peraddressAccept);
	}
	public void acceptId() {
		javaScriptExecutorClick(identificationTab);
		javaScriptExecutorClick(identificationAccept);
	}
	public void acceptEducation() throws InterruptedException {

		Thread.sleep(1000);
		javaScriptExecutorClick(educationAccept);
	}
	public void clickEducationNotAppicable() {
		javaScriptExecutorClick(educationNotApplicable);
	}
	public void clickEducationinsuff() throws InterruptedException {
		javaScriptExecutorClick(educationinsuff);
		Thread.sleep(1000);
		txtinsuffReason.sendKeys("Insuff rised for Education");
		btninsuff.click();
	}
	public void clickEducationOnHold() throws InterruptedException {
		javaScriptExecutorClick(educationOnHold);

	}
	public void VerifyEducation(String path) throws InterruptedException {
		try {
			javaScriptExecutorClick(educationAccept);
		}catch (Exception e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(educationEvidenceUpload));
		uploadFile(educationEvidenceUpload, path);
		SelectVendorClosureForm("internal");
		Thread.sleep(1500);
		educationDecision("approve");		
		Set<String> childWindows = driver.getWindowHandles();
		int size = childWindows.size();
		if (size>1) {
			String parentWindow = driver.getWindowHandle();
			for (String window : childWindows) {
				if (!parentWindow.equals(window)) {
					driver.switchTo().window(window);
					compSubmit.click();
					driver.switchTo().window(parentWindow);
					Thread.sleep(1000);
				}
			}
		}
	}
	public void verifyAddress(String path) throws InterruptedException {
		javaScriptExecutorClick(addressVerificationTab);
		Thread.sleep(1500);
		try {
			javaScriptExecutorClick(curaddressAccept);
		}catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		uploadFile(curaddressEvidenceUpload, path);
		SelectVendorClosureForm("external");
		Thread.sleep(1500);
		CurrentAddressDecision("approve");
		Set<String> childWindows = driver.getWindowHandles();
		int size = childWindows.size();
		if (size>1) {
			String parentWindow = driver.getWindowHandle();
			for (String window : childWindows) {
				if (!parentWindow.equals(window)) {
					driver.switchTo().window(window);
					compSubmit.click();
					driver.switchTo().window(parentWindow);
					Thread.sleep(1000);
				}
			}
		}
		Thread.sleep(1000);
		try {
			javaScriptExecutorClick(peraddressAccept);
		}catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1500);
		uploadFile(peraddressEvidenceUpload, path);
		Thread.sleep(1500);
		SelectVendorClosureForm("digital");
		Thread.sleep(2000);
		permanentAddressDecision("approve");
		Set<String> childWindows1 = driver.getWindowHandles();
		int size1 = childWindows1.size();
		if (size1>1) {
			String parentWindow = driver.getWindowHandle();
			for (String window : childWindows1) {
				if (!parentWindow.equals(window)) {
					driver.switchTo().window(window);
					compSubmit.click();
					driver.switchTo().window(parentWindow);
					Thread.sleep(1000);
				}
			}
		}
	}
	public void verifyEmployment(String path) throws InterruptedException {
		javaScriptExecutorClick(employementTab);
		Thread.sleep(1500);
		javaScriptExecutorClick(employmentAccept);
		Thread.sleep(1000);
		uploadFile(employmentEvidenceUpload, path);
		javaScriptExecutorClick(clickinternal);
		Thread.sleep(1000);
		javaScriptExecutorClick(vendorSubmit);
		Thread.sleep(2000);
		javaScriptExecutorClick(employmentApprove);
		Set<String> childWindows1 = driver.getWindowHandles();
		int size1 = childWindows1.size();
		if (size1>1) {
			String parentWindow = driver.getWindowHandle();
			for (String window : childWindows1) {
				if (!parentWindow.equals(window)) {
					driver.switchTo().window(window);
					compSubmit.click();
					driver.switchTo().window(parentWindow);
					Thread.sleep(1000);
				}
			}
		}
	}
	public void verifyReference(String path) throws InterruptedException {
		javaScriptExecutorClick(referenceTab);
		Thread.sleep(1000);
		javaScriptExecutorClick(referenceAccept);
		Thread.sleep(1000);
		uploadFile(referenceEvidenceUpload, path);
		javaScriptExecutorClick(clickinternal);
		Thread.sleep(1500);
		javaScriptExecutorClick(vendorSubmit);
		Thread.sleep(2500);
		javaScriptExecutorClick(referenceApprove);
	}
	public void verifyIdentification(String path) throws InterruptedException {
		javaScriptExecutorClick(identificationTab);
		Thread.sleep(1000);
		try {
			javaScriptExecutorClick(identificationAccept);
		}catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		uploadFile(identificationEvidenceUpload, path);
		try {
			SelectVendorClosureForm("External");
		}catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1500);
		IdDecision("approve");
		Set<String> childWindows = driver.getWindowHandles();
		int size = childWindows.size();
		if (size>1) {
			String parentWindow = driver.getWindowHandle();
			for (String window : childWindows) {
				if (!parentWindow.equals(window)) {
					driver.switchTo().window(window);
					compSubmit.click();
					driver.switchTo().window(parentWindow);
					Thread.sleep(1000);
				}
			}
		}
		Thread.sleep(1000);
	}
	public void VerifierToDataEntryInsufficiency(String Educa,String EduReason,String address,String addressReason,String id,String idReason) throws InterruptedException {
		if(Educa.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(educationAccept);
			javaScriptExecutorClick(educationinsuff);
			Thread.sleep(1000);
			txtinsuffReason.sendKeys(EduReason);
			btninsuff.click();
		}else if(address.equalsIgnoreCase("yes")){
			javaScriptExecutorClick(addressVerificationTab);
			javaScriptExecutorClick(curaddressAccept);
			javaScriptExecutorClick(curaddressinsuff);
			Thread.sleep(1000);
			txtinsuffReason.sendKeys(addressReason);
			btninsuff.click();
		}else if(id.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(identificationTab);
			javaScriptExecutorClick(identificationAccept);
			javaScriptExecutorClick(idinsuff);
			Thread.sleep(1000);
			txtinsuffReason.sendKeys(idReason);
			btninsuff.click();
		}
	}
	public void clickNotApplicable(String comp) {
		if(comp.equalsIgnoreCase("education")) {
			javaScriptExecutorClick(educationNotApplicable);

		}else if(comp.equalsIgnoreCase("currentaddress")) {
			javaScriptExecutorClick(addressVerificationTab);
			javaScriptExecutorClick(currentAddressNotApplicable);
		}else if(comp.equalsIgnoreCase("permanentAddress")) {
			try {
				javaScriptExecutorClick(addressVerificationTab);
			}catch (Exception e) {
				e.printStackTrace();
			}
			javaScriptExecutorClick(permanentAddressNotApplicable);
		}else if(comp.equalsIgnoreCase("id")) {
			javaScriptExecutorClick(identificationTab);
			javaScriptExecutorClick(idNotApplicable);
		}


	}
	public void clickOnHold(String comp) {
		if(comp.equalsIgnoreCase("education")) {
			javaScriptExecutorClick(educationOnHold);

		}else if(comp.equalsIgnoreCase("currentaddress")) {
			javaScriptExecutorClick(addressVerificationTab);
			javaScriptExecutorClick(currentAddressOnHold);
		}else if(comp.equalsIgnoreCase("permanentAddress")) {
			try {
				javaScriptExecutorClick(addressVerificationTab);
			}catch (Exception e) {
				e.printStackTrace();
			}
			javaScriptExecutorClick(currentAddressOnHold);
		}else if(comp.equalsIgnoreCase("id")) {
			javaScriptExecutorClick(identificationTab);
			javaScriptExecutorClick(idOnHold);
		}
	}
	public void VerifierToDataEntryEducationRejection(String Educa,String EduReason,String address,String addressReason,String id,String idReason) throws InterruptedException {

		if(Educa.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(educationRejection);
			Thread.sleep(1000);
			txtrejectReason.sendKeys(EduReason);
			btnreject.click();
		}else if(address.equalsIgnoreCase("yes")){
			javaScriptExecutorClick(addressVerificationTab);
			javaScriptExecutorClick(curaddressRejection);
			Thread.sleep(1000);
			txtrejectReason.sendKeys(addressReason);
			btnreject.click();
		}else if(id.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(identificationTab);
			javaScriptExecutorClick(identificationRejection);
			Thread.sleep(1500);
			txtrejectReason.sendKeys(idReason);
			btnreject.click();
		}
	}
	public void autoComponentVerification(String testcaseNo,String Accept,String path,String Decision,String comp,String view,String Notap) throws InterruptedException {
		ExcelUtils ex=new ExcelUtils("C:\\Users\\Durga Prasad\\eclipse-workspace\\Attest360\\src\\test\\resources\\TestData\\AutomationFieldData.xlsx");
		javaScriptExecutorClick(clickHere);	
		selectDropdownOption(orgSear, "Billing Changes");
		Thread.sleep(1000);
		jobrol.click();
		jobrol.click();
		Thread.sleep(1500);
		List<WebElement> num = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		String crtNumber = num.get(0).getText();
		//		txtsearch.sendKeys(crtNumber);
		//		btnsearch.click();
		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+crtNumber+"']")).click();
		//		Thread.sleep(1000);
		//		eduPage.click();
		Thread.sleep(1500);
		if(isAcceptPresent()) {
			System.out.println(testcaseNo);
			System.out.println(Accept);
			if(Accept.equalsIgnoreCase("yes")) {
				javaScriptExecutorClick(educationAccept);
				int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ",testcaseNo);
				if(eveidenceupl.isDisplayed()) {
					ex.setCellData("Testcases", "Actual result", cellRowNum,"Component Is Accepted");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
					logo.click();
				}else {
					ex.setCellData("Testcases", "Actual result", cellRowNum,"Component Is Not Accepted");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
					logo.click();
				}
			}
			educationAccept.click();
		}
		if(testcaseNo.equalsIgnoreCase("Test085")) {
			//			javaScriptExecutorClick(cancel);
			logo.click();
		}
		if(path!="") {
			uploadFile(eveidenceupl, path);
			Thread.sleep(1000);
			if (isAlertPresent()) {
				Alert alert = driver.switchTo().alert();
				String text = alert.getText();
				acceptAlert();
				int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ",testcaseNo);
				System.out.println(cellRowNum);
				ex.setCellData("Testcases", "Actual result", cellRowNum,text);
				ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
				Thread.sleep(1000);
				cancel.click();
				logo.click();
			}
			try {
				if(isvendorclouserformPresent()) {
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ","Test087");
					System.out.println(cellRowNum);
					ex.setCellData("Testcases", "Actual result", cellRowNum,"Vendor Closer From is displayed");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				}else {
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ","Test087");
					System.out.println(cellRowNum);
					ex.setCellData("Testcases", "Actual result", cellRowNum,"Vendor Closer From is Not Displayed");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (Decision.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(educationAccept);
			Thread.sleep(1000);
			//			javaScriptExecutorClick(totalsubmit);
			Thread.sleep(1000);
			Set<String> childWindows = driver.getWindowHandles();
			int size = childWindows.size();
			if (size>1) {
				String parentWindow = driver.getWindowHandle();
				for (String window : childWindows) {
					if (!parentWindow.equals(window)) {
						driver.switchTo().window(window);
						compSubmit.click();
						driver.switchTo().window(parentWindow);
						Thread.sleep(1000);
					}
				}
			}
			if(testcaseNo.equalsIgnoreCase("Test088")||testcaseNo.equalsIgnoreCase("Test090")) {
				if (isElementPresent("approved0")) {
					if(view.equalsIgnoreCase("yes")) {
						if (isviewformPresent()) {
							Thread.sleep(1000);
							javaScriptExecutorClick(viewfor);
							Set<String> form = driver.getWindowHandles();
							int size2 = form.size();
							if (size2>1) {
								String parentWindow = driver.getWindowHandle();
								for (String window : form) {
									if (!parentWindow.equals(window)) {
										driver.switchTo().window(window);
										btncan.click();
										driver.switchTo().window(parentWindow);
									}
								}
							}
							if(size2>1) {
								int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ","Test090");
								System.out.println(cellRowNum);
								ex.setCellData("Testcases", "Actual result", cellRowNum,"View Form Displayed");
								ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");

							}else {
								int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ","Test090");
								System.out.println(cellRowNum);
								ex.setCellData("Testcases", "Actual result", cellRowNum,"View Form is Not Displayed");
								ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");

							}
						} else {
							int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ","Test090");
							System.out.println(cellRowNum);
							ex.setCellData("Testcases", "Actual result", cellRowNum,"View Form is not there");
							ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");

						}
					}
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ","Test088");
					System.out.println(cellRowNum);
					ex.setCellData("Testcases", "Actual result", cellRowNum,"Decision-Approved");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
					Thread.sleep(1000);
					javaScriptExecutorClick(cancel);
					logo.click();

				} else {
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ","Test088");
					System.out.println(cellRowNum);
					ex.setCellData("Testcases", "Actual result", cellRowNum,"Decision-NotTaken");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
					Thread.sleep(1000);
					javaScriptExecutorClick(cancel);
					logo.click();
				}
			}
			if(comp.equalsIgnoreCase("yes")) {
				if(size>1) {
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ","Test089");
					System.out.println(cellRowNum);
					ex.setCellData("Testcases", "Actual result", cellRowNum,"Comparison Template Appeared");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Pass");
					javaScriptExecutorClick(cancel);
					logo.click();
				}else {
					int cellRowNum = ex.getCellRowNum("Testcases", "Test Case Num ","Test089");
					System.out.println(cellRowNum);
					ex.setCellData("Testcases", "Actual result", cellRowNum,"Comparison Template Not Appeared");
					ex.setCellData("Testcases", "Test Result", cellRowNum, "Fail");
					javaScriptExecutorClick(cancel);
					logo.click();
				}
			}
		}
		try {
			javaScriptExecutorClick(cancel);
			logo.click();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	public boolean isvendorclouserformPresent() {
		try {
			List<WebElement> element = driver.findElements(By.id("internal"));
			if(element.size()==0) {
				return false;
			}
			return true;
		}catch (Exception e) {
			System.out.println("element is not there");
			return true;
		}
	}

	public boolean isviewformPresent() {
		try {
			List<WebElement> element = driver.findElements(By.xpath("//a[normalize-space()='View Form']"));
			if(element.size()==0) {
				return false;
			}
			return true;
		}catch (Exception e) {

			System.out.println("element is not there");
			return true;
		}
	}
	public boolean isAcceptPresent() {
		try {
			List<WebElement> element = driver.findElements(By.xpath("//button[contains(text(),'Accept')]"));
			if(element.size()==0) {
				return false;
			}
			return true;
		}catch (Exception e) {
			System.out.println("element is not there");
			return true;
		}
	}

}


