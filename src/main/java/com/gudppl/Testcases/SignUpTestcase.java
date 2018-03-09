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
	public void testCeateStroy() throws InterruptedException, IOException {
		
		CreateStoryPage createStoryPage = new CreateStoryPage(driver);
		createStoryPage.clickStory();
		
		CreatePage createPage = new CreatePage(driver);
		createPage.createStory("Change World", "Ready to change world", "E:\\image\\ImageNoticeUpload\\ListingFundIamgeUpload4.exe");
		
		
	}

	@Test(priority=6)
	public void testCeateStroy2() {
		
		
	}
}
