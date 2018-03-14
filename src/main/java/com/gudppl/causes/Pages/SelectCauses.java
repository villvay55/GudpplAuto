package com.gudppl.causes.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCauses {

	private WebDriver driver;
	
	private By OpportunitiesLnk = By.xpath(".//*[@id='navbarSupportedContent']/ul[1]/li[4]/a");
	private By allCausesLnk = By.xpath("html/body/app-root/div/div[2]/app-all-opportunity/section[1]/app-banner/header/div/div/h1/span[2]");
	private By allCausesBtn = By.xpath(".//*[@id='allcauses']/div/div/div[2]/div/span[1]");
	

	public SelectCauses(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public AnimalSupport selectAllCauses() throws InterruptedException {
		
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
		
		clickallCausesBtn();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		return new AnimalSupport(driver);
	}
	public void clickOppLnk() throws InterruptedException {
		
		WebElement OpportunitiesLnkElement = driver.findElement(OpportunitiesLnk);
		
		OpportunitiesLnkElement.click();
		
	}
	
	public void clickAllCausesLnk() throws InterruptedException {
		
		WebElement allCausesLnkElement = driver.findElement(allCausesLnk);
		
		allCausesLnkElement.click();
	
		
	}
	
	public void clickallCausesBtn() throws InterruptedException {
		
		WebElement allCausesBtnElement = driver.findElement(allCausesBtn);
		
		allCausesBtnElement.click();
	
		
	}
	
}
