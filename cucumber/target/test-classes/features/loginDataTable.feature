Feature: Login Functionality
#  Scenario: Validate Login with valid credentials dataTable
#    Given user launches website
#    And user enter the following details
#      |  standard_user| secret_sauce |
#    When user clicks on the login button

  Scenario: Validate Login with valid credentials dataTable with columns
    Given user launches website
    And user enter the following details with columns
      | username      | password     |
      | standard_user | secret_sauce |
      |testData1      |testdata2     |
    When user clicks on the login button