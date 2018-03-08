package com.gudppl.event.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CasusesPage {
	
	private By enviromentCauseBtn = By.xpath("html/body/app-root/div/div[2]/app-causes/div/div[2]/div/label[1]/span");
	private By causesContinueBtn = By.xpath("html/body/app-root/div/div[2]/app-causes/div/button");
	private By aboutOpportunityTxt = By.xpath("html/body/app-root/div/div[2]/app-about-opportunity/div/h1");
	
	private WebDriver driver;

	public CasusesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public AboutOpporunityPage selectCause() throws InterruptedException {
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		selectCausebtn();
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		clickOnCauseContinue();
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		return new AboutOpporunityPage(driver);
	}
	
	
	
	
	public void clickOnCauseContinue() {
		
		WebElement eventContinueBtnElement =  driver.findElement(causesContinueBtn);
		
		if(eventContinueBtnElement.isDisplayed()) {
			
			eventContinueBtnElement.click();
		}
		
		else System.out.println("Element not found");
		
	}
	
	public void selectCausebtn() {
		
		WebElement eventCauseBtnElement =  driver.findElement(enviromentCauseBtn);
		
		if(eventCauseBtnElement.isDisplayed()) {
			
			eventCauseBtnElement.click();
		}
		
		else System.out.println("Element not found");
	}
	
	public String casusesVerifyPage() {
		
		WebElement aboutOpportunityTxtElement = driver.findElement(aboutOpportunityTxt);
		String straboutOpportunityTxt  = aboutOpportunityTxtElement.getText();
		return straboutOpportunityTxt;
	}
	
	

	public boolean verifyCasusesPage() throws InterruptedException {
		
	String expectedAboutOppTxt = "About opportunity";
	return casusesVerifyPage().contains(expectedAboutOppTxt);
		
	}
}
