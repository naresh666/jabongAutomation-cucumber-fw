package com.jabong.qa.steps;

import com.jabong.qa.basePage.JabongTestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TestBaseStepDef {
	Steps steps;
	public TestBaseStepDef(Steps steps) {
		this.steps=steps;
	}
	
	@Given("^user launch browser$")
	public void user_launch_browser() {
		steps.testbase=new JabongTestBase();
		steps.testbase.intilizeDriver();
		
		
	}
	@When("^user enter url$")
	public void user_enter_url() {
		steps.landingpage=steps.testbase.enterURL();
	}

}
