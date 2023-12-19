package com.learnselenium.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {

	private By firstName = By.xpath("//label[text()='First']/preceding-sibling::input");
	private By lastName = By.xpath("//label[text()='Last']/preceding-sibling::input");
	private By email = By.xpath("//label[normalize-space(text())='Email']/following-sibling::input");
	private By phone = By.xpath("//input[@type='number']");
	private By username = By.id("username");
	
	WebDriver driver;
	
	@BeforeMethod
	public void initializeDriver() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://test.qatechhub.com/form-elements/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority=1, groups= {"sanity", "suite", "batch"})  
	public void test1() {
		WebElement eleFirstName = driver.findElement(firstName);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(eleFirstName));
		eleFirstName.sendKeys("John");
		eleFirstName.clear();
		driver.findElement(lastName).sendKeys("Doe");
		System.out.println("Entered Text in First Name");
		System.out.println("Entered Text in Last Name");
	}
	
	
	@Test(groups= {"sanity", "sprint34"}, priority=2)  
	public void test2() {
		WebElement eleEmail = driver.findElement(email);
		System.out.println("Entered Text in Last Name");
		
		eleEmail.sendKeys("johndoe@test.com");
		System.out.println("Entered Text in Email");
		
		WebElement elePhone = driver.findElement(phone);
		elePhone.sendKeys("123456789");
		System.out.println("Entered Text in Phone");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
