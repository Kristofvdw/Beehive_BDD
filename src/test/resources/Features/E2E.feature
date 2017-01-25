@login
Feature: Login Feature

  Background:
    Given I navigate to https://ploy:website@website-acc.ploy.be/nl
    When  I go to the login section

  @validLogin
  Scenario:
    When   I login with username wim@eagle.be and password Test1234
    Then  I am logged in


  Scenario:
    When   I login with username wim@eagle.be and password Test12345
    Then  I am not logged in


  Scenario Outline:
    When   I login with username <username> and password <pwd>
    Then  I am not logged in

    Examples:
    |username|pwd|
    |wim@test.be|test123456|

