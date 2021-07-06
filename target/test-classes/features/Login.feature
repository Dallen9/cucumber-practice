Feature: Application Login

# Hooks and background cannot be used to together
#  Background:
#    Given validate the browser
#    When Browser is triggered
#    Then Check if browser is displayed

  @RegTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "john" and "1234"
    Then Home page is populated
    And Cards displayed are "true"

  @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "doe" and "123445"
    Then Home page is populated
    And Cards displayed are "false"

  # Data table
  @WebTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
    | jenny | abcd | john@gmail.com | U.S | 32336626 |
    Then Home page is populated
    And Cards displayed are "true"

  # Test multiple fields with Example keyword (Parameterizing testing)
  @RegTest
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User login in to application with <username> and <password>
    Then Home page is populated
    And Cards displayed are "true"

  Examples:
    |username|password|
    |user1   |pass1   |
    |user2   |pass2   |
    |user3   |pass3   |
    |user4   |pass4   |
