package com.learnselenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	
WebDriver driver;
	
	private By rows = By.xpath("//table[@id='table1']/tbody/tr");
	private By columns = By.xpath("//table[@id='table1']/thead/tr/th");
	private By headerColumns = By.xpath("//table[@id='table1']/thead/tr/th/span");
	
	@BeforeMethod
	public void initializeDriver() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	
	public int getRowsInTable() {
		return driver.findElements(rows).size();
	}
	
	public int getHeaderCount() {
		return driver.findElements(columns).size();
	}
	
	@Test(enabled=false)
	public void printAllValuesInTable() {
		int rows = getRowsInTable();
		int cols = getHeaderCount();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				String val = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("The value in Row: "+i+" and column: "+j+" is: "+val);
			}
		}
		
	}
	
	@Test
	public void printValuesBasedOnIndex() {
		System.out.println(getValueBasedOnIndex("table1", 1,4));
		System.out.println(getValueBasedOnIndex("table2", 4,2));
	}
	
	
	@Test
	public void printColIndexBasedOnName() {
		System.out.println(getColIndexBasedOnName("Last Name"));
		System.out.println(getColIndexBasedOnName("First Name"));
		System.out.println(getColIndexBasedOnName("Due"));
	}
	
	public int getColIndexBasedOnName(String colName) {
		int colIndex = 0;
		List<WebElement> headers = driver.findElements(headerColumns);
		for(WebElement ele: headers) {
			colIndex++;
			String valHeader = ele.getText().trim();
			if(valHeader.equalsIgnoreCase(colName))
				break;
		}
		return colIndex;
	}
	
	public String getValueBasedOnIndex(String tabelId, int rowIndex, int colIndex) {
		return driver.findElement(By.xpath("//table[@id='"+tabelId+"']/tbody/tr["+rowIndex+"]/td["+colIndex+"]")).getText();
	}
	
	public String getValueBasedOnColumnName(int rowIndex, String colName) {
		int colIndex = getColIndexBasedOnName(colName);
		return driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+rowIndex+"]/td["+colIndex+"]")).getText();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
