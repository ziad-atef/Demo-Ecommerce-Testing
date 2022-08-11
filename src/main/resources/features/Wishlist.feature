@smoke

Feature: Wishlist

  Scenario: Logged user could add different products to Wishlist(1)
    Given user has logged in
    And   user go to home page
    When  user click add to wishlist button
    Then  item should be added to wishlist

  Scenario: Logged user could add different products to Wishlist(2)
    Given user has logged in
    And   user go to home page
    When  user click add to wishlist button
    And   user wait until success message disappears
    And   user clicks wishlist tab
    Then  item quantity in wishlist should be > 0