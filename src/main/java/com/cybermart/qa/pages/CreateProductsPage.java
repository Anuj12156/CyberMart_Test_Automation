package com.cybermart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermart.qa.base.TestBase;
import com.cybermart.qa.utility.TestUtil;

public class CreateProductsPage  extends TestBase {
	
	
	//Parent Categories ------------------------------------------------------
	//------------------------------------------------------------------------
	@FindBy(xpath="//p[text()='Men']")
	WebElement menCategory;
	
	@FindBy(xpath="//p[text()='Women']")
	WebElement womenCategory;
	
	@FindBy(xpath="//p[text()='Kids']")
	WebElement kidsCategory;

	@FindBy(xpath="//p[text()='Beauty']")
	WebElement beautyCategory;
	
	@FindBy(xpath="//p[text()='Electronics']")
	WebElement  electronicsCategory;
	
	@FindBy(xpath="//p[text()='Home & Living']")
	WebElement homeLivingCategory;
	
	@FindBy(xpath="//p[text()='Sports']")
	WebElement sportsCategory;
	
	@FindBy(xpath="//p[text()='Gear']")
	WebElement gearCategory;
	
	@FindBy(xpath="//p[text()='Offers Zone']")
	WebElement offersZoneCategory;
	
	//@FindBy(xpath="//input[@id='mui-9'][@type='text']")
	//WebElement searchTextBox;
	
	//Sub Categories Men -------------------------------------------------
	//--------------------------------------------------------------------
	@FindBy(xpath="//p[text()='Top wear']")
	WebElement topwearMen;
	
	@FindBy(xpath="//p[text()='Ethnic Wear']")
	WebElement ethnicwearMen;
	
	@FindBy(xpath="//p[text()='Bottom Wear']")
	WebElement bottomwearMen;
	
	@FindBy(xpath="//p[text()='Innerwear & Loungewear ']")
	WebElement innerwaerAndLoungeWearMen;
	
	@FindBy(xpath="//p[text()='Footwear']")
	WebElement footwearMen;
	
	@FindBy(xpath="//p[text()='Bags']")
	WebElement bagsMen;
	
	@FindBy(xpath="//p[text()='Sportswear & Activewear']")
	WebElement sportswearMen;
	
	@FindBy(xpath="//p[text()='Accessories']")
	WebElement accessoriesMen;
	
	@FindBy(xpath="//p[text()='Personal Care & Grooming']")
	WebElement personalCareMen;
	
	@FindBy(xpath="//p[text()='Joggers']")
	WebElement joggersMen;
	
	@FindBy(xpath="//p[text()='Casual Trousers']")
	WebElement casualTrousersMen;
	
	
	//Child Sub Categories under top wear in men --------------------------------------
	//---------------------------------------------------------------------------------
	
	@FindBy(xpath="//p[text()='T-Shirts']")
	WebElement tshirtsTopWearMen;
	
	@FindBy(xpath="//p[text()='Casual Shirts']")
	WebElement casualShirtTopWearMen;
	
	
	// Next Button to open Product Creation Page -------------------------------
	//--------------------------------------------------------------------------
	@FindBy(xpath="//button[text()='Next']")
	WebElement nextButton;
	
	public CreateProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateCategories() {
		//verify Parent categories
		menCategory.isDisplayed();
		womenCategory.isDisplayed();
		kidsCategory.isDisplayed();
		beautyCategory.isDisplayed();
		electronicsCategory.isDisplayed();
		homeLivingCategory.isDisplayed();
		sportsCategory.isDisplayed();
		sportsCategory.isDisplayed();
		gearCategory.isDisplayed();
	}
	
	public void validateSubCategoryMen() {
		//Click on Main Category
		menCategory.click();
		
		//Verify sub categories men
		topwearMen.isDisplayed();
		ethnicwearMen.isDisplayed();
		bottomwearMen.isDisplayed();
		innerwaerAndLoungeWearMen.isDisplayed();
		footwearMen.isDisplayed();
		bagsMen.isDisplayed();
		sportswearMen.isDisplayed();
		accessoriesMen.isDisplayed();
		personalCareMen.isDisplayed();
		joggersMen.isDisplayed();
		
	}
	
	
	public void validateChildSubCategoriesTopWearMen() {

			//Click on Main Category
			menCategory.click();
			
			//click on sub category
			topwearMen.click();
			
			//verifyChildSubCategories
			tshirtsTopWearMen.isDisplayed();
			casualShirtTopWearMen.isDisplayed();
			
		
		
	}
	
	// Navigation to product page
	public void productCreationPage() {
	
	// Navigate to Men-Topwear-Tshirt----------
		
		//Click on Main Category
		menCategory.click();
		//click on sub category
		topwearMen.click();
		//Click on ChildSubCategory
		tshirtsTopWearMen.click();
		
		
	}
	
	public void productCreationPageBottomWear() throws Exception{

		// Navigate to Men-bottomwear-Trouser----------
			
			//Click on Main Category
			menCategory.click();
			bottomwearMen.click();
			casualTrousersMen.click();
			nextButton.click();
			TestUtil.waitStatement1();
			
	}
}
