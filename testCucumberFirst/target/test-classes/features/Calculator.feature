@Regression
@Calculator

Feature: Calculator Testing

  Background:
    Given Running Background Step

  @Ticker1234
  Scenario: Add two numbers
    Given i have a calculator
    When I add 2 and 3
    And do some operation
    Then the result should be 5

  @Ticket4567
  Scenario Outline: Subtract two numbers
    Given i have a calculator
    When I subtract "<Number1>" and "<Number2>"
    Then the result should be "<Result>"
    But Demonstrate Data Table
      | Arg1  | Arg2 |
      | one   | two  |
      | three | four |
    Examples:
      | Number1 | Number2 | Result |
      | 3       | 2       | 1      |
      | 6       | 3       | 3      |
  	
  	