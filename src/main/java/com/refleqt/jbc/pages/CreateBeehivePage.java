package com.refleqt.jbc.pages;

import org.junit.Assert;
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
    @FindBy(id="extra_hive_parts")
    WebElement extraHivePartsField;
    @FindBy(id="in_use")
    WebElement inUseCheckbox;


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
        Select extraSelect = new Select(extraHivePartsField);
        extraSelect.selectByValue("8");
    }
    public void submit()
    {
        Assert.assertTrue(true);
    }

    public void checkAddedBeehive()
    {
        Assert.assertTrue(true);
    }

}