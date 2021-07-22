Feature: Add to cart from Quick Order

  Scenario: Customer add a product in the cart using the quick order
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer clicks Quick Order button
    And customer clicks on Isbn-Product Code field
    And customer types the Product Code in the field
    And customer clicks on Isbn-Product Code first column text
    Then customer should see the product with the product code