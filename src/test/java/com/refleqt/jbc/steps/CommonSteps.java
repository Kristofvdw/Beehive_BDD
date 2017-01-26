package com.refleqt.jbc.steps;

import com.refleqt.jbc.support.PageController;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class CommonSteps {
    /** Members */
    private PageController pageController;

    /** Constructor */
    public CommonSteps() {
        this.pageController = PageController.getInstance();
    }

    /** Steps to perform before and after scenario */
    @Before
    public void beforeScenario() {
        pageController.setupDriver();
    }

    @After
    public void afterScenario() {
        pageController.tearDownDriver();
    }
}
