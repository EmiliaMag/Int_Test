Feature: LogIn

  Scenario: Customer Log in to the pearsonassesment page
    Given customer visits the PearsonAssessment's LogIn Page
    And customer closes pop-ups
    When customer types the username in the Username Field
    And customer types the password in the Password Field
    And customer clicks on SignIn button
    Then customer should be logged in to the page