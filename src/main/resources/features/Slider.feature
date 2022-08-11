@smoke

Feature: Home page slider

  Scenario: Logged user could add different products to Shopping cart(1)
    Given user go to home page
    When  user click on first slider
    Then  user should be directed to "https://demo.nopcommerce.com/nokia-lumia-1020"


  Scenario: Logged user could add different products to Wishlist(2)
    Given user go to home page
    When  user click on second slider
    Then  user should be directed to "https://demo.nopcommerce.com/iphone-6"