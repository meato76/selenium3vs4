package com.cydeo.tests;

import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowMinimize {

    @Test
    public void window_minimize_test(){

        WebDriver driver = new ChromeDriver();

        BrowserUtils.sleep(3);

        driver.manage().window().maximize();

        BrowserUtils.sleep(3);

        driver.manage().window().minimize();

    }
}
