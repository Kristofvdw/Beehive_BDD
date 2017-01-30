@honeyExtraction

Feature: Als imker kan ik een honing extractie doen

  Background:
    Given I navigate to http://172.16.62.26/#/createHoney_extraction
    And I am logged in

    @doExtraction
    Scenario: de imker drukt op de nieuwe honingextractie knop en vult het formulier in
    When the extraction form opened
    When I fill in the extraction form
    And I press the submit button
    Then I created an extraction