Feature: test My account dropdown list1


  Scenario: Customer add a new address in the Address Book
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer customer clicks on SignIn button from the header of the page
    And customer clicks the username and password field and enter the credentials on the SignIn form
    And customer clicks on SignIn button
    And customer go to Store Page
    And customer clicks on "Adaptive Behavior Assessment System | Third Edition (ABAS-3)" Product Link
#    And customer clicks No button on the Survey Pop-up
    And customer clicks on "All products" Format Cart
    And customer clicks on Add to Cart Button from the product with isbn: "0158009150"
    And customer clicks on View Cart on the displayed pop-up
    And customer clicks on Create Quote Button
    And customer clicks on My Account Radio Button
    And customer clicks on Continue button
    And customer clicks on Search Address field
    And customer press the down arrow to select the second address from the list
    And customer clicks on the Next button
    Then customer should see the Shipping Method section from the Create Quote form
    And customer clicks on Next button
    And customer accepts the Terms and Conditions by clicking on the checkbox
    And customer clicks on Generate Quote button
    And customer clicks on View Quote on the Quote Created Popup
    Then the customer should see the created quote