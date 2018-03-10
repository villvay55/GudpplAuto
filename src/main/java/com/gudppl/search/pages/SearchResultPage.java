package com.gudppl.search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

	private WebDriver driver;
	private By oppsTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[2]/a");
	private By peopleTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[3]/a");
	private By organizzationsTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[4]/a");
	private By noticeTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[5]");
	
	public SearchResultPage(WebDriver driver) {
		
		this.driver = driver;
	}

}
