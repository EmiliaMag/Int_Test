Feature: Add to cart when cutomer is logged out

  Scenario: Customer Log in to the pearsonassesment page
    Given customer visits the PearsonAssessment's LogIn Page
    And customer closes pop-ups
#    When customer  clicks on Store button from the header   (old)
    When customer go to Store Page
    And customer clicks on "Sensory Profile Adult" Product Link
    And customer clicks on "All products" Format Cart
    And customer clicks on Add to Cart Button from the product with isbn: "A103000232631"
    And customer clicks on View Cart button from the Add to Cart pop-up
    Then customer should see the product in the cart