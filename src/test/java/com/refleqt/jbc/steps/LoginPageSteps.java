package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {

    private PageController pageController;

    /** Constructor */
    public LoginPageSteps(){
        this.pageController = PageController.getInstance();
    }

    @When("I login with username (\\S+) and password (\\S+)")
    public void login(String username, String password){
        pageController.loginPage().login(username, password);
    }

    @Then("I am not logged in")
    public void notLoggedIn(){
        pageController.loginPage().notLoggedIn();
    }
}
