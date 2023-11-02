Feature: Search Functionality

  Background:
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    Then Verify that the user is on the homepage
    When The user clicks Login button
    Then Verify that Login page have the necessary structure
    When The user logins with credentials "gamzeSay@gmail.com" and "Test1234"
    Then Verify that the user has successfully logged in and is on the My Account page

    @searchFuctionality
    Scenario: TC01-Search Functionality
      Then Verify that a search bar and search button become visible on the main page.
      And Verify that by default ,'Search' appears in the search bar.
      When The user writes a "Television" in the search bar and clicks search button.
      Then Verify that the user is directed to the page where the product related to the given order are found.