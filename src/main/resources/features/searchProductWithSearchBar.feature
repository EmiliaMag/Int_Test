Feature: Search Bar

  Scenario: Customer search a product with search bar
    Given customer visits the PearsonAssessment's LogIn Page
    And customer closes the pop-up
    When customer clicks on Search Bar
    And customer types the Ampac produc name
    And customer clicks on search button
    Then customer should see the Ampac's Product Page