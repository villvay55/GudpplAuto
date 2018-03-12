package com.gudppl.search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {

	private WebDriver driver;
	private By result = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[2]/div/div[1]");
	private By oppsTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[2]/a");
	private By peopleTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[3]/a");
	private By organizationsTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[4]/a");
	private By noticeTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[5]");
	
	public SearchResultPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void verifyTab() throws InterruptedException {
		
		clickOnOppTab();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickOnPeopleTab();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickOnOrganizationTab();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickOnNoticeTab();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
	}
	public void clickOnOppTab() {
		
		WebElement oppsTabElement =  driver.findElement(oppsTab);
			
		if(oppsTabElement.isDisplayed()) {
				
			oppsTabElement.click();
			
		}
			
		else System.out.println("Element not found");
			
	}
	
	public void clickOnPeopleTab() {
		
		WebElement peopleTabElement =  driver.findElement(peopleTab);
			
		if(peopleTabElement.isDisplayed()) {
				
			peopleTabElement.click();
			
		}
			
		else System.out.println("Element not found");
			
	}
	
	public void clickOnOrganizationTab() {
		
		WebElement organizationsTabElement =  driver.findElement(organizationsTab);
			
		if(organizationsTabElement.isDisplayed()) {
				
			organizationsTabElement.click();
			
		}
			
		else System.out.println("Element not found");
			
	}
	
	public void clickOnNoticeTab() {
		
		WebElement noticeTabElement =  driver.findElement(noticeTab);
			
		if(noticeTabElement.isDisplayed()) {
				
			noticeTabElement.click();
			
		}
			
		else System.out.println("Element not found");
			
	}
	
	/*public boolean verifyResultPage() throws InterruptedException {
		
		WebElement resultElement  = driver.findElement(result);
		boolean resultPageElement  = resultElement.isDisplayed();
		
		return resultPageElement;
			
		}*/
	
	

}
