Feature: Test Login Functionality

  @Regression
  Scenario Outline: Check login is successful with valid credentials
    Given chrome browser is open
    And user is on loginpage
    When user enters <username> and <password>
    And user clicks on submit button
    Then user is navigated to homepage

       Examples: 
      | username | password    |
      | student  | Password123 |
      | student  | Password123 |