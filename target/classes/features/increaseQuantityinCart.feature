Feature: quantity field in ca cart

  Scenario: Customer increase the quantity of a product from the QTY field
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
#    When customer clicks on Store button from the header of the page   (old)
    And customer go to Store Page
    And customer clicks on "Sensory Profile Adult" Product Link
    # And customer clicks No button on the Survey Pop-up
    And customer clicks on "All products" Format Cart
    And customer clicks on Add to Cart Button from the product with isbn: "0158700015"
    And customer clicks on View Cart on the displayed pop-up
    And customer clicks on QTY field on product with Isbn "0158700015" and deletes the default input
    And customer types the value "10" in the Qty field for isbn : "0158700015"
    Then customer should see update message