package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.FindBy;

public class HomePageSteps {

    private PageController pageController;

    /** Constructor */
    public HomePageSteps(){
        this.pageController = PageController.getInstance();
    }

    @Given("I navigate to (\\S+)")
    public void openWebPage(String url){
        pageController.openWebPage(url);
    }

    @When("I go to the login section")
    public void goToLogin(){
        pageController.homePage().goToLogin();
    }
    @When("I click the regiondashboard link")
    public void goToRegionDashboard()
    {
        pageController.homePage().goToRegionDashboard();
    }
    @When("I click the notifications link")
    public void goToNotifications()
    {
        pageController.homePage().gotoNotificationOverview();
    }
    @When("I click the overzicht link")
    public void goToOverzicht()
    {
        pageController.homePage().goToApiaries();
    }



}
