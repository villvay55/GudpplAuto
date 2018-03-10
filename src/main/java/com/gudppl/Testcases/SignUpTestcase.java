package com.gudppl.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.gudppl.base.gudpplBaseSetup;
import com.gudppl.signup.Pages.CreateAccount;
import com.gudppl.signup.Pages.SelectCauses;
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
	public void testSignUp() throws InterruptedException, IOException {
		
		SignUpLandPage signUpLandPage = new SignUpLandPage(driver);
		signUpLandPage.signLand();
		
		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.fillSignUpDetails("viki", "Harry", "wiki@gmail.com", "realpass", "750697470", "02/02/1990");
		
		SelectCauses selectCauses = new SelectCauses(driver);
		selectCauses.selectCauses();
		
		CreateAccount createAccount = new CreateAccount(driver);
		createAccount.createAccount();
	}

	
}
