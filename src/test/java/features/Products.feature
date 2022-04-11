Feature: Get Product Price List from saucedemo.com

  Background: Open the application saucedemo.com
    Given User have opens the application in browser
    When User enters the username "standard_user"
    And User enters the password "secret_sauce"
    And User clicks on the login button
	@Sanity
  Scenario: Validate the successful login
    #Given I have opened the application in browser
    When User is on product page
    Then User can see below products with price
      | Product                 | Price  |
      | Sauce Labs Backpack     | $29.99 |
      | Sauce Labs Bolt T-Shirt | $15.99 |
