package com.jabong.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.jabong.qa.objectRepository.MyntraHomePageProp;
import com.jabong.qa.utils.WebDriverUtils;

public class MyntraHomePage extends WebDriverUtils implements MyntraHomePageProp  {

	WebDriver driver;
	public MyntraHomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public String getMyntraHomePageTitle() {
		return driver.getTitle();
	}
	public void mouseOverOnMen() {
		new Actions(driver).moveToElement(driver.findElement(MOUSE_OVER_MEN_LOCATOR)).build().perform();
		
	}
	public JeansForMenPage clickOnJeansInMen() {
		click(JEANS_LOCATOR);
		return new JeansForMenPage(driver);
	}

}
