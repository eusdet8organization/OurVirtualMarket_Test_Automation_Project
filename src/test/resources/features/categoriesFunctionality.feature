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

    @cancelCategorie
  Scenario: TC-001 Canceling Categories
    And The user clicks X button
    Then Verify that the user is on the homepage

  @wip1
  Scenario: TC-002 Select by categoryName-01
    When The user navigates to the first element
    Then Verify that the category title matches the text of the first element

  @wip1
  Scenario: TC-003 Select by categoryName-02
    When The user navigates to the second element
    Then Verify that the category title matches the text of the second element

  @wip1
  Scenario: TC-004 Select by categoryName-03
    When The user navigates to the third element
    Then Verify that the category title matches the text of the third element

  @wip1
  Scenario: TC-005 Select by categoryName-04
    When The user navigates to the fourth element
    Then Verify that the category title matches the text of the fourth element


#  @wip2
#  Scenario Outline: Select by <categoryName>
#    When The user navigates to "<categoryName>"
#  #  Then Verify that the category title matches the selected "<categoryName>"
#    Examples:
#      | categoryName    |
#      | HEALTH & BEAUTY |
#      | NETWORKING      |
#      | TELEVISIONS     |
#      | TV ACCESSORIES  |

