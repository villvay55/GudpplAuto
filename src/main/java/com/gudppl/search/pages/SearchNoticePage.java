package com.gudppl.search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchNoticePage {

	private WebDriver driver;
	private By noticeTab = By.xpath("html/body/app-root/div/div[2]/app-search-page/div/section[1]/div/ul/li[5]");

	public SearchNoticePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
}
