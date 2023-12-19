package com.learnselenium.excelutils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExcel {

    @Test(dataProvider = "test123")
    public void testWithExcelData(String firstName, String lastName, String email, String phone) {
        System.out.println("FirstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);

        // Your test logic here
    }

    @DataProvider(name = "FormData")
    public Object[][] testData() {
        return ExcelDataReader.readTestData();
    }
    
    @DataProvider(name = "test123")
    public Object[][] testData2() {
        return ExcelDataReader.readTestData();
    }
}

