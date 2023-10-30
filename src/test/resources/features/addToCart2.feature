Feature: Add to Cart 2
@addToCart2
  Scenario: TC 001 - Add to Cart 2

    Given The user is on the homepage
    When The user closes Newsletter pop-up
    And The user clicks Login button
    And The user enters with the valid credentials
    Then Verify that the user has successfully logged in and is on the My Account page
    When The user is on the homepage
    And The user closes Newsletter pop-up
    And The user scrolls up to the Trending Items section on the home page
    And The user adds any product to the cart
    Then It is verified that success message displayed
    When The user clicks on Shopping Cart
    Then It is verified that the added product is in the cart


