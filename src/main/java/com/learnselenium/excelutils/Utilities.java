package com.learnselenium.excelutils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	
	public static WebDriver driver;
	
	public static void enterText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public static boolean click(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		return true;
	}
	

}
