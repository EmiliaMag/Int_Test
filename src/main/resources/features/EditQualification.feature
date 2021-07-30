Feature: edit button from qualification page

  Scenario: Customer edits the qualification field
    Given customer visits the PearsonAssessment's LogIn Page
    And  customer closes pop-ups
    When customer customer clicks on SignIn button from the header of the page
    And customer clicks the username and password field and enter the credentials on the SignIn form
    And customer clicks on SignIn button
    And customer clicks on My Account dropdown button
    And customer clicks on Qualification Button from the dropdown list
    And  customer clicks on Edit button on "Degree" section
    Then customer should see the Edit Degree Page
    And customer clicks on Degree dropdown list and selects "Doctor Of Medicine"
    And customer clicks on Major Field and types "Medicine"
    And customer clicks on Institution Field and types "Institution"
    And customer clicks on Terms & Conditions checkbox
    And customer clicks on Save Button from the Edit Degree Button
    Then customer should be redirected to the Qualification page and should see The B Level Degree
    And  customer clicks on Edit button on "License/Certification" section
    And customer clicks on Certification Type dropdown list and selects "Medical Doctor"
    And customer clicks on Certification Number field and types "098675672354"
    And customer clicks on Certifying Agency field and types "Agency"
    And customer clicks on State field and selects "Ohio"
    And customer clicks on Terms & Conditions checkbox
    And customer clicks on Save Button from the Edit Degree Button
    Then customer should be redirected to the Qualification page and should see The B Level Degree
    And customer clicks on Edit button on "Accredited institution" section
    And customer clicks on Institution Name and types "Name"
    And customer clicks on Type of Institution Field and selects "Public"
    And customer clicks on Country Field and selects "United States"
    And customer clicks on StreetAddress field and types "Street Address"
    And customer clicks on City field and types "Phoenix"
    And customer clicks on State dropdown and selects "Arizona"
    And customer clicks on Postal Code field and types "85018"
    And customer clicks on Accreditation status dropdown and select "Already accredited"
    And customer clicks on Terms & Conditions checkbox
    And customer clicks on Save Button from the Edit Degree Button
    Then customer should be redirected to the Qualification page and should see The B Level Degree
    And customer clicks on Edit button on "Organization membership" section
    And customer clicks on Organization types dropdown and selects "American Occupational Therapy Association (AOTA)"
    And customer clicks on Membership number field and types "1234567890"
    And customer clicks on Terms & Conditions checkbox
    And customer clicks on Save Button from the Edit Degree Button
    Then customer should be redirected to the Qualification page and should see The B Level Degree
