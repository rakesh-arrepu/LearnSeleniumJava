package com.learnselenium.advanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			System.out.println("Webdriver intitated");
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
//			TC1- accepting alert
			clickButton(driver, "Click for JS Alert");
			String jsAlert = driver.switchTo().alert().getText();
			System.out.println(jsAlert);
			driver.switchTo().alert().accept();
			
//			TC2- dismiss alert
			clickButton(driver, "Click for JS Confirm");
			String jsConfirm = driver.switchTo().alert().getText();
			System.out.println(jsConfirm);
			driver.switchTo().alert().dismiss();
			
//			TC1- Send Keys and Accept
			clickButton(driver, "Click for JS Prompt");
			Alert alert = driver.switchTo().alert();
			String jsPrompt = alert.getText();
			System.out.println(jsPrompt);
			alert.sendKeys("This is an Alert");
			alert.accept();
			
		}
		finally {
			driver.quit();
		}
	}
	
	
	static void clickButton(WebDriver driver, String buttonName) throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='"+buttonName+"']")).click();
		Thread.sleep(1000);
		
	}

}
