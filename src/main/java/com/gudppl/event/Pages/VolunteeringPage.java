package com.gudppl.event.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VolunteeringPage {
	
	private By volunteersCheckBox = By.xpath("html/body/app-root/div/div[2]/app-event-volunteering/div/div[2]/div/form/div/div[1]/label");
	private By volunteersContineBtn = By.xpath("html/body/app-root/div/div[2]/app-event-volunteering/div/button");
	private By oppInfoTxt = By.xpath("html/body/app-root/div/div[2]/app-opportunity-info/div/h1");
	
	protected WebDriver driver;
	
	public VolunteeringPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public OpporunityInfoPage fillVolunteersDetails() throws InterruptedException {
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		selectVolunteerType();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		clickOnVolunteersContinue();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		return new OpporunityInfoPage(driver);
	}

	public void selectVolunteerType() {
		
		WebElement volunteerTypeCheckBoxElement  = driver.findElement(volunteersCheckBox);
		
		if(!volunteerTypeCheckBoxElement.isSelected()) {
			
			volunteerTypeCheckBoxElement.click();
		}
		
	}
	
	public void clickOnVolunteersContinue() {
		
		WebElement volunteersContinueBtnElement =  driver.findElement(volunteersContineBtn);
		
		if(volunteersContinueBtnElement.isDisplayed()) {
			
			volunteersContinueBtnElement.click();
		}
		
		else System.out.println("Element not found");
		
	}
	
	public String volunteeringVerifyPage() {
		
		WebElement oppInfoTxtElement = driver.findElement(oppInfoTxt);
		String strOppInfoTxt  = oppInfoTxtElement.getText();
		return strOppInfoTxt;
	}
	
	

	public boolean verifyVolunteeringPage() throws InterruptedException {
		
	String expectedoppInfoTxt = "Opportunity info";
	return volunteeringVerifyPage().contains(expectedoppInfoTxt);
		
	}
}
