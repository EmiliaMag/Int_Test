Feature: Search Bar

  Scenario: User search a product with search bar
    Given user visit the PearsonAssesment page
    And user closes Pop-up
    When user click on Search Bar
    And type the Ampac produc name
    And click on search button
    Then the user should see the Ampac's Product Page