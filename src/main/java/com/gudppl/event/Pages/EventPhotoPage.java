package com.gudppl.event.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventPhotoPage {

protected WebDriver driver;
	
	private By imageUploadBtn = By.xpath(".//*[@class='image-upload-box mr-2']/div");
	private By imageSaveBtn = By.xpath(".//*[@id='cropoppimageModal']/div/div/div[3]/button[2]");
	private By eventCreateBtn = By.xpath("html/body/app-root/div/div[2]/app-photos/div[1]/button");
	private By fianlEventTxt = By.xpath("html/body/app-root/div/div[2]/app-view-opportunity/main/div/app-overview/div/div/div/div[1]/div/dl/section[1]/h3");
	private By imageCloseBtn = By.xpath(".//*[@id='cropoppimageModal']/div/div/div[1]/button");
	
	public EventPhotoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void uploadIamge(String imagePath) throws InterruptedException, IOException {
		
		
		WebElement imageUploadBtnElement =  driver.findElement(imageUploadBtn);
		imageUploadBtnElement.click();
		if(imageUploadBtnElement.isDisplayed()) {
			
			imageUploadBtnElement.click();
		}
		
		else System.out.println("image button Element not found");
		
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		Runtime.getRuntime().exec(imagePath);
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		
		clickImageSaveBtn();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickEventCreateBtn();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
	}
	
	public void clickImageSaveBtn() throws InterruptedException, IOException {
		
		
		WebElement imageSaveBtnElement  = driver.findElement(imageSaveBtn);
		
		if(imageSaveBtnElement.isEnabled()){
			
			imageSaveBtnElement.click();
		
		} 
		
		else {
			
			
			WebElement imageCloseBtnElement =  driver.findElement(imageCloseBtn);
			if(imageCloseBtnElement.isDisplayed()) {
				
				imageCloseBtnElement.click();
			}
			
			synchronized (driver)
			{
			    driver.wait(5000);
			}
			
			WebElement imageUploadBtnElement =  driver.findElement(imageUploadBtn);
			imageUploadBtnElement.click();
			if(imageUploadBtnElement.isDisplayed()) {
				
				imageUploadBtnElement.click();
			}
			
			else System.out.println("image button Element not found");
			
			
			synchronized (driver)
			{
			    driver.wait(5000);
			}
			
			Runtime.getRuntime().exec("");
			
			synchronized (driver)
			{
			    driver.wait(5000);
			}
			
			
			clickImageSaveBtn();
			
		}
		//else System.out.println("image button Element not found");
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
	}
	
	public void clickEventCreateBtn() throws InterruptedException {
		
		
		WebElement eventCreateBtnElement  = driver.findElement(eventCreateBtn);
		
		if(eventCreateBtnElement.isDisplayed()) {
			
			eventCreateBtnElement.click();
		}
		
		else System.out.println("image button Element not found");
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
	}
	
	public String photoVerifyPage() {
		
		WebElement fianlEventTxtElement = driver.findElement(fianlEventTxt);
		String strFianlEvent  = fianlEventTxtElement.getText();
		return strFianlEvent;
	}
	
	

	public boolean verifyphotoPage() throws InterruptedException {
		
	String expecteFianlEvent = "About this opportunity";
	return photoVerifyPage().contains(expecteFianlEvent);
		
	}
}
