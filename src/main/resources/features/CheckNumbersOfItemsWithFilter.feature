Feature: Filters section on the Store Page

  Scenario:  User search for products for Preschool Age Range
    Given user visit the PearsonAssesment's Page
    And user closes pop-ups
    And  click on Store button from the header
    When user click Behavior Category Filter
    And click Age Range Dropdown
    And click Preschool Checkbox
    Then the user should see the number of products according to the selected filters