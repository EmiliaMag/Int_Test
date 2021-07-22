Feature: Remove a product added in Quick order -> Reset Form

  Background: Customer add a product in the cart using the quick order
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer clicks Quick Order button
    And customer clicks on Isbn-Product Code field
    And customer types the Product Code in the field
    And customer clicks on Isbn-Product Code first column text
    Then customer should see the product name


  Scenario: Customer removes the product added in the Quick Order
    Given customer is on the Quick Order Page
    And customer clicks on X button to remove the product
    Then customer should see the Add to Cart button disabled

  Scenario: Customer resets the form on Quick Order Page
    Given customer is on the Quick Order Page
    And customer clicks on Isbn-Product Code first column text
    When customer clicks on Reset Form Button


