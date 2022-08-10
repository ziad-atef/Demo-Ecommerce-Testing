@smoke

Feature: Resetting password

  Scenario:  User could reset his/her password successfully
    Given user go to login page
    When  select forgot password
    And   types registered email
    And   press on recover button
    Then  confirmation message is displayed