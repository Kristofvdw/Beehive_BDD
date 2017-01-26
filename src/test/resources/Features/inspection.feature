@inspection
Feature: doInspection Feature

  Background:
    Given I navigate to http://172.16.62.26/index.html?#/createInspection

  @doInspection
  Scenario:
    When the inspectie formulier opened
    When I fill in the inspection form
    And I press the submit button
    Then I created an inspection