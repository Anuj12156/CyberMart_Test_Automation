package com.cybermart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cybermart.qa.base.TestBase;

public class ProductCreationPage extends TestBase {
	
	@FindBy(xpath="//input[@name='p_name']")
	WebElement productNameText;
	
	@FindBy(xpath="//div[@id='mui-5' and contains(@class, 'MuiSelect-select')]")
	WebElement brandDropdown;
	
	
	// Codify brand needs to be selected
	@FindBy(xpath="//div//li[@data-value='171']")
	WebElement brandToSelect;
	
	@FindBy(xpath="//button[text()='Add More SKU/Variants']")
	WebElement addVariantsButton;
	
	@FindBy(xpath="//input[@name='Color']")
	WebElement colorTextBox;
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/span[1]")
	WebElement addColorButton;
	
	@FindBy(xpath="//input[@name='Size']")
	WebElement sizeTextBox;
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/span[1]")
	WebElement addSizeButton;
	
	@FindBy(xpath="//input[@name='variant-1.price']")
	WebElement priceVariant1;
	
	@FindBy(xpath="//input[@name='variant-1.sku']")
	WebElement skuVariant1;
	
	@FindBy(xpath="//input[@name='variant-1.quantity']")
	WebElement qtyVariant1;
	
	@FindBy(xpath="//input[@name='variant-1.sale_price']")
	WebElement salePriceVariant1;
	
	@FindBy(xpath="//input[@name='variant-1.start_sale_date']")
	WebElement saleStartDateVariant1;
	
	@FindBy(xpath="//input[@name='variant-1.end_sale_date']")
	WebElement saleEndDateVariant1;
	
	@FindBy(xpath="(//div[@class='flex flex-wrap my-3'] //div)[1]")
	WebElement sizeChartImage;
	
	@FindBy(xpath="(//div[@class='flex flex-wrap my-3'] //div)[4]")
	WebElement mainImageProduct;
	
	@FindBy(xpath="(//div[@class='flex flex-wrap my-3'] //div)[7]")
	WebElement additionalImageProduct;

}
