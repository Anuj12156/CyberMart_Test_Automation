package com.cybermart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cybermart.qa.base.TestBase;
import com.cybermart.qa.pages.CreateProductsPage;
import com.cybermart.qa.pages.HomePage;
import com.cybermart.qa.pages.LoginPage;
import com.cybermart.qa.pages.ProductCreationPage;
import com.cybermart.qa.utility.TestUtil;

public class ProductCreationTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateProductsPage createProductsPage;
	ProductCreationPage productCreationPage;

	public ProductCreationTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
	    loginPage = new LoginPage();
	    createProductsPage = new CreateProductsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.navigateCreateProductPage();
		createProductsPage.productCreationPageBottomWear();
		productCreationPage = new ProductCreationPage();
	}
	
	@Test
	public void createProduct() throws Exception  {
		productCreationPage.enterProductName(prop.getProperty("productName"));
		productCreationPage.selectBrand();
		TestUtil.waitStatement2();
		productCreationPage.addVariants(prop.getProperty("color"), prop.getProperty("size"));
		TestUtil.waitStatement2();
		productCreationPage.variantDetails(prop.getProperty("price"), prop.getProperty("sku"), prop.getProperty("qty"), prop.getProperty("salePrice"), prop.getProperty("saleEndDate"));
		TestUtil.waitStatement2();
		productCreationPage.selectReturn();
		productCreationPage.selectWarranty();
		productCreationPage.selectTaxClass();
		productCreationPage.enterFakeOrder();
		TestUtil.waitStatement2();
		productCreationPage.selectShipping();
		productCreationPage.bulletPoint(prop.getProperty("bulletPoints"));
		TestUtil.waitStatement2();
		productCreationPage.productDescription();
		TestUtil.waitStatement2();
		productCreationPage.metaInfo(prop.getProperty("metatitle"), prop.getProperty("metatag"), prop.getProperty("metadescription"));
		TestUtil.waitStatement2();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
