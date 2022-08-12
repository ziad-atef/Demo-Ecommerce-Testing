@smoke

Feature: Products compare list

  Scenario: Logged user could add different products to compare list(1)
    Given user has logged in
    And   user is at home page
    When  user adds a product to compare list
    Then  item should be added to compare list

  Scenario: Logged user could add different products to compare list(2)
    Given user has logged in
    And   user is at home page
    When  user adds a product to compare list
    And   user adds another product to compare list
    And   user navigates to compare list
    Then  chosen products should appear in the compare list
