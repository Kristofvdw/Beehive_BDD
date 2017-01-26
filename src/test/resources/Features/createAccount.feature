@createAccount
Feature: als imker kan ik een account aanmaken

  Background:
    Given I navigate to http://172.16.62.26/#/

  @ValidCreateAccount
  Scenario: de imker drukt op de registreer knop en vult het formulier in
    When I click on the register button
      And I fill in the form with the following data
       | Test01        |
       | komkommer01   |
       | komkommer01   |
       | test          |
       | tester        |
       | Ispace 13     |
       | 3000          |
       | 0499239100        |
       | tester@beehive.com |
      And I click the register button
      And I click the OK button
    Then I should be able to login


