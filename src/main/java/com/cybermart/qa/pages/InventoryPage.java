package com.cybermart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybermart.qa.base.TestBase;

public class InventoryPage extends TestBase {
	
	@FindBy(xpath="(//span[text()='Edit'])[1]")
	WebElement editProductInventory;
	
	@FindBy(xpath="(//input[@type='number'][@step='1'])[1]")
	WebElement editStockQty;
	
	@FindBy(xpath="(//input[@type='number'][@step='0'])[1]")
	WebElement editPrice;
	
	@FindBy(xpath="(//div[contains(@class, 'cursor-pointer')])[21]")
	WebElement submitStockQty;
	
	@FindBy(xpath="//p[@class='cursor-pointer']")
	WebElement submitEditPrice;
	
	public InventoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle()throws Exception{
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public void updateQuantity() throws Exception {
		
		editStockQty.clear();
		Thread.sleep(2000);
		editStockQty.sendKeys("20");
		submitStockQty.click();
		Thread.sleep(2000);
	}
	
	public void updatePrice() throws Exception {
		editPrice.clear();
		Thread.sleep(2000);
		editPrice.sendKeys("2000");
		submitEditPrice.click();
		Thread.sleep(2000);
	}
	
	public EditProductPage verifyEditButton() {
		editProductInventory.click();
		return new EditProductPage();
	}
}
