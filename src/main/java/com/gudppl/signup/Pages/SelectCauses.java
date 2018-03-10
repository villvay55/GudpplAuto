package com.gudppl.signup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCauses {

	private WebDriver driver;
	private By selectCauses = By.xpath("html/body/app-root/div/div[2]/app-step2/section/form/div[1]/label[3]/span");
	private By continueBtn = By.xpath("html/body/app-root/div/div[2]/app-step2/section/form/div[2]/button[1]");
	private By skipBtn = By.xpath("html/body/app-root/div/div[2]/app-step2/section/form/div[2]/button[2]");
	
	
	
	
	public SelectCauses(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public CreateAccount selectCauses() throws InterruptedException {
		
		ClickOnCauses();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		
		ClickOnContinue();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		return new CreateAccount(driver);
	}
	
	
	public void ClickOnCauses() {
		
		WebElement selectCausesElement  = driver.findElement(selectCauses);
	
		if(selectCausesElement.isDisplayed()) {
			
			selectCausesElement.click();
			
		}
		
	}
	
	public void ClickOnContinue() {
		
		WebElement continueBtnElement  = driver.findElement(continueBtn);
	
		if(continueBtnElement.isDisplayed()) {
			
			continueBtnElement.click();
			
		}
		
	}
	
	public void ClickOnSkip() {
		
		WebElement skipBtnElement  = driver.findElement(skipBtn);
	
		if(skipBtnElement.isDisplayed()) {
			
			skipBtnElement.click();
			
		}
		
	}

}
