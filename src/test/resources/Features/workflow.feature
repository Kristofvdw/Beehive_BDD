@workflow
Feature: BeekeeperWorkflow Feature

  Background:
    Given I navigate to http://172.16.62.26/

    @newUser
    Scenario: ik ben een nieuwe gebruiker en ik registreer me en meld me aan
      When I click on the register button
      And I register with username Bertje and password Password123 and mail user@mail.com
      Then I am registered
      When I login with username Bertje and password Password123
      Then I am logged in

    @existingUserDoesAnInspection
    Scenario: ik ben een bestaande gebruiker en ik doe een inspectie
      When I login with username Bertje and password Password123
      Then I am logged in
      When I got to the inspection form
      When the inspectie formulier opened
      When I fill in the inspection form
      And I press the submit button
      Then I created an inspection