package test.attest360.pageObjects;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.attest360.testCases.BaseClass;
import test.attest360.utilities.ExcelUtils;

public class QADecision_Fresher extends BaseClass {
	public QADecision_Fresher() {
		PageFactory.initElements(driver,this);
	}
	//***********delegation**********
	@FindBy(xpath="//span[normalize-space()='Case Details']")
	WebElement dropdownCaseDetails;
	@FindBy(xpath="//a[text()='Auto Delegation']")
	WebElement autodelicatelink;
	@FindBy(id="organizationId")
	WebElement customerDropdown;
	@FindBy(xpath="//button[@class='btn btn-dark']")	
	WebElement btnRun;
	//*****QA Decision*************	
	@FindBy(xpath="//span[text()=' Click Here']")
	WebElement clickHere;
	@FindBy(id="searchName")
	WebElement txtsearch;
	@FindBy(id="button-addon2")
	WebElement btnsearch;
	@FindBy(id="orgSearchId")
	WebElement customer;
	@FindBy(xpath="//button[@class='btn btn-danger btn-sm waves-effect mb-2 waves-light shadow']")
	WebElement btnStopBgv;
	@FindBy(id="stopBGVReason")
	WebElement reasonStopBgv;
	@FindBy(xpath="//*[@id=\"stopBGVModal\"]/div/div/div[3]/button")
	WebElement btnStopBgvSubmit;
	//Reject Buttons
	@FindBy(xpath="//div[@id='reject0']//button[@id='rejcetButtonId']")// 
	WebElement educationReject;
	@FindBy(xpath="//div[@id='reject1']//button[@id='rejcetButtonId']")
	WebElement currentAddressReject;
	@FindBy(xpath="//div[@id='reject2']//button[@id='rejcetButtonId']")
	WebElement permanentAddressReject;
	@FindBy(xpath="//div[@id='reject3']//button[@id='rejcetButtonId']")
	WebElement identificationRejection;
	@FindBy(xpath="//input[@name='rejectionTo'][@value='dataEntry']")
	WebElement RejectToDataentry;
	@FindBy(xpath="//input[@name='rejectionTo'][@value='verifier']")
	WebElement RejectToVerifier;
	@FindBy(id="rejectReason")
	WebElement RejectReson;
	@FindBy(xpath="//button[@type='submit'][normalize-space()='Reject']")
	WebElement RejectSubmit;
	
	//********Education***************
	@FindBy(id="verificationTabLink0")
	WebElement educationTab;
	@FindBy(xpath="//div[@id='decisionPending0']//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement educationApprove;
	@FindBy(xpath="//div[@id='decisionPending0']//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement educationDiscrepancy;
	@FindBy(xpath="//div[@id='decisionPending0']//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement educationRejection;
	
	//****Address Verification****************
	@FindBy(id="verificationTabLink1")
	WebElement addressVerificationTab;
	@FindBy(xpath="//div[@id='decisionPending1']//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement currentAddApprove;
	@FindBy(xpath="//div[@id='decisionPending1']//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement currentAddDiscrepancy;
	@FindBy(xpath="//div[@id='decisionPending1']//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement currentAddReject;
	@FindBy(xpath="//div[@id='componentStatus1']//i[@class='far fa-hand-paper thumb-red fa-2x']")
	WebElement curStopbgvStop;
	@FindBy(xpath="//div[@id='componentStatus1']//i[@class='fas fa-angle-double-right thumb-green fa-2x']")
	WebElement curPreceedafterStop;
	
	@FindBy(xpath="//div[@id='decisionPending2']//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement permanentAddApprove;
	@FindBy(xpath="//div[@id='decisionPending2']//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement permanentAddDiscrepancy;
	@FindBy(xpath="//div[@id='decisionPending2']//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement parmanentAddReject;
	@FindBy(xpath="//div[@id='componentStatus2']//i[@class='far fa-hand-paper thumb-red fa-2x']")
	WebElement peraddStopbgvStop;
	@FindBy(xpath="//div[@id='componentStatus2']//i[@class='fas fa-angle-double-right thumb-green fa-2x']")
	WebElement paraddStopbgvproceed;
	
	//****Identification****************
	@FindBy(id="verificationTabLink2")
	WebElement identificationTab;
	@FindBy(xpath="//div[@id='decisionPending3']//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement identificationApprove;
	@FindBy(xpath="//div[@id='decisionPending3']//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement identificationDiscrepancy;
	@FindBy(xpath="//div[@id='decisionPending3']//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement identificationReject;
	@FindBy(xpath="//div[@id='componentStatus3']//i[@class='far fa-hand-paper thumb-red fa-2x']")
	WebElement idStopbgvStop;
	@FindBy(xpath="//div[@id='componentStatus3']//i[@class='fas fa-angle-double-right thumb-green fa-2x']")
	WebElement idStopbgvproceed;
	//Employement
	@FindBy(id="verificationTabLink3")
	WebElement employementTab;
	@FindBy(xpath="//div[@id='decisionPending4']//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement employmentApprove;
	@FindBy(xpath="//div[@id='decisionPending4']//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement employementDiscrepancy;
	@FindBy(xpath="//div[@id='decisionPending4']//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement employementReject;
	
	//Reference
	@FindBy(id="verificationTabLink4")
	WebElement referenceTab;
	@FindBy(xpath="//div[@id='decisionPending6']//i[@class='far fa-thumbs-up thumb-green fa-2x']")
	WebElement referenceApprove;
	@FindBy(xpath="//div[@id='decisionPending6']//i[@class='far fa-thumbs-up thumb-amber fa-2x']")
	WebElement referenceDiscrepancy;
	@FindBy(xpath="//div[@id='decisionPending6']//i[@class='far fa-thumbs-down thumb-red fa-2x']")
	WebElement referenceReject;
	//Reports
	@FindBy(id="verificationTabLinkReports")
	WebElement reports;
	@FindBy(id="generateInterimId")
	WebElement intrimReport;
	@FindBy(id="interimReportButton")
	WebElement generateIntrim;
	@FindBy(xpath="//button[@id='finalReportGenerateId' and @class='btn btn-dark mx-2 waves-effect waves-light']")
	WebElement finalReport;
	@FindBy(id="reportGenerationSubmit")
	WebElement generateFinal;
	@FindBy(id="reportTemplate")
	WebElement template;
	@FindBy(xpath="//span[@class='logo-lg']//img[@id='app-logo-light']")
	WebElement logo;
	@FindBy(xpath="//i[@class='far fa-hand-paper thumb-red fa-2x']")
	WebElement stopAfterStopBGV;
	@FindBy(xpath="//div[@class='card border-left-orange']//a")
	WebElement bgvBucket;
	@FindBy(xpath="//i[@class='fas fa-angle-double-right thumb-green fa-2x']")
	WebElement proceedAfterStopBgv;
	@FindBy(id="considerBillingYes")
	WebElement considerForBillingYes;
	@FindBy(id="considerBillingNo")
	WebElement considerForBillingNo;
	@FindBy(id="stopBGVSubmit")
	WebElement btnbillingDesicion;
	@FindBy(xpath="//a[text()='Stop BGV Review']")
	WebElement stopBGVReview;
	@FindBy(xpath="//button[@id='submitComparisonForm']")
	WebElement compSubmit;
	public void educationDecision(String decision) {
		if (decision.equalsIgnoreCase("approve")) {
			javaScriptExecutorClick(educationApprove);
		} else if(decision.equalsIgnoreCase("UTV")) {
			javaScriptExecutorClick(educationDiscrepancy);
		}else if(decision.equalsIgnoreCase("Reject")) {
			javaScriptExecutorClick(educationRejection);
		}
	}
	public void CurrentAddressDecision(String decision) {
		if (decision.equalsIgnoreCase("approve")) {
			javaScriptExecutorClick(currentAddApprove);
		} else if(decision.equalsIgnoreCase("UTV")) {
			javaScriptExecutorClick(currentAddDiscrepancy);
		}else if(decision.equalsIgnoreCase("Reject")) {
			javaScriptExecutorClick(currentAddReject);
		}
	}
	public void permanentAddressDecision(String decision) {
		if (decision.equalsIgnoreCase("approve")) {
			javaScriptExecutorClick(permanentAddApprove);
		} else if(decision.equalsIgnoreCase("UTV")) {
			javaScriptExecutorClick(permanentAddDiscrepancy);
		}else if(decision.equalsIgnoreCase("Reject")) {
			javaScriptExecutorClick(parmanentAddReject);
		}
	}
	public void idDecision(String decision) {
		if (decision.equalsIgnoreCase("approve")) {
			javaScriptExecutorClick(identificationApprove);
		} else if(decision.equalsIgnoreCase("UTV")) {
			javaScriptExecutorClick(identificationDiscrepancy);
		}else if(decision.equalsIgnoreCase("Reject")) {
			javaScriptExecutorClick(identificationReject);
		}
	}


	public void runAutoDeligate(String customername) throws InterruptedException {
		dropdownCaseDetails.click();
		Thread.sleep(500); 
		autodelicatelink.click();
		Thread.sleep(1500);
		selectDropdownOption(customerDropdown,customername);
		btnRun.click();
		Thread.sleep(2500);
	}
	public void searchEmployee() throws InterruptedException {
		ExcelUtils ex=new ExcelUtils();
		String crtNum = ex.getCellData("CRTNumber", "CRTNumber", 2);
		Thread.sleep(2000);
		javaScriptExecutorClick(clickHere);
		txtsearch.sendKeys(crtNum,Keys.ENTER);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='"+crtNum+"']")));
		driver.findElement(By.xpath("//a[text()='"+crtNum+"']")).click();
		
	}
	public void clickLogo(){
		logo.click();
	}
	public void qaDecisionEducation() throws InterruptedException {
		
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
	public void qaDecisionAddress() throws InterruptedException {
		javaScriptExecutorClick(addressVerificationTab);
		Thread.sleep(1000);
		try {
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
		}catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
	
		permanentAddressDecision("approve");
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
	public void qaDecisionIdentification() throws InterruptedException {
		javaScriptExecutorClick(identificationTab);
		Thread.sleep(1000);
		idDecision("approve");
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
	public void qaDecisionEmployment() throws InterruptedException {
		javaScriptExecutorClick(employementTab);
		Thread.sleep(1000);
		javaScriptExecutorClick(employmentApprove);
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
	public void qaDecisionReference() throws InterruptedException {
		javaScriptExecutorClick(referenceTab);
		Thread.sleep(1000);
		javaScriptExecutorClick(referenceApprove);
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
	public void generateIntrimReport() throws InterruptedException {
		Thread.sleep(1000);
		refresh();
		reports.click();
		Thread.sleep(1000);
		intrimReport.click();
		Thread.sleep(1000);
		generateIntrim.click();
	}
	public void generateFinalReport() throws InterruptedException {
		Thread.sleep(1000);
		refresh();
		try {
			reports.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finalReport.click();
		Thread.sleep(1500);
		javaScriptExecutorClick(generateFinal);
		Thread.sleep(2000);
	}
	public boolean isfinalReportDisplayed() throws InterruptedException {
		Thread.sleep(1000);
		refresh();
		reports.click();
		try {
			if(finalReport.isDisplayed()) {
				return false;
			}
			return true;
		}catch (Exception e) {
			System.out.println("Final Report is Displayed");
			return true;
		}
	}
	
public void rejectToVerifierFromQA(String Educa,String EduReason,String address,String addressReason,String id,String idReason) throws InterruptedException {
	
	if(Educa.equalsIgnoreCase("yes")) {
		javaScriptExecutorClick(educationReject);
		javaScriptExecutorClick(RejectToVerifier);
		Thread.sleep(1000);
		RejectReson.sendKeys(EduReason);
		RejectSubmit.click();
		}else if(address.equalsIgnoreCase("yes")){
			javaScriptExecutorClick(addressVerificationTab);
			javaScriptExecutorClick(currentAddressReject);
			javaScriptExecutorClick(RejectToVerifier);
			Thread.sleep(1000);
			RejectReson.sendKeys(addressReason);
			RejectSubmit.click();
		}else if(id.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(identificationTab);
			javaScriptExecutorClick(identificationRejection);
			javaScriptExecutorClick(RejectToVerifier);
			Thread.sleep(1500);
			RejectReson.sendKeys(idReason);
			RejectSubmit.click();
		}
}
public void rejectToDataEntryFromQA(String Educa,String EduReason,String address,String addressReason,String id,String idReason) throws InterruptedException {
	
	if(Educa.equalsIgnoreCase("yes")) {
		javaScriptExecutorClick(educationReject);
		javaScriptExecutorClick(RejectToDataentry);
		Thread.sleep(1000);
		RejectReson.sendKeys(EduReason);
		RejectSubmit.click();
		}else if(address.equalsIgnoreCase("yes")){
			javaScriptExecutorClick(addressVerificationTab);
			javaScriptExecutorClick(currentAddressReject);
			javaScriptExecutorClick(RejectToDataentry);
			Thread.sleep(1000);
			RejectReson.sendKeys(addressReason);
			RejectSubmit.click();
		}else if(id.equalsIgnoreCase("yes")) {
			javaScriptExecutorClick(identificationTab);
			javaScriptExecutorClick(identificationRejection);
			javaScriptExecutorClick(RejectToDataentry);
			Thread.sleep(1500);
			RejectReson.sendKeys(idReason);
			RejectSubmit.click();
		}
}
public void stopBgv(String reason) {
	btnStopBgv.click();
	reasonStopBgv.sendKeys(reason);
	btnStopBgvSubmit.click();
}
public void ProceedForBilling(String desicion) throws InterruptedException {
	Thread.sleep(1000);
	logo.click();
	bgvBucket.click();
	Thread.sleep(1000);
	selectDropdownOption(customer,"Billing Changes");
	stopBGVReview.click();
	ExcelUtils ex=new ExcelUtils();
	String crtNum = ex.getCellData("CRTNumber", "CRTNumber", 2);
	driver.findElement(By.xpath("//a[text()='"+crtNum+"']")).click();
	javaScriptExecutorClick(stopAfterStopBGV);
	Thread.sleep(1000);
	if(desicion.equalsIgnoreCase("no")) {
		considerForBillingNo.click();
		btnbillingDesicion.click();
	}else if(desicion.equalsIgnoreCase("yes")){
		considerForBillingYes.click();
		btnbillingDesicion.click();
	}
	
}

public void proceedToVerifier() throws InterruptedException {
	Thread.sleep(1000);
	javaScriptExecutorClick(logo);
	bgvBucket.click();
	Thread.sleep(1000);
	selectDropdownOption(customer,"Billing Changes");
	stopBGVReview.click();
	ExcelUtils ex=new ExcelUtils();
	String crtNum = ex.getCellData("CRTNumber", "CRTNumber", 2);
	driver.findElement(By.xpath("//a[text()='"+crtNum+"']")).click();
	javaScriptExecutorClick(proceedAfterStopBgv);	
}
public void stopBGVEmployeeSearch() throws InterruptedException {
	Thread.sleep(1000);
	javaScriptExecutorClick(logo);
	bgvBucket.click();
	Thread.sleep(1000);
	selectDropdownOption(customer,"Billing Changes");
	ExcelUtils ex=new ExcelUtils();
	String crtNum = ex.getCellData("CRTNumber", "CRTNumber", 2);
	txtsearch.sendKeys(crtNum,Keys.ENTER);
	driver.findElement(By.xpath("//a[text()='"+crtNum+"']")).click();
}
public void stopBGVReviewEmployeeSearch() throws InterruptedException {
	Thread.sleep(1500);
	logo.click();
	bgvBucket.click();
	Thread.sleep(1000);
	selectDropdownOption(customer,"Billing Changes");
	stopBGVReview.click();
	ExcelUtils ex=new ExcelUtils();
	String crtNum = ex.getCellData("CRTNumber", "CRTNumber", 2);
	txtsearch.sendKeys(crtNum,Keys.ENTER);
	driver.findElement(By.xpath("//a[text()='"+crtNum+"']")).click();
}
public void proceedForbillingYes(String comp) {
	if(comp.equalsIgnoreCase("education")) {
		javaScriptExecutorClick(stopAfterStopBGV);
		javaScriptExecutorClick(considerForBillingYes);
		javaScriptExecutorClick(btnbillingDesicion);
	}else if(comp.equalsIgnoreCase("currentaddress")) {
		javaScriptExecutorClick(curStopbgvStop);
		javaScriptExecutorClick(considerForBillingYes);
		javaScriptExecutorClick(btnbillingDesicion);
	}else if(comp.equalsIgnoreCase("permanentAddress")) {
		javaScriptExecutorClick(peraddStopbgvStop);
		javaScriptExecutorClick(considerForBillingYes);
		javaScriptExecutorClick(btnbillingDesicion);
	}else if(comp.equalsIgnoreCase("id")) {
		javaScriptExecutorClick(idStopbgvStop);
		javaScriptExecutorClick(considerForBillingYes);
		javaScriptExecutorClick(btnbillingDesicion);
	}
	}
	public void proceedForbillingNo(String comp) {
		if(comp.equalsIgnoreCase("education")) {
			javaScriptExecutorClick(stopAfterStopBGV);
			javaScriptExecutorClick(considerForBillingNo);
			javaScriptExecutorClick(btnbillingDesicion);
		}else if(comp.equalsIgnoreCase("currentaddress")) {
			javaScriptExecutorClick(addressVerificationTab);
			javaScriptExecutorClick(curStopbgvStop);
			javaScriptExecutorClick(considerForBillingNo);
			javaScriptExecutorClick(btnbillingDesicion);
		}else if(comp.equalsIgnoreCase("permanentAddress")) {
			try {
			javaScriptExecutorClick(addressVerificationTab);
			}catch (Exception e) {
				e.printStackTrace();
			}
			javaScriptExecutorClick(peraddStopbgvStop);
			javaScriptExecutorClick(considerForBillingNo);
			javaScriptExecutorClick(btnbillingDesicion);
		}else if(comp.equalsIgnoreCase("id")) {
			javaScriptExecutorClick(identificationTab);
			javaScriptExecutorClick(idStopbgvStop);
			javaScriptExecutorClick(considerForBillingNo);
			javaScriptExecutorClick(btnbillingDesicion);
		}
	}
	public void proceedToVerifier1(String comp) throws InterruptedException {
		if(comp.equalsIgnoreCase("education")) {
			javaScriptExecutorClick(proceedAfterStopBgv);
			
		}else if(comp.equalsIgnoreCase("currentaddress")) {
			javaScriptExecutorClick(addressVerificationTab);
			javaScriptExecutorClick(curPreceedafterStop);
			
		}else if(comp.equalsIgnoreCase("permanentAddress")) {
			try {
			javaScriptExecutorClick(addressVerificationTab);
			}catch (Exception e) {
				e.printStackTrace();
			}
			javaScriptExecutorClick(paraddStopbgvproceed);
			
		}else if(comp.equalsIgnoreCase("id")) {
			javaScriptExecutorClick(identificationTab);
			javaScriptExecutorClick(idStopbgvproceed);
		}

}
	}
