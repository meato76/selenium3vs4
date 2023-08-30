package com.cydeo.tests;

import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetMethods {

    @Test
    public void get_methods_test() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        System.out.println("googleSearchBox.getAccessibleName() = " + googleSearchBox.getAccessibleName());
        System.out.println("googleSearchBox.getAriaRole() = " + googleSearchBox.getAriaRole());
        System.out.println("googleSearchBox.getDomAttribute(\"class\") = " + googleSearchBox.getDomAttribute("class"));
        System.out.println("googleSearchBox.getDomProperty(\"class\") = " + googleSearchBox.getDomProperty("class"));

        WebElement storeLink = driver.findElement(By.xpath("//a[.='Store']"));
        System.out.println("storeLink.getAccessibleName() = " + storeLink.getAccessibleName());
        System.out.println("storeLink.getAriaRole() = " + storeLink.getAriaRole());
        System.out.println("storeLink.getDomAttribute(\"href\") = " + storeLink.getDomAttribute("href"));
        System.out.println("storeLink.getDomProperty(\"href\") = " + storeLink.getDomProperty("href"));


    }
}