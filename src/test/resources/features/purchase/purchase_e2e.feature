@purchase
Feature: E2E purchase on Demoblaze
  As a shopper
  I want to add products to the cart and complete a purchase
  So that I can verify the checkout flow works end-to-end

  Scenario: Purchase two products successfully
    Given I am on the Demoblaze home page
    When I add "Samsung galaxy s6" to the cart
    And I go back to the home page
    And I add "Nokia lumia 1520" to the cart
    And I open the cart
    Then I should see 2 items in the cart
    When I place the order with:
      | name       | Sergio        |
      | country    | Uruguay       |
      | city       | Montevideo    |
      | creditCard | 4111111111111111 |
      | month      | 12            |
      | year       | 2026          |
    Then the purchase should be completed
