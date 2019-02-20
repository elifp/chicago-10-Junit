Feature: Printing pricelist

  @pricelist
  Scenario: Pricelist verification

    Given user goes to BRITE ERP homepage
    And user should select BriteErpDemo
    Then user should enter valid credential(email and password) and click on log in button
    And user should select Point of Sale section
    Then user should see pricelist under category
    Then user should see "earphone" item name under pricelistnames which already created