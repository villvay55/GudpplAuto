package com.gudppl.search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchOrganizationPage {

	private WebDriver driver;
	private By organizationsTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[4]/a");
	
	public SearchOrganizationPage(WebDriver driver) {
		
		this.driver = driver;
	}


}
