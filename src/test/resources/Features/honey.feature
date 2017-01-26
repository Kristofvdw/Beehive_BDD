@honeyExtraction

Feature: honeyExtraction Feature

  Background:
    Given I navigate to http://172.16.62.26/#/createHoney_extraction

    @doExtraction
    Scenario:
    When the extraction form opened
    When I fill in the extraction form
    And I press the submit button
    Then I created an extraction