package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLSelectElement;

import java.util.List;

/**
 * Created by Kristof on 25/01/2017.
 */
public class RegisterForm
{
    //@FindBy(xpath = "form[@id='username']\")")
    @FindBy(id = "username")
    WebElement username;
    //@FindBy(xpath = "form[@id='password']\")")
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "cpassword")
    WebElement controlPassword;
    @FindBy(id = "firstname")
    WebElement firstname;
    @FindBy(id = "lastname")
    WebElement lastname;
    @FindBy(id = "adresinput")
    WebElement adress;
    @FindBy(id = "postcode")
    WebElement postcode;
    @FindBy(id = "mobile")
    WebElement mobile;
    @FindBy(id = "email")
    WebElement mail;
    @FindBy(id = "submitbutton")
    WebElement submit;
    @FindBy(css = "button[ng-click='homeCtrl.okRegModal()']")
    WebElement okbutton;


    public void fillRegisterForm(List<String> table)
    {
        int i = 0;
        for (String data : table)
        {
            System.out.println(i + " " + data);
            i++;
        }

        username.sendKeys(table.get(0));
        password.sendKeys(table.get(1));
        controlPassword.sendKeys(table.get(2));
        firstname.sendKeys(table.get(3));
        lastname.sendKeys(table.get(4));
        adress.sendKeys(table.get(5));
        postcode.sendKeys(table.get(6));
        mobile.sendKeys(table.get(7));
        mail.sendKeys(table.get(8));
    }

    public void submitUser()
    {
        submit.click();
    }
    public void onlyFillUniqueFields(String name, String pass, String email)
    {
        username.sendKeys(name);
        password.sendKeys(pass);
        controlPassword.sendKeys(pass);
        mail.sendKeys(email);
        submit.click();
    }

    public void checkRegisterSuccess()
    {
        okbutton.click();
        //To implement, check if the success message shows
        Assert.assertTrue(true);
    }
}
