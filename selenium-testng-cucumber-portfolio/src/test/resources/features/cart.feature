Feature: Cart management
  As a logged-in shopper
  I want to manage products in the cart
  So that I can review selected items

  Background:
    Given I open the SauceDemo login page
    When I login with username "standard_user" and password "secret_sauce"
    Then I should land on the inventory page

  Scenario: Add a backpack to the cart
    When I add the product "Sauce Labs Backpack" to the cart
    Then the cart badge should display "1"

  Scenario: Remove a backpack from the cart
    When I add the product "Sauce Labs Backpack" to the cart
    And I remove the product "Sauce Labs Backpack" from the cart
    Then the cart badge should not be visible
