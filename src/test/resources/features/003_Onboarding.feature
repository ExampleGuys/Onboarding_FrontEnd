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
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The User click on "Drafts" tab under the List of Onboardings headline
    Then The User verify that edit icon in the Actions section of first element of list should be visible

  Scenario: TC ONB2-141 Personal Information section  in the Edit Onboarding page should be visible
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The User click on "Drafts" tab under the List of Onboardings headline
    And And The User click on edit icon in the Actions section of first element of list
    Then The User verify that Personel Information section should be visible

  Scenario: TC ONB2-143 Resources section in the Edit Onboarding page should be visible
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The User click on "Drafts" tab under the List of Onboardings headline
    And And The User click on edit icon in the Actions section of first element of list
    Then The User verify that Resources section should be visible

  Scenario: TC ONB2-144 Completion Date At The Latest section in the Edit Onboarding page should be visible
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The User click on "Drafts" tab under the List of Onboardings headline
    And And The User click on edit icon in the Actions section of first element of list
    Then The User verify that Completion Date At The Latest section should be visible

  Scenario: TC ONB2-145 Comments section in the Edit Onboarding page should be visible
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The User click on "Drafts" tab under the List of Onboardings headline
    And And The User click on edit icon in the Actions section of first element of list
    Then The User verify that Comments section should be visible

  Scenario: TC ONB2-304 Attachments section in the new onboarding page should be visible
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The user click on the "New Onboarding" button top right corner of the page
    Then The user should seen Attachments section

  Scenario: TC ONB2-306 The "Select File" button in the Attachments section should be visible
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The user click on the "New Onboarding" button top right corner of the page
    Then the user should seen “Select File” button in the Attachments section

  Scenario: TC ONB2-19 List of Onboarding should be displayed properly
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    Then User should be able to view previously created onboarding item

  Scenario: TC ONB2-102 Clicking on the "Onboardings" link at the top left of the page redirects the page to the 'All onboardings list page'
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The user click on the "New Onboarding" button top right corner of the page
    And The User click on the 'Onboardings' link top left on the page
    Then The User verify that links redirected to the page

  Scenario: TC ONB2-101 Clicking the "View More" button in the "Action" section of the completed items redirects to the relevant page
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And Click on the View More button in the Action part of the element which has complated status
    Then The user verify that the page redirect to Edit Onboarding Page

  Scenario: TC ONB2-100 When Click on the "show logs" button in the "Action" part of the first onboarding element, the logs should be shown
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The User Click on the show logs button of First Onboarding List Element
    Then The User Verify that show logs modal opened

  Scenario: TC ONB2-142 Company Registration section in the Edit Onboarding page should be visible
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The User click on "Drafts" tab under the List of Onboardings headline
    And And The User click on edit icon in the Actions section of first element of list
    Then the User verify that Company Registration section is visible

  Scenario: TC ONB2-103 Cancel button in the ant-popover should be clickable
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The user click on the delete icon in the Actions section of a first element of onboarding list
    And The User Click on "Cancel" button on the ant-popover
    Then The User verify that "Cancel" button is working properly

  Scenario: TC ONB2-106 New Onboarding button top right corner of the page should be clickable
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The user click on the "New Onboarding" button top right corner of the page
    Then The User verify that redirected to new onboarding create page


  Scenario: TC ONB2-78 'All' tab should show all onboarding processes
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The User click on All tab under the List of Onboardings headline
    Then Then user verify that All onboarding processes should shown in the All tab

    Scenario: TC ONB2-79 'Ongoing' tab should show ongoing onboarding processes
      Given The user goes to staging url
      And The user enters with user "requesterUser" and user "requester_password"
      And The User click on the "Onboarding" section in the Navigation Menu
      And The User click on "Drafts" tab under the List of Onboardings headline
      Then Then user verify that Draft onboarding processes should shown in the Drafts tab

  Scenario: TC ONB2-80 'Complated' tab should show complated onboarding processes
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The User click on Completed tab under the List of Onboardings headline
    Then Then user verify that Completed onboarding processes should shown in the Drafts tab

  Scenario: TC ONB2-46 Created onboarding should be deleted
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The user click on the delete icon in the Actions section of a first element of onboarding list
    And The User Click on "Delete" button on the ant-popover
    Then The user verify that created onboarding is deleted

  Scenario: TC ONB2-112 Add Resources button in the new onboarding page should be clickable
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The user click on the "New Onboarding" button top right corner of the page
    Then The User verify that "Add resource" button should be clickable

  Scenario: TC ONB2-113 Add Comment button in the new onboarding page should be clickable
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The user click on the "New Onboarding" button top right corner of the page
    And The user write a comment in the comment section bottom of the page
    Then The User verify that the "Add comment" button is clickable

  Scenario: TC ONB2-114 Delete Comment (icon) button in the new onboarding page should be clickable
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboarding" section in the Navigation Menu
    And The user click on the "New Onboarding" button top right corner of the page
    And The user write a comment in the comment section bottom of the page
    And the User Click on the "Add comment" button
    Then The User verify that the Delete Comment button is clickable