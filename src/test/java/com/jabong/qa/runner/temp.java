package com.jabong.qa.runner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.jabong.qa.basePage.JabongTestBase;
import com.jabong.qa.objectRepository.MyntraHomePageProp;

public class temp extends JabongTestBase implements MyntraHomePageProp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		temp tem=new temp();
		driver=tem.intilizeDriver();
		driver.get("https://www.myntra.com/");
		new Actions(driver).moveToElement(driver.findElement(MOUSE_OVER_MEN_LOCATOR)).build().perform();
		driver.findElement(tem.JEANS_LOCATOR).click();
		Thread.sleep(15000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.className("pagination-next")));
		List<WebElement> webElements=driver.findElements(By.xpath("//li[@class='product-base']//img"));

		System.out.println(webElements.size());
		for (WebElement webElement : webElements) {
			String s=webElement.getAttribute("title");
		System.out.println(s.contains("Jeans"));
			System.out.println(s);
			
			
		}
		
	}
	

}
