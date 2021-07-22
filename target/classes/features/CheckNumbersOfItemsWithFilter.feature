Feature: Filters section on the Store Page

  Scenario:  Customer search for products for Preschool Age Range
    Given customer visits the PearsonAssessment's LogIn Page
    And customer closes pop-ups
    And  customer clicks on Store button from the header
    When customer clicks Behavior Category Filter
    And customer clicks Age Range Dropdown
    And customer clicks Preschool Checkbox
    Then customer should see the number of products according to the selected filters