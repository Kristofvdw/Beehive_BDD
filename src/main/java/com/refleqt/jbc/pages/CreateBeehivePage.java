package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Kristof on 25/01/2017.
 */
public class CreateBeehivePage
{
    @FindBy(name = "BeehiveForm")
    WebElement BeehiveForm;

    @FindBy(id="name")
    WebElement nameField;

    @FindBy(id="beehive_type")
    WebElement typeField;
    @FindBy(id="beehive_origin")
    WebElement originField;
    @FindBy(name = "apiaryCheckbox")
    WebElement apiaryCheckbox;
    @FindBy(id="apiary")
    WebElement apiaryDropdown;
    @FindBy(name="queenCheckbox")
    WebElement queenCheckbox;
    @FindBy(id="queen")
    WebElement queenDropdown;
    @FindBy(id="extra_hive_parts")
    WebElement extraHivePartsField;
    @FindBy(id="in_use")
    WebElement inUseCheckbox;
    @FindBy(id="submitButton")
    WebElement submitButton;


    public void checkOpenedForm()
    {
        Assert.assertNotNull(BeehiveForm);
    }
    public void fillForm(String name)
    {
        nameField.sendKeys(name);
        Select typeSelect = new Select(typeField);
        typeSelect.selectByValue("2");
        Select originSelect = new Select(originField);
        originSelect.selectByValue("1");
        apiaryCheckbox.click();
        queenCheckbox.click();
        Select queenSelect = new Select(queenDropdown);
        queenSelect.selectByValue("2");
        extraHivePartsField.sendKeys(Keys.RIGHT);
        inUseCheckbox.click();
    }
    public void submit()
    {
        submitButton.click();
        //To Do
        Assert.assertTrue(true);
    }

    public void checkAddedBeehive()
    {
        //To Do
        Assert.assertTrue(true);
    }

}
