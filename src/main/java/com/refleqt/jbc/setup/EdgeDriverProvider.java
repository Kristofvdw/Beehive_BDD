package com.refleqt.jbc.setup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Kristof on 27/01/2017.
 */
public class EdgeDriverProvider
{
    private WebDriver driver = null;

    @Before
    public void createDriver() {
        String path = "src\\drivers\\MicrosoftWebDriver.exe";
        System.setProperty("webdriver.edge.driver", path);
        driver = new EdgeDriver();
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void shouldBeAbleToPerformAGoogleSearch() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.titleIs("webdriver - Google Search"));
    }
    /**Create Edge Driver instance, with desired capabilities, which is used to perform browser interactions with.*/
    public static WebDriver setupDriver() {
        String msg = "Launching Edge driver!";
        System.out.println((char)27 + "[34m" + msg + (char)27 + "[0m");
        int implicitWait = 60;
        String path = "src\\drivers\\MicrosoftWebDriver.exe";
        System.setProperty("webdriver.edge.driver", path);
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        return driver;
    }

}


