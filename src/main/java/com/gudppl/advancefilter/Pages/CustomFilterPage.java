package com.gudppl.advancefilter.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomFilterPage {

	private By oppLnk = By.xpath(".//*[@id='navbarSupportedContent']/ul[1]/li[4]/a");
	private By filterLnk = By.xpath("html/body/app-root/div/div[2]/app-all-opportunity/section[1]/app-banner/div[1]/a");
	private By fromDateTxtBox = By.xpath("html/body/app-root/div/div[2]/app-all-opportunity/section[1]/app-banner/div[1]/form/div/div[2]/p-calendar/span/input");
	private By toDateTxtBox = By.xpath("html/body/app-root/div/div[2]/app-all-opportunity/section[1]/app-banner/div[1]/form/div/div[3]/p-calendar/span/input");
	private By applyBtn = By.xpath("html/body/app-root/div/div[2]/app-all-opportunity/section[1]/app-banner/div[1]/form/div/div[4]/button");
	
	private WebDriver driver;

	public CustomFilterPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
public void fillSearchDetails() throws InterruptedException {
		
		clickOppLnk();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		//clickShowFilterLnk();
		
		
		/*synchronized (driver)
		{
		    driver.wait(3000);
		}*/
		
		Select dateRangeDropDown = new Select(driver.findElement(By.xpath(".//*[@id='inputState']")));
		dateRangeDropDown.selectByIndex(3);
		
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterFromDate();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		enterToDate();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		clickApplyBtn();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
	}
	
	public void clickOppLnk() throws InterruptedException {
		
		WebElement oppLnkElement = driver.findElement(oppLnk);
		
		oppLnkElement.click();
	
		
	}

	
	public void clickShowFilterLnk() throws InterruptedException {
		
		WebElement filterLnkElement = driver.findElement(filterLnk);
		
		filterLnkElement.click();
	
		
	}


	public void enterFromDate() throws InterruptedException {
		
		WebElement fromDateTxtBoxElement = driver.findElement(fromDateTxtBox);
		
		fromDateTxtBoxElement.click();
	
		
	}

	public void enterToDate() throws InterruptedException {
		
		WebElement toDateTxtBoxElement = driver.findElement(toDateTxtBox);
		
		toDateTxtBoxElement.click();
	
	}
	
	
	public void clickApplyBtn() throws InterruptedException {
		
		WebElement applyBtnElement = driver.findElement(applyBtn);
		
		applyBtnElement.click();
	
		
	}
}
