package com.jabong.qa.pages;

import org.openqa.selenium.WebDriver;

import com.jabong.qa.objectRepository.SignInPageProp;
import com.jabong.qa.utils.WebDriverUtils;

public class SignInPage extends WebDriverUtils implements SignInPageProp {
	WebDriver driver;

	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public void userEnterEmail(String userName) {
		enterText(ENTER_EMAIL_LOCATOR, userName);
	}
	public void userEnterPassword(String password) {
		enterText(ENTER_PASSWORD_LOCATOR, password);
	}
	public HomePage userClickSignBtn() {
		click(SIGNIN_BTN_LOCATOR);
		return new HomePage(driver);
	}

}
