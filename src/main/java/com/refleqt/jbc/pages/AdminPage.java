package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Kristof on 26/01/2017.
 */
public class AdminPage
{
    @FindBy(id = "logoutButton")
    WebElement logoutButton;

    public void checkLogin()
    {
        Assert.assertNotNull(logoutButton);
    }
}
