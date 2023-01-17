Feature: HeartBingo Login

  Scenario: As a User I should navigate to login page
    Given I am on homepage
#    When I click on accept all cookies on pop up
    When I click on Login Link
    Then I should navigate on login page successfully
    And I verify that user is on login page "Log In to start playing."

