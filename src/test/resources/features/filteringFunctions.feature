Feature: Filtering Functions
  @wip
  Scenario: TC-01-Filtering Functions
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    And The user clicks Login button
    And The user logins with credentials "bilal@gmail.com" and "12345"
    And The user click the Television
    And Verify Filtering Functions
