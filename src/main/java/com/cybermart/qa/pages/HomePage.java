package com.cybermart.qa.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.cybermart.qa.base.TestBase;
import com.cybermart.qa.utility.TestUtil;

public class HomePage extends TestBase {
	
	//Homepage Dashboard Elements --------------------------------------------------------
	
	@FindBy(xpath="//img[@alt='main-logo']")
	WebElement sellerLogo;
	
	@FindBy(xpath="//div[@class='styles_appPaper__inDSm rounded-2xl MuiBox-root css-0']")
	WebElement ordersDataDashboard;
	
	@FindBy(xpath="//div[text()='Other Seller']")
	WebElement otherSellerLink;
	
	@FindBy(xpath="//img[@alt='profile picture']")
	WebElement profilePictureLinkSeller;
	
	@FindBy(xpath="//li[text()='Logout']")
	WebElement logoutLinkSeller;
	
	//Main Links HomePage Seller --------------------------------------------------------
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement dashboardSeller;
	
	@FindBy(xpath="//h6[text()='Products']")
	WebElement productsLinkSeller;
	
	@FindBy(xpath="//h6[text()='Orders']")
	WebElement ordersLinkSeller;
	
	@FindBy(xpath="//h6[text()='Promotions']")
	WebElement promotionsLinkSeller;

	@FindBy(xpath="//h6[text()='Account Setting']")
	WebElement accountSettingsLinkSeller;
	
	@FindBy(xpath="//h6[text()='Seller Store']")
	WebElement sellerStoreLinkSeller;
	
	@FindBy(xpath="//h6[text()='SubSeller']")
	WebElement subSellerLink;
	
	
	// Sub Links Seller Navigation Bar  --------------------------------------------------------
	
	@FindBy(xpath="//h5[text()='Create Product']")
	WebElement createProductLink;
	
	@FindBy(xpath="//h5[text()='Inventory']")
	WebElement inventoryLinkSeller;
	
	@FindBy(xpath="//h5[text()='Buyer Questions']")
	WebElement buyerQuestionsLinkSeller;
	
	@FindBy(xpath="//h5[text()='Manage Orders']")
	WebElement manageOrdersLinkSeller;
	
	@FindBy(xpath="//h5[text()='Coupons']")
	WebElement couponsLinkSeller;
	
	@FindBy(xpath="//h5[text()='Campaign']")
	WebElement campaignLinkSeller;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyHomePageTitle() throws Exception {
		TestUtil.waitStatement2();
		System.out.println(driver.getTitle());
		Reporter.log(driver.getTitle());
		
		return driver.getTitle();
		
	}
	
	public boolean validateSellerLogo() throws Exception {
		TestUtil.waitStatement2();
		return sellerLogo.isDisplayed();
	}
	
	public boolean validateOrdersDataDashboard() throws Exception {
		TestUtil.waitStatement2();
		return ordersDataDashboard.isDisplayed();
		
	}
	
	public boolean validateOtherSellerLink() throws Exception {
		TestUtil.waitStatement2();
		return otherSellerLink.isDisplayed();
	}
	
	public boolean validateProfilePicture() throws Exception {
		TestUtil.waitStatement2();
		return profilePictureLinkSeller.isDisplayed();
	}
	
	public boolean validateLogoutLink()  throws Exception {
		TestUtil.waitStatement2();
		profilePictureLinkSeller.click();
		return logoutLinkSeller.isDisplayed();
		
	}
	public boolean validateDashboard() throws Exception {
		TestUtil.waitStatement2();
		 return dashboardSeller.isDisplayed();
	}
	
	public boolean validateProductsLinkSeller() throws Exception {
		driver.navigate().refresh();
		TestUtil.waitStatement2();
		productsLinkSeller.click();
		Thread.sleep(1000);
        return createProductLink.isDisplayed();
	}
	
	public boolean validateOrdersLinkSeller() throws Exception {
		TestUtil.waitStatement2();
		ordersLinkSeller.click();
		return manageOrdersLinkSeller.isDisplayed();
	}
	
	public boolean validatePromotionsLinkSeller() throws Exception {
		TestUtil.waitStatement2();
		promotionsLinkSeller.click();
		return couponsLinkSeller.isDisplayed();
	}
	
	public AccountSetting validateAccountSettingLinkSeller() throws Exception {
		TestUtil.waitStatement2();
		accountSettingsLinkSeller.click();
		return new AccountSetting();
	}
	public SellerStorePage validateSellerStoreLink() throws Exception {
		TestUtil.waitStatement2();
		sellerStoreLinkSeller.click();
		return new SellerStorePage();
	}
	
	public SubSellerPage validateSubSellerLink() throws Exception {
		TestUtil.waitStatement2();
		subSellerLink.click();
		return new SubSellerPage();
	}
	public CreateProductsPage validateCreateProductsLink() throws Exception {
		TestUtil.waitStatement2();
		productsLinkSeller.click();
		createProductLink.click();
		
		return new CreateProductsPage() ;
		
	}
	
	public InventoryPage validateInventoryPage() throws Exception {
		
		TestUtil.waitStatement2();
		String currentURL = driver.getCurrentUrl();
		if(currentURL.equals("https://qaseller.cybermart.in/product_catalog/select_categories")) {
			inventoryLinkSeller.click();
		}
		else if(currentURL.equals("https://qaseller.cybermart.in/product_qa/listing")) {
			inventoryLinkSeller.click();
		}
		else {
			productsLinkSeller.click();
			inventoryLinkSeller.click();
		}
		
		return new InventoryPage();
		
	}
	
	public BuyerQuestionsPage validateBuyerQuestionsLink() throws Exception {
		TestUtil.waitStatement2();
		String currentSellerPageURL1 = driver.getCurrentUrl();
		if(currentSellerPageURL1.equals("https://qaseller.cybermart.in/product_catalog/select_categories")) {
			buyerQuestionsLinkSeller.click();
		}
		else if(currentSellerPageURL1.equals("https://qaseller.cybermart.in/manage_inventory")) {
			buyerQuestionsLinkSeller.click();
		}
		else {
			productsLinkSeller.click();
			inventoryLinkSeller.click();
		}
		
		return new BuyerQuestionsPage();
		
	}
	
	public ManageOrdersPage validateManageOrdersLink() throws Exception {
		TestUtil.waitStatement2();
		ordersLinkSeller.click();
		manageOrdersLinkSeller.click();
		
		return new ManageOrdersPage();
	}
	
	public CouponsPage validateCouponsLinkSeller() throws Exception {
		TestUtil.waitStatement2();
		String currentSellerURL2 = driver.getCurrentUrl();
		
		if(currentSellerURL2.equals("https://qaseller.cybermart.in/campaign/listing")) {
			
			couponsLinkSeller.click();
		}
		else {
			promotionsLinkSeller.click();
			couponsLinkSeller.click();
			
		}
		return new CouponsPage();
	}
	
	public CampaignPage validateCampaignLinkSeller() throws Exception {
		
		TestUtil.waitStatement2();
		String currentSellerURL3 = driver.getCurrentUrl();
		
		if(currentSellerURL3.equals("https://qaseller.cybermart.in/coupon/coupon_listing")) {
			
			campaignLinkSeller.click();
		}
		else {
			promotionsLinkSeller.click();
			campaignLinkSeller.click();
			
		}
		return new CampaignPage();
	}
	
	public void navigateCreateProductPage() {
		productsLinkSeller.click();
		createProductLink.click();
	}
	
	public void navigateInventoryPage() {
		
		productsLinkSeller.click();
		inventoryLinkSeller.click();
	}
}
