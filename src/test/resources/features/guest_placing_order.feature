Feature: Guest places Order - E2E

  @guestorder
  Scenario: Ability of guest to place order
    Given Guest reaches Store Page
    When Guest search for "blue"
    And Guest is able to search successfully
    And Guest adds "Blue Shoes" in the cart
