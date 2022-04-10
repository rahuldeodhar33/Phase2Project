Feature: Login test for page saucedemo.com

  Background: Open the application
    Given User have opened the application in browser
	@Sanity
  Scenario Outline: Validate the successful login
    #Given I have opened the application in browser
    When User enter username "<Username>"
    And User enter password "<Password>"
    And User click on the login button
    Then User should be Landed on the home page

    Examples: 
      | Username      | Password     |
      | standard_user | secret_sauce |
	@Regression
  Scenario Outline: Validate the unsuccessful login
    #Given I have opened the application in browser
    When User enter username "<Username>"
    And User enter password "<Password>"
    And User click on the login button
    Then User should get this error "<Error>"

    Examples: 
      | Username     | Password  | Error                                                                     |
      | problem_user | Abcd@1234 | Epic sadface: Username and password do not match any user in this service |
