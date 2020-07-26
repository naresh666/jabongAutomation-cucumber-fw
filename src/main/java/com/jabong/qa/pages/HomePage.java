package com.jabong.qa.pages;

import org.openqa.selenium.WebDriver;

import com.jabong.qa.objectRepository.HomePageProp;
import com.jabong.qa.utils.WebDriverUtils;

public class HomePage extends WebDriverUtils implements HomePageProp {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public String verifyUserOnHomePage() {
		mouseOver(ACCOUNT_NAME_LOCATOR);
		return getText(ACCOUNT_NAME_LOCATOR);
		
	}
	

}
