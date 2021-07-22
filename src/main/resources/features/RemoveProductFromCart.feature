Feature: Customer logs in, add a product to cart, and removes it

  Scenario: Customer adds a product to cart and removes it
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer customer clicks on SignIn button from the header of the page
    And customer clicks the username and password field and enter the credentials on the SignIn form
    And customer clicks on SignIn button
    And customer clicks on Store button from the header of the page
    And customer clicks on "Adaptive Behavior Assessment System | Third Edition (ABAS-3)" Product Link
#    And customer clicks No button on the Survey Pop-up
    And customer clicks on "All products" Format Cart
    And customer clicks on Add to Cart Button from the product with isbn: "0158009169"
    And customer clicks on View Cart on the displayed pop-up
    And customer clicks on the X button then Remove button for the product with isbn : "0158009169"
    Then customer should see the remove alert message