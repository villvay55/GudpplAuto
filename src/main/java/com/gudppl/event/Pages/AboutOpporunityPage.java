package com.gudppl.event.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AboutOpporunityPage {
	
	private By opporunityDetailsTxtBox = By.xpath(".//*[@title='Rich Text Editor, editor13']");
	private By opporunityDetailBtn = By.xpath("html/body/app-root/div/div[2]/app-about-opportunity/div/form/button");
	
	private By aboutOppTxtBox = By.xpath(".//*[@id='cke_editor1']/div/div/iframe");
	private By volNeedTxtBox = By.xpath(".//*[@id='cke_editor2']/div/div/iframe");
	private By impactSocityTxtBox = By.xpath(".//*[@id='cke_editor3']/div/div/iframe");
	private By volGainTxtBox = By.xpath(".//*[@id='cke_editor4']/div/div/iframe");
	private By volunteeringTxt = By.xpath("html/body/app-root/div/div[2]/app-event-volunteering/div/h1");
			
	private WebDriver driver;

	public AboutOpporunityPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public VolunteeringPage fillOppDetail(String aboutOpp, String volNeed, String impactSocity, String volGain) throws InterruptedException {
		
		enterOppDetails(aboutOpp,volNeed,impactSocity,volGain);
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		clickOpporunityDetailBtn();
		synchronized (driver)
		{
		    driver.wait(6000);
		}	
		return new VolunteeringPage(driver);
	}
	
	
	
	public void enterOppDetails(String aboutOpp, String volNeed, String impactSocity, String volGain) throws InterruptedException {

		synchronized (driver)
		{
		    driver.wait(6000);
		}
		
		WebElement aboutOppTxtBoxElement  = driver.findElement(aboutOppTxtBox);
		
		if(aboutOppTxtBoxElement.isDisplayed()) {
			
			aboutOppTxtBoxElement.click();
			aboutOppTxtBoxElement.sendKeys(aboutOpp);
		}
		
		WebElement volNeedTxtBoxElement  = driver.findElement(volNeedTxtBox);
		
		if(aboutOppTxtBoxElement.isDisplayed()) {
			
			volNeedTxtBoxElement.click();
			volNeedTxtBoxElement.sendKeys(volNeed);
		}
		
		WebElement impactSocityTxtBoxElement  = driver.findElement(impactSocityTxtBox);
		
		if(aboutOppTxtBoxElement.isDisplayed()) {
			
			impactSocityTxtBoxElement.click();
			impactSocityTxtBoxElement.sendKeys(impactSocity);
		}
		
		WebElement volGainTxtBoxElement  = driver.findElement(volGainTxtBox);
		
		if(aboutOppTxtBoxElement.isDisplayed()) {
			
			volGainTxtBoxElement.click();
			volGainTxtBoxElement.sendKeys(volGain);
		}
		
		synchronized (driver)
		{
		    driver.wait(6000);
		}	
			
	}
	
	public void clickOpporunityDetailBtn() {
		
		WebElement oppDetailBtnElement  = driver.findElement(opporunityDetailBtn);
		
		if(oppDetailBtnElement.isDisplayed()) {
			
			oppDetailBtnElement.click();
		}
	}
	
	public String aboutOppVerifyPage() {
		
		WebElement volunteeringTxtElement = driver.findElement(volunteeringTxt);
		String strvolunteeringTxt  = volunteeringTxtElement.getText();
		return strvolunteeringTxt;
	}
	
	

	public boolean verifyAboutOppPage() throws InterruptedException {
		
	String expectedvolunteeringTxt = "Volunteering";
	return aboutOppVerifyPage().contains(expectedvolunteeringTxt);
		
	}

}
