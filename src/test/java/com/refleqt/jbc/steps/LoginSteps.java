package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    private PageController pageController;

    /** Constructor */
    public LoginSteps(){
        this.pageController = PageController.getInstance();
    }

    @When("I login with username (\\S+) and password (\\S+)")
    public void login(String username, String password){
        pageController.loginHeader().login(username, password);
    }

    @Then("I am logged in")
    public void checkLogin(){
        pageController.loginHeader().checkLogin();
    }

    @Then("I am not logged in")
    public void notLoggedIn(){
        pageController.loginHeader().notLoggedIn();
    }
}
