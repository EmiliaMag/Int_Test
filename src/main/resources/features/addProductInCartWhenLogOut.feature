Feature: Add to cart when cutomer is logged out

  Scenario: Customer Log in to the pearsonassesment page
    Given customer visits the PearsonAssessment's LogIn Page
    And customer closes pop-ups
    When customer  clicks on Store button from the header
    And customer clicks on Sensory Profile Adult Product
    And customer clicks on Kits Format Card
    And customer clicks on add to Cart button
    And customer clicks on View Cart button from the Add to Cart pop-up
    Then customer should see the product in the cart