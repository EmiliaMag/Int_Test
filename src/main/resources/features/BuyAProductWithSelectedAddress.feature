Feature: Add a new Address in the Address Book


  Scenario: Customer add a new address in the Address Book and then buy a product and
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer customer clicks on SignIn button from the header of the page
    And customer clicks the username and password field and enter the credentials on the SignIn form
    And customer clicks on SignIn button
    And customer clicks on My Account dropdown button
    And customer clicks on Address Book Button from the dropdown list
    And customer clicks on Add Address button on the Address Book Page
    Then customer should see the Add Address Page
    And customer clicks on First Name field and types "Name"
    And customer clicks on Last Name field and types "Last Name"
    And customer clicks on Street Address field and types "the address"
    And customer clicks on the "City" field and types "Phoenix"
    And customer clicks on "State/Province" dropdown list and selects "Arizona"
    And customer clicks on "ZIP/Postal Code" field and types "85018"
    And customer clicks on Save Button
    Then customer should see an update message
#    And customer clicks No button on the Survey Pop-up
    When customer clicks Quick Order button
    And customer clicks on Isbn-Product Code field
    And customer types the Product Code in the field
    And customer clicks on Isbn-Product Code first column text
    And customer clicks on add to Cart button on the right side of the Product Code field
    And customer clicks on View Cart button from the pop-up
    Then customer should see the "Adaptive Behavior Assessments System" product in Cart
    And customer clicks on checkout button
    And customer clicks on My Account Radio Button
    And customer clicks on Continue button
    Then customer should see the Secure Checkout Page
#    And customer clicks No button on the Survey Pop-up
    And customer clicks on Search Address field
    And customer press the down arrow to select the second address from the list
    And customer clicks on the Next button
    Then customer should see the Shipping method displayed
    And customer clicks on Next button
    Then customer should see Payment and billing section displayed
    And customer clicks on Card Number field and types "3546456456456456" in the "Card Number" field
    And customer clicks on Month dropdown list and selects "5" from the "Month" list
    And customer clicks on Year dropdown list and selects "2022" from the "Year" list
    And customer clicks on Security code field and types "245" in the "Security Code" field
    Then customer should see the Place Order button disabled
    And customer clicks on Terms&Conditions checkbox button
    Then customer should see the Place Order button enabled
    And customer clicks on Back to Cart breadcrumb link
    And customer clicks on My Account dropdown button
    And customer clicks on Address Book Button from the dropdown list
    And customer click X Button to remove the new added address
    And customer click on Delete button from the Delete Address Pop-up
    Then customer should see the update message
