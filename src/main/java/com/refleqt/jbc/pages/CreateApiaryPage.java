package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Kristof on 7/02/2017.
 */
public class CreateApiaryPage
{
    @FindBy(name = "ApiaryForm")
    WebElement apiaryForm;
    @FindBy(id = "name")
    WebElement nameField;
    @FindBy(id = "address")
    WebElement addressField;
    @FindBy(id = "postcode")
    WebElement postcodeField;


    public void checkApiaryFormOpened() {
        Assert.assertNotNull(apiaryForm);
    }

    public void enterName(String naam)
    {
        nameField.sendKeys(naam);
    }

    public void enterPlace(String plaats) {
        addressField.sendKeys(plaats);
    }

    public void enterPostcode(String postcode)
    {
        postcodeField.sendKeys(postcode);
    }

    public void checkCreateApiary()
    {
        Assert.assertTrue(true);
    }
}
