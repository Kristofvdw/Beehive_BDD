package com.refleqt.jbc.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD:src/test/java/com/refleqt/jbc/tests/BeehiveTest.java
        features = "src/test/resources/Features/login.feature",//Path to the tests
        tags = {"@validLogin,@invalidLogin"},//What tags to include(@)/exclude(@~)
=======
        features = "src/test/resources/Features/createAccount.feature",//Path to the tests
        tags = {"@createAccount"},//What tags to include(@)/exclude(@~)
>>>>>>> jasper:src/test/java/com/refleqt/jbc/tests/E2ETest.java
        glue = {"com.refleqt.jbc.steps"},//Path to steps
        plugin = {"pretty", "json:target/cucumber/json/BeehiveTest.json"},
        strict = true,
        snippets = SnippetType.CAMELCASE
)
<<<<<<< HEAD:src/test/java/com/refleqt/jbc/tests/BeehiveTest.java
public class BeehiveTest {
}
=======
public class E2ETest {}
>>>>>>> jasper:src/test/java/com/refleqt/jbc/tests/E2ETest.java
