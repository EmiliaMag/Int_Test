Feature: Checkout Page

  Scenario: Customer adds a product to cart and reaches the checkout page
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes the pop-up
    When customer customer clicks on SignIn button from the header of the page
    And customer clicks the username and password field and enter the credentials on the SignIn form
    And customer clicks on SignIn button
    Then customer clicks on Store button from the header of the page
    And customer clicks on Sensory Profile Adult Product Link
#    And customer clicks No button on the Survey Pop-up
    And customer clicks on Kits Format Cart for SPA product
    And customer clicks on add to Cart button
    And customer clicks on View Cart on the displayed pop-up
    Then customer clicks on checkout button
    And customer clicks on My Account Radio Button
    And customer clicks on Continue button
    Then customer should see the Secure Checkout Page