Feature: Customer access the Pearson's LogIn Page, add try to create a new account

  Scenario: Customer creates a new account
    Given customer visits the PearsonAssessment's LogIn Page (dev environment)
    And  customer closes pop-ups
    When customer customer clicks on SignIn button from the header of the page
    And customer clicks on First Name field in the Create Account form and types "FirstNameAB"
    And customer clicks on Last Name field in the Create Account form and types "LastNameAB"
    And customer clicks on Email field in the Create Account form and types "abcde@gmail.com"
    And customer unchecks the Same as email address checkbox
    And customer clicks on Username field in the Create Account form and types "UsernameTestAB"
    And customer clicks on Password field in the Create Account form and types "PasswordTest@87"
    And customer clicks on Terms&Conditions checkbox
    And customer clicks on Create Account button
    Then customer should be redirected to Account details page