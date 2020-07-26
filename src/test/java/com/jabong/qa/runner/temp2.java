package com.jabong.qa.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class temp2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "G:\\naresh practice\\I Hub Selenium Manoj Sir\\JabongAutomation\\src\\main\\resources\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");

	}
	

}
