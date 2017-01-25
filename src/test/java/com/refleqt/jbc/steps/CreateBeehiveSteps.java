package com.refleqt.jbc.steps;

import com.refleqt.jbc.pages.CreateBeehivePage;
import com.refleqt.jbc.support.PageController;
import cucumber.api.java.en.When;
import cucumber.api.java.en.*;

/**
 * Created by Kristof on 25/01/2017.
 * When I enter the with name BeehiveNaam
 And I press the voeg toe button
 Then I created a bijenkast
 */
public class CreateBeehiveSteps
{
    private PageController pageController;

    /** Constructor */
    public CreateBeehiveSteps(){
        this.pageController = PageController.getInstance();
    }
    @When("the bijenkast formulier opened")
    public void checkOpened()
    {
        pageController.createBeehivePage().checkOpenedForm();
    }

    @When("I enter the with name (\\S+)")
    public void fillForm(String name)
    {
        pageController.createBeehivePage().fillForm(name);
    }

    @And("I press the voeg toe button")
    public void voegToe()
    {
        pageController.createBeehivePage().submit();
    }

    @Then("I created a bijenkast")
    public void checkAddedBeehive()
    {
        pageController.createBeehivePage().checkAddedBeehive();
    }

}
