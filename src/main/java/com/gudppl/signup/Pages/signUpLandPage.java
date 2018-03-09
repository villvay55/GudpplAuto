package com.gudppl.signup.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUpLandPage {

	private By signUpLnk = By.xpath("html/body/app-root/div/div[2]/app-login/section/div/p/a");
	private By singUpEmail = By.xpath("html/body/app-root/div/div[2]/app-signup/section/a[2]");
	private By singUpFaceBook = By.xpath("html/body/app-root/div/div[2]/app-signup/section/a[1]");
	
	private WebDriver driver;
	
	public signUpLandPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public signUpPage signLand(){
		
		
		
		
		return new signUpPage(driver);
	
	}
	
	
	
}
