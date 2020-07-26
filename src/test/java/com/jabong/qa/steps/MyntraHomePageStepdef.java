package com.jabong.qa.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyntraHomePageStepdef {
	Steps steps;
	public MyntraHomePageStepdef(Steps steps) {
		this.steps=steps;
	}
	@And("user should see myntra website title as {string}")
	public void user_should_see_myntra_website_title_as(String expectedTitle) {
		Assert.assertEquals(expectedTitle, steps.myntrahomepage.getMyntraHomePageTitle());
	}
	@And("mouse over on men")
	public void mouse_over_on_men() {
		steps.myntrahomepage.mouseOverOnMen();
		
	}
	@And("click on jeans")
	public void click_on_jeans() {
		steps.jeansformenpage=steps.myntrahomepage.clickOnJeansInMen();
	}

}
