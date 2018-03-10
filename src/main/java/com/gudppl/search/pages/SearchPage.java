package com.gudppl.search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	private By searchTxtBox = By.xpath(".//*[@id='navbarSupportedContent']/ul[2]/li[1]/div/div/input");
	private By searchBtn = By.xpath(".//*[@id='navbarSupportedContent']/ul[2]/li[2]/a");
	
	private WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public SearchResultPage search(String searchData) throws InterruptedException {
		
		enterSearchDetails(searchData);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		clickOnSearch();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		return new SearchResultPage(driver);
	}
	
	
	public void enterSearchDetails(String searchData) {
		
		WebElement searchTxtBoxElement  = driver.findElement(searchTxtBox);

		if(searchTxtBoxElement.isDisplayed()) {
			
			searchTxtBoxElement.click();
			searchTxtBoxElement.sendKeys(searchData);
		}
	}
		
	public void clickOnSearch() {
			
		WebElement searchBtnElement =  driver.findElement(searchBtn);
			
		if(searchBtnElement.isDisplayed()) {
				
			searchBtnElement.click();
			
		}
			
		else System.out.println("Element not found");
			
		}

}
	
	
