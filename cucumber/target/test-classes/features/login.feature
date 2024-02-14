Feature: Login Functionality
  Scenario: Validate Login with valid credentials
    Given user launches website
    And user valid username "standard_user"
    And user enter valid password "secret_sauce"
    When user clicks on the login button
    Then user redirects to the My account page
