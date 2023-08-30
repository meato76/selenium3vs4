package com.cydeo.tests;

import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindowTab {

    @Test
    public void new_window_tab_test(){

        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.get("https://www.etsy.com");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://www.tesla.com");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.amazon.com");

    }
}
