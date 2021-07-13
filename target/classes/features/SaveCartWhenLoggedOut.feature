Feature: Save Cart

  Scenario: User save the cart when is logged out
    Given user visit the PearsonAssesment Page
    And user closes pop-up
    When user click on Quick Order button from the Pearson Banner
    And click on Isbn-Product Code field
    And type the Product Code in the field
    And click on Isbn-Product Code first column text
    And click on Add to Cart button on the right side of the Product Code field
    When user click on View Cart button from the Add to cart pop-up
    And click on Save cart button on the pop-up
    Then the user should see the Sign In page in breadcrumb