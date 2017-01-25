package com.refleqt.jbc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLSelectElement;

/**
 * Created by Kristof on 25/01/2017.
 */
public class RegisterForm
{
    @FindBy(id = "edit-first-name")
    WebElement firstNameField;
    @FindBy(id = "edit-last-name")
    WebElement lastNameField;
    @FindBy(id = "edit-gender-m")
    WebElement genderField;
    @FindBy(id = "edit-birth-date-day")
    WebElement birthDayField;
    @FindBy(id = "edit-birth-date-month")
    Select birthMonthField;
    @FindBy(id = "edit-birth-date-year")
    Select birthYearField;
    @FindBy(id = "edit-street-name")
    WebElement streetNameField;
    @FindBy(id = "edit-house-number")
    WebElement houseNumberField;
    @FindBy(id = "edit-box-number")
    WebElement boxNumberField;
    @FindBy(id = "edit-postal-code")
    WebElement postalCodeField;
    @FindBy(id = "edit-city")
    WebElement cityField;
    @FindBy(id = "edit-country")
    HTMLSelectElement countryField;
    @FindBy(id = "edit-telephone")
    WebElement telephoneField;

    public void fillRegisterForm(String username)
    {
        firstNameField.sendKeys(username);
        lastNameField.sendKeys("Curry");
        //genderField.click();
        //(Select)birthDayField.s;
        birthMonthField.selectByVisibleText("Dec");
        birthYearField.selectByVisibleText("1992");
        streetNameField.sendKeys("Koedriesstraat");
        houseNumberField.sendKeys("3");
        boxNumberField.sendKeys("");
        postalCodeField.sendKeys("3950");
        cityField.sendKeys("Genk");
        countryField.setValue("Thailand");
        telephoneField.sendKeys("0478987648");
    }

    public boolean checkRegister()
    {
        return true;
    }
}
