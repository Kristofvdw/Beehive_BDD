@createAccount
Feature: createAccount feature

  @ValidCreateAccount
  Scenario:

    Given I navigate to http://172.16.62.26/#/
    When I click on the register button
    And I enter Username "Test01" and Password "Komkommer01"
    Then I am registered


