@regression @logout
Feature: Login Functionality

  @logout1
  Scenario: TC 001 - Logout
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    When The user clicks Login button
    And The user logins with credentials "testmail@test.com" and "Test12345678"
    Then Verify that the user has successfully logged in and is on the My Account page
    When The user clicks Logout button
    Then Verify logout with extra info
    When The user navigates to back page
    Then Verify that the user is on Account page
    When The user clicks My Account button
    Then Verify that the user is redirected to Login page

  @logout2
  Scenario: TC 001 - Logout
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    When The user clicks Login button
    And The user logins with credentials "testmail@test.com" and "Test12345678"
    Then Verify that the user has successfully logged in and is on the My Account page
    When The user clicks Address Book button
    Then Verify that the user is on the Address Book page
    When The user clicks Logout button
    Then Verify logout with extra info
    When The user navigates to back page
    Then Verify that the user is on Account page
    When The user clicks My Account button
    Then Verify that the user is redirected to Login page

  @logout3
  Scenario: TC 001 - Logout
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    When The user clicks Login button
    And The user logins with credentials "testmail@test.com" and "Test12345678"
    Then Verify that the user has successfully logged in and is on the My Account page
    When The user clicks Logout button
    Then Verify logout with extra info
    When The user clicks continue button on Account Page
    When The user navigates to back page
    Then Verify Account Logout Text
    When The user navigates to back page
    Then Verify that the user is on Account page
    When The user clicks My Account button
    Then Verify that the user is redirected to Login page