@adminLogin
Feature: admin login Feature

  Background:
    Given I navigate to http://172.16.62.26/#/

  @adminLogin
  Scenario: As an admin i can log in
    When   I login with username random and password admin
    Then  I am logged in