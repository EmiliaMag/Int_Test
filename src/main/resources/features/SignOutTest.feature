Feature: Customer logs in, and then logs out

  Scenario: Customer logs in and then logs out
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer customer clicks on SignIn button from the header of the page
    And customer clicks the username and password field and enter the credentials on the SignIn form
    And customer clicks on SignIn button
    And customer clicks on My Account dropdown button
    And customer clicks on Sign Out
    Then customer should see the Sign In button