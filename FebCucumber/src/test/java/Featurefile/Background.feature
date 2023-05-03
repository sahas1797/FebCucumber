Feature: Checking Background keyword



  @SmokeTest
  Scenario: Adding items to the cart
    Given The user is in his homepage
    When The user click on add to cart
    Then The items must be moved to cart




  Scenario: Payment and checkout of items
    Given The user is in his login
    When the user clicks on payment and Checkout
    Then The user should land in payments page