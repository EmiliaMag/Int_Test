Feature: Pearson Logo functionality

  Scenario: Customer return to the Home Page using the Pearson's Logo Button
    Given customer visits the PearsonAssessment's LogIn Page
    And customer closes the pop-up
    When customer clicks on Search Bar field
    And customer types the Ampac product name
    And customer clicks on search button next to the search field
    And customer clicks on Pearson's Logo button
    Then customer should be redirected to the Home Page