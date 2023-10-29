@regression @removeAddMyWishList
Feature: Remove Add My Wish List

  Background:
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    And The user clicks Login button

  @removeAddMyWishList1
  Scenario: TC 001 - My Wish List
    And The user logins with credentials "testmail@test.com" and "Test12345678"
    Then Verify that the user has successfully logged in and is on the My Account page
    When The user clicks Television menu
    Then Verify that the user is on the Television page
    When The user adds the product "C1920FS" in the My Wish List
    Then Verify Success Message on the Television page
    When The user adds the product "C2420G" in the My Wish List
    Then Verify Success Message on the Television page
    When The user clicks My Wish List button
    Then Verify that the user is on the My Wish List page
    And Verify that there are "2" products in the My Wish List
    When The user clicks remove button for "C1920FS" product
    Then Verify Success Message on the My Wish List page
    When The user clicks add to cart button for "C2420G" product
    Then Verify " Added to cart successfully. What is next?" text
    When The user should click on View Cart button.
    Then Verify that the user is on the Shopping Cart page
    And Verify that "C2420G" product is in shopping cart

  @removeAddMyWishList2
  Scenario: TC 002 - My Wish List
    And The user logins with credentials "testmail2@test.com" and "Test12345678"
    Then Verify that the user has successfully logged in and is on the My Account page
    When The user clicks Television menu
    Then Verify that the user is on the Television page
    When The user adds the product "C1920FS" in the My Wish List
    Then Verify Success Message on the Television page
    When The user adds the product "C2420G" in the My Wish List
    Then Verify Success Message on the Television page
    When The user adds the product "C3220G" in the My Wish List
    Then Verify Success Message on the Television page
    When The user clicks My Wish List button
    Then Verify that the user is on the My Wish List page
    And Verify that there are "3" products in the My Wish List
    When The user clicks remove button for "C1920FS" product
    Then Verify Success Message on the My Wish List page
    When The user clicks add to cart button for "C2420G" product
    Then Verify " Added to cart successfully. What is next?" text
    When The user should click on Continue Shopping button.
    And The user clicks add to cart button for "C3220G" product
    Then Verify " Added to cart successfully. What is next?" text
    When The user should click on View Cart button.
    Then Verify that the user is on the Shopping Cart page
    And Verify that "C2420G" product is in shopping cart
    And Verify that "C3220G" product is in shopping cart



