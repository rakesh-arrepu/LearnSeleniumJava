package com.learnselenium.assignments.naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Day2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();
//        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@id='firstName']")).click();
//        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Peketi");
//        driver.findElement(By.xpath("//input[@id='lastName']")).click();
//        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Naresh");
//        driver.findElement(By.xpath("//input[@id='email']")).click();
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qwerty12345678@gmail.com");
//        driver.findElement(By.xpath("//input[@id='password']")).click();
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nare$h@28");
//        driver.findElement(By.xpath("//button[@id='submit']")).click();
//        Thread.sleep(1000);

//        TC-02
//        WebElement headerElement = driver.findElement(By.xpath("//span[@id='error']"));
//        String actualHeader = headerElement.getText();
//        Assert.assertEquals(actualHeader, "Email address is already in use");
//
//        TC-03
//        driver.findElement(By.xpath("//button[@id='add-contact']")).click();
//        driver.findElement(By.xpath("//input[@id='firstName']")).click();
//        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Peketi");
//        driver.findElement(By.xpath("//input[@id='lastName']")).click();
//        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Naresh");
//        driver.findElement(By.xpath("//input[@id='birthdate']")).click();
//        driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("1992-05-28");
//        driver.findElement(By.xpath("//input[@id='email']")).click();
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qwerty12345678@gmail.com");
//        driver.findElement(By.xpath("//input[@id='phone']")).click();
//        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9876543210");
//        driver.findElement(By.xpath("//input[@id='street1']")).click();
//        driver.findElement(By.xpath("//input[@id='street1']")).sendKeys("Ummalada");
//        driver.findElement(By.xpath("//input[@id='street2']")).click();
//        driver.findElement(By.xpath("//input[@id='street2']")).sendKeys("Anakapalli");
//        driver.findElement(By.xpath("//input[@id='city']")).click();
//        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Visakhapatnam");
//        driver.findElement(By.xpath("//input[@id='stateProvince']")).click();
//        driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys("Anadhra Pradesh");
//        driver.findElement(By.xpath("//input[@id='postalCode']")).click();
//        driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("531001");
//        driver.findElement(By.xpath("//input[@id='country']")).click();
//        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
//        driver.findElement(By.xpath("//button[@id='submit']")).click();
//
//        WebElement headerElement = driver.findElement(By.tagName("h1"));
//        String actualHeader = headerElement.getText();
//        Assert.assertEquals(actualHeader, "Contact List");

//          TC4
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']")).click();
        driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']/option[1]")).click();
        driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']")).click();
        driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']/option[3]")).click();
        driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']")).click();
        driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']/option[4]")).click();
        //check box
        WebElement option2 = driver.findElement(By.xpath("//input[@value='option-2']"));
        Assert.assertTrue(option2.isSelected(),"Option2 is not ticked");


        driver.findElement(By.xpath("//form[@id='radio-buttons']/input[@value='yellow']")).click();


//        driver.quit();
        
    }
}
