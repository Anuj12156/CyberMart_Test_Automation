package com.cybermart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cybermart.qa.base.TestBase;
import com.cybermart.qa.pages.CreateProductsPage;
import com.cybermart.qa.pages.HomePage;
import com.cybermart.qa.pages.InventoryPage;
import com.cybermart.qa.pages.LoginPage;

public class InventoryPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	InventoryPage inventoryPage;
	

	public InventoryPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
	    loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = new HomePage();
		homePage.navigateInventoryPage();
		inventoryPage = new InventoryPage();
	}
	
	@Test(priority=1)
	public void verifyInventoryTitle() throws Exception {
		String pageTitle = inventoryPage.getTitle();
		Assert.assertEquals(pageTitle, "Cybermart | Inventory");
	}
	@Test(priority=2)
	public void updateQuantity()throws Exception {
		inventoryPage.updateQuantity();
	}
	@Test(priority=3)
	public void updatePrice() throws Exception {
		inventoryPage.updatePrice();
	}
	@Test(priority=4)
	public void verifyEditProductButton() {
		inventoryPage.verifyEditButton();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
