Feature: Save Cart

  Scenario: Customer save the cart when is logged out
    Given customer visits the PearsonAssessment's LogIn Page
    And customer closes pop-ups
    When customer clicks on Quick Order button from the Pearson Banner
    And customer clicks on Isbn-Product Code field
    And customer types the Product Code in the field
    And customer clicks on Isbn-Product Code first column text
    And customer clicks on add to Cart button on the right side of the Product Code field
    When customer clicks on View Cart button from the Add to Cart pop-up
    And customer clicks on Save cart button on the pop-up
    Then customer should see the Sign In page in breadcrumb