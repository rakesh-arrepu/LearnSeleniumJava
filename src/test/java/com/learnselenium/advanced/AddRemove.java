package com.learnselenium.advanced;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddRemove {

	static int noOfAddClicks = 4;
	static int noOfDeleteClicks = 2;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			System.out.println("Webdriver intitated");
			driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Element']")));

			
			//TC -1
			WebElement addElement = driver.findElement(By.xpath("//button[text()='Add Element']"));
			Thread.sleep(4000);
			if (addElement.isEnabled() && noOfAddClicks > 0) {
				for (int i = 0; i < noOfAddClicks; i++) {
					addElement.click();
					System.out.println("Add Element clicked - " + i);
				}
			}

			List<WebElement> deletButtons = driver
					.findElements(By.xpath("//div[@id='elements']/button[text()='Delete']"));
			Assert.assertTrue(deletButtons.size() == noOfAddClicks);
			System.out.println("Delete Elements Size -" + deletButtons.size());
			Thread.sleep(4000);
			
			
			
			//TC-2
			for (int i = 0; i < noOfDeleteClicks; i++) {
				deletButtons.get(i).click();
				System.out.println("Delete Element clicked - " + i);
			}
			List<WebElement> deletButtonsAfterremove = driver
					.findElements(By.xpath("//div[@id='elements']/button[text()='Delete']"));
			Assert.assertTrue(deletButtonsAfterremove.size() == noOfAddClicks - noOfDeleteClicks);
			System.out.println("Delete Elements Size -" + deletButtonsAfterremove.size());
			Thread.sleep(4000);
			
		} finally {
			driver.quit();
		}

	}

}
