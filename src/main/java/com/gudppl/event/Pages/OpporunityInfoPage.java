package com.gudppl.event.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpporunityInfoPage {

protected WebDriver driver;
	
private By oppInfoDateTxtBox = By.xpath("html/body/app-root/div/div[2]/app-opportunity-info/div/form/div[1]/div/div/div[1]/p-calendar/span/input");
private By oppInfoStartTxtBox = By.xpath("html/body/app-root/div/div[2]/app-opportunity-info/div/form/div[1]/div/div/div[2]/div/div[1]/p-calendar/span/input");
private By oppInfoEndTxtBox = By.xpath("html/body/app-root/div/div[2]/app-opportunity-info/div/form/div[1]/div/div/div[2]/div/div[2]/p-calendar/span/input");
private By oppInfoVolunterNoTxtBox = By.xpath(".//*[@id='formGroupExampleInput']");
private By oppInfoLocationtTxtBox = By.xpath("html/body/app-root/div/div[2]/app-opportunity-info/div/form/div[2]/div[1]/div/div/div/input");
private By OpporunityInfoBtn = By.xpath("html/body/app-root/div/div[2]/app-opportunity-info/div/form/button");
private By photoTxt = By.xpath("html/body/app-root/div/div[2]/app-photos/div[1]/h2");


public OpporunityInfoPage(WebDriver driver) {
		this.driver = driver;
	}


public EventPhotoPage fillOppInfoDetails(String oppInfoDate, String oppInfoStart, String oppInfoEnd,
		String oppInfoVolunterNo, String oppInfoLocationt) throws InterruptedException {
	
	WebElement oppInfoDateTxtBoxElement =  driver.findElement(oppInfoDateTxtBox);
	
	if(oppInfoDateTxtBoxElement.isDisplayed()) {
		
		oppInfoDateTxtBoxElement.click();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		oppInfoDateTxtBoxElement.sendKeys(oppInfoDate);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
	}
	
	
	
	WebElement oppInfoStartTxtBoxElement =  driver.findElement(oppInfoStartTxtBox);
	
	if(oppInfoStartTxtBoxElement.isDisplayed()) {
		
		oppInfoStartTxtBoxElement.sendKeys(oppInfoStart);
	}
	
	else System.out.println("Element not found");
	
	synchronized (driver)
	{
	    driver.wait(3000);
	}
	
	WebElement oppInfoEndTxtBoxElement =  driver.findElement(oppInfoEndTxtBox);
	
	if(oppInfoEndTxtBoxElement.isDisplayed()) {
		
		oppInfoEndTxtBoxElement.sendKeys(oppInfoEnd);
	}
	
	
	else System.out.println("Element not found");
	
	synchronized (driver)
	{
	    driver.wait(3000);
	}
	
	WebElement oppInfoVolunterNoTxtBoxElement =  driver.findElement(oppInfoVolunterNoTxtBox);
	
	if(oppInfoVolunterNoTxtBoxElement.isDisplayed()) {
		
		oppInfoVolunterNoTxtBoxElement.sendKeys(oppInfoVolunterNo);
	}
	
	else System.out.println("Element not found");

	
	driver.findElement(By.xpath("html/body/app-root/div/div[2]/app-opportunity-info/div/form/div[2]/div[1]/div/div/div/input")).sendKeys(oppInfoLocationt);
	synchronized (driver)
	{
	    driver.wait(3000);
	}
	
	clickOpporunityInfoBtn();
	
	synchronized (driver)
	{
	    driver.wait(3000);
	}
	
	return new EventPhotoPage(driver);
	
	
}

	public void clickOpporunityInfoBtn() throws InterruptedException {
	
	WebElement OpporunityInfoBtnElement  = driver.findElement(OpporunityInfoBtn);
	
	if(OpporunityInfoBtnElement.isDisplayed()) {
		
		OpporunityInfoBtnElement.click();
	}
	
	synchronized (driver)
	{
	    driver.wait(3000);
	}
	
	}
	
	public String opporunityInfoVerifyPage() {
		
		WebElement photoTxtElement = driver.findElement(photoTxt);
		String strPhotoTxt  = photoTxtElement.getText();
		return strPhotoTxt;
	}
	
	

	public boolean verifyOpporunityInfoPage() throws InterruptedException {
		
	String expectePhotoTxt = "Photos";
	return opporunityInfoVerifyPage().contains(expectePhotoTxt);
		
	}


}
	
	

