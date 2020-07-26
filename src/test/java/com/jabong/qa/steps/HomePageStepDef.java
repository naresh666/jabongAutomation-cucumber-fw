package com.jabong.qa.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;

public class HomePageStepDef {
	Steps steps;
	public HomePageStepDef(Steps steps) {
		this.steps=steps;
	}
	@Then("user should see account name as {string}")
	public void user_should_see_account_name_as(String expectedUserName) {
		System.out.println("actual  :"+steps.homepage.verifyUserOnHomePage());
		System.out.println("expected  :"+expectedUserName);
		Assert.assertEquals(expectedUserName, steps.homepage.verifyUserOnHomePage());
	}

}
