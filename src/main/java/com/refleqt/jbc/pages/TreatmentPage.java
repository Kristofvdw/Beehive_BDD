package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kristof on 26/01/2017.
 */
public class TreatmentPage
{
    @FindBy(name="TreatmentForm")
    WebElement treatmentForm;

    @FindBy(id="treatment_type")
    WebElement typeSelect;

    @FindBy(id="time_stamp")
    WebElement dateField;

    public void checkOpenedForm()
    {
        Assert.assertNotNull(treatmentForm);
    }

    public void fillTreatmentForm()
    {
        Select legSelect = new Select(typeSelect);
        legSelect.selectByValue("1");
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        dateField.sendKeys(format.format(date).toString());
    }

    public void checkSuccessTreatment()
    {
        /* To do Implement test */
        Assert.assertTrue(true);
    }
}
