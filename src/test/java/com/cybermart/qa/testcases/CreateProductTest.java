package com.cybermart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cybermart.qa.base.TestBase;
import com.cybermart.qa.pages.CreateProductsPage;
import com.cybermart.qa.pages.HomePage;
import com.cybermart.qa.pages.LoginPage;

public class CreateProductTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CreateProductsPage createProductsPage;
	

	public CreateProductTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
	    createProductsPage = new CreateProductsPage();
	    loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.navigateCreateProductPage();
	}
	
	@Test(priority=1)
	public void verifyCategoriesCreateProduct() {
		createProductsPage.validateCategories();
		
	}
	
	@Test(priority=2)
	public void verifySubCategoriesMen() {
		createProductsPage.validateSubCategoryMen();
	}
	
	@Test(priority=3)
	public void verifyChildSubcategoriesTopWearMen() {
		createProductsPage.validateChildSubCategoriesTopWearMen();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
