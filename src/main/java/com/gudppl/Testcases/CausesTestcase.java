package com.gudppl.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gudppl.base.gudpplBaseSetup;
import com.gudppl.causes.Pages.AnimalSupport;
import com.gudppl.causes.Pages.DisasterRelif;
import com.gudppl.causes.Pages.Education;
import com.gudppl.causes.Pages.Enviroment;
import com.gudppl.causes.Pages.Other;
import com.gudppl.causes.Pages.People;
import com.gudppl.causes.Pages.SelectCauses;
import com.gudppl.event.Pages.BasePage;
import com.gudppl.event.Pages.SignInPage;


public class CausesTestcase extends gudpplBaseSetup{

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
	public void testCauses() throws InterruptedException, IOException {
		
		SelectCauses selectCauses = new SelectCauses(driver);
		selectCauses.selectAllCauses();
		
		AnimalSupport animalSupport = new AnimalSupport(driver);
		animalSupport.selectAnimalSupport();
		
		DisasterRelif disasterRelif = new DisasterRelif(driver);
		disasterRelif.selectDisasterRelif();
		
		Education Education = new Education(driver);
		Education.selectEducation();
		
		Enviroment enviroment = new Enviroment(driver);
		enviroment.selectEnviroment();
		
		People people = new People(driver);
		people.selectPeople();
		
		Other other = new Other(driver);
		other.selectOther();
		
		
	
	}
}
