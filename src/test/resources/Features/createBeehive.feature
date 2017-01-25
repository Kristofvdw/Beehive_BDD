@createBeehive
Feature: createBeehive Feature

  Background:
    Given I navigate to http://172.16.62.26/index.html?#/createBeehive

    @fillForm
    Scenario:
      When the bijenkast formulier opened
      When I enter the with name BeehiveNaam
      And I press the voeg toe button
      Then I created a bijenkast