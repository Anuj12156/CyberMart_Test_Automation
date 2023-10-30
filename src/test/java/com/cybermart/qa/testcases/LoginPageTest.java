package com.cybermart.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cybermart.qa.base.TestBase;
import com.cybermart.qa.pages.HomePage;
import com.cybermart.qa.pages.LoginPage;



public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest () {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void validateTitle() {
		String title = loginPage.validateTitle();
		Assert.assertEquals(title, "Cybermart | Login");
	}
	
	@Test(priority=2) 
	public void validateRegisterButton() {
		boolean button = loginPage.validateRegisterBtn();
		Assert.assertTrue(button);
	}
	
	@Test(priority=3)
	public void validateFbLogin() {
	boolean btn2 = loginPage.validateFbLogin();
	Assert.assertTrue(btn2);
	}
	
	@Test(priority=4)
	public void validateLoginText() {
		boolean txtLogin = loginPage.validateLoginText();
		Assert.assertTrue(txtLogin);
	}
	
	@Test(priority=5)
	public void validateWelcomeImage() {
		boolean welcomeImage = loginPage.validateWelcomeImage();
		Assert.assertTrue(welcomeImage);
	}
	
	@Test(priority=6) 
	public void validateNewMemberText() {
		boolean txtNewMember = loginPage.validateNewMemberText();
		Assert.assertTrue(txtNewMember);
		
	}
	
	@Test(priority=7)
	public void validateGoogleSignIn() {
		boolean googleSignIn = loginPage.validateGoogleLogin();
		Assert.assertTrue(googleSignIn);
	}
	
	@Test(priority=8)
	public void login() throws Exception {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
