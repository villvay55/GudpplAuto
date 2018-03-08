package com.gudppl.notice.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePage {
	
	private By noticeTitleTxtBox = By.xpath("html/body/app-root/div/div[2]/app-create-notice/div[1]/form/div[1]/input");
	private By noticeDesciptionTxtBox = By.xpath(".//*[@id='cke_editor1']");
	private By noticeCausesBtn = By.xpath("html/body/app-root/div/div[2]/app-create-notice/div[1]/form/div[3]/div/label[2]/span");
	private By imageUploadBtn = By.xpath(".//*[@id='image-upload']");
	private By submitNoticeBtn = By.xpath("html/body/app-root/div/div[2]/app-create-notice/div[1]/form/div[5]/button[1]");
	
	private WebDriver driver;
	
	public CreatePage(WebDriver driver) {
	
		this.driver = driver;
	}

	
	public void createNotice(String noticeTitle, String noticeDes , String imagePath) throws InterruptedException, IOException {
		
		enterNoticeTitle(noticeTitle);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterEventName(noticeDes);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		clickOnCauseContinue();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		clickImageUploadBtn();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		Runtime.getRuntime().exec(imagePath);
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		//clickOnSubmit();
	
		WebElement element = driver.findElement(By.xpath("html/body/app-root/div/div[2]/app-create-notice/div[1]/form/div[5]/button[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}

		
		
	}
	public void enterNoticeTitle(String noticeTitle) {
		
		WebElement noticeTitleTxtBoxElement  = driver.findElement(noticeTitleTxtBox);
		
		if(noticeTitleTxtBoxElement.isDisplayed()) {
				
			noticeTitleTxtBoxElement.click();
			noticeTitleTxtBoxElement.sendKeys(noticeTitle);
		}	
		
	}
	
	
	public void enterEventName(String noticeDes) {
		
		WebElement noticeDesciptionTxtBoxElement  = driver.findElement(noticeDesciptionTxtBox);
		
		if(noticeDesciptionTxtBoxElement.isDisplayed()) {
				
			noticeDesciptionTxtBoxElement.click();
			noticeDesciptionTxtBoxElement.sendKeys(noticeDes);
		}	
		
	}
	
	
	public void clickOnCauseContinue() {
		
		WebElement noticeCausesBtnnElement =  driver.findElement(noticeCausesBtn);
		
		if(noticeCausesBtnnElement.isDisplayed()) {
			
			noticeCausesBtnnElement.click();
		}
		
		else System.out.println("Element not found");
		
	}
	
	public void clickImageUploadBtn() throws InterruptedException, IOException {
		
		
		WebElement imageUploadBtnElement  = driver.findElement(imageUploadBtn);
		
		if(imageUploadBtnElement.isEnabled()){
			
			imageUploadBtnElement.click();
		
		} 
		
	}
	
	public void clickOnSubmit() {
		
		WebElement submitNoticeBtnElement =  driver.findElement(submitNoticeBtn);
		
		if(submitNoticeBtnElement.isDisplayed()) {
			
			submitNoticeBtnElement.click();
		}
		
		else System.out.println("Element not found");
		
	}
}
