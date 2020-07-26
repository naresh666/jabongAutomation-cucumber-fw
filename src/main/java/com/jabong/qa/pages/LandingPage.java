package com.jabong.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.jabong.qa.objectRepository.LandingPageProp;
import com.jabong.qa.utils.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProp {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public SignInPage clickOnSigninLink() {
		click(SIGNIN_LINK_LOCATOR);
		return new SignInPage(driver);
	}
	public MyntraHomePage clickOnMyntra() {
		click(MYNTRA_LOCATOR);
		return new MyntraHomePage(driver);
		
	}
	

}
