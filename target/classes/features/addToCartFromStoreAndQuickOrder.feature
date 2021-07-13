Feature: Add to cart multiple products


  Background: : User Log in to the pearsonassesment page
    Given user visit the PearsonAssesment's Home Page
    And closes the pop-up
    When user click on Store button
    Then the user should see the Store Page with all the products

  Scenario: User add "Sensory Profile Adult/Adolescent" Product in Cart
    Given user click on Sensory Profile Adult product
    And click on Kits Format Card
    And click on Add to Cart button
    And click on Continue Shopping button from the Add to Cart pop-up
    And click on Store Button from the header
    Then user should see the Store Page with all the products

#
#  Scenario: User add "Auditory Skills Assessment" Product in Cart
#    Given user click on "Auditory Skills Assessment" product
#    And click on "Test Form & reports" Format Card
#    And click on Add to Cart button
#    And click on View Cart button from the Add to Cart pop-up
#    Then the user should see both products added in the cart