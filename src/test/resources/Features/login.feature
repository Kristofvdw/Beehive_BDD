@login
Feature: Login Feature

  Background:
    Given I navigate to http://172.16.62.26/#/

  @validLogin
  Scenario: Een gebruiker kan inloggen met een juiste gebruikersnaam en paswoord
    When   I login with username Mark and password Password123
    Then  I am logged in

  @invalidLogin
    Scenario: Een gebruiker kan niet inloggen met een foute gebruikersnaam en paswoord
      When   I login with username Fout and password Slecht
      Then  I am not logged in

  @adminLogin
    Scenario: Een administrator kan inloggen met de jusite gegevens
    When I login with username random and password y$lo
    Then I am logged in as an administrator
