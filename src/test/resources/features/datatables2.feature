@datatables2
Feature: Testing datatables website

  Scenario: Testing adding new employe to the table

    Given user is on the datatables homepage
    And User clicks to new button
    Then User should see create new entry box
    And User should enter firstname "Adam"
    And User should enetr lastname "Smith"
    And User should enter position "SDET"
    And User should enter office "Chicago"
    And User shoul enetr extension "115"
    And User should enter start date "2019-01-19"
    And User should enter salary "120000"
    Then User should click to create button
    And User enters first name to search box
    Then User should see first name is inserted in the table
