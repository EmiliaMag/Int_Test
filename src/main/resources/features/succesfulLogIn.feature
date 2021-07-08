
Feature: LogIn

  Scenario: User Log in to the pearsonassesment page
    Given user visit the PearsonAssesment's LogIn Page
    And user closes pop-ups
    When user type the username in the Username Field
    And type the password in the Password Field
    And click on SignIn Button
    Then the user should be logged in to the page