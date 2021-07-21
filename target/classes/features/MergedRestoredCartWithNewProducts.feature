Feature: Merged carts


  Scenario: Customer adds a product to cart and reaches the checkout page
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer customer clicks on SignIn button from the header of the page
    And customer clicks the username and password field and enter the credentials on the SignIn form
    And customer clicks on SignIn button
    And customer clicks on Store button from the header of the page
    And customer clicks on "Adolescent/Adult Sensory Profile (Sensory Profile Adult/Adolescent)" Product Link
#    And customer clicks No button on the Survey Pop-up
    And customer clicks on Kits Format Cart for SPA product
    And customer clicks on add to Cart button
    And customer clicks on View Cart on the displayed pop-up
    Then user should see the Cart page with the product selected
    And customer clicks on Save Cart button
    And customer clicks on Cart Name field on Save Cart Popup and types "Name" in the field
    And customer clicks on Save Button from Save Cart Popup
    Then customer should see an cart update message
    And customer clicks on My Account dropdown button
    And customer clicks on Saved Carts Link from the dropdown list
    And customer clicks on Restore Button
    And customer clicks on Restore Button from the Restore Popup
    And customer clicks on Store button from the header of the page
    And customer clicks on "Adolescent/Adult Sensory Profile (Sensory Profile Adult/Adolescent)" Product Link
    And customer clicks on Kits Format Cart for SPA product
    And customer clicks on add to Cart button
    And customer clicks on View Cart on the displayed pop-up