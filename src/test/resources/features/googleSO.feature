@googleSO
Feature: Google search feature

  Scenario Outline: Testing google search functionality

    Given User is on the google homepage
    And User enters "<searchValue>"
    Then User should see "<searchValue>" in the title

    Examples: Test data for google search funcionality

    |searchValue|
    |flowers    |
    |cars       |
    |trucks     |