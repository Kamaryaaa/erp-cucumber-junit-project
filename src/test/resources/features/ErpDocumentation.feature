Feature: Access Documentation Page
  Background:
    Given user is already on the main page

    @Documentation
    Scenario: Verify access of Documentation page

      When user clicks profile name as pos manager
      And user clicks "Documentation" option
      Then user navigated to documentation page