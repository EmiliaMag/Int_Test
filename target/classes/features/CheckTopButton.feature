Feature: Top button

  Scenario: Customer is on the Store Page, scroll to the bottom of the page and then click on Top button
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
#    And customer clicks on Store button from the header of the page   (old)
    And customer go to Store Page
    And customer scrolls to the bottom of the page
    And customer clicks on Top Button from the bottom-right side of the page
    Then customer should see the search bar field