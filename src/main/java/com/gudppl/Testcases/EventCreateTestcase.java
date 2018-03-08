package com.gudppl.Testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gudppl.base.gudpplBaseSetup;
import com.gudppl.event.Pages.AboutOpporunityPage;
import com.gudppl.event.Pages.BasePage;
import com.gudppl.event.Pages.CasusesPage;
import com.gudppl.event.Pages.CreateEventPage;
import com.gudppl.event.Pages.CreatePage;
import com.gudppl.event.Pages.EventPhotoPage;
import com.gudppl.event.Pages.OpporunityInfoPage;
import com.gudppl.event.Pages.SignInPage;
import com.gudppl.event.Pages.VolunteeringPage;

import ExcelLib.ExcelDataConfig;
import ExcelLib.TestUtil;

public class EventCreateTestcase extends gudpplBaseSetup{

	
		public ExcelDataConfig excelDataConfig;
	
		private WebDriver driver;
		
		@BeforeClass
		public void setUp() {
			
			driver = getDriver();
		}
		
		
		@DataProvider
		public Iterator<Object[]> getTestData() {
			
			ArrayList<Object[]> testdata = TestUtil.getEventDataFromFile();
			
			
			return testdata.iterator();
			
			
		}
		
		
		
		
		
		@Test(dataProvider="loginDetails")
		public void testCeateEvent(String userName, String password, String orgName, String eventName , String oppDetails, String volNeed, String impactSocity, String volAgain , String eventDate , String eventStart , String eventEnd , String volunteers , String eventLocation, String imagePath) throws InterruptedException, IOException {
			
			BasePage basepage = new BasePage(driver);
			String loginPageTile =  basepage.getPageTitle();
			Assert.assertTrue(loginPageTile.toLowerCase().contentEquals("gudppl"));
		
			System.out.println("Gudppl Home Page");
	
			SignInPage signInPage  = new SignInPage(driver);
			signInPage.verifySigin(userName,password);
			Assert.assertTrue(signInPage.verifySignInPage());
			
			System.out.println("Successfully login gudppl");
			
			CreatePage createPage = new CreatePage(driver);
			createPage.clickCreateBtn();
			Assert.assertTrue(createPage.verifyCreatePage());
			System.out.println("Select an event from category");
			
			CreateEventPage createEventPage = new CreateEventPage(driver);
			createEventPage.fillEventDetails(orgName, eventName);
			Assert.assertTrue(createEventPage.verifyCreatePage());
			System.out.println("Enter event details");
			
			CasusesPage casusesPage = new CasusesPage(driver);
			casusesPage.selectCause();
			Assert.assertTrue(casusesPage.verifyCasusesPage());
			System.out.println("Select casuses type");
			
			AboutOpporunityPage aboutOpporunityPage = new AboutOpporunityPage(driver);
			aboutOpporunityPage.fillOppDetail(oppDetails, volNeed, impactSocity, volAgain);
			Assert.assertTrue(aboutOpporunityPage.verifyAboutOppPage());
			System.out.println("Enter opporunity details");
			
			VolunteeringPage volunteeringPage = new VolunteeringPage(driver);
			volunteeringPage.fillVolunteersDetails();
			Assert.assertTrue(volunteeringPage.verifyVolunteeringPage());
			System.out.println("Enter volunteering related details");
			
			OpporunityInfoPage opporunityInfoPage = new OpporunityInfoPage(driver);
			opporunityInfoPage.fillOppInfoDetails(eventDate, eventStart, eventEnd, volunteers, eventLocation);
			Assert.assertTrue(opporunityInfoPage.verifyOpporunityInfoPage());
			System.out.println("Enter opportunity info details");
			
			EventPhotoPage eventPhotoPage = new EventPhotoPage(driver);
			eventPhotoPage.uploadIamge(imagePath);
			Assert.assertTrue(eventPhotoPage.verifyphotoPage());
			System.out.println("Upload event photo and Event successfully created");
			
			
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		
		@DataProvider(name="loginDetails")
		public Object[][] getLoginData(){
			
			
			excelDataConfig = new ExcelDataConfig("C:\\Eclipse\\Automation\\Automation\\TestData\\TestData1.xlsx");
			
			
			
			int rowCount = excelDataConfig.getRowNum(0);
			
			Object[][] loginDetails = new Object[rowCount][14];
			
			for(int r=0;r<rowCount;r++) {
				
				loginDetails[r][0] = excelDataConfig.getDataa(0, r, 0);
				loginDetails[r][1] = excelDataConfig.getDataa(0, r, 1);
				loginDetails[r][2] = excelDataConfig.getDataa(0, r, 2);
				loginDetails[r][3] = excelDataConfig.getDataa(0, r, 3);
				loginDetails[r][4] = excelDataConfig.getDataa(0, r, 4);
				loginDetails[r][5] = excelDataConfig.getDataa(0, r, 5);
				loginDetails[r][6] = excelDataConfig.getDataa(0, r, 6);
				loginDetails[r][7] = excelDataConfig.getDataa(0, r, 7);
				loginDetails[r][8] = excelDataConfig.getDataa(0, r, 8);
				loginDetails[r][9] = excelDataConfig.getDataa(0, r, 9);
				loginDetails[r][10] = excelDataConfig.getDataa(0, r, 10);
				loginDetails[r][11] = excelDataConfig.getDataa(0, r, 11);
				loginDetails[r][12] = excelDataConfig.getDataa(0, r, 12);
				loginDetails[r][13] = excelDataConfig.getDataa(0, r, 13);
			
				
				
			}
					return loginDetails;
					
		}
		

		/*@DataProvider(name="eventDetails")
		public Object[][] getEventData(){
			
			
			excelDataConfig = new ExcelDataConfig("C:\\Eclipse\\Automation\\Automation\\TestData\\TestData.xlsx");
			
			
			
			int rowCount = excelDataConfig.getRowNum(0);
			
			Object[][] eventDetails = new Object[rowCount][2];
			
			for(int r=0;r<rowCount;r++) {
				
				eventDetails[r][0] = excelDataConfig.getDataa(0, r, 2);
				eventDetails[r][1] = excelDataConfig.getDataa(0, r, 3);
				
			}
					return eventDetails;
		}		*/
		
		
		
		
		
}
