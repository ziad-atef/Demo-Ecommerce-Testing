@smoke

Feature: Currencies

  Scenario: User could change the currency
    Given user go to home page
    When  select Euro currency from the dropdown
    Then  Euro Symbol is shown on the 4 products displayed in Home page