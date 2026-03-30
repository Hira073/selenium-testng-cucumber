Feature: Login functionality
  As a user
  I want to log into SauceDemo
  So that I can access the inventory page

  Scenario: Successful login with valid credentials
    Given I open the SauceDemo login page
    When I login with username "standard_user" and password "secret_sauce"
    Then I should land on the inventory page

  Scenario: Failed login with invalid credentials
    Given I open the SauceDemo login page
    When I login with username "locked_out_user" and password "secret_sauce"
    Then I should see a login error message containing "Sorry, this user has been locked out"
