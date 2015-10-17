Feature: Simple Calculator Operations

  Scenario Outline: Addition
    Given Calculator is turned on
    When I add <first>
    And add <second>
    Then result should be <result>
    Examples:
    | first | second | result |
    | 3     | 4      | 7      |
    | 10    | 5      | 15     |
