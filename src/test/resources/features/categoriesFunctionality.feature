@category
Feature: Categories Functionality

  Background:
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    And The user clicks on the Categorie button
    Then The user should be able to see following category names
      | HEALTH & BEAUTY |
      | NETWORKING      |
      | TELEVISIONS     |
      | TV ACCESSORIES  |


  Scenario: TC-001 Canceling Categories
    And The user clicks X button
    Then Verify that the user is on the homepage


  Scenario: TC-002 Select by categoryName-01
    When The user clicks on the "Health & Beauty" category
    Then Verify that the "HEALTH & BEAUTY" category is selected

  Scenario: TC-003 Select by categoryName-02
    When The user clicks on the "Networking" category
    Then Verify that the "NETWORKING" category is selected


  Scenario: TC-004 Select by categoryName-03
    When The user clicks on the "Televisions" category
    Then Verify that the "TELEVISIONS" category is selected


  Scenario: TC-005 Select by categoryName-04
    When The user clicks on the "TV Accessories" category
    Then Verify that the "TV ACCESSORIES" category is selected




