package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Kristof on 26/01/2017.
 * When I fill in the treatment form
 Then I created a treatment
 */
public class TreatmentSteps
{
    @When("I fill in the treatment form")
    public void fillTreatmentForm()
    {
        PageController.getInstance().treatmentPage().fillTreatmentForm();
    }
    @Then("I created a treatment")
    public void checkCreateTreatment()
    {
        PageController.getInstance().treatmentPage().checkSuccessTreatment();
    }
}
