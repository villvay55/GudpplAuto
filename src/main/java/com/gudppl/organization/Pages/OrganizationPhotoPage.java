package com.gudppl.organization.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrganizationPhotoPage {
	
	private WebDriver driver;
	
	private By imageUploadBtn = By.xpath(".//*[@id='dropdownMenuButton']");
	private By uploadLogoBtn = By.xpath("html/body/app-root/div/div[2]/app-upload-logo/div[1]/div[2]/div/div/div/div/a[1]/label/span");
	private By orgCreateBtn = By.xpath("html/body/app-root/div/div[2]/app-upload-logo/div[1]/button");
	
	public OrganizationPhotoPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void uploadIamge() throws InterruptedException, IOException {
		
		WebElement imageUploadBtnElement  = driver.findElement(imageUploadBtn);
		
		if(imageUploadBtnElement.isDisplayed()) {
			
			imageUploadBtnElement.click();
		}
		
		else System.out.println("image button Element not found");
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		WebElement uploadLogoBtnElement  = driver.findElement(uploadLogoBtn);
		
		if(uploadLogoBtnElement.isDisplayed()) {
			
			uploadLogoBtnElement.click();
		}
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		Runtime.getRuntime().exec("E:\\image\\EventIamgeUpload.exe");
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickOrgCreateBtn();
	}
	
	public void clickOrgCreateBtn() throws InterruptedException {
		
		
		WebElement orgCreateBtnElement  = driver.findElement(orgCreateBtn);
		
		if(orgCreateBtnElement.isDisplayed()) {
			
			orgCreateBtnElement.click();
		}
		
		else System.out.println("image button Element not found");
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
	}

}
