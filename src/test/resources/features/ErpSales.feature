Feature: Verify Sales page

  Background:
    Given user is already on the main page
 @salesModule
    Scenario: Verify sales page function
      When user clicks Sales module
      And user clicks first checkbox in the left
      And user see all the check box checked
      Then user see the "3" option in the manu
        |Export|
        |Delete|
        |Create Invoice|
        |Send a Cart Recovery Email|
