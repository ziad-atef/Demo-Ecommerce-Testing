@smoke

Feature: Product search

  Scenario Outline:  Logged user could search using product name
    Given user has logged in
    And   user is at home page
    When  user enter product name as "<name>"
    And   user press enter
    Then  search results should appear and contain "<name>"
    Examples:
      |  name  |
      |  book  |
      | laptop |
      |  nike  |

  Scenario Outline:  Logged user could search for product using sku
    Given user has logged in
    And   user is at home page
    When  user enter product sku as "<sku>"
    And   user press enter
    Then  search result should contain "<sku>"
    Examples:
      |     sku     |
      |  SCI_FAITH  |
      |  APPLE_CAM  |
      |  SF_PRO_11  |
