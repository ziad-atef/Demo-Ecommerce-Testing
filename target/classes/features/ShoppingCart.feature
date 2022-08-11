@smoke

Feature: Shopping cart

  Scenario: Logged user could add different products to Shopping cart(1)
    Given user has logged in
    And   user go to home page
    When  user click add to Shopping cart button
    Then  item should be added to Shopping cart

  Scenario: Logged user could add different products to Wishlist(2)
    Given user has logged in
    And   user go to home page
    When  user click add to Shopping cart button
    And   user wait until Shopping cart success message disappears
    And   user clicks Shopping cart tab
    Then  item quantity in Shopping cart should be > 0