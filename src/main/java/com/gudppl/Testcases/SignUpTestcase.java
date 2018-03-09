package com.gudppl.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.gudppl.base.gudpplBaseSetup;

import ExcelLib.ExcelDataConfig;

public class SignUpTestcase extends gudpplBaseSetup{

	public ExcelDataConfig excelDataConfig;
	
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = getDriver();
	}
}
