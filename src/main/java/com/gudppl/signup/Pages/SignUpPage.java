package com.gudppl.signup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	
	private By firstNameTxtBox = By.xpath(".//*[@id='signupS1FirstName']");
	private By lastNameTxtBox = By.xpath(".//*[@id='signupS1LastName']");
	private By emailTxtBox = By.xpath(".//*[@id='signupS1Email']");
	private By passwordTxtBox = By.xpath(".//*[@id='exampleInputPassword2']");
	private By phoneTxtBox = By.xpath("html/body/app-root/div/div[2]/app-step1/section/form/div/div/div[5]/div/div/input");
	private By birthdayTxtBox = By.xpath("html/body/app-root/div/div[2]/app-step1/section/form/div/div/div[8]/div/p-calendar/span/input");
	private By signBtn = By.xpath("html/body/app-root/div/div[2]/app-step1/section/form/button");
	
	
	
	private WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public SelectCauses fillSignUpDetails(String firstName, String lastName,String email,String password, String phone,String birthday) throws InterruptedException {
		
		enterfirstName(firstName);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterlastName(lastName);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterEmail(email);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterPassword(password);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterPhone(phone);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterBirthday(birthday);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		ClickOnSignUp();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		return new SelectCauses(driver);
	}
	
	public void enterfirstName(String firstName) {
		
		WebElement firstNameTxtBoxElement  = driver.findElement(firstNameTxtBox);
	
		if(firstNameTxtBoxElement.isDisplayed()) {
			
			firstNameTxtBoxElement.sendKeys(firstName);
		}
		
	}
	public void enterlastName(String lastName){
			
			WebElement lastNameTxtBoxElement  = driver.findElement(lastNameTxtBox);
		
			if(lastNameTxtBoxElement.isDisplayed()) {
				
				lastNameTxtBoxElement.sendKeys(lastName);
			}
			
		}
	
	public void enterEmail(String email) {
		
		WebElement emailTxtBoxElement  = driver.findElement(emailTxtBox);
	
		if(emailTxtBoxElement.isDisplayed()) {
			
			emailTxtBoxElement.sendKeys(email);
		}
		
	}
	
	public void enterPassword(String password) {
		
		WebElement passwordTxtBoxElement  = driver.findElement(passwordTxtBox);
	
		if(passwordTxtBoxElement.isDisplayed()) {
			
			passwordTxtBoxElement.sendKeys(password);
		}
		
	}
	
	public void enterPhone(String phone) {
		
		WebElement phoneTxtBoxElement  = driver.findElement(phoneTxtBox);
	
		if(phoneTxtBoxElement.isDisplayed()) {
		
			phoneTxtBoxElement.sendKeys(phone);
		}
		
	}

	
	public void enterBirthday(String birthday) {
		
		WebElement birthdayTxtBoxElement  = driver.findElement(birthdayTxtBox);
	
		if(birthdayTxtBoxElement.isDisplayed()) {
			
			birthdayTxtBoxElement.click();
			birthdayTxtBoxElement.sendKeys(birthday);
		}
		
	}
	
	public void ClickOnSignUp() {
		
		WebElement signBtnElement  = driver.findElement(signBtn);
	
		if(signBtnElement.isDisplayed()) {
			
			signBtnElement.click();
			
		}
		
	}
	
	
	
		
}


