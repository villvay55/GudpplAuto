package com.gudppl.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gudppl.base.gudpplBaseSetup;
import com.gudppl.event.Pages.BasePage;
import com.gudppl.event.Pages.CreateEventPage;
import com.gudppl.event.Pages.SignInPage;
import com.gudppl.organization.Pages.CasusesPage;
import com.gudppl.organization.Pages.ContactInfoPage;
import com.gudppl.organization.Pages.CreateOrganizationPage;
import com.gudppl.organization.Pages.CreatePage;
import com.gudppl.organization.Pages.OrganizationPhotoPage;

public class OrganizationCreateTestcase extends gudpplBaseSetup{

	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = getDriver();
	}
	
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct() {
		
		BasePage basepage = new BasePage(driver);
		String loginPageTile =  basepage.getPageTitle();
		Assert.assertTrue(loginPageTile.toLowerCase().contentEquals("gudppl"));
	
		System.out.println("Gudppl Home Page");
	}
	@Test(priority=1,dependsOnMethods="test_Home_Page_Appear_Correct")
	public void test_Login_Page() throws InterruptedException {
		
		SignInPage signInPage  = new SignInPage(driver);
		signInPage.verifySigin("malaravan2070@gmail.com", "123456");
		Assert.assertTrue(signInPage.verifySignInPage());
		
		System.out.println("Successfully login gudppl");
	
	}
	
	@Test(priority=2,dependsOnMethods="test_Login_Page")
	public void test_Organization_Create_Page() throws InterruptedException {
		
		
		CreatePage createPage = new CreatePage(driver);
		createPage.clickCreateBtn();
		Assert.assertTrue(createPage.verifyCreatePage());
		System.out.println("Create an organization page");
	}

	@Test(priority=3,dependsOnMethods="test_Organization_Create_Page")
	public void test_Organization_Create_Org_Page() throws InterruptedException {
		
		CreateOrganizationPage createOrganizationPage = new CreateOrganizationPage(driver);
		createOrganizationPage.fillOrganizationDetails("Galaxy Ruler" , "We guard the galaxy" );
		//Assert.assertTrue(createEventPage.verifyCreatePage());
		//System.out.println("Enter event details");
		
	}
	
	@Test(priority=4,dependsOnMethods="test_Organization_Create_Org_Page")
	public void test_Organization_Casuses_Page() throws InterruptedException {
		
		CasusesPage casusesPage = new CasusesPage(driver);
		casusesPage.selectCause();
		//Assert.assertTrue(createEventPage.verifyCreatePage());
		//System.out.println("Enter event details");
		
	}
	
	@Test(priority=5,dependsOnMethods="test_Organization_Casuses_Page")
	public void test_Organization_ContactInfo_Page() throws InterruptedException {
		
		ContactInfoPage contactInfoPage = new ContactInfoPage(driver);
		contactInfoPage.fillContactInfo("No - 2151 Broadway", "New York NY 10023", "1934222731" , "New York" , "harry@gmail.com" , "New York" ,  "10001");
		//Assert.assertTrue(createEventPage.verifyCreatePage());
		//System.out.println("Enter event details");
		
	}
	
	@Test(priority=6,dependsOnMethods="test_Organization_ContactInfo_Page")
	public void test_Organization_ImageUpload_Page() throws InterruptedException, IOException {
		
		OrganizationPhotoPage organizationPhotoPage = new OrganizationPhotoPage(driver);
		organizationPhotoPage.uploadIamge();
		//Assert.assertTrue(createEventPage.verifyCreatePage());
		//System.out.println("Enter event details");
		
	}


}
