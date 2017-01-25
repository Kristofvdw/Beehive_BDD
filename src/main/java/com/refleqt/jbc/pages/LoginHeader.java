package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Kristof on 25/01/2017.
 */
public class LoginHeader
{
    @FindBy(css = "input[ng-model='user.username']")
    WebElement usernameField;

    @FindBy(css = "input[ng-model='user.password']")
    WebElement pwdField;

    @FindBy(css = "input[value='Login!']")
    WebElement loginButton;

    @FindBy(css = "label[ng-if='lc.error == 1'")
    WebElement errorField;

    @FindBy(css = "input[value='Logout']")
    WebElement logoutButton;

    public void login(String username, String password){
        usernameField.sendKeys(username);
        pwdField.sendKeys(password);
        loginButton.click();
    }
    public void notLoggedIn(){
        Assert.assertTrue(errorField.getText().toLowerCase().contains("gebruikersnaam of het wachtwoord is incorrect"));
    }
    public void checkLogin()
    {
        Assert.assertNotNull(logoutButton);
    }
}
