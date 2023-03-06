Feature: ERP login functionality
  Agile story:
  As a user, I should be able to access all the features on the login page
    # AC1: 1. Users should be able to log in with valid credentials should land on the "Dashboard" page after successful login.
    #AC2: "Wrong username or password." message should be displayed for invalid login attempt.
    #AC3:"Please fill out this field." message should be displayed for any empty field
  Background:
    Given user is on the ERP login page

  @loginWithValidCredentials
  Scenario: Login with valid Credentials
    When user enters valid credentials
    Then user is on the main Odoo page


  @loginWithInvalidCredentials
  Scenario: Login with invalid Credentials
    When user enters invalid username
    And user enters valid password
    Then user should see wrong username password warning

  @loginWithInvalidCredentials
  Scenario: Login with invalid Credentials
    When user enters valid username
    And user enters invalid password
    Then user should see wrong username password warning

  @loginWithInvalidCredentials
  Scenario: Login with invalid Credentials
    When user enters invalid username
    And user enters invalid password
    Then user should see wrong username password warning

 # @loginWithoutCredentials
  #Scenario: Login without credentials
    #When user clicks the login button without entering credentials
    #Then user see the warning message






