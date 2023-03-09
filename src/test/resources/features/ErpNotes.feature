Feature: ERP NotesTab functionality

  Background:
    Given user is already on the main page
@NotesModule
  Scenario: Verify Note functionality
    When user clicks notes
    And user clicks create button
    And user write "something" in text area
    And user clicks save button
    Then user should see note created message