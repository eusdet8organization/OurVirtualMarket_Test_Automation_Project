@regression @login
Feature: Login Functionality

  Background:
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    Then Verify that the user is on the homepage
    When The user clicks Login button

  @positiveLogin
  Scenario: TC 001 - Positive Login Test
    Then Verify that Login page have the necessary structure
    When The user logins with credentials "gamzeSay@gmail.com" and "Test1234"
    Then Verify that the user has successfully logged in and is on the My Account page

  @negativeLogin
  Scenario Outline: TC 002 - Negative Login Test
    And The user logins with credentials "<email>" and "<password>"
    Then Verify Warning Message
    Examples:
      | email              | password |
      |                    | Test1234 |
      | gamzeSay@gmail.com |          |
      | t@t                | 1234     |