package com.cybermart.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermart.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@name='emailOrPhone']")
	WebElement username;
	
	@FindBy (xpath="//input[@name='loginPassword']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//span[text()='Register']")
	WebElement registerBtn;
	
	@FindBy(xpath="//button[@class=\"kep-login-facebook small\"]")
	WebElement fbLogin;
	
	@FindBy(xpath="//span[text()='Login Here']")
	WebElement loginText;
	
	@FindBy(xpath="//div[@class='hidden md:flex px-10 items-center justify-center']")
	WebElement welcomeImage;
	
	@FindBy(xpath="//span[text()='New Member?']")
	WebElement textNewMember;
	
	@FindBy(xpath="//span[text()='Sign in with Google']")
	WebElement loginGoogle;
	
	public LoginPage () {
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean validateRegisterBtn() {
		return registerBtn.isDisplayed();
	}
	
	public boolean validateFbLogin() {
		return fbLogin.isDisplayed();
	}
	
	public boolean validateLoginText() {
		return loginText.isDisplayed();
	}
	
	public boolean validateWelcomeImage() {
		return welcomeImage.isDisplayed();
	}
	public boolean validateNewMemberText() {
		return  textNewMember.isDisplayed();
	}
	
	public boolean validateGoogleLogin() {
		return loginGoogle.isDisplayed();
	}

	public HomePage login(String un, String pwd) throws Exception {
		
		Thread.sleep(1000);
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		Thread.sleep(3000);
		
		return new HomePage();
	}
}
