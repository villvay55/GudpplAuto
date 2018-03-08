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
import com.gudppl.event.Pages.CreateEventPage;
import com.gudppl.event.Pages.SignInPage;
import com.gudppl.listing.Pages.CreateListingPage;
import com.gudppl.listing.Pages.CreatePage;

import ExcelLib.TestUtil;

public class ListingCreateTestcase extends gudpplBaseSetup{

	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = getDriver();
	}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		
		ArrayList<Object[]> testdata = TestUtil.getListingDataFromFile();
		
		
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
	public void testCeateListing(String userName, String password,String selectOrg, String listTitle, String listLocation, String listContact, String listDescription, String imagePath) throws InterruptedException, IOException {
		
		
		
		CreatePage createPage = new CreatePage(driver);
		createPage.clickCreateBtn();
		
		
		CreateListingPage createListingPage = new CreateListingPage(driver);
		createListingPage.fillListingDetails(selectOrg,listTitle,listLocation,listContact,listDescription,imagePath);
	}
	
	
}
