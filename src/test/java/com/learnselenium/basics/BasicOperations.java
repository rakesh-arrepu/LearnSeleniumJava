package com.learnselenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasicOperations {

	public static void main(String[] args) throws InterruptedException {
		
		String userdir = System.getProperty("user.dir");
		System.out.println(userdir);
		System.setProperty("webdriver.chrome.driver", userdir+ "//src/test/resources/drivers/chromedriver");
		
//		1. Instantiate a Chrome webdriver
		ChromeDriver driver = new ChromeDriver();
		
		try {
		//Chrome Driver setup
		
			Assert.assertEquals(driver.getTitle(), "File Download");
			driver.getCurrentUrl(); 
			
		driver.navigate().to("https://test.qatechhub.com/form-elements/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		2. Enter Text in First Name & Last Name
		WebElement firstName = driver.findElement(By.xpath("//label[text()='First']/preceding-sibling::input"));
		firstName.sendKeys("John");
		driver.findElement(By.xpath("//label[text()='Last']/preceding-sibling::input")).sendKeys("Doe");
		System.out.println("Entered Text in First Name");
		WebElement email = driver.findElement(By.xpath("//label[normalize-space(text())='Email']/following-sibling::input"));
		System.out.println("Entered Text in Last Name");
		
		email.sendKeys("johndoe@test.com");
		System.out.println("Entered Text in Email");
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='number']"));
		phone.sendKeys("123456789");
		System.out.println("Entered Text in Phone");
		
		clickGender(driver, "Male");
		
		WebElement ddl = driver.findElement(By.id("wpforms-49-field_5"));
		Select sel = new Select(ddl);
//		sel.selectByIndex(1);
//		sel.selectByValue("Cypress");
		sel.selectByVisibleText("Selenium");
		System.out.println("Selected value in dropdown");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println("Clicked on Submit");
		Thread.sleep(2000);
		
		WebElement success = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-49']/p[1]"));
		String msg = success.getText();
		
		Assert.assertTrue(success.isDisplayed(), "Successs Element is not found");
		Assert.assertEquals(msg, "You have successfully filled in the fo");
		
		} finally {
			//Close the Browser(all sessions)
			driver.quit();
		}
		
		
		

	}
	
	public static void clickGender(ChromeDriver driver, String gender) {
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding-sibling::input"));
		if(!checkbox.isSelected())
			checkbox.click();
		
		
		System.out.println("Clicked on "+gender+" Checbox");
	};

}
