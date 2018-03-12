package com.gudppl.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gudppl.base.gudpplBaseSetup;
import com.gudppl.event.Pages.BasePage;
import com.gudppl.event.Pages.SignInPage;
import com.gudppl.search.pages.SearchPage;
import com.gudppl.search.pages.SearchResultPage;

import ExcelLib.ExcelDataConfig;

public class SearchTestcase extends gudpplBaseSetup{

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
		
		SearchPage searchPage = new SearchPage(driver);
		searchPage.search("h");
		
		
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		searchResultPage.verifyTab();
		
		/*if(searchResultPage.verifyResultPage()){
			
			System.out.println("There are result");
		}else {
			
			System.out.println("No result");
		}*/
	
	}

}