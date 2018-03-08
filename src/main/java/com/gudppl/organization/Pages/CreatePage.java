package com.gudppl.organization.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePage {
	
	private By createBtn = By.xpath(".//*[@id='navbarSupportedContent']/a");
	private By createOrganizationLbl = By.xpath("html/body/app-root/div/div[2]/app-create-organization/div/div/div/h1");
	private By createOrganizationBtn = By.xpath("html/body/app-root/div/div[2]/app-create/div[1]/div[1]/div/div/button");
	private WebDriver driver;
	
	public CreatePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public CreateOrganizationPage clickCreateBtn() throws InterruptedException {
		
		WebElement createBtnElement = driver.findElement(createBtn);
		createBtnElement.click();
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		clickCreateOrganizationBtn();
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		return  new CreateOrganizationPage(driver);
	}
	
	public void clickCreateOrganizationBtn() throws InterruptedException {
		
		WebElement createOrganizationBtnElement = driver.findElement(createOrganizationBtn);
		createOrganizationBtnElement.click();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
	}

	public String organizationVerifyPage() {
		
		WebElement createOrganizationLblElement = driver.findElement(createOrganizationLbl);
		String strcreateOrganizationLbl  = createOrganizationLblElement.getText();
		
		return strcreateOrganizationLbl;
	}
	
	

	public boolean verifyCreatePage() throws InterruptedException {

	String expectedOrganizationTxt = "Create an organization";
	return organizationVerifyPage().contains(expectedOrganizationTxt);
		
	}
}


