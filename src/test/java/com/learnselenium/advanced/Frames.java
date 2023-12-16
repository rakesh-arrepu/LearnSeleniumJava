package com.learnselenium.advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			driver.navigate().to("https://www.lambdatest.com/selenium-playground/iframe-demo/");
			Thread.sleep(2000);
			List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
			System.out.println("No of Iframes in the page: "+iframes.size());
			
			//name or Id
			driver.switchTo().frame("iFrame1");
			WebElement content = driver.findElement(By.xpath("//div[@contenteditable='true']"));
			System.out.println(content.getText());
			driver.switchTo().parentFrame();
			
			//By Index
			driver.switchTo().frame(1);
			driver.findElement(By.xpath("//a[text()='API Reference']")).click();
			Thread.sleep(2000);
			driver.switchTo().parentFrame();
			
			//By WebElement of target frame
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@scrolling='auto']")));
			driver.findElement(By.xpath("//a[text()='API Reference']")).click();
			Thread.sleep(2000);
			driver.switchTo().parentFrame();
		} finally {
			driver.quit();
		}
	}

}
