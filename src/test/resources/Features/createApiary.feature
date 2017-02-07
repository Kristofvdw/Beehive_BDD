@createApiary
Feature: als imker kan ik een bijenstand registreren

  Background:
    Given I navigate to http://172.16.62.26/index.html?#/createApiary

  @fillApiaryForm
  Scenario: de imker drukt op nieuwe bijenstand en vult het formulier in
    When the bijenstand formulier opened
    When I enter the bijenstand name with name Bijenstand
    And I enter the place Hasselt
    And I enter the postcode 1000
    And I press the submitButton
    Then I created a bijenstand