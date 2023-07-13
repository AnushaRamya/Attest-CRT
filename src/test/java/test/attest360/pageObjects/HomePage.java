package test.attest360.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.attest360.testCases.BaseClass;

public class HomePage  extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//div/a[text()='Create']") //create new case
	WebElement crtNew;
	@FindBy(xpath="//td/a[text()='Select']") //Customer select Button
	WebElement btnSelect;
	
	// All HomePage
	
	@FindBy(xpath="//span[contains(text(),'Click Here')]") // To View All cases 
	WebElement toViewAllCases;
	
	@FindBy(id="searchName")   // search box txt field 
	WebElement searchBox;
	
	@FindBy(id="orgSearchId")   // Organization /customer dropdown
	WebElement organizationDropdown;
	
	@FindBy(id="button-addon2") // search button
	WebElement btnsearch;
	
	@FindBy(id="reinitiated") // reinitiated bucket dataentry,Verifier & QA
	WebElement reInitiatedBucket;
	
	@FindBy(id="app-logo-light") // reinitiated bucket dataentry,Verifier & QA
	WebElement homePage;
	

	// DataEntry DashBoard 
	
	@FindBy(xpath="//span[text()=' Customer Details ']") // Customer Details dropdown
	WebElement customerDetailDropdown;
	
	@FindBy(id="customerDetails") //Customers link
	WebElement customersLink;
	
	@FindBy(xpath="//span[contains(text(),'Case Details')]") // Case Details Dropdown QA / DataEntry
	WebElement casedetailsDropdown;
	
	@FindBy(id="highPriority") // HighPriority Bucket DataEntry/Verifier
	WebElement highPriorityBucket;
	
	@FindBy(id="new") // New Bucket
	WebElement newBucket;
	
	@FindBy(id="wip") // WIP Bucket
	WebElement wipBucket;
	
	@FindBy(id="toReview") // ToReview Bucket
	WebElement toReviewBucket;
	
	@FindBy(id="reworkCount") // Rejected And Insuff Bucket
	WebElement rejectedAndInsuffBucket;
	
	@FindBy(xpath="//a[text()='Fill Data']") // fill data link
	WebElement filDataLink;
	
	@FindBy(xpath="//a[text()='Upload Cases']")  // upload cases
	WebElement uploadCasesLink;
	
	@FindBy(xpath="//span[contains(text(),'Reports')]")  // Reports DropDown
	WebElement reportsDropdown;
	
	@FindBy(xpath="//a[text()='Component Reports']")  // Component Reports Links
	WebElement componenetReportsLink;
	
	// Verifier DashBoard 
	
	@FindBy(id="tatExceeded") // TAT Exceeded Bucket
	WebElement tatExceededBucket;
	
	@FindBy(id="tatToday") // TAT dueToady Bucket
	WebElement tatDueTodayBucket;
	
	@FindBy(id="tatUpcoming") // TAT upcoming Bucket
	WebElement tatUpcomingBucket;
	
	@FindBy(id="statusSearch") // status dropdown
	WebElement statusDropdown;
	
	// QA DashBoard 
	
	@FindBy(id="tatUpcoming") // PreCheck Bucket
	WebElement preCheckBucket;
	
	@FindBy(id="qaPending") // QA Pending Bucket
	WebElement qaPendingBucket;
	
	@FindBy(id="verifierPending") // Verifier Pending Bucket
	WebElement verifierPendingBucket;
	
	@FindBy(xpath="//a[contains(text(),'Auto Delegation')]") // Auto Deligation link
	WebElement runAutoDelegationLink;

	
	//insufficient
	@FindBy(id="insuffReason") //insufficiency reason
	WebElement insuffReason;
	@FindBy(id="insuffSubmitButton") //insufficiency reason
	WebElement btnInsufficient;
	
	public void CreateNew() throws InterruptedException 	{
		crtNew.click();
	}
	public void clickSelect() {
		btnSelect.click();
	}
	public void clickToViewAllCases() {
		toViewAllCases.click();
	}
	public void searchCustomer(String customerNme) {
		searchBox.sendKeys(customerNme,Keys.ENTER);
	}
	public void setInsufficientReason(String Reason) {
		insuffReason.sendKeys(Reason);
		btnInsufficient.click();
	}
	public void clickCustomerDetailsDropdown() {
		customerDetailDropdown.click();
	}
	public void clickCustomersLink() {
		customersLink.click();
	}
	public void selectCustomer(String customerNme) throws InterruptedException 	{
		customerDetailDropdown.click();
		Thread.sleep(1000);
		customersLink.click();
		searchBox.sendKeys(customerNme,Keys.ENTER);
		Thread.sleep(1000);
		btnSelect.click();
	}
	
	public void clickCreateNew() throws InterruptedException 	{
		casedetailsDropdown.click();
		Thread.sleep(1000);
		uploadCasesLink.click();
		crtNew.click();
	}
	
	public void clickFillData() throws InterruptedException{
		if(filDataLink.isDisplayed()) {
			filDataLink.click();
		}else {
			casedetailsDropdown.click();
			Thread.sleep(1000);
			filDataLink.click();
		}
	}
	
	public void selectCrtNumber(String crtNumber) throws InterruptedException	{
		searchBox.sendKeys(crtNumber,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+crtNumber+"']")).click();
	}
}
