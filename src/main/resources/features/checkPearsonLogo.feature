
Feature: Pearson Logo functionality

  Scenario: User return to the Home Page using the Pearson's Logo Button
    Given user visit the PearsonAssesment Page
    And user closes pop-ups
    When user click on Search Bar field
    And type the Ampac product name
    And click on search button next to the search field
    And click on Pearson's Logo button
    Then the user should be redirected to the Home Page