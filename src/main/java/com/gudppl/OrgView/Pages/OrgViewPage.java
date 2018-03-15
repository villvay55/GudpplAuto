package com.gudppl.OrgView.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrgViewPage {

	private By eventCreateLnk = By.xpath("html/body/app-root/div/div[2]/app-organization-dashboard/main/div/div/div[1]/app-opportunities-card/div/div/div[3]/div/a[1]/p");
	private By hoursPledgedLnk = By.xpath("html/body/app-root/div/div[2]/app-organization-dashboard/main/div/div/div[1]/app-opportunities-card/div/div/div[3]/div/a[2]/p");
	private By hoursVerifiedLnk = By.xpath("html/body/app-root/div/div[2]/app-organization-dashboard/main/div/div/div[1]/app-opportunities-card/div/div/div[3]/div/a[3]/p");
	private By hoursUnverifiedLnk = By.xpath("html/body/app-root/div/div[2]/app-organization-dashboard/main/div/div/div[1]/app-opportunities-card/div/div/div[3]/div/a[4]/p");
	private By oppTab = By.xpath("html/body/app-root/div/div[2]/app-organization-dashboard/main/app-oraganization-change/div/div/ul/li[2]/a");
	private WebDriver driver;
	
	public OrgViewPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void OrgDetails() throws InterruptedException {
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickOnOppTab();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		List<WebElement> row = driver.findElements(By.xpath(".//*[tbody]/tbody/tr"));
		for(WebElement data :row ){
		System.out.println(data.getText());
		}

		
	}

	
	public String eventCreateVerifyLnk() {
		
		WebElement eventCreateLnkElement = driver.findElement(eventCreateLnk);
		String eventCreateLnkElementTxt  = eventCreateLnkElement.getText();
		return eventCreateLnkElementTxt;
	}
	
	public String hoursPledgedVerifyLnk() {
		
		WebElement hoursPledgedLnkElement = driver.findElement(hoursPledgedLnk);
		String hoursPledgedLnkElementTxt  = hoursPledgedLnkElement.getText();
		return hoursPledgedLnkElementTxt;
	}
	
	
	public String hoursVerifiedLnk() {
		
		WebElement hoursVerifiedLnkElement = driver.findElement(hoursVerifiedLnk);
		String hoursVerifiedLnkElementTxt  = hoursVerifiedLnkElement.getText();
		return hoursVerifiedLnkElementTxt;
	}
	
	public String hoursUnverifiedLnk() {
		
		WebElement hoursUnverifiedLnkElement = driver.findElement(hoursUnverifiedLnk);
		String hoursUnverifiedLnkElementTxt  = hoursUnverifiedLnkElement.getText();
		return hoursUnverifiedLnkElementTxt;
	}

	public boolean verifyEventCreateLnk() throws InterruptedException {
		
	String expectedEventCreateLnk = "2";
	return eventCreateVerifyLnk().contains(expectedEventCreateLnk);
		
	}
	
	public boolean verifyHoursPledgedLnk() throws InterruptedException {
		
		String expectedHoursPledgedLnk = "0s";
		return hoursPledgedVerifyLnk().contains(expectedHoursPledgedLnk);
			
		}
	
	public boolean verifyHoursVerifiedLnk() throws InterruptedException {
		
		String expectedHoursVerifiedLnk = "0";
		return hoursVerifiedLnk().contains(expectedHoursVerifiedLnk);
			
		}
	
	public boolean verifyHoursUnverifiedLnk() throws InterruptedException {
		
		String expectedHoursUnverifiedLnk = "0";
		return hoursUnverifiedLnk().contains(expectedHoursUnverifiedLnk);
			
		}
	
	public void clickOnOppTab() throws InterruptedException {
		
		WebElement oppTabElement = driver.findElement(oppTab);
		
		oppTabElement.click();
		
	}
	
	

}
