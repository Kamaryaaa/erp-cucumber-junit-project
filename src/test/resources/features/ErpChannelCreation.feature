Feature: ERP channel creation and sending massage functionality

  Agile story:
  As a user, I should be able to create a channel and send message on the channel.
  #1. Verify the users can add channels on the “Discuss” page.
  #users should be able to write a channel name.
  #
  #2. Verify the users can send message in the channel.

  Background:
    Given user is already on the main page
@channelCreation
    Scenario: create a channel
      Given User press add sign for creating a channel
      When  User write the "MyChannel" in an input box
      And users select the create #myChannel message
      #And user hit the enter
      Then users should able to see the channel created massage
@sendingMessage
  Scenario: sending message on new channel
    When user press "MyChannel"
    And user write "How are you?" in text box
    And user clicks send button
    And user refresh the page
    Then user should see the massage on the chat feed


