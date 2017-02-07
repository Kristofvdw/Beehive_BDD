package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Kristof on 7/02/2017.
 * @createApiary
Feature: als imker kan ik een bijenstand registreren

Background:
Given I navigate to http://172.16.62.26/index.html?#/createApiary

 @fillApiaryForm
 Scenario: de imker drukt op nieuwe bijenstand en vult het formulier in
 When the bijenstand formulier opened
 When I enter the bijenstand name with name Bijenstand
 And I enter the place Hasselt
 And I enter the postcode 1000
 And I press the voeg toe button
 Then I created a bijenstand
 */
public class CreateApiarySteps
{
    private PageController pageController;
    public CreateApiarySteps(){
        this.pageController = PageController.getInstance();
    }
    @When("the bijenstand formulier opened")
    public void checkApiaryFormOpened()
    {
        pageController.createApiaryPage().checkApiaryFormOpened();
    }
    @When("I enter the bijenstand name with name (\\S+)")
    public void enterName(String naam) {
        pageController.createApiaryPage().enterName(naam);
    }
    @And("I enter the place (\\S+)")
    public void enterPlace(String plaats) {
        pageController.createApiaryPage().enterPlace(plaats);
    }
    @And("I enter the postcode (\\S+)")
    public void enterPostcode(String postcode) {
        pageController.createApiaryPage().enterPostcode(postcode);
    }
    @Then("I created a bijenstand")
    public void checkCreateApiary() {
        pageController.createApiaryPage().checkCreateApiary();
    }

}
