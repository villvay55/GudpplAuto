package com.gudppl.gudstories.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gudppl.gudstories.Pages.CreatePage;

public class CreateStoryPage {

	
	private By storyLnk = By.xpath(".//*[@id='navbarSupportedContent']/ul[1]/li[5]/a");
	private By createStoryBtn = By.xpath("html/body/app-root/div/div[2]/app-gud-stories/div/div/div[1]/div/div/button");
	
	private WebDriver driver;
	
	public CreateStoryPage(WebDriver driver) {
	
		this.driver = driver;
	}
	

	public CreatePage clickStory() throws InterruptedException {
		
		clickStoryLnk();
		
		clickCreateStory();
		
		
		return new CreatePage(driver);
	}
	
	
    public void clickStoryLnk() throws InterruptedException {
		
		
		WebElement storyLnkElement  = driver.findElement(storyLnk);
		
		if(storyLnkElement.isDisplayed()) {
			
			storyLnkElement.click();
		}
		
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
    }
	
   
    
		
	public void clickCreateStory() throws InterruptedException {
				
				
		WebElement createStoryBtnElement  = driver.findElement(createStoryBtn);
				
		if(createStoryBtnElement.isDisplayed()) {
					
			createStoryBtnElement.click();
				
		}
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
	}
		
}
