@treatment
Feature: Treatment Feature

  Background:
    Given I navigate to http://172.16.62.26/index.html?#/createTreatment

  @createTreatment
  Scenario:
    When I fill in the treatment form
    Then I created a treatment