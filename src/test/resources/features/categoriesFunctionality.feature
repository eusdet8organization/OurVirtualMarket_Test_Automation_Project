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

  @newCategory
  Scenario Outline: TC-002 Select by categoryName-01
    When The user clicks on the "<categoryName>" category
    Then Verify that the "<categoryTitle>" category is selected
    Examples:
      | categoryName    | categoryTitle   |
      | Health & Beauty | HEALTH & BEAUTY |
      | Networking      | NETWORKING      |
      | Televisions     | TELEVISIONS     |
      | TV Accessories  | TV ACCESSORIES  |



