@googleParameters
Feature: Goggle search funcionality

  Scenario: Testing google search

    Given User is on the homepage on google
    When User enters "flowers"
    Then User should see "flowers" in the title
