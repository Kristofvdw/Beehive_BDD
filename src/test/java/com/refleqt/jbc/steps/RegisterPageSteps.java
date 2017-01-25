package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Kristof on 25/01/2017.
 */
public class RegisterPageSteps
{
    private PageController pageController;
    /** Constructor */
    public RegisterPageSteps(){
        this.pageController = PageController.getInstance();
    }

    @When("I click on the register button")
    public void goToRegisterPage()
    {
        pageController.homePage().goToRegister();
    }
    @And("I click on register as a candidate button")
    public void clickRegisterAsCandidate()
    {
        pageController.homePage().clickRegisterAsCandidate();
    }
    @And("I register with username (\\S+) and password (\\S+)")
    public void fillRegisterForm(String username)
    {
        pageController.registerForm().fillRegisterForm(username);
    }
    @Then("I am registered")
    public void checkRegister()
    {
        Assert.assertTrue(pageController.registerForm().checkRegister());
    }
}
