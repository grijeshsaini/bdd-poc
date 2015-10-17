Feature: Simple Calculator Operations

  Scenario: Addition
    Given Calculator is turned on
    When I add 3
    And add 5
    Then result should be 8