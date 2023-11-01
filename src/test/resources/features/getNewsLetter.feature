@regression @getNewsLetter
Feature: Get News Letter

  Background:
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    When The user clicks Login button
    And The user logins with credentials "testmail5@test.com" and "Test12345678"
    When The user clicks on Home button
    Then Verify Newsletter pop-up
    When The user closes Newsletter pop-up
    Then Verify that the user is on the homepage
    When The user scrolls down to bottom
    Then Verify that Newsletter subscription option is at the bottom

  @getNesLetter1
  Scenario: TC 001 - Get News Letter
    When The user enters valid email on the subscribe
    Then Verify Subscription was successful success message
    When The user enters valid email on the subscribe
    Then Verify Email has already exist Error message
    When The user clicks Logout button
    Then Verify the user logged out
    When The user clicks Login button
    And The user logins with credentials "testmail5@test.com" and "Test12345678"
    When The user clicks on Home button
    Then Verify that Newsletter is not visible

  @getNesLetter2
  Scenario: TC 002 - Negative - Get News Letter
    When The user enters invalid email on the subscribe
    Then Verify Email is required alert message


