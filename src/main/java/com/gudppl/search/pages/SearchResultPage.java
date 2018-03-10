package com.gudppl.search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {

	private WebDriver driver;
	private By result = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[2]/div/div[1]");
	
	public SearchResultPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public boolean verifyResultPage() throws InterruptedException {
		
		WebElement resultElement  = driver.findElement(result);
		boolean resultPageElement  = resultElement.isDisplayed();
		
		return resultPageElement;
			
		}
	
	

}
