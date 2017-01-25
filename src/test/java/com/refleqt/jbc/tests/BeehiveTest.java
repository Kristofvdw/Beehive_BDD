package com.refleqt.jbc.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/login.feature",//Path to the tests
        tags = {"@validLogin,@invalidLogin"},//What tags to include(@)/exclude(@~)
        glue = {"com.refleqt.jbc.steps"},//Path to steps
        plugin = {"pretty", "json:target/cucumber/json/BeehiveTest.json"},
        strict = true,
        snippets = SnippetType.CAMELCASE
)
public class BeehiveTest {
}