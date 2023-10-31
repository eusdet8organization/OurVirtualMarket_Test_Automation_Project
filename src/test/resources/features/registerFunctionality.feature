@regresion
Feature: Register Functionality

  Background:
    Given The user is on the homepage
    When The user closes Newsletter pop-up
    And The user clicks Register button

  Scenario Outline: TC-001-Register Functionality Positive
    And The user Register with credentials "<First Name>","<Last Name>","<E-Mail>","<Telephone>","<Password>" and "<Password Confirm>"
    When The user clicks Privacy Policy
    And The user clicks Continue
    Then Verify Success Message on the register page
    Examples:
      | First Name | Last Name | E-Mail           | Telephone      | Password | Password Confirm |
      | bilal      | saglam    | bilbil@gmail.com | 0505 111 11 11 | 12345    | 12345            |


  Scenario Outline: TC-002-Register Negative
    And The user Register with credentials "<First Name>","<Last Name>","<E-Mail>","<Telephone>","<Password>" and "<Password Confirm>"
    When The user clicks Privacy Policy
    And The user clicks Continue
    Then Verify Warning Message with register
    Examples:
      | First Name                          | Last Name                           | E-Mail           | Telephone      | Password | Password Confirm |
      | gfhasdfghjlkujzthgfdsafghasadfghjkl | saglam                              | bilal1@gmail.com | 0505 111 11 11 | 12345    | 12345            |
      | bilal                               | gfhasdfghjlkujzthgfdsafghasadfghjkl | bilal1@gmail.com | 0505 111 11 11 | 12345    | 12345            |
      | bilal                               | saglam                              | bilal@com        | 0505 111 11 11 | 12345    | 12345            |
      | bilal                               | saglam                              | bilal1@gmail.com | 1              | 12345    | 12345            |
      | bilal                               | saglam                              | bilal1@gmail.com | 1              | 1        | 12345            |
      |                                     |                                     |                  |                |          |                  |

  Scenario Outline: TC-007-Register Privacy Policy Negative
    And The user Register with credentials "<First Name>","<Last Name>","<E-Mail>","<Telephone>","<Password>" and "<Password Confirm>"
    And The user clicks Continue
    Then Verify Warning Message with Privacy Policy
    Examples:
      | First Name | Last Name | E-Mail           | Telephone      | Password | Password Confirm |
      | bilal      | saglam    | bilal1@gmail.com | 0505 111 11 11 | 12345    | 12345            |
