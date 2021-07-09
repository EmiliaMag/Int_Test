Feature: Checkout Page

  Scenario: User buy a product and reaches the checkout page
    Given User visit the PearsonAssesment page
    And  closes  the pop-up us
    When user click on SignIn Button from the header of the page
    And click the username and password field and enter the credentials on the SignIn form
    And click on SignIn button
    Then click on Store button from the header of the page
    And click on Sensory Profile Adult Product Link
    And click No button on the Survey Pop-up
    And click on Kits Format Cart for SPA product
    And click on add to Cart button
    And click on View Cart on the displayed pop-up
    Then click on checkout button
    And click on My Account Radio Box
    And click on Continue button
    Then user should see the Secure Checkoout Page