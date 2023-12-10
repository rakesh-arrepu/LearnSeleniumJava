package com.learnselenium.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1500);
		
//		WebElement ddl = driver.findElement(By.xpath("//p-dropdown[@id='journeyClass']"));
		selectDropdownValue(driver, "//p-dropdown[@id='journeyClass']", "AC 2 Tier (2A)");
		
//		WebElement ddl2 = driver.findElement(By.xpath("//p-dropdown[@id='journeyQuota']"));
		selectDropdownValue(driver, "//p-dropdown[@id='journeyClass']", "LADIES");
	}
	
	static void selectDropdownValue(WebDriver driver, String locatorDdl, String value) throws InterruptedException {
		driver.findElement(By.xpath(locatorDdl)).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//p-dropdownitem/li[@aria-label='"+value+"']")).click();
	}

}
