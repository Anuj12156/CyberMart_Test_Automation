package com.cybermart.qa.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermart.qa.base.TestBase;
import com.cybermart.qa.utility.TestUtil;

public class ProductCreationPage extends TestBase {
	
	@FindBy(xpath="//input[@name='p_name']")
	WebElement productNameText;
	
	//click on brand drop down
	@FindBy(xpath="//div[@id='mui-6' and contains(@class, 'MuiSelect-select')]")
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
	
	@FindBy(xpath="//div[@class='w-22 flex items-center justify-center min-w-[85px] h-20 mr-3 text-center border"
	+" border-borderColor border-dashed rounded-[5px] p-2 mb-2']//input[@type='file']\r\n")
	WebElement sizeChartImage;
	
	@FindBy(xpath="(//div[@class='w-22 flex items-center justify-center min-w-[85px] h-[100px] mr-3 text-center border"
	+" border-borderColor border-dashed rounded-[5px] p-2 mb-2']//input[@type='file'])[1]")
	WebElement mainImageProduct;
	
	@FindBy(xpath="(//div[@class='w-22 flex items-center justify-center min-w-[85px] h-[100px] mr-3 text-center border"
	+" border-borderColor border-dashed rounded-[5px] p-2 mb-2']//input[@type='file'])[2]")
	WebElement additionalImageProduct;
	
	//open return drop down
	@FindBy(xpath="//div[@id='mui-14']")
	WebElement returnDropdown;
	
	//select return days
	@FindBy(xpath="//li[@data-value='7']")
	WebElement returnDays;
	
	//open warranty drop down
	@FindBy(xpath="//div[@id='mui-16']")
	WebElement warrantyDropdown;
	
	// Select Warranty period
	@FindBy(xpath="//li[@data-value='1']")
	WebElement warrantyPeriod;
	
	//open tax class dropdown
	@FindBy(xpath="//div[@id='mui-18']")
	WebElement taxClassDropdown;
	
	//select tax class
	@FindBy(xpath="//li[@data-value='13']")
	WebElement taxClassValue;
	
	@FindBy(xpath="//input[@name='fakeOrder']")
	WebElement fakeOrdersValue;
	
	@FindBy(xpath="(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	WebElement selectStandardShipping;
	
	@FindBy(xpath="//input[@name='shipping.standard.days']")
	WebElement numberOfDays;
	
	@FindBy(xpath="//input[@name='shipping.standard.charges']")
	WebElement shippingCost;
	
	@FindBy(xpath="//input[@name='bulletPoints']")
	WebElement bulletPointsText;
	
	@FindBy(xpath="(//button[contains(@class, 'MuiButton-root') and contains(text(), 'Add')])[1]")
	WebElement bulletPointsAddButton;
	
	@FindBy(xpath="(//div[@role='textbox'][@aria-label='Rich Text Editor, main'])[1]")
	WebElement longDescription;
	
	@FindBy(xpath="(//div[@role='textbox'][@aria-label='Rich Text Editor, main'])[2]")
	WebElement moreInformation;
	
	@FindBy(xpath="//input[@name='meta_title']")
	WebElement metaTitle;
	
	@FindBy(xpath="//input[@name='meta_tag']")
	WebElement metaTag;
	
	@FindBy(xpath="//input[@name='meta_description']")
	WebElement metaDescription;
	
	@FindBy(xpath="//button[@data_testid='addProductBtn']")
	WebElement submitButton;
	
	
	public ProductCreationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterProductName(String pName) throws Exception {
		productNameText.sendKeys(pName);
		TestUtil.waitStatement1();
	}
	public void selectBrand() throws Exception {
		brandDropdown.click();
		brandToSelect.click();
	}
	public void addVariants(String color, String size) {
		addVariantsButton.click();
		colorTextBox.sendKeys(color);
		addColorButton.click();
		sizeTextBox.sendKeys(size);
		addSizeButton.click();
	}
	
	public void variantDetails(String price, String sku, String qty, String salePrice, String saleEndDate) {
		priceVariant1.sendKeys(price);
		skuVariant1.sendKeys(sku);
		qtyVariant1.sendKeys(qty);
		salePriceVariant1.sendKeys(salePrice);
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    String formattedDate = currentDate.format(formatter);
		saleStartDateVariant1.sendKeys(formattedDate);
		saleEndDateVariant1.sendKeys(saleEndDate);
		
	}
	public void uploadSizeChart(String sizeChartImagePath) throws Exception {
		TestUtil.waitStatement2();
		sizeChartImage.sendKeys(sizeChartImagePath);
		TestUtil.waitStatement2();
	}
	
	public void uploadProductImage(String mainImagePath, String additionalImagePath) throws Exception{
		TestUtil.waitStatement2();
		mainImageProduct.sendKeys(mainImagePath);
		TestUtil.waitStatement2();
		additionalImageProduct.sendKeys(additionalImagePath);
		TestUtil.waitStatement2();
	}
	public void selectReturn() {
		returnDropdown.click();
		returnDays.click();
	}
	public void selectWarranty() {
		warrantyDropdown.click();
		warrantyPeriod.click();
	}
	
	public void selectTaxClass() {
		taxClassDropdown.click();
		taxClassValue.click();
	}
	
	public void enterFakeOrder() {
		fakeOrdersValue.sendKeys("20");
	}
	public void selectShipping() {
		selectStandardShipping.click();
		numberOfDays.sendKeys("5");
		shippingCost.sendKeys("40");
	}
	
	public void bulletPoint(String bulletPoints) {
		for(int i=1;i<=5;i++) {
			bulletPointsText.sendKeys(bulletPoints+i);
			bulletPointsAddButton.click();
		}
	}
	public void productDescription() {
		longDescription.sendKeys("Very good test product for men");
		moreInformation.sendKeys("More information about the test product");
	}
	public void metaInfo(String metatitle, String metatag, String metadescription) throws Exception {
		metaTitle.sendKeys(metatitle);
		metaTag.sendKeys(metatag);
		metaDescription.sendKeys(metadescription);
		TestUtil.waitStatement2();
	}

	public void clickSubmit() {
		submitButton.click();
	}
}
