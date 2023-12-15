package com.learnselenium.assignments.naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
    public static void main(String[] args){
        ChromeDriver driver = new ChromeDriver();
        //Enter into Website
        driver.get("https://test.qatechhub.com/form-elements/");
        driver.manage().window().maximize();
        //Click on Checknoxes
        //driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
        //Click on context_menu
        //driver.findElement(By.xpath("//a[@href='/context_menu']")).click();
        //driver.findElement(By.xpath("//a[@href='#home']")).click();
        //driver.findElement(By.xpath("//a[@href='redirect']")).click();
//        driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']")).click();
//        driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']")).sendKeys("Anakapalli");
        driver.findElement(By.xpath("//input[@id='wpforms-49-field_1']")).click();
        driver.findElement(By.xpath("//input[@id='wpforms-49-field_1']")).sendKeys("Peketi");
        driver.findElement(By.xpath("//input[@id='wpforms-49-field_1-last']")).click();
        driver.findElement(By.xpath("//input[@id='wpforms-49-field_1-last']")).sendKeys("Naresh");
        driver.findElement(By.xpath("//input[@id='wpforms-49-field_2']")).click();
        driver.findElement(By.xpath("//input[@id='wpforms-49-field_2']")).sendKeys("naresh25369@gmail.com");
        driver.findElement(By.xpath("//input[@id='wpforms-49-field_4']")).click();
        driver.findElement(By.xpath("//input[@id='wpforms-49-field_4']")).sendKeys("9010037751");
        driver.findElement(By.xpath("//input[@id='wpforms-49-field_3_1']")).click();
        driver.findElement(By.xpath("//select[@id='wpforms-49-field_5']")).click();
        driver.findElement(By.xpath("//select[@id='wpforms-49-field_5']/option[@value='Cypress']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();




        //driver.quit();

    }

}
