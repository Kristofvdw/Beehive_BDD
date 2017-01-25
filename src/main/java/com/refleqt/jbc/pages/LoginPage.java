package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "edit-name")
    WebElement usernameField;

    @FindBy(id = "edit-pass")
    WebElement pwdField;

    @FindBy(id = "edit-submit")
    WebElement loginButton;

    @FindBy(css = "div[class$='error']")
    WebElement errorField;

    public void login(String username, String password){
        usernameField.sendKeys(username);
        pwdField.sendKeys(password);
        loginButton.click();
    }

    public void notLoggedIn(){
        Assert.assertTrue(errorField.getText().toLowerCase().contains("gebruikersnaam of wachtwoord is onbekend."));
    }

}
