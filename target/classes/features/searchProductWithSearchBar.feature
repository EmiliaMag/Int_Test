Feature: Search Bar

  Scenario: Customer search a product with search bar
    Given customer visits the PearsonAssessment's LogIn Page
    And customer closes pop-ups
    When customer clicks on Search Bar
    And customer types the Ampac product name
    And customer clicks on search button
    Then customer should see the Ampac's Product Page