Feature: LogIn

  Scenario: Customer Log in to the pearsonassesment page
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer customer clicks on SignIn button from the header of the page
    And customer clicks the username and password field and enter the credentials on the SignIn form
    And customer clicks on SignIn button
    Then customer should be logged in to the page