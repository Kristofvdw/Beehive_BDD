package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Kristof on 26/01/2017.
 * @doExtraction
When the extraction form opened
When I fill in the extraction form
And I press the submit button
Then I created an extraction
 */
public class HoneyExtractionSteps
{
    private PageController pageController;

    /** Constructor */
    public HoneyExtractionSteps(){
        this.pageController = PageController.getInstance();
    }
    @When("the extraction form opened")
    public void CheckOpenExtractionForm()
    {
        pageController.createHoneyExtractionPage().CheckOpenExtractionForm();
    }

    @When("I fill in the extraction form")
    public void fillExtractionForm()
    {
        pageController.createHoneyExtractionPage().fillExtractionForm();
    }

    @Then("I created an extraction")
    public void checkInspection()
    {
        pageController.createHoneyExtractionPage().checkHoneyExtraction();
    }

    @When("I got to the extraction form")
    public void goToExtractionForm()
    {
        /* Todo click inspectionForm button */
        pageController.openWebPage("http://172.16.62.26/#/createHoney_extraction");
    }
}
