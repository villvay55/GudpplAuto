package com.gudppl.listing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gudppl.organization.Pages.CreateOrganizationPage;

public class CreatePage {
	
	private By createBtn = By.xpath(".//*[@id='navbarSupportedContent']/a");
	private By createListingnBtn = By.xpath("html/body/app-root/div/div[2]/app-create/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div/button");
	private WebDriver driver;
	
	public CreatePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public CreateListingPage clickCreateBtn() throws InterruptedException {
		
		WebElement createBtnElement = driver.findElement(createBtn);
		createBtnElement.click();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		clickCreateListingBtn();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		return new CreateListingPage(driver);
		
		
		
	}
	
	public void clickCreateListingBtn() throws InterruptedException {
		
		WebElement createListingnBtnElement = driver.findElement(createListingnBtn);
		createListingnBtnElement.click();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
	}
	
	

}
