@login
Feature: Login Feature

  Background:
    Given I navigate to http://172.16.62.26/#/

  @validLogin
  Scenario:
    When   I login with username Mark and password Password123
    Then  I am logged in

  @invalidLogin
    Scenario:
      When   I login with username Fout and password Slecht
      Then  I am not logged in
