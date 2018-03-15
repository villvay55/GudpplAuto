package com.gudppl.OrgView.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrgSelectionPage{

	
	private By changeDashBoardLnk = By.xpath(".//*[@id='navbarSupportedContent']/ul[2]/li[6]/div/a/i");
	private By selectOrgLnk = By.xpath(".//*[@id='navbarSupportedContent']/ul[2]/li[6]/div/app-switch-account/div/div/a[2]");
	
	
	

	private WebDriver driver;

	public OrgSelectionPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public OrgViewPage viewOrgDetails() throws InterruptedException {
		
		clickChangeDashBoardLnk();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickSelectOrgLnkElement();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		return new OrgViewPage(driver);
	}
	
	public void clickChangeDashBoardLnk() throws InterruptedException {
		
		WebElement changeDashBoardLnkElement = driver.findElement(changeDashBoardLnk);
		
		changeDashBoardLnkElement.click();
		
	}
	
	public void clickSelectOrgLnkElement() throws InterruptedException {
		
		WebElement selectOrgLnkElement = driver.findElement(selectOrgLnk);
		
		selectOrgLnkElement.click();
		
	}
	
}
