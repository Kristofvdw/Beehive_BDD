package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kristof on 26/01/2017.
 */
public class CreateHoneyExtractionPage
{
    @FindBy(name = "Honey_extractionForm")
    WebElement honeyForm;

    @FindBy(id = "time_stamp")
    WebElement dateField;
    @FindBy(id = "weight")
    WebElement weightInput;
    @FindBy(id = "humidity")
    WebElement humidityInput;
    @FindBy(id = "nectar_origin")
    WebElement origin;
    @FindBy(id = "description")
    WebElement description;
    @FindBy(id = "submitbutton")
    WebElement submit;

    public void fillExtractionForm()
    {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        dateField.sendKeys(format.format(date).toString());
        dateField.sendKeys(Keys.ENTER);
        weightInput.sendKeys("40");
        humidityInput.sendKeys(Keys.RIGHT);
        origin.sendKeys("Genk Stad");
        description.sendKeys("Beschrijving voor deze honey extraction");
    }
    public void checkHoneyExtraction() {
        /* To Do implement tests */
        Assert.assertTrue(true);
    }
    public void CheckOpenExtractionForm() {
        Assert.assertNotNull(honeyForm);
    }
    public void pressSubmit()
    {
        submit.click();
    }
}
