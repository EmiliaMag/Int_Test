
Feature: Add to cart when user is logged out

  Scenario: User Log in to the pearsonassesment page
    Given user visit the PearsonAssesment Page
    And user closes pop-up
    When user click on Store button from the header
    And click on Sensory Profile Adult Product
    And click on Kits Format Card
    And click on Add to Cart button
    And click on View Cart button from the Add to Cart pop-up
    Then the user should see the product in the cart