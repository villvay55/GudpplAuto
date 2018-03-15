package com.gudppl.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gudppl.OrgView.Pages.OrgSelectionPage;
import com.gudppl.OrgView.Pages.OrgViewPage;
import com.gudppl.base.gudpplBaseSetup;
import com.gudppl.event.Pages.BasePage;
import com.gudppl.event.Pages.SignInPage;

public class OrgDetailsPage extends gudpplBaseSetup{

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
	public void testOrgDetails() throws InterruptedException, IOException {
		
		OrgSelectionPage orgSelectionPage = new OrgSelectionPage(driver);
		orgSelectionPage.viewOrgDetails();
		
		OrgViewPage orgViewPage = new OrgViewPage(driver);
		
		Assert.assertTrue(orgViewPage.verifyEventCreateLnk());
		System.out.println("Verify Total events");
		
		Assert.assertTrue(orgViewPage.verifyHoursPledgedLnk());
		System.out.println("Verify Hours pledged");
		
		Assert.assertTrue(orgViewPage.verifyHoursVerifiedLnk());
		System.out.println("Verify Hours verified");

		Assert.assertTrue(orgViewPage.verifyHoursUnverifiedLnk());
		System.out.println("Verify Hours unverified");
		
		
		orgViewPage.OrgDetails();
		
		
	}
	
	
}
