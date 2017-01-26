package com.refleqt.jbc.pages;

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
    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "cpassword")
    WebElement controlPassword;
    @FindBy(id = "firstname")
    WebElement firstname;
    @FindBy(id = "lastnameinput")
    WebElement lastname;
    @FindBy(id = "adresinput")
    WebElement adress;
    @FindBy(id = "postcodeinput")
    WebElement postcode;
    @FindBy(id = "mobileinput")
    WebElement mobile;
    @FindBy(id = "emailinput")
    WebElement mail;
    @FindBy(name = "submitbutton")
    WebElement submit;


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
}
