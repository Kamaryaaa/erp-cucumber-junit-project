Feature: Access Documentation Page
  Background:
    Given user is already on the main page

    Scenario: Verify access of Documentation page

      When user clicks profile name
      And user clicks "Documentation" option
      Then user navigated to documentation page