@smoke

Feature: Follow us on social media

  Scenario: User could follow us on facebook
    Given user go to home page
    When  clicks on facebook link
    And   user switches to new tab
    Then  page url should be "https://www.facebook.com/nopCommerce"

  Scenario: User could follow us on twitter
    Given user go to home page
    When  clicks on twitter link
    And   user switches to new tab
    Then  page url should be "https://twitter.com/nopCommerce"

  Scenario: User could follow us on rss
    Given user go to home page
    When  clicks on rss link
    And   user switches to new tab
    Then  page url should be "https://demo.nopcommerce.com/new-online-store-is-open"

  Scenario: User could follow us on youtube
    Given user go to home page
    When  clicks on youtube link
    And   user switches to new tab
    Then  page url should be "https://www.youtube.com/user/nopCommerce"