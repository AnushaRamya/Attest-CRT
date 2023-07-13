package test.attest360.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.attest360.testCases.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="username")
	WebElement newuser;
	@FindBy (id="loginPassword")
	WebElement newpass;
	@FindBy (xpath="//button[text()='Login']")
	WebElement btnlogin;
	@FindBy (id="userSilhouette")
	WebElement uprofile;
	@FindBy (xpath="//div[@class='dropdown-menu dropdown-menu-end profile-dropdown show']//span[contains(text(),'Logout')]")
	WebElement logout;

	public void setNewUser(String username) {
		newuser.clear();
		newuser.sendKeys(username);
	}
	public void setNewPassword(String pass) {
		newpass.clear();
		newpass.sendKeys(pass);
	}
	public void clickLogin() {
		btnlogin.click();
	}
	public void clickprofileLogout() throws InterruptedException{
		uprofile.click();
		Thread.sleep(500);
		logout.click();
	}
}
