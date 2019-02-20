@youtube
Feature: Youtube search feature

  Background: User is on the homepage and is able to searchbox and search button

    Given user is on the youtube homepage
    And User is able to see search box
    And User is able to see search button

  Scenario: Testing youtube search


    When User searches for funny cat videos
    Then User should see reseults related to funny cat videos

   Scenario: Testing youtube search

    When User searches for funny dog videos
    Then User should see reseults related to funny dog videos

    Scenario: Testing youtube search

    When User searches for funny pet videos
    Then User should see reseults related to funny pet videos