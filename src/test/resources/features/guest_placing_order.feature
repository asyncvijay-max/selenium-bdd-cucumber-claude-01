Feature: Guest places Order - E2E

  @guestorder
  Scenario: Ability of guest to place order
    Given Guest reaches Store Page
    When Guest search for "blue"
    And Guest is able to search successfully
    And Guest adds "Blue Shoes" in the cart
    And Guest see the added product in the cart
    And Guest fills the billing address
      | firstName | lastName | street    | city     | zip   | email           |
      | tome       | jerye    | 215 street | New York | 10001 | tom123e@testing.com |
    And Guest submits the Order
    Then Guest sees the order successfully



