package com.cybermart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cybermart.qa.base.TestBase;
import com.cybermart.qa.pages.AccountSetting;
import com.cybermart.qa.pages.BuyerQuestionsPage;
import com.cybermart.qa.pages.CampaignPage;
import com.cybermart.qa.pages.CouponsPage;
import com.cybermart.qa.pages.CreateProductsPage;
import com.cybermart.qa.pages.HomePage;
import com.cybermart.qa.pages.InventoryPage;
import com.cybermart.qa.pages.LoginPage;
import com.cybermart.qa.pages.ManageOrdersPage;
import com.cybermart.qa.pages.SellerStorePage;
import com.cybermart.qa.pages.SubSellerPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	AccountSetting accountSettingsPage;
	SellerStorePage sellerStorePage;
	SubSellerPage subSellerPage;
	InventoryPage inventoryPage;
	BuyerQuestionsPage buyerQuestionsPage;
	ManageOrdersPage manageOrdersPage;
	CouponsPage couponsPage;
	CampaignPage campaignPage;
	CreateProductsPage creatProductPage;

	
	public HomePageTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		sellerStorePage = new SellerStorePage();
		accountSettingsPage = new AccountSetting();
		subSellerPage = new SubSellerPage();
		inventoryPage = new InventoryPage();
		buyerQuestionsPage = new BuyerQuestionsPage();
		manageOrdersPage = new  ManageOrdersPage();
		couponsPage = new CouponsPage();
		campaignPage = new CampaignPage();
		creatProductPage = new CreateProductsPage();
 		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() throws Exception {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cybermart | Home");
	}
	
	@Test(priority=2)
	public void verifyDashboardSeller() throws Exception {
		boolean dashboardSeller = homePage.validateDashboard();
		Assert.assertTrue(dashboardSeller);
	}
	
	@Test(priority=3)
	public void verifySellerLogo() throws Exception {
		boolean sellerLogo = homePage.validateSellerLogo();
		Assert.assertTrue(sellerLogo);
	}
	
	@Test(priority=4)
	public void verifyOrdersDataDashboard() throws Exception {
		boolean ordersDataDashboard = homePage.validateOrdersDataDashboard();
		Assert.assertTrue(ordersDataDashboard);
	}
	
	@Test(priority=5)
	public void verifyOtherSellerLink() throws Exception {
		
		boolean otherSellerLink = homePage.validateOtherSellerLink();
		Assert.assertTrue(otherSellerLink);
		
	}
	
	@Test(priority=6)
	public void verifyProfilePicture() throws Exception {
		boolean profilePicture = homePage.validateProfilePicture();
		Assert.assertTrue(profilePicture);
	}
	
	@Test(priority=7)
	public void verifyLogoutLink() throws Exception {
		boolean logoutLink = homePage.validateLogoutLink();
		Assert.assertTrue(logoutLink);
	}
	
	@Test(priority=8)
	public void verifyProductsLink() throws Exception {
		boolean createProduct = homePage.validateProductsLinkSeller();
		Assert.assertTrue(createProduct);
	}
	@Test(priority=9)
	public void verifyOrdersLink() throws Exception {
		boolean manageOrders = homePage.validateOrdersLinkSeller();
		Assert.assertTrue(manageOrders);
	}
	@Test(priority=10) 
	public void verifyPromotionsLink() throws Exception {
		
		boolean coupons = homePage.validatePromotionsLinkSeller();
		Assert.assertTrue(coupons);
		
	}
	@Test(priority=11)
	public void verifyAccountSettings() throws Exception {
		
		accountSettingsPage = homePage.validateAccountSettingLinkSeller();
		
	}
	
	@Test(priority=12)
	public void verifySellerStore() throws Exception {
		 
		sellerStorePage = homePage.validateSellerStoreLink();
	}
	
	@Test(priority=13) 
	public void verifySubSeller() throws Exception {
		subSellerPage = homePage.validateSubSellerLink();
	}
	
	@Test(priority=14)
	
	public void verifyCreateProduct() throws Exception {
		creatProductPage = homePage.validateCreateProductsLink();
	}
	
	@Test(priority=15) 
	public void verifyInventoryPage() throws Exception {
		
		inventoryPage = homePage.validateInventoryPage();
		
	}
	
	@Test(priority=16)
	public void verifyBuyerQuestions() throws Exception {
		buyerQuestionsPage = homePage.validateBuyerQuestionsLink();
	}
	
	@Test(priority=17)
	public void verifyManageOrders() throws Exception {
		manageOrdersPage = homePage.validateManageOrdersLink();
	}
	
	@Test(priority=18)
	public void verifyCouponsLinkSeller() throws Exception {
		couponsPage = homePage.validateCouponsLinkSeller();
	}
	
	@Test(priority=19)
	public void verifyCampaignPage() throws Exception {
		
		campaignPage = homePage.validateCampaignLinkSeller();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
