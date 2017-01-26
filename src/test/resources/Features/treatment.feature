@treatment
Feature: als imker kan ik een behandeling toevoegen

  Background:
    Given I navigate to http://172.16.62.26/index.html?#/createTreatment

  @createTreatment
  Scenario: De imker maakt een nieuwe behandeling aan
    When I fill in the treatment form
    Then I created a treatment