package com.gudppl.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gudppl.base.gudpplBaseSetup;
import com.gudppl.event.Pages.BasePage;
import com.gudppl.event.Pages.SignInPage;
import com.gudppl.gudstories.Pages.CreatePage;
import com.gudppl.gudstories.Pages.CreateStoryPage;
import com.gudppl.signup.Pages.SignUpLandPage;
import com.gudppl.signup.Pages.SignUpPage;

import ExcelLib.ExcelDataConfig;

public class SignUpTestcase extends gudpplBaseSetup{

	public ExcelDataConfig excelDataConfig;
	
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = getDriver();
	}
	
	@Test(priority=1)
	public void commTest() throws InterruptedException {
		
		BasePage basepage = new BasePage(driver);
		String loginPageTile =  basepage.getPageTitle();
		Assert.assertTrue(loginPageTile.toLowerCase().contentEquals("gudppl"));
	
		System.out.println("Gudppl Home Page");
		
		
		SignInPage signInPage  = new SignInPage(driver);
		signInPage.verifySigin("malaravan2070@gmail.com", "qazwsx");
		Assert.assertTrue(signInPage.verifySignInPage());
		
		System.out.println("Successfully login gudppl");
	}
	
	@Test(priority=2)
	public void testSignUp() throws InterruptedException, IOException {
		
		SignUpLandPage signUpLandPage = new SignUpLandPage(driver);
		signUpLandPage.signLand();
		
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.fillSignUpDetails("viki", "Harry", "wiki@gmail.com", "aaaa", "750697470", "02/02/1990");
		
		
	}

	
}
