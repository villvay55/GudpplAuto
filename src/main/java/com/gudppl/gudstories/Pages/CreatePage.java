package com.gudppl.gudstories.Pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreatePage {

	private By storyTitleTxtBox = By.xpath("html/body/app-root/div/div[2]/app-create/div[1]/form/div[1]/input");
	private By orgSelection = By.xpath("html/body/app-root/div/div[2]/app-create/div[1]/form/div[2]/div[1]/angular2-multiselect/div/div[1]/div");
	private By orgChkBox = By.xpath("html/body/app-root/div/div[2]/app-create/div[1]/form/div[2]/div[1]/angular2-multiselect/div/div[2]/div[2]/ul/li/label");
	private By opptSelection = By.xpath("html/body/app-root/div/div[2]/app-create/div[1]/form/div[2]/div[2]/input");
	private By oppSelectionChxBox = By.xpath("/*[@id='oppselectmodal']/div/div/div[2]/div/div/label[1]/span[2]");
	private By doneBtn = By.xpath(".//*[@id='oppselectmodal']/div/div/div[3]/button");	
	private By storyTxtBox = By.xpath(".//*[@id='cke_editor1']");
	private By imageUploadBtn = By.xpath(".//*[@id='image-upload']");
	private By imageSaveBtn = By.xpath(".//*[@id='cropoppimageModal']/div/div/div[3]/button[2]");
	private By storyCreateBtn = By.xpath("html/body/app-root/div/div[2]/app-create/div[1]/form/div[6]/button[1]");

	
	private WebDriver driver;
	
	public CreatePage(WebDriver driver) {
	
		this.driver = driver;
	}

	public void createStory(String storyTitle,String story,String imagePath) throws InterruptedException, IOException {
		
		enterStoryTitle(storyTitle);
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		selectOrg();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		oppSelection();
		
		synchronized (driver)
		{
		    driver.wait(5000);
		}
		
		enterStory(story);
		
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
		
		WebElement imageSaveBtnElement =  driver.findElement(imageSaveBtn);
		imageSaveBtnElement.click();
		if(imageSaveBtnElement.isDisplayed()) {
			
			imageSaveBtnElement.click();
		}
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		WebElement storyCreateBtnElement =  driver.findElement(storyCreateBtn);
	
		if(storyCreateBtnElement.isDisplayed()) {
			
			storyCreateBtnElement.click();
		}
		
		synchronized (driver)
		{
		    driver.wait(6000);
		}
	}
	
	
	
	
	public void enterStoryTitle(String storyTitle) {
		
		WebElement storyTitleTxtBoxElement  = driver.findElement(storyTitleTxtBox);
		
		if(storyTitleTxtBoxElement.isDisplayed()) {
			
			storyTitleTxtBoxElement.click();
			storyTitleTxtBoxElement.sendKeys(storyTitle);
		}	
		
	}
	
	public void selectOrg() throws InterruptedException {
		
		WebElement orgSelectionElement  = driver.findElement(orgSelection);
		
		if(orgSelectionElement.isDisplayed()) {
			
			orgSelectionElement.click();
		}	
		
		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		WebElement orgChkBoxElement  = driver.findElement(orgChkBox);

		if(orgChkBoxElement.isDisplayed()) {
			
			orgChkBoxElement.click();
		}	
		
	}
	
	public void enterStory(String story) {
		
		WebElement storyTxtBoxElement  = driver.findElement(storyTxtBox);
		
		if(storyTxtBoxElement.isDisplayed()) {

			storyTxtBoxElement.click();
			storyTxtBoxElement.sendKeys(story);
		}	
		
	}
	
	
	public void oppSelection() throws InterruptedException {
		
		
		WebElement opptSelectionElement  = driver.findElement(opptSelection);
		
		if(opptSelectionElement.isDisplayed()) {

			opptSelectionElement.click();
			
			synchronized (driver)
			{
			    driver.wait(3000);
			}
			
			opptSelectionElement.click();
			
			
		}	

		
		synchronized (driver)
		{
		    driver.wait(3000);
		}
		
		
		WebElement doneBtnElement  = driver.findElement(doneBtn);
		
		if(doneBtnElement.isDisplayed()) {

			doneBtnElement.click();
		}

	}
	
	
}
