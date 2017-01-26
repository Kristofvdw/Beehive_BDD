package com.refleqt.jbc.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Kristof on 26/01/2017.
 * Makes a headless driver provider
 * Usefull for setup scripts or other tests
 */
public class PhantomDriverProvider
{
    protected static WebDriver driver;
    //method to test the Phantomjs driver
    public static void main(String[] args)
    {
        driver = setupDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Guru99");
        element.submit();
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
    /**Create PhantomJS instance, with desired capabilities, which is used to perform browser interactions with.*/
    public static WebDriver setupDriver() {
        int implicitWait = 60;
        String path = "src\\drivers\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe";
        System.setProperty("phantomjs.binary.path", path);
        WebDriver driver = new PhantomJSDriver();
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        return driver;
    }
}
