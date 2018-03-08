package com.gudppl.organization.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganizationPage {

	
	private By organizationContinueBtn = By.xpath("html/body/app-root/div/div[2]/app-create-organization/div/div/div/div[2]/button[1]");
    private By orgNameTxtBox = By.xpath(".//*[@id='formGroupExampleInput']");
	private By aboutOrgTxtBox = By.xpath(".//*[@id='cke_editor1']/div/div/iframe");
	private By orgInfoContinueBtn = By.xpath("html/body/app-root/div/div[2]/app-organization-info/div/form/button");
	
	private WebDriver driver;

	public CreateOrganizationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public CasusesPage  fillOrganizationDetails(String orgName , String orgAbout) throws InterruptedException {
		
		clickOnOrgContinue();
		
		synchronized (driver)
		
		{
		    driver.wait(3000);
		}
		
		enterOrgName(orgName);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		Select orgCategoryDropDown = new Select(driver.findElement(By.xpath(".//*[@formcontrolname='category']")));
		orgCategoryDropDown.selectByIndex(15);
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		Select orgTypeDropDown = new Select(driver.findElement(By.xpath(".//*[@formcontrolname='type']")));
		orgTypeDropDown.selectByIndex(1);
		
		synchronized (driver)
		
		{
		    driver.wait(3000);
		}
		
		enterOrgAbout(orgAbout);

		synchronized (driver)
		
		{
		    driver.wait(3000);
		}
		clickOnOrgInfoContinue();
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		return new CasusesPage(driver);
		
		
	}
	
	public void enterOrgName(String orgName) {
		
		WebElement orgNameTxtBoxElement  = driver.findElement(orgNameTxtBox);
	
		if(orgNameTxtBoxElement.isDisplayed()) {
			
			orgNameTxtBoxElement.sendKeys(orgName);
		}
		
	}
	
	public void enterOrgAbout(String orgAbout) {
		
		WebElement aboutOrgTxtBoxElement  = driver.findElement(aboutOrgTxtBox);
	
		if(aboutOrgTxtBoxElement.isDisplayed()) {
			
			aboutOrgTxtBoxElement.click();
			aboutOrgTxtBoxElement.sendKeys(orgAbout);
		}
		
	}
	
	public void clickOnOrgContinue() {
		
		WebElement organizationContinueBtnElement =  driver.findElement(organizationContinueBtn);
		
		if(organizationContinueBtnElement.isDisplayed()) {
			
			organizationContinueBtnElement.click();
		}
		
		else System.out.println("Element not found");
		
	}

	public void clickOnOrgInfoContinue() {
		
		WebElement orgInfoContinueBtnElement =  driver.findElement(orgInfoContinueBtn);
		
		if(orgInfoContinueBtnElement.isDisplayed()) {
			
			orgInfoContinueBtnElement.click();
		}
		
		else System.out.println("Element not found");
		
	}
}
