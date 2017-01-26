package com.refleqt.jbc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "a[href$='login']")
    WebElement loginField;
    @FindBy(css = "a[href$='register']")
    WebElement registerButton;
    @FindBy(css = "a[href$='candidate/register']")
    WebElement candidateButton;

    public void goToLogin(){
        loginField.click();
    }
    public void goToRegister() {registerButton.click();}

    public void goToInspection() {}
    public void goToTreatment() {}
    public void goToCreateBeehive() {}
    public void goToCreateApiary() {}


    public void clickRegisterAsCandidate() {
        candidateButton.click();
    }
}
