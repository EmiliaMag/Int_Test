Feature: Info Button- Qualification Level

  Scenario: Customer clicks on Info button from the Qualification Level section
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer customer clicks on SignIn button from the header of the page
    And customer clicks the username and password field and enter the credentials on the SignIn form
    And customer clicks on SignIn button
    And customer clicks on My Account dropdown button
    And customer clicks on Qualification Button from the dropdown list
    And customer clicks on Info button on the right of the Qualification Level section
    Then customer should see an Qualification Level Popup