package com.jabong.qa.steps;

import io.cucumber.java.en.And;

public class LandingPageStepDef {
	Steps steps;
	public LandingPageStepDef(Steps steps) {
		this.steps=steps;
	}
	@And("user click on signin link")
	public void user_click_on_signin_link() {
		steps.loginpage=steps.landingpage.clickOnSigninLink();
		
	}
	@And("user click on myntra link and user redirect to myntra home page")
	public void user_click_on_myntra_link_redirect_myntra_home_page() {
		steps.myntrahomepage=steps.landingpage.clickOnMyntra();
		
	}
	

}
