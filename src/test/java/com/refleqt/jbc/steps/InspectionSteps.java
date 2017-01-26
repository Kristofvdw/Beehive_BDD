package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Kristof on 26/01/2017.
 * When the inspectie formulier opened
 When I fill in the form
 And I press the voeg toe button
 Then I created an inspection
 */
public class InspectionSteps
{
    private PageController pageController;

    /** Constructor */
    public InspectionSteps(){
        this.pageController = PageController.getInstance();
    }
    @When("the inspectie formulier opened")
    public void CheckOpenInspectionForm()
    {
        pageController.inspectionPage().CheckOpenInspectionForm();
    }
    @When("I fill in the inspection form")
    public void fillInspectionForm()
    {
        pageController.inspectionPage().fillInspectionForm();
    }
    @And("I press the submit button")
    public void clickSubmit() {pageController.inspectionPage().pressSubmit();}
    @Then("I created an inspection")
    public void checkInspection()
    {
        pageController.inspectionPage().checkInspection();
    }
}
