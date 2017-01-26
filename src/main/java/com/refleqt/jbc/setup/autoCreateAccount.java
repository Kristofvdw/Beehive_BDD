package com.refleqt.jbc.setup;

import com.refleqt.jbc.support.DriverProvider;
import com.refleqt.jbc.support.PageController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertTrue;
import org.openqa.selenium.*;

/**
 * Created by Kristof on 26/01/2017.
 */
public class autoCreateAccount
{
    protected WebDriver driver;
    @Before
    public void setUp()
    {
        DriverProvider driverProvider = new DriverProvider();
        driver = driverProvider.setupDriver();
    }
    @Test
    public void testRegister()
    {
        driver.get("http://172.16.62.26/index.html#/register");
        driver.findElement(By.name("RegisterForm"));
        Boolean isPresent = driver.findElements(By.name("RegisterForm")).size() > 0;
        assertTrue(isPresent);
        fillRegisterForm();
        //Wait and test
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        assertTrue(driver.getCurrentUrl().equals("http://172.16.62.26/index.html#/"));
    }
    public void fillRegisterForm()
    {
        driver.findElement(By.id("username")).sendKeys("Mark");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("cpassword")).sendKeys("Password123");
        driver.findElement(By.id("firstname")).sendKeys("firstname");
        driver.findElement(By.id("lastnameinput")).sendKeys("lastnameinput");
        driver.findElement(By.id("adresinput")).sendKeys("adress 45");
        driver.findElement(By.id("postcodeinput")).sendKeys("3600");
        driver.findElement(By.id("mobileinput")).sendKeys("0479648234");
        driver.findElement(By.id("emailinput")).sendKeys("kristof@mail.be");
        driver.findElement(By.id("submitbutton")).click();
    }
    @After
    public void afterRegister() {
        driver.quit();
    }
}
