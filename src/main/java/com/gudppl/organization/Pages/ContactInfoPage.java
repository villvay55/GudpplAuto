package com.gudppl.organization.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactInfoPage {

	private By address1TxtBox = By.xpath(".//*[@placeholder='Address line 1']");
	private By address2TxtBox = By.xpath(".//*[@placeholder='Address line 2']");
	private By cityTxtBox = By.xpath(".//*[@placeholder='City here']");
	private By phoneTxtBox = By.xpath(".//*[@id='signupS1Phone']");
	private By emailTxtBox = By.xpath(".//*[@placeholder='info@organization.com']");
	private By stateTxtBox = By.xpath(".//*[@placeholder='State here']");
	private By postalTxtBox = By.xpath(".//*[@placeholder='Postal code here']");
	private By contactInfoContinueBtn = By.xpath("html/body/app-root/div/div[2]/app-contact-info/div/form/button");
	
	
	private WebDriver driver;
	
	public ContactInfoPage(WebDriver driver) {
	
		this.driver = driver;
	}

	public OrganizationPhotoPage fillContactInfo(String address1 , String address2 ,String phone ,  String city  , String email , String state ,  String postal ) throws InterruptedException {
		
		
		Select orgCountryDropDown = new Select(driver.findElement(By.xpath(".//*[@id='exampleFormControlSelect1']")));
		orgCountryDropDown.selectByVisibleText("United States");
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		
		enterAddress1(address1);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterAddress2(address2);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterPhone(phone);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterCity(city);
		
			synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterEmail(email);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterState(state);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		
		enterPostal(postal);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		
		clickOnContactInfoContinue();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		return new OrganizationPhotoPage(driver);
	}
	
	public void enterAddress1(String address1) {
		
		WebElement address1TxtBoxElement  = driver.findElement(address1TxtBox);
	
		if(address1TxtBoxElement.isDisplayed()) {
			
			address1TxtBoxElement.sendKeys(address1);
		}
		
	}
	
	public void enterAddress2(String address2) {
	
	WebElement address2TxtBoxElement  = driver.findElement(address2TxtBox);

	if(address2TxtBoxElement.isDisplayed()) {
		
		address2TxtBoxElement.sendKeys(address2);
	}
	
}
	
	public void enterCity(String city) {
		
	WebElement cityTxtBoxElement  = driver.findElement(cityTxtBox);

	if(cityTxtBoxElement.isDisplayed()) {
		
		cityTxtBoxElement.sendKeys(city);
	}
	
}
	
	public void enterPhone(String phone) {
		
		WebElement phoneTxtBoxElement  = driver.findElement(phoneTxtBox);

		if(phoneTxtBoxElement.isDisplayed()) {
			
			phoneTxtBoxElement.sendKeys(phone);
		}
		
	}
	
	
	public void enterEmail(String email) {
		
		WebElement emailTxtBoxElement  = driver.findElement(emailTxtBox);

		if(emailTxtBoxElement.isDisplayed()) {
			
			emailTxtBoxElement.sendKeys(email);
		}
		
	}
	
	public void enterState(String state) {
		
		WebElement stateTxtBoxElement  = driver.findElement(stateTxtBox);

		if(stateTxtBoxElement.isDisplayed()) {
			
			stateTxtBoxElement.sendKeys(state);
		}
		
	}
	
	public void enterPostal(String postal) {
		
		WebElement postalTxtBoxElement  = driver.findElement(postalTxtBox);

		if(postalTxtBoxElement.isDisplayed()) {
			
			postalTxtBoxElement.sendKeys(postal);
		}
		
	}
	
	public void clickOnContactInfoContinue() {
		
		WebElement contactInfoContinueBtnElement =  driver.findElement(contactInfoContinueBtn);
		
		if(contactInfoContinueBtnElement.isDisplayed()) {
			
			contactInfoContinueBtnElement.click();
		}
		
		else System.out.println("Element not found");
		
	}
}
