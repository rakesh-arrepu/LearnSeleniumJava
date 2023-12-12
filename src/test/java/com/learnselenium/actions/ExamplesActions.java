package com.learnselenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExamplesActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		//Right Click
		act.contextClick().perform();
		
		//Right Click at particular element
		WebElement ele = driver.findElement(By.id("2324"));
		act.contextClick(ele).perform();
		
		//Double Click
		act.doubleClick().perform();
		act.doubleClick(ele).perform();
		
		act.moveToElement(ele);
		act.moveToElement(ele).click().perform();
		act.moveToElement(ele).sendKeys("adff");
		
		//Drag & Drop
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		act.dragAndDrop(sourceElement, targetElement).perform();
		
		WebElement eleDblClick = driver.findElement(By.id("double-click"));
		act.moveToElement(eleDblClick).doubleClick().perform();;
//		act.doubleClick(eleDblClick);
		
		WebElement hover1 = driver.findElement(By.xpath("//div/button[text()='Hover Over Me First!']"));
		act.moveToElement(hover1);
		WebElement link1Hover1 = driver.findElement(By.xpath("//div/button[text()='Hover Over Me First!']/following-sibling::div/a"));
		Assert.assertTrue(link1Hover1.isDisplayed());
		
		//Keyboard actions Select, Copy & Paste
		//Select All
		act.keyDown(Keys.CONTROL);
		act.keyDown("a");
		act.keyUp("a");
		
		//Copy
		act.keyDown("c");
		act.keyUp("c");
		
		//paste
		act.keyDown("v");
		act.keyUp("v");
		
		act.keyUp(Keys.CONTROL);
		
	}

}
