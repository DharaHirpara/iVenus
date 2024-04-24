@smoke
Feature: User Register
  As a user
  I can create the account

  Background:
    Given I am on the homepage

  Scenario: User should be able to create the account
    When I should click on register icon
    And I should click on register link
    When I should enter Username "Dhara"
    And I should enter Email address "cucumberBdd123@gmail.com"
    And I should enter Password "test@123"
    And I should click on Register button
    Then I should verify Text "Hello"