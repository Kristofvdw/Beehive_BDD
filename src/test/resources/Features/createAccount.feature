@createAccount
Feature: createAccount feature

  Background:
    Given I navigate to http://172.16.62.26/#/

  @ValidCreateAccount
  Scenario:
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
    Then I should be able to login


