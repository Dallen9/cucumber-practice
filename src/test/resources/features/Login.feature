Feature: Application Login

  @RegTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "john" and "1234"
    Then Home page is populated
    And Cards displayed are "true"

  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "doe" and "123445"
    Then Home page is populated
    And Cards displayed are "false"

  # Data table
  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with following details
    | jenny | abcd | john@gmail.com | U.S | 32336626 |
    Then Home page is populated
    And Cards displayed are "true"

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
