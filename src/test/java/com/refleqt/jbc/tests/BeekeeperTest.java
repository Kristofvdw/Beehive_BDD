package com.refleqt.jbc.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Kristof on 26/01/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Features/",//Path to the tests
        tags = {"@newUser","~@ignore"},//What tags to include(@)/exclude(@~)
        glue = {"com.refleqt.jbc.steps"},//Path to steps
        plugin = {"pretty", "html:target/cucumber"},
        strict = true,
        snippets = SnippetType.CAMELCASE
)
public class BeekeeperTest {
}
