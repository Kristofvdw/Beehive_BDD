package com.refleqt.jbc.support;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;

import java.awt.*;
import java.util.concurrent.TimeUnit;


public class DriverProvider {

    /**The WebDriver instance which is used to perform browser interactions with.*/
    protected static WebDriver driver;

    /**Create WebDriver instance, with desired capabilities, which is used to perform browser interactions with.*/
    public static WebDriver setupDriver() {
        int implicitWait = 60;
        //Create chromeDriver
        String path = "src\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver(createLocalCapabilities());
        //Maximize screen
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Point position = new Point(0, 0);
        driver.manage().window().setPosition(position);
        Dimension maximizedScreenSize = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
        driver.manage().window().setSize(maximizedScreenSize);
        driver.manage().window().maximize();
        //Set timeout
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        return driver;
    }

    private static DesiredCapabilities createLocalCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("unexpectedAlertBehaviour", "accept");
        capabilities.setCapability("ensureCleanSession",true);
        capabilities.setCapability("enableNativeEvents", false);
        capabilities.setCapability("requireWindowFocus", true);
        capabilities.setCapability("trustAllSslCertificates",true);
        capabilities.setCapability("unexpectedAlertBehaviour", "accept");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        capabilities.setCapability(ChromeOptions.CAPABILITY,options);
        return capabilities;
    }
}
