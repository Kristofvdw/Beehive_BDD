@createBeehive
Feature: als imker kan ik een bijenkast registreren

  Background:
    Given I navigate to http://172.16.62.26/index.html?#/createBeehive

    @fillForm
    Scenario: de imker drukt op nieuwe bijenkast en vult het formulier in
      When the bijenkast formulier opened
      When I enter the with name BeehiveNaam
      And I press the voeg toe button
      Then I created a bijenkast