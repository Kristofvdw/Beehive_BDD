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
    public void notLoggedIn(){
        Assert.assertTrue(errorField.getText().toLowerCase().contains("login gevevens zijn onjuist"));
    }
    public void checkLogin()
    {
        Assert.assertNotNull(logoutButton);
    }
}
