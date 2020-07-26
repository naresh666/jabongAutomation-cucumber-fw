package com.jabong.qa.pages;

import org.openqa.selenium.WebDriver;

import com.jabong.qa.objectRepository.JeansForMenPageProp;
import com.jabong.qa.utils.WebDriverUtils;

public class JeansForMenPage extends WebDriverUtils implements JeansForMenPageProp {
	
	WebDriver driver;
	public JeansForMenPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public String jeansPageVerification() {
		return driver.findElement(DISPLAYED_JEANS_MEN_LOCATOR).getText();
	}

}
