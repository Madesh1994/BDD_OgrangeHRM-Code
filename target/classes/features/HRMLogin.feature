#This is a first Cucumber feature
@login
Feature: As a user, i want to login to Orange HRM Application.

  Scenario Outline: Login to HRM application
    Given I am open Orange HRM Application <URL>
    When I enter vaild user name <Username>
    And I enter valid password <Password>
    Then I should logged into Orange HRM Application
    When I click Logout button
    Then I should logged out from the HRM Application

    Examples: 
      | URL                                        | Username | Password |
      | https://opensource-demo.orangehrmlive.com/ | Admin    | admin123 |
