package com.learnselenium.advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			driver.navigate().to("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
			Thread.sleep(2000);
			
			String parentWindow = driver.getWindowHandle(); // returns parent window
			System.out.print("parent Window: "+parentWindow);
//			driver.findElement(By.xpath("//a[normalize-space(text())='Follow On Twitter']")).click();
//			
//			Set<String> windows= driver.getWindowHandles();
//			//parent - index 0/1
//			//child window at index 0/1
//			System.out.print("window size: "+windows.size());
//			Assert.assertTrue(windows.size() == 2 );
//			for(String child: windows) {
//				System.out.println("Child window: "+ child);
//				if(!parentWindow.equals(child)) {
//					driver.switchTo().window(child);
//					Thread.sleep(5000);
//					break;
//				}
//			}
//			
//			//validate element in childWindow
//			WebElement settingsIcon = driver.findElement(By.xpath("//header//*[@role='navigation']/a"));
//			Assert.assertTrue(settingsIcon.isDisplayed());
//			Assert.assertTrue(settingsIcon.isEnabled());
//			
//			//Close child window/active window
//			driver.close();
//			
//			//Switch to parent window
//			driver.switchTo().window(parentWindow);
//			
//			
//			//Enter url in parent window textbox
//			driver.findElement(By.xpath("//input[@type='url']")).sendKeys("https://www.google.com");
//			driver.findElement(By.xpath("//input[@type='url']/following-sibling::a")).click();
//			
//			//Child window google opens
//			Set<String> windows1= driver.getWindowHandles();
//			System.out.print("window size after url click: "+windows1.size());
//			Assert.assertTrue(windows1.size() == 2 );
//			
//			for(String child: windows1) {
//				driver.switchTo().window(child);
//			}
//			Thread.sleep(5000);
//			Assert.assertTrue(driver.getTitle().contains("Google"));
//			//Close child window/active window
//			driver.close();
//			
//			//Switch to parent window
//			driver.switchTo().window(parentWindow);
			
			
			
//			1st Scenario: Target Window: FaceBook
			//a[@aria-label='Facebook']
			//Click on Follow Twitter & Facebook button
			String targetWindow="";
			driver.findElement(By.id("followboth")).click();
			Set<String> windows= driver.getWindowHandles();
			System.out.print("window size: "+windows.size());
			Assert.assertTrue(windows.size() == 3 );
			for(String child: windows) {
				System.out.println("Child window: "+ child);
				if(!parentWindow.equals(child)) {
					driver.switchTo().window(child);
					Thread.sleep(5000);
					if(driver.findElement(By.xpath("//div[@role='dialog']//form//div/div[1]//span[contains(text(),'LambdaTest')]")).isDisplayed()) {
						targetWindow = child;
						break;
					}
					
				}
			}
			
			driver.switchTo().window(targetWindow);
			Thread.sleep(5000);
			System.out.println("Title of Target Window: "+ driver.getTitle());
			
//			Close child window/active window
			driver.close();
			
			//Switch to parent window
			driver.switchTo().window(parentWindow);
		} catch(Exception e) {
			e.printStackTrace();
		} 
		finally {
			//Close all windows opened by webdriver
			driver.quit();
		}
	}

}
