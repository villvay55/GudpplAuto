package com.gudppl.Testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gudppl.base.gudpplBaseSetup;
import com.gudppl.event.Pages.BasePage;
import com.gudppl.event.Pages.SignInPage;
import com.gudppl.notice.Pages.CreateNoticePage;
import com.gudppl.notice.Pages.CreatePage;

import ExcelLib.ExcelDataConfig;
import ExcelLib.TestUtil;

public class NoticeCreateTestcase extends gudpplBaseSetup{
	
	public ExcelDataConfig excelDataConfig;
	
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = getDriver();
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		
		ArrayList<Object[]> testdata = TestUtil.getNoticeDataFromFile();
		
		
		return testdata.iterator();
		
		
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

	@Test(dataProvider="getTestData", priority=2)
	public void testCeateNotice(String userName,String password,String noticeTitle,String noticeDes,String imagePath) throws InterruptedException, IOException {
		
		
		CreateNoticePage createNoticePage = new CreateNoticePage(driver);
		createNoticePage.clickNotice();
		
		CreatePage createPage = new CreatePage(driver);
		createPage.createNotice(noticeTitle, noticeDes, imagePath);
	}
}
