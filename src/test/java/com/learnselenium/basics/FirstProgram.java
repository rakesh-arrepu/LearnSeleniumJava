package com.learnselenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		
		String userdir = System.getProperty("user.dir");
		System.out.println(userdir);
		System.setProperty("webdriver.chrome.driver", userdir+ "//src/test/resources/drivers/chromedriver");
		
//		1. Instantiate a chrome webdriver
//		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://mvnrepository.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("APjFqb"));
		driver.findElement(By.className("gLFyf"));
		driver.findElement(By.name("q"));
		
		
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@aria-label='Google Search']"));

		
		//Close the Browser(all sessions)
		driver.quit();
	}

}
