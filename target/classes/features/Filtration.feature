@smoke

Feature: Product filtration

  Scenario: Logged user could filter with color
    Given user has logged in
    And   user is at home page
    When  user hovers over apparel
    And   user clicks shoes sub-category
    And   user chooses a color filter
    Then  products having chosen color
