Feature: ERP repair module

  Background:
    Given user is already on the main page
@repairModule
    Scenario: Verify Repairs Module
      When user clicks repairs module
      And user clicks first checkbox
      Then all the check box checked
      Then user see the action dropdown manu
      |Export|
      |Delete|
      |Create Invoice|