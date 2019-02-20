@Wikipedia
Feature: Wikipedia search feature

  Scenario: Wikipedia search test

    Given user is on the Wikipedia homepage
    When User enters Steve Jobs to search bar and click enter
    Then User should see the first header is displayed Steve Jobs