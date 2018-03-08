package com.gudppl.listing.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateListingPage {
	
	private By listingTitleTxtBox = By.xpath("html/body/app-root/div/div[2]/app-funds/div[1]/form/div[2]/input");
	private By listingLocationTxtBox = By.xpath("html/body/app-root/div/div[2]/app-funds/div[1]/form/div[3]/div[1]/input");
	private By contactNumberTxtBox = By.xpath(".//*[@id='inputEmail4']");
	private By aboutOppTxtBox = By.xpath(".//*[@id='cke_editor1']/div/div/iframe");
	private By peopleCauseBtn = By.xpath("html/body/app-root/div/div[2]/app-funds/div[1]/form/div[8]/div/div/label[2]/span");
	private By imageUploadBtn = By.xpath(".//*[@id='image-upload']");
	private By imageSaveBtn = By.xpath(".//*[@id='cropoppimageModal']/div/div/div[3]/button[2]");
	private By listingCreateBtn = By.xpath("html/body/app-root/div/div[2]/app-funds/div[1]/form/div[10]/button");
	
private WebDriver driver;
	
	public CreateListingPage(WebDriver driver) {
	
		this.driver = driver;
	}

	public void fillListingDetails(String selectOrg, String title , String location , String contactNo , String aboutListing,  String imagePath) throws InterruptedException, IOException {
		
		Select listingOrgCountryDropDown = new Select(driver.findElement(By.xpath(".//*[@id='exampleFormControlSelect1']")));
		listingOrgCountryDropDown.selectByIndex(0);
		
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		
		enterTitle(title);
		
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		
		enterLocation(location);
		
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		
		enterContactNo(contactNo);
		
		synchronized (driver)
		{
		    driver.wait(6000);
		}
		
		enterAboutListing(aboutListing);
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		selectCausebtn();
		
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		
		WebElement imageUploadBtnElement =  driver.findElement(imageUploadBtn);
		imageUploadBtnElement.click();
		if(imageUploadBtnElement.isDisplayed()) {
			
			imageUploadBtnElement.click();
		}
		
		else System.out.println("image button Element not found");
		
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		Runtime.getRuntime().exec(imagePath);
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickImageSaveBtn();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		clickListingCreateBtn();
	}

    public void enterTitle(String title) {
		
		WebElement listingTitleTxtBoxElement  = driver.findElement(listingTitleTxtBox);

		if(listingTitleTxtBoxElement.isDisplayed()) {
			
			listingTitleTxtBoxElement.sendKeys(title);
		}
		
	}
    
    public void enterLocation(String location) {
		
		WebElement listingLocationTxtBoxElement  = driver.findElement(listingLocationTxtBox);

		if(listingLocationTxtBoxElement.isDisplayed()) {
			
			listingLocationTxtBoxElement.sendKeys(location);
		}
		
	}
    
    public void enterContactNo(String contactNo) {
		
		WebElement contactNumberTxtBoxElement  = driver.findElement(contactNumberTxtBox);

		if(contactNumberTxtBoxElement.isDisplayed()) {
			
			contactNumberTxtBoxElement.sendKeys(contactNo);
		}
		
	}
    
    public void enterAboutListing(String aboutListing) {
		
		WebElement aboutOppTxtBoxElement  = driver.findElement(aboutOppTxtBox);

		aboutOppTxtBoxElement.click();
		
		if(aboutOppTxtBoxElement.isDisplayed()) {
			
			aboutOppTxtBoxElement.sendKeys(aboutListing);
		}
		
	}
    
    public void selectCausebtn() {
		
		WebElement peopleCauseBtnElement =  driver.findElement(peopleCauseBtn);
		
		if(peopleCauseBtnElement.isDisplayed()) {
			
			peopleCauseBtnElement.click();
		}
		
		else System.out.println("Element not found");
	}

    public void clickImageSaveBtn() throws InterruptedException {
		
		
		WebElement imageSaveBtnElement  = driver.findElement(imageSaveBtn);
		
		if(imageSaveBtnElement.isDisplayed()) {
			
			imageSaveBtnElement.click();
		}
		
}
    
    public void clickListingCreateBtn() throws InterruptedException {
		
		
		WebElement listingCreateBtnElement  = driver.findElement(listingCreateBtn);
		
		if(listingCreateBtnElement.isDisplayed()) {
			
			listingCreateBtnElement.click();
		}
		
		else System.out.println("image button Element not found");
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
	}
}
