package com.gudppl.event.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePage {
	
	private By createBtn = By.xpath(".//*[@id='navbarSupportedContent']/a");
	private By createEventLbl = By.xpath("html/body/app-root/div/div[2]/app-create-event/div/div/div/h2");
	private By createEventBtn = By.xpath("html/body/app-root/div/div[2]/app-create/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div/button");
	private WebDriver driver;
	
	public CreatePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public CreateEventPage clickCreateBtn() throws InterruptedException {
		
		WebElement createBtnElement = driver.findElement(createBtn);
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		createBtnElement.click();
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		clickCreateEventBtn();
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		return  new CreateEventPage(driver);
	}
	
	public void clickCreateEventBtn() throws InterruptedException {
		
		WebElement createEventBtnElement = driver.findElement(createEventBtn);
		createEventBtnElement.click();
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
	}

	public String eventVerifyPage() {
		
		WebElement createEventLblElement = driver.findElement(createEventLbl);
		String strCreateEventLbl  = createEventLblElement.getText();
		
		return strCreateEventLbl;
	}
	
	

	public boolean verifyCreatePage() throws InterruptedException {
		
	//clickCreateBtn();
	String expectedEventTxt = "One day event";
	return eventVerifyPage().contains(expectedEventTxt);
		
	}
}


