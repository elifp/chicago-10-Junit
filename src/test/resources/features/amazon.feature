@amazon1
Feature: Amazon search

  Scenario: Amazon search test

    Given User is on the amazon homepage
    When User enters headphones keybaord
    And User clicks to search button
    Then User should see results related to headphones