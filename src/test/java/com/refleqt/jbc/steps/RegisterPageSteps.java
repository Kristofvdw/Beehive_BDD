package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

/**
 * Created by Kristof on 25/01/2017.
 */
public class RegisterPageSteps
{
    private List<String> table;

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

    @And("I fill in the form whit the following data$")
    public void enterData(List<String> table){

        this.table = table;

        pageController.registerForm().fillRegisterForm(table);
    }
    @And("I click the register button")
    public void register()
    {
        pageController.registerForm().submitUser();
    }
    @Then("I could log in")
    public void checkRegister()
    {
       pageController.loginHeader().login(table.get(0),table.get(1));
    }
}