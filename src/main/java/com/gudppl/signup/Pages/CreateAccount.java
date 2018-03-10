package com.gudppl.signup.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount {

	private WebDriver driver;
	private By imageUploadBtn = By.xpath("html/body/app-root/div/div[2]/app-step3/section/form/label/span/img");
	private By imageSaveBtn = By.xpath(".//*[@id='propiccropModal']/div/div/div[2]/button[2]");
	private By eventCreateBtn = By.xpath("html/body/app-root/div/div[2]/app-step3/section/form/div/button");
	
	
	public CreateAccount(WebDriver driver) {
		
		this.driver = driver;
	}

	
	public void createAccount() throws InterruptedException, IOException {
		
		clickUploadIamge();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		Runtime.getRuntime().exec("F:\\image\\ImageNoticeUpload\\ListingFundIamgeUpload1.exe");
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		
		clickImageSave();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		
		clickCreateBtn();
		
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
	}
	
	
	public void clickUploadIamge() throws InterruptedException, IOException {
		
		
		WebElement imageUploadBtnElement =  driver.findElement(imageUploadBtn);
	
		if(imageUploadBtnElement.isDisplayed()) {
			
			imageUploadBtnElement.click();
		}
}
	
	public void clickImageSave() throws InterruptedException, IOException {
		
		
		WebElement imageSaveBtnElement =  driver.findElement(imageSaveBtn);
	
		if(imageSaveBtnElement.isDisplayed()) {
			
			imageSaveBtnElement.click();
		}
	}
	
	public void clickCreateBtn() throws InterruptedException, IOException {
		
		
		WebElement eventCreateBtnElement =  driver.findElement(eventCreateBtn);
	
		if(eventCreateBtnElement.isDisplayed()) {
			
			eventCreateBtnElement.click();
		}
	}
}