Feature: Get News Letter

  Scenario: TC 001 - Get News Letter
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    When The user clicks Login button
    And The user logins with credentials "testmail@test.com" and "Test12345678"