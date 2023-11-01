Feature: Succes Shopping

  @successShopping1
  Scenario Outline: TC-001 Buying by entering your address for the first time
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    And The user clicks Login button
    And The user logins with credentials "leia01@gmail.com" and "Test1234"
    And The user is on the homepage
    And The user closes Newsletter pop-up
    And The user scrolls up to the Trending Items section on the home page
    And The user adds the product "Noerden" in the Add to Cart
    And The user clicks on Shopping Cart
    And The user click the checkout button
    And The user fills the Billing Details form with: "<firstname>", "<lastname>", "<company>", "<address1>", "<address2>" , "<city>" and "<postcode>"
    And The user clicks on the continue button
    Then Verify that the existing address is selected in the Delivery Details menu
    When The user clicks the continue button in delivery details menu
    Then Verify that the flat shipping rate is selected in the delivery method menu
    When The user clicks the continue button in delivery method menu
    Then Verify that the cash on delivery button is selected in the payment method menu
    When The user check the terms and conditions button
    When The user clicks the continue button in payment method menu
    Then Verify that the table headers are the following
      | Product Name |
      | Model        |
      | Quantity     |
      | Unit Price   |
      | Total        |
    When The user clicks the confirm order button
    Then Verifies that the message that the order was successful.
    Examples:
      | firstname | lastname | company  | address1  | address2 | city   | postcode |
      | leia      | organa   | starwars | skywalker | naboo    | helium | 3215     |


  Scenario: TC-002 Shopping with registered address
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    And The user clicks Login button
    And The user enters with the valid credentials
    And The user is on the homepage
    And The user closes Newsletter pop-up
    And The user scrolls up to the Trending Items section on the home page
    And The user adds the product "Noerden" in the Add to Cart
    And The user clicks on Shopping Cart
    And The user click the checkout button
    Then Verify that the existing address is selected in billing details menu
    When The user clicks on the continue button
    Then Verify that the existing address is selected in the Delivery Details menu
    When The user clicks the continue button in delivery details menu
    Then Verify that the flat shipping rate is selected in the delivery method menu
    When The user clicks the continue button in delivery method menu
    Then Verify that the cash on delivery button is selected in the payment method menu
    When The user check the terms and conditions button
    When The user clicks the continue button in payment method menu
    Then Verify that the table headers are the following
      | Product Name |
      | Model        |
      | Quantity     |
      | Unit Price   |
      | Total        |
    When The user clicks the confirm order button
    Then Verifies that the message that the order was successful.

  @neu1
  Scenario: Shopping with registered address and comment fields
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    And The user clicks Login button
    And The user enters with the valid credentials
    And The user is on the homepage
    And The user closes Newsletter pop-up
    And The user scrolls up to the Trending Items section on the home page
    And The user adds the product "Noerden" in the Add to Cart
    And The user clicks on Shopping Cart
    And The user click the checkout button
    Then Verify that the existing address is selected in billing details menu
    When The user clicks on the continue button
    Then Verify that the existing address is selected in the Delivery Details menu
    When The user clicks the continue button in delivery details menu
    Then Verify that the flat shipping rate is selected in the delivery method menu
    When The user enters a text in comment fields
    And The user clicks the continue button in delivery method menu
    Then Verify that the cash on delivery button is selected in the payment method menu
    When The user enters text in the comment field in the payment menu
    And The user check the terms and conditions button
    And The user clicks the continue button in payment method menu
    Then Verify that the table headers are the following
      | Product Name |
      | Model        |
      | Quantity     |
      | Unit Price   |
      | Total        |
    When The user clicks the confirm order button
    Then Verifies that the message that the order was successful.