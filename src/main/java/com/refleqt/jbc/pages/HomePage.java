package com.refleqt.jbc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "a[href$='login']")
    WebElement loginField;
    @FindBy(css = "a[href$='register']")
    WebElement registerButton;
    @FindBy(css = "a[href$='regionDashboard']")
    WebElement regionDashboard;
    @FindBy(css = "a[href$='notificationOverview']")
    WebElement notificationOverview;
    @FindBy(css = "a[href$='listApiaries']")
    WebElement listApiaries;
    @FindBy(css = "a[href='index.html#/']")
    WebElement homeLink;
    @FindBy(id="submitbutton")
    WebElement submitButton;


    public void goToLogin(){
        loginField.click();
    }
    public void goToRegister() {registerButton.click();}
    public void goToRegionDashboard()
    {
        regionDashboard.click();
    }
    public void gotoNotificationOverview()
    {
        notificationOverview.click();
    }
    public void goToApiaries()
    {
        listApiaries.click();
    }
    public void goToHome()
    {
        homeLink.click();
    }
    public void goToInspection() {

    }
    public void goToTreatment() {}
    public void goToCreateBeehive() {}
    public void goToCreateApiary() {}

    public void press_submitButton()
    {
        submitButton.click();
    }
}
