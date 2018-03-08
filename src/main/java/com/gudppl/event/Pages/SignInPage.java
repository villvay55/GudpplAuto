package com.gudppl.event.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	private WebDriver driver;
	
	private By emailTextBox = By.xpath("html/body/app-root/div/div[2]/app-home-page-1/section[2]/div/app-login/section/form/div[1]/label");
	
	private By passwordTextBox = By.xpath("html/body/app-root/div/div[2]/app-home-page-1/section[2]/div/app-login/section/form/div[2]/label");
 
	private By loginBtn = By.xpath("html/body/app-root/div/div[2]/app-home-page-1/section[2]/div/app-login/section/form/button");

	//private By errorMesTxt = By.xpath("html/body/app-root/div/div[2]/app-home-page-1/section[2]/div/app-login/section/div[1]/app-display-message/div");

	private By homeLink = By.xpath(".//*[@id='navbarSupportedContent']/ul[1]/li[2]/a");
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUserName(String userName) {
		
		WebElement emailTxtBox  = driver.findElement(emailTextBox);
	
		if(emailTxtBox.isDisplayed()) {
			
			emailTxtBox.sendKeys(userName);
		}
		
	}

	public void enterPassword(String userPassword) {
		
		WebElement passTxtBox = driver.findElement(passwordTextBox);
		
		if(passTxtBox.isDisplayed()) {
			
			passTxtBox.sendKeys(userPassword);
		}
		
	}
	
	public void clickOnSignIn() {
		
		WebElement signInBtn =  driver.findElement(loginBtn);
		
		if(signInBtn.isDisplayed()) {
			
			signInBtn.click();
		}
		
		else System.out.println("Element not found");
		
	}

	public CreatePage verifySigin(String user , String pass) throws InterruptedException {
		enterUserName(user);
		synchronized (driver)
		{
		    driver.wait(1000);
		}
		enterPassword(pass);
		synchronized (driver)
		{
		    driver.wait(1000);
		}
		clickOnSignIn();
		synchronized (driver)
		{
		    driver.wait(18000);
		}
		return  new CreatePage(driver);
		
		
	}
	
	public boolean verifySignInPage() {
		
		WebElement homeLinkElement  = driver.findElement(homeLink);
		boolean status = homeLinkElement.isDisplayed();
		
		return status;
	}


}
