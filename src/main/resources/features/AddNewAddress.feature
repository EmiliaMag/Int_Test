Feature: Add a new Address in the Address Book


  Scenario: Customer add a new address in the Address Book
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
    And customer click X Button to remove the new added address
    And customer click on Delete button from the Delete Address Pop-up
    Then customer should see the update message

