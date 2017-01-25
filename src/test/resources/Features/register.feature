@register
Feature: Register feature

  @validRegister
  Scenario:

    Given I navigate to http://172.16.62.26/#/
    When I click on the register button
    And I register with username Bertje and password bla
    Then I am registered
