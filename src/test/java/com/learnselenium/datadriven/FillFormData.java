package com.learnselenium.datadriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.learnselenium.excelutils.ExcelDataReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FillFormData {
	
	private By firstName = By.xpath("//label[text()='First']/preceding-sibling::input");
	private By lastName = By.xpath("//label[text()='Last']/preceding-sibling::input");
	private By email = By.xpath("//label[normalize-space(text())='Email']/following-sibling::input");
	private By phone = By.xpath("//input[@type='number']");
	private By ddlCourse = By.id("wpforms-49-field_5");
	private By btnSubmit = By.xpath("//button[@type='submit']");
	private By success = By.xpath("//p[text()='You have successfully filled in the form!']");
	
	WebDriver driver;
	
	@BeforeMethod
	public void initializeDriver() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://test.qatechhub.com/form-elements/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(dataProvider="qatechTestData")  
	public void fillForm(String txtFirstName, String txtLastName, String txtEmail, String txtPhone,  String txtGender, String txtCourse) throws InterruptedException {
		WebElement eleFirstName = driver.findElement(firstName);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(eleFirstName));
		
		driver.findElement(firstName).sendKeys(txtFirstName);
		driver.findElement(lastName).sendKeys(txtLastName);
		driver.findElement(email).sendKeys(txtEmail);
		driver.findElement(phone).sendKeys(txtPhone);
		clickGender(driver, txtGender);
		WebElement ddl = driver.findElement(ddlCourse);
		Select sel = new Select(ddl);
		sel.selectByValue(txtCourse); 
		driver.findElement(btnSubmit).click();
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.findElement(success).isDisplayed());
		
	}
	
	public static void clickGender(WebDriver driver, String gender) {
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding-sibling::input"));
		if(!checkbox.isSelected())
			checkbox.click();
		
		System.out.println("Clicked on "+gender+" Checbox");
	};
	
	
	@DataProvider(name="qatechTestData")
	public Object[][] getTestData(){
		return ExcelDataReader.readTestData();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
