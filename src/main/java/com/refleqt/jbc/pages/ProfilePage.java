package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

    @FindBy(css = "a[href$='/user/profile'")
    WebElement userNameField;

    public void checkLogin(){
        Assert.assertEquals("wim test",userNameField.getText().toLowerCase());
    }

}
