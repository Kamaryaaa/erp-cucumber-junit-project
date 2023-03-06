Feature: ERP logout functionality
  Agile story:
  As a user, i should be able to logout from the page
  Given user is on the ERP login page
@logout
  Scenario: ERP log out
    Given user is already on the main page
    When user clicks profile name
    And user clicks logout button
    Then user should return to login page
