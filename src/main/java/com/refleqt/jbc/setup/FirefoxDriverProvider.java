package com.refleqt.jbc.setup;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

import static com.refleqt.jbc.setup.PhantomDriverProvider.driver;

/**
 * Created by Kristof on 27/01/2017.
 */
public class FirefoxDriverProvider
{
    private WebDriver driver = null;

    @Before
    public void createDriver() {
        String path = "src\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path);
        driver = new FirefoxDriver();
    }

    @After
    public void quitDriver() {
        //driver.quit();
    }

    @Test
    public void shouldBeAbleToPerformAGoogleSearch() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.titleIs("webdriver - Google zoeken"));
    }
    /**Create Edge Driver instance, with desired capabilities, which is used to perform browser interactions with.*/
    public static WebDriver setupDriver() {
        String msg = "Launching Firefox driver!";
        System.out.println((char)27 + "[34m" + msg + (char)27 + "[0m");
        int implicitWait = 60;
        String path = "src\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path);
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        return driver;
    }
    //De frontend is nog een beetje onbeveiligd
    @Test
    public void hackTheSite()
    {
        driver.get("http://172.16.62.26/#/");
        //Make sure we are on the website
        Assert.assertEquals(driver.getTitle(),"B-Central");
        com.refleqt.jbc.setup.SessionStorage ss = new com.refleqt.jbc.setup.SessionStorage(driver);
        ss.setItemInSessionStorage("username","Mark");
        String hash = null;
        try {
            hash = DatatypeConverter.printHexBinary(
                    MessageDigest.getInstance("SHA-256").digest("Password123".getBytes("UTF-8")));
            System.out.println(hash);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        ss.setItemInSessionStorage("password",hash);
        //ss.setItemInSessionStorage("password",hash);
        ss.setItemInSessionStorage("role","ADMIN");
        driver.navigate().refresh();
        ss.getItemFromSessionStorage("username");
        ss.getItemFromSessionStorage("password");
        System.out.println(ss.getItemFromSessionStorage("role"));
        System.out.println(hash);
    }
}
