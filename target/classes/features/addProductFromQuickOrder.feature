Feature: Add to cart from Quick Order

  Scenario: User add a product in the cart using the quick order
    Given user visit the PearsonAssesment's Page
    And  closes the pop-up
    When user click Quick Order button
    And click on Isbn-Product Code field
    And type the Product Code in the field
    And click on Isbn-Product Code first column text
    Then the user should see the product with the product code