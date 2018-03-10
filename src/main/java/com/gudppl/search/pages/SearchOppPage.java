package com.gudppl.search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchOppPage {

	private WebDriver driver;
	private By oppsTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[2]/a");
	
	public SearchOppPage(WebDriver driver) {
		
		this.driver = driver;
	}
}
