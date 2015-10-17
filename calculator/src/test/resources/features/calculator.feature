Feature: Simple Calculator Operations

  Background: I have calculator
    Given Calculator is turned on

  Scenario Outline: Addition
    When I add <first>
    And add <second>
    Then result should be <result>
    Examples:
    | first | second | result |
    | 3     | 4      | 7      |
    | 10    | 5      | 15     |

  Scenario Outline: Subtraction
    When I add <first>
    And subtract <second>
    Then result should be <result>
    Examples:
    | first | second | result |
    | 10    | 5      | 5      |
    | 15    | 5      | 10     |

  Scenario: Combination of Addition and subtraction
    When I add 10
    And subtract 5
    And add 10.5
    Then result should be 15.5