package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Kristof on 25/01/2017.
 */
public class LoginHeader
{
    @FindBy(id = "loginUsername")
    WebElement usernameField;

    @FindBy(id = "loginPassword")
    WebElement pwdField;

    @FindBy(id = "loginButton")
    WebElement loginButton;

    @FindBy(css = "label[ng-if='lc.error == 1'")
    WebElement errorField;

    @FindBy(id = "logoutButton")
    WebElement logoutButton;

    @FindBy(id = "registerButton")
    WebElement registerButton;


    public void login(String username, String password){
        usernameField.sendKeys(username);
        pwdField.sendKeys(password);
        loginButton.click();
    }
    public void notLoggedIn()
    {
        //Er zou een errorfield moeten verschijnen.
        Assert.assertNotNull(errorField);
        Assert.assertTrue(errorField.getText().toLowerCase().contains("incorrect"));
    }
    public void checkLogin()
    {
        //Loginbutton should disappear, logout should appear
        Assert.assertNotNull(logoutButton);
        Assert.assertNull(loginButton);
    }
}
