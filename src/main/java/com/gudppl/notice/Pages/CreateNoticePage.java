package com.gudppl.notice.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CreateNoticePage {
	
	private By noticeLnk = By.xpath(".//*[@id='navbarSupportedContent']/ul[1]/li[6]/a");
	private By createListingBtn = By.xpath("html/body/app-root/div/div[2]/app-noticeboard/div[1]/div[1]/div/button");
	
	private WebDriver driver;
	
	public CreateNoticePage(WebDriver driver) {
	
		this.driver = driver;
	}
	

	public CreatePage clickNotice() throws InterruptedException {
		
		clickNoticeBoardLnk();
		
		clickCreateNotice();
		
		
		return new CreatePage(driver);
	}
	
	
    public void clickNoticeBoardLnk() throws InterruptedException {
		
		
		WebElement noticeLnkElement  = driver.findElement(noticeLnk);
		
		if(noticeLnkElement.isDisplayed()) {
			
			noticeLnkElement.click();
		}
		
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
    }
	
   
    
		
	public void clickCreateNotice() throws InterruptedException {
				
				
		WebElement createListingBtnElement  = driver.findElement(createListingBtn);
				
		if(createListingBtnElement.isDisplayed()) {
					
			createListingBtnElement.click();
				
		}
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
	}
		

}
