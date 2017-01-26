@navigate
Feature: navigatie van ingelogde user

  Background:
    Given I navigate to http://172.16.62.26/#/

  @overzicht
  Scenario: Een gebruiker kan inloggen met een juiste gebruikersnaam en paswoord
    When   I login with username Test01 and password komkommer01
    Then  I am logged in
    When I click the overzicht link
    