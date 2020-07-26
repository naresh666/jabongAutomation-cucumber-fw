package com.jabong.qa.steps;

import io.cucumber.java.en.And;

public class SignInPageStepDef {
	Steps steps;

	public SignInPageStepDef(Steps steps) {
		this.steps = steps;
	}

	@And("user enter email address as {string}")
	public void user_enter_email_address_as(String userName) {
		steps.loginpage.userEnterEmail(userName);
	}

	@And("user enter password as {string}")
	public void user_enter_password_as(String password) {
		steps.loginpage.userEnterPassword(password);
	}
	@And("user click on signin button")
	public void user_click_on_signin_button() {
		steps.homepage=steps.loginpage.userClickSignBtn();
	}
	
}
