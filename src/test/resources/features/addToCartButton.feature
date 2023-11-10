Feature: Login Functionality

  Background:
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    Then Verify that the user is on the homepage
    When The user clicks Login button
    Then Verify that Login page have the necessary structure
    When The user logins with credentials "gamzeSay@gmail.com" and "Test1234"
    Then Verify that the user has successfully logged in and is on the My Account page

  @addToCart
    Scenario: TC1-Add a Product to the Cart
      When The user writes a "Samsung smart 4K" in the search bar and clicks search button.
      Then Verify that the user is directed to the page where the product related to the given order are found.
      When The user choose a "Samsung QE55Q60AAUXXU Smart 4K Ultra TV" on the search page and clicks it.
      Then Verify that the user can go to the page where the relevant product is.
      And Verify that the relevant product displayes info.

