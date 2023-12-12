Feature: The machine is powered
  Scenario: A user plug the coffee machine
    Given a coffee machine
    When I plug the machine to electricity
    Then The machine is powered