Feature: quantity field in ca cart

  Scenario: User increase the quantity of a product from the QTY field
    Given User visit the PearsonAssesment page
    And  closes  the pop-up us
    When click on Store button from the header of the page
    And click on Sensory Profile Adult Product Link
    # And click No button on the Survey Pop-up
    And click on Kits Format Cart for SPA product
    And click on add to Cart button
    And click on View Cart on the displayed pop-up
    Then click on QTY field
    And delete the default input
    And enter the value 3
    Then user should see update message