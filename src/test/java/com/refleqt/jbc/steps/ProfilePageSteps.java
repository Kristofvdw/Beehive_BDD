package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.Then;

public class ProfilePageSteps {

    private PageController pageController;

    /** Constructor */
    public ProfilePageSteps(){
        this.pageController = PageController.getInstance();
    }

    @Then("I am logged in")
    public void checkLogin(){
        pageController.profilePage().checkLogin();
    }
}
