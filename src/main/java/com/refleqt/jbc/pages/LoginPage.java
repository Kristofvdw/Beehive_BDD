package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    /*
    //Enter username
        driver.findElement(By.cssSelector("input[ng-model='user.username']")).sendKeys(username);
        //Enter password
        driver.findElement(By.cssSelector("input[ng-model='user.password']")).sendKeys(password);
        //Click submit or press enter
        driver.findElement(By.cssSelector("input[ng-click='lc.login(user)']")).sendKeys(Keys.RETURN);
        //driver.findElement(By.cssSelector("input[ng-click='lc.login(user)']")).click();*/

    @FindBy(css = "input[ng-model='user.username")
    WebElement usernameField;

    @FindBy(css = "input[ng-model='user.password']")
    WebElement pwdField;

    @FindBy(id = "input[ng-click='lc.login(user)")
    WebElement loginButton;

    @FindBy(css = "ng-if='lc.error == 1'")
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
