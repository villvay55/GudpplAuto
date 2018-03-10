package com.gudppl.search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPeoplePage {

	private WebDriver driver;
	private By peopleTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[3]/a");

	public SearchPeoplePage(WebDriver driver) {
		
		this.driver = driver;
	}


}
