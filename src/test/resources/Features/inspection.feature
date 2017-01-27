@inspection
Feature: als imker kan ik een inspectie doen

  Background:
    Given I navigate to http://172.16.62.26/index.html?#/createInspection

  @doInspection
  Scenario: de imker opent het inspectieformulier en vult het in
    When I got to the inspection form
    When the inspectie formulier opened
    When I fill in the inspection form
    And I press the submit button
    Then I created an inspection