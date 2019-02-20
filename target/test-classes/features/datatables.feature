@datatables
Feature: Testing datatables website

  Scenario: Testing adding new employe to the table

    Given user is on the datatables homepage
    And User clicks to new button
    Then User should see create new entry box
    And User should enter firstname
    And User should enetr lastname
    And User should enter position
    And User should enter office
    And User shoul enetr extension
    And User should enter start date
    And User should enter salary
    Then User should click to create button
    And User enters first name to search box
    Then User should see first name is inserted in the table
