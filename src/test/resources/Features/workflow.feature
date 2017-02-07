@workflow
Feature: BeekeeperWorkflow Feature

  Background:
    Given I navigate to http://172.16.62.26/

    @newUser
    Scenario: ik ben een nieuwe gebruiker en ik registreer me en meld me aan
      When I click on the register button
      And I fill in the form with the following data
        | Harry       |
        | Password123   |
        | Password123   |
        | Yur          |
        | Awizard        |
        | Ispace 13     |
        | 1000          |
        | 0499239100        |
        | harry@bee.be |
      And I click the register button
      And I click the OK button
      When I login with username Harry and password Password123
      Then I am logged in

    @existingUserDoesAnInspection
    Scenario: ik ben een bestaande gebruiker en ik doe een inspectie
      When I login with username Harry and password Password123
      Then I am logged in
      When I got to the inspection form
      When the inspectie formulier opened
      When I fill in the inspection form
      And I press the submit button
      Then I created an inspection