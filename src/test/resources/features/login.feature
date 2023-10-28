@regression @login
Feature: Login Functionality

  @positiveLogin
  Scenario: TC 001 - Positive Login Test
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    Then Verify that the user is on the homepage
    When The user clicks Login button
    Then Verify that Login page have the necessary structure
    When The user logins with credentials "gamzeSay@gmail.com" and "Test1234"
    Then Verify that the user has successfully logged in and is on the My Account page