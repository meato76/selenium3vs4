package com.cydeo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class RelativeLocators {

    @Test
    public void relative_locators_test() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement aboutLink = driver.findElement(By.cssSelector("a[class='MV3Tnb']"));

        WebElement storeLink1 = driver.findElement(By.cssSelector("a[class='MV3Tnb']"));
        System.out.println("storeLink.getText() = " + storeLink1.getText());

        WebElement storeLink2 = driver.findElement(RelativeLocator.with(By.cssSelector("a[class='MV3Tnb']")).toRightOf(aboutLink));
        System.out.println("storeLink.getText() = " + storeLink2.getText());





    }
}