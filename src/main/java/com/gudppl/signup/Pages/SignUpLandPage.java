package com.gudppl.signup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpLandPage {

	private By signUpLnk = By.xpath(".//*[text()='Sign up']");
	private By singUpEmail = By.xpath("html/body/app-root/div/div[2]/app-signup/section/a[2]");
	private By singUpFaceBook = By.xpath("html/body/app-root/div/div[2]/app-signup/section/a[1]");
	
	private WebDriver driver;
	
	public SignUpLandPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public SignUpPage signLand() throws InterruptedException{
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		ClickOnSignUpLnk();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		ClickOnSignUpEmail();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		return new SignUpPage(driver);
	
	}
	
	
	public void ClickOnSignUpLnk() {
		
		WebElement signUpLnkElement  = driver.findElement(signUpLnk);
	
		if(signUpLnkElement.isDisplayed()) {
			
			signUpLnkElement.click();
			
		}
		
	}
	
	public void ClickOnSignUpEmail() {
		
		WebElement singUpEmailElement  = driver.findElement(singUpEmail);
	
		if(singUpEmailElement.isDisplayed()) {
			
			singUpEmailElement.click();
			
		}
		
	}
	
	public void ClickOnSignUpFaceBook() {
		
		WebElement singUpFaceBookElement  = driver.findElement(singUpFaceBook);
	
		if(singUpFaceBookElement.isDisplayed()) {
			
			singUpFaceBookElement.click();
			
		}
		
	}
	
	
}
