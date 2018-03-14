package com.gudppl.causes.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Other {

private WebDriver driver;
	
	private By HomeLnk = By.xpath(".//*[@id='navbarSupportedContent']/ul[1]/li[2]/a");
	private By OpportunitiesLnk = By.xpath(".//*[@id='navbarSupportedContent']/ul[1]/li[4]/a");
	private By allCausesLnk = By.xpath("html/body/app-root/div/div[2]/app-all-opportunity/section[1]/app-banner/header/div/div/h1/span[2]");
	private By OtherBtn = By.xpath(".//*[@id='allcauses']/div/div/div[2]/div/span[7]/span");
	

	public Other(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public Other selectOther() throws InterruptedException {
		
		clickHomeLnk();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickOppLnk();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickAllCausesLnk();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		OtherBtnBtn();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		return new Other(driver);
	}
	
	
	public void clickHomeLnk() throws InterruptedException {
		
		WebElement HomeLnkElement = driver.findElement(HomeLnk);
		
		HomeLnkElement.click();
		
		}



	public void clickOppLnk() throws InterruptedException {
		
		WebElement OpportunitiesLnkElement = driver.findElement(OpportunitiesLnk);
		
		OpportunitiesLnkElement.click();
		
	}
	
	public void clickAllCausesLnk() throws InterruptedException {
		
		WebElement allCausesLnkElement = driver.findElement(allCausesLnk);
		
		allCausesLnkElement.click();
	
		
	}
	
	public void OtherBtnBtn() throws InterruptedException {
		
		WebElement OtherBtnBtn = driver.findElement(OtherBtn);
		
		OtherBtnBtn.click();
	
		
	}
}
