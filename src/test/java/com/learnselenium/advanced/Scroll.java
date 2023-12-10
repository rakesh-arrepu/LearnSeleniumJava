package com.learnselenium.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		Thread.sleep(3000);
////		vertical scroll to bottom of page
//		jsExecutor.executeScript("window.scrollBy(0, document.bodyheight)");
//		
//		Thread.sleep(1500);
//		
////		vertical scroll to top of the page
//		jsExecutor.executeScript("window.scrollBy(document.bodyheight, 0)");
//		
//		arguments[0].scrollIntoView();
		WebElement statusCode = driver.findElement(By.xpath("//a[text()='Status Codes']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView()", statusCode);
		Thread.sleep(1500);
		statusCode.click();
		
		
		Thread.sleep(3000);

		driver.quit();
		
			
			
	}

}
