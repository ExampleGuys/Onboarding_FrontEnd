
  Feature: Onboarding Create Tests
    Scenario: TC ONB2-107 Personal Information section in the new onboarding page should be visible
      Given The user goes to staging url
      And User logs into the web application with the given test data as a requester
      And The User click on the "Onboarding" section in the Navigation Menu
      And The user click on the "New Onboarding" button top right corner of the page
      Then the user should seen Personal Information section