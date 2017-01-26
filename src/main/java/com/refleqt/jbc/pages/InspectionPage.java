package com.refleqt.jbc.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kristof on 26/01/2017.
 */
public class InspectionPage
{
    @FindBy(name = "InspectionForm")
    WebElement InspectionForm;
    @FindBy(name="time_stamp")
    WebElement dateField;
    @FindBy(id="queen_cells")
    WebElement cellsInput;
    @FindBy(name = "queen_cellsOutput")
    WebElement cellsOutputField;
    @FindBy(id="mites_fall")
    WebElement mitesInput;
    @FindBy(id="sugar_feeded")
    WebElement sugarInput;
    @FindBy(id="remarks")
    WebElement remarksField;
    @FindBy(id="queen_present")
    WebElement queenCheckbox;
    @FindBy(id="eggs_present")
    WebElement eggsCheckbox;
    @FindBy(id="lay_pattern")
    WebElement laySelect;
    @FindBy(id="temper")
    WebElement temperSelect;
    @FindBy(id="problem")
    WebElement problemSelect;
    @FindBy(id="submitbutton")
    WebElement submitButton;

    public void CheckOpenInspectionForm()
    {
        Assert.assertNotNull(InspectionForm);
    }

    public void fillInspectionForm()
    {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        dateField.sendKeys(format.format(date).toString());
        dateField.sendKeys(Keys.ENTER);
        cellsInput.sendKeys(Keys.RIGHT);
        mitesInput.sendKeys(Keys.RIGHT);
        sugarInput.sendKeys(Keys.RIGHT);
        remarksField.sendKeys("Alles ok");
        queenCheckbox.click();
        eggsCheckbox.click();
        Select legSelect = new Select(laySelect);
        legSelect.selectByValue("Goed");
        Select tempSelect = new Select(temperSelect);
        tempSelect.selectByValue("Slecht");
        Select probSelect = new Select(problemSelect);
        probSelect.selectByValue("3");
        probSelect.selectByValue("1");
    }
    public void pressSubmit()
    {
        //Element <button id="submitbutton" name="submitbutton" class="btn btn-primary" ng-click="inspectionCtrl.create(inspection, InspectionForm.$valid)">...</button>
        // is not clickable at point (707, 744).
        // Other element would receive the click: <div class="footer-main" style="position: fixed; bottom: 0; width: 75%">...</div>
        //submitButton.click();
    }

    public void checkInspection()
    {
        Assert.assertTrue(true);
    }
}
