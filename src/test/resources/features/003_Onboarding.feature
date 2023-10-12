
  Feature: Onboarding Create Tests

    Scenario: TC ONB2-107 Personal Information section in the new onboarding page should be visible
      Given The user goes to staging url
      And The user enters with user "requesterUser" and user "requester_password"
      And The User click on the "Onboarding" section in the Navigation Menu
      And The user click on the "New Onboarding" button top right corner of the page
      Then the user should seen Personal Information section

    Scenario: TC ONB2-108 Company Registration section in the new onboarding page should be visible
      Given The user goes to staging url
      And The user enters with user "requesterUser" and user "requester_password"
      And The User click on the "Onboarding" section in the Navigation Menu
      And The user click on the "New Onboarding" button top right corner of the page
      Then the user should seen Company Registration section

      Scenario: TC ONB2-109 Resources section in the new onboarding page should be visible
        Given The user goes to staging url
        And The user enters with user "requesterUser" and user "requester_password"
        And The User click on the "Onboarding" section in the Navigation Menu
        And The user click on the "New Onboarding" button top right corner of the page
        Then the user should seen Resources section

    Scenario: TC ONB2-110 Completion Date at The Latest section in the new onboarding page should be visible
      Given The user goes to staging url
      And The user enters with user "requesterUser" and user "requester_password"
      And The User click on the "Onboarding" section in the Navigation Menu
      And The user click on the "New Onboarding" button top right corner of the page
      Then the user should seen Completion Date at The Latest section

    Scenario: TC ONB2-111 Comments section in the new onboarding page should be visible
      Given The user goes to staging url
      And The user enters with user "requesterUser" and user "requester_password"
      And The User click on the "Onboarding" section in the Navigation Menu
      And The user click on the "New Onboarding" button top right corner of the page
      Then the user should seen Comments section

    Scenario: TC ONB2-137 Comments Show logs button in the Action section of first element of Onboarding list should be visible
      Given The user goes to staging url
      And The user enters with user "requesterUser" and user "requester_password"
      And The User click on the "Onboarding" section in the Navigation Menu
      Then The User verify that “Show Logs” button in the Action section is visible

    Scenario: TC ONB2-140 Edit icon in the Ongoing Elements of Onboardings List should be visible
      Given The user goes to staging url
      And The user enters with user "<requesterUser>" and user "<requester_password>"
      And The User click on the "Onboarding" section in the Navigation Menu