Feature: Calculator - POC

  Scenario: Add Operation
    Given Calculator is initialized
    When add two variables "3" "5"
    Then 8 should be returned