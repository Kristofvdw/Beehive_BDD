@register
Feature: Register feature

  @validRegister
  Scenario:
    Given I navigate to https://ploy:website@website-acc.ploy.be/nl
    When I click on the register button
    And I click on register as a candidate button
    And I register with username Bertje and password bla
    Then I am registered
