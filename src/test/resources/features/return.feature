@wip
Feature: Returns

  Background:
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    And The user clicks Login button
    And The user logins with credentials "bilal@gmail.com" and "12345"
    And The user click the return

  Scenario: TC-001-Returns Positive
    Then Verify that the firstname,lastname,telephone and email are written on the form
    When The user fills out the form and clicks submit
    Then Verify Success Message on the Return page


  Scenario Outline: TC-002-Return Negative
    Then Verify that the form is incomplete  "<Order ID>","<Product Name>","<Product Code>","<Reason for Return>"

    Examples:
      | Order ID | Product Name | Product Code | Reason for Return |
      |          | Nicky Clarke | 5            | Reason for Return |
      | 23       |              | 5            | Reason for Return |
      | 23       | Nicky Clarke |              | Reason for Return |
      | 23       | Nicky Clarke | 5            |                   |
      |          |              |              |                   |