package com.gudppl.event.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateEventPage {
	
	private By organizationTxtBox = By.xpath(".//*[@id='exampleFormControlSelect1']");
	private By eventNameTxtBox = By.xpath(".//*[@id='exampleFormControlTextarea1']");
	private By eventContinueBtn = By.xpath("html/body/app-root/div/div[2]/app-create-event/div/div/div/form/div[3]/button[1]");
	private By causesTxt = By.xpath("html/body/app-root/div/div[2]/app-causes/div/h1");
	
	private WebDriver driver;
	
	public CreateEventPage(WebDriver driver) {
		this.driver=driver;
	} 

	
	public CasusesPage fillEventDetails(String orgName, String eventName) throws InterruptedException {
		
		
		
		
		enterOrgName();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterEventName(eventName);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		clickOnEventContinue();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		return  new CasusesPage(driver);
	}
		
		//WebElement createBtnElement = driver.findElement(createBtn);
	

	
	public void enterOrgName() {
		
		WebElement organizationTxtBoxElement  = driver.findElement(organizationTxtBox);
	
		if(organizationTxtBoxElement.isEnabled()) {
			
			Select orgNameDropDown = new Select(driver.findElement(By.xpath(".//*[@id='exampleFormControlSelect1']")));
			orgNameDropDown.selectByIndex(1);
			
		}
		
	}
	public void enterEventName(String eventName) {
			
		WebElement eventNameTxtBoxElement  = driver.findElement(eventNameTxtBox);
		
		if(eventNameTxtBoxElement.isDisplayed()) {
				
			eventNameTxtBoxElement.sendKeys(eventName);
		}	
		
	}
	
	public void clickOnEventContinue() {
		
		WebElement eventContinueBtnElement =  driver.findElement(eventContinueBtn);
		
		if(eventContinueBtnElement.isDisplayed()) {
			
			eventContinueBtnElement.click();
		}
		
		else System.out.println("Element not found");
		
	}
	

	public String eventDetailsVerifyPage() {
		
		WebElement causesTxtElement = driver.findElement(causesTxt);
		String strcausesTxt  = causesTxtElement.getText();
		return strcausesTxt;
	}
	
	

	public boolean verifyCreatePage() throws InterruptedException {
		
	String expectedcausesTxt = "Causes";
	return eventDetailsVerifyPage().contains(expectedcausesTxt);
		
	}



}
