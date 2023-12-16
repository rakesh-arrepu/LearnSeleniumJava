package com.learnselenium.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		1st Approach
		driver.findElement(By.xpath("//div[@id='myModal']//button[text()='Close']")).click();
		
		
//		2nd Approach
		WebElement modalElement = driver.findElement(By.xpath("//div[@id='myModal']//div[@class='modal-content']"));
		modalElement.findElement(By.xpath(".//button[@class='close']"));
		modalElement.findElement(By.xpath(".//h4[@class='modal-title']"));
		
		//3rd Approach
		
	}
	

}
