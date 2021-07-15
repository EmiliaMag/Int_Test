Feature: quantity field in ca cart

  Scenario: Customer increase the quantity of a product from the QTY field
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer clicks on Store button from the header of the page
    And customer clicks on Sensory Profile Adult Product Link
    # And customer clicks No button on the Survey Pop-up
    And customer clicks on Kits Format Cart for SPA product
    And customer clicks on add to Cart button
    And customer clicks on View Cart on the displayed pop-up
    Then customer clicks on QTY field
    And customer deletes the default input
    And customer types the value 3
    Then customer should see update message