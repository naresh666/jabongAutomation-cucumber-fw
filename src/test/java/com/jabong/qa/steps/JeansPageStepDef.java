package com.jabong.qa.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;

public class JeansPageStepDef {
	Steps steps;
	public JeansPageStepDef(Steps steps) {
		this.steps=steps;
	}
	
	@Then("user should see Jeans for men page {string}")
	public void user_should_see_Jeans_for_men_page(String expected) {
		System.out.println(steps.jeansformenpage.jeansPageVerification());
		Assert.assertEquals(expected, steps.jeansformenpage.jeansPageVerification());
	}
}
