@regression @yavuz
Feature: Onboarding Create Tests with Requester Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Onboardings" section in the Navigation Menu

  @ONB2-107
  Scenario: TC ONB2-107 Personal Information section in the new onboarding page should be visible
    And The user click on the "New Onboarding" button top right corner of the page
    Then The user should seen "Personal Information" section

  @ONB2-108
  Scenario: TC ONB2-108 Company Registration section in the new onboarding page should be visible
    And The user click on the "New Onboarding" button top right corner of the page
    Then The user should seen "Company Registration" section

  @ONB2-109
  Scenario: TC ONB2-109 Resources section in the new onboarding page should be visible
    And The user click on the "New Onboarding" button top right corner of the page
    Then The user should seen "Resources" section

  @ONB2-110
  Scenario: TC ONB2-110 Completion Date at The Latest section in the new onboarding page should be visible
    And The user click on the "New Onboarding" button top right corner of the page
    Then The user should seen "Completion Date at The Latest" section

  @ONB2-111
  Scenario: TC ONB2-111 Comments section in the new onboarding page should be visible
    And The user click on the "New Onboarding" button top right corner of the page
    Then The user should seen "Comments" section

  @ONB2-137
  Scenario: TC ONB2-137 Comments Show logs button in the Action section of first element of Onboarding list should be visible
    Then The User verify that “Show Logs” button in the Action section is visible

  @ONB2-140
  Scenario: TC ONB2-140 Edit icon in the Ongoing Elements of Onboardings List should be visible
    And The User click on "Drafts" tab under the List of Onboardings headline
    Then The User verify that edit icon in the Actions section of first element of list should be visible

  @ONB2-141
  Scenario: TC ONB2-141 Personal Information section  in the Edit Onboarding page should be visible
    And The User click on "Drafts" tab under the List of Onboardings headline
    And The User click on edit icon in the Actions section of first element of list
    Then The user should seen "Personal Information" section

  @ONB2-143
  Scenario: TC ONB2-143 Resources section in the Edit Onboarding page should be visible
    And The User click on "Drafts" tab under the List of Onboardings headline
    And The User click on edit icon in the Actions section of first element of list
    Then The user should seen "Resources" section

  @ONB2-144
  Scenario: TC ONB2-144 Completion Date At The Latest section in the Edit Onboarding page should be visible
    And The User click on "Drafts" tab under the List of Onboardings headline
    And The User click on edit icon in the Actions section of first element of list
    Then The user should seen "Completion Date at The Latest" section

  @ONB2-145
  Scenario: TC ONB2-145 Comments section in the Edit Onboarding page should be visible
    And The User click on "Drafts" tab under the List of Onboardings headline
    And The User click on edit icon in the Actions section of first element of list
    Then The user should seen "Comments" section

  @ONB2-304
  Scenario: TC ONB2-304 Attachments section in the new onboarding page should be visible
    And The user click on the "New Onboarding" button top right corner of the page
    Then The user should seen "Attachments" section

  @ONB2-306
  Scenario: TC ONB2-306 The "Select File" button in the Attachments section should be visible
    And The user click on the "New Onboarding" button top right corner of the page
    Then The user should seen “Select File” button in the Attachments section

  @ONB2-19
  Scenario: TC ONB2-19 List of Onboarding should be displayed properly
    Then User should be able to view previously created onboarding item

  @ONB2-102
  Scenario: TC ONB2-102 Clicking on the "Onboardings" link at the top left of the page redirects the page to the 'All onboardings list page'
    And The user click on the "New Onboarding" button top right corner of the page
    And The User click on the Onboardings link top left on the page
    Then The User verify that links redirected to the page

  @ONB2-101
  Scenario: TC ONB2-101 Clicking the "View More" button in the "Action" section of the completed items redirects to the relevant page
    And Click on the View More button in the Action part of the element which has complated status
    Then The user verify that the page redirect to "Edit onboarding | Mycomp" Page

  @ONB2-100
  Scenario: TC ONB2-100 When Click on the "show logs" button in the "Action" part of the first onboarding element, the logs should be shown
    And The User Click on the show logs button of First Onboarding List Element
    Then The User Verify that show logs modal opened

  @ONB2-142
  Scenario: TC ONB2-142 Company Registration section in the Edit Onboarding page should be visible
    And The User click on "Drafts" tab under the List of Onboardings headline
    And The User click on edit icon in the Actions section of first element of list
    Then The user should seen "Company Registration" section

  @ONB2-103
  Scenario: TC ONB2-103 Cancel button in the ant-popover should be clickable
    And The user click on the delete icon in the Actions section of a first element of onboarding list
    Then The User verify that "Cancel" button is clickable

  @ONB2-106
  Scenario: TC ONB2-106 New Onboarding button top right corner of the page should be clickable
    And The user click on the "New Onboarding" button top right corner of the page
    Then The User verify that redirected to new onboarding create page

  @ONB2-78
  Scenario: TC ONB2-78 'All' tab should show all onboarding processes
    And The User click on All tab under the List of Onboardings headline
    Then Then user verify that All onboarding processes should shown in the All tab

  @ONB2-79
  Scenario: TC ONB2-79 'Drafts' tab should show ongoing onboarding processes
    And The User click on "Drafts" tab under the List of Onboardings headline
    Then Then user verify that Draft onboarding processes should shown in the Drafts tab

  @ONB2-80
  Scenario: TC ONB2-80 'Complated' tab should show complated onboarding processes
    And The User click on Completed tab under the List of Onboardings headline
    Then Then user verify that Completed onboarding processes should shown in the Drafts tab

  @ONB2-46
  Scenario: TC ONB2-46 Created onboarding should be deleted
    And The user click on the delete icon in the Actions section of a first element of onboarding list
    And The User Click on "Delete" button on the ant-popover
    Then The user verify that created onboarding is deleted

  @ONB2-112
  Scenario: TC ONB2-112 Add Resources button in the new onboarding page should be clickable
    And The user click on the "New Onboarding" button top right corner of the page
    Then The User verify that "Add resource" button should be clickable

  @ONB2-113
  Scenario: TC ONB2-113 Add Comment button in the new onboarding page should be clickable
    And The user click on the "New Onboarding" button top right corner of the page
    And The user write a comment in the comment section bottom of the page
    Then The User verify that the "Add comment" button is clickable

  @ONB2-114
  Scenario: TC ONB2-114 Delete Comment (icon) button in the new onboarding page should be clickable
    And The user click on the "New Onboarding" button top right corner of the page
    And The user write a comment in the comment section bottom of the page
    And The User Click on the "Add comment" button
    Then The User verify that the Delete Comment button is clickable

  @ONB2-77
  Scenario: TC ONB2-77 The customize column button on the onboarding listing page should be clickable
    Then The customize column button at the top right of the page must be clickable

  @ONB2-76
  Scenario: TC ONB2-76 The search button on the onboarding listing page should be clickable
    Then The "Search" button at the top right of the page should be clickable

  @ONB2-138
  Scenario: TC ONB2-138 Show logs button in the Action section of first element of Onboarding list should be clickable
    Then The User verify that “Show Logs” button in the Action section is clickable

  @ONB2-115
  Scenario: TC ONB2-115 New Comment should be added in the new onboarding page
    And The user click on the "New Onboarding" button top right corner of the page
    And The user write a comment in the comment section bottom of the page
    And The User Click on the "Add comment" button
    Then The user verify that the addition of a new comment

  @ONB2-117
  Scenario: TC ONB2-117 New Comment should be deleted in the new onboarding page
    And The user click on the "New Onboarding" button top right corner of the page
    And The user write a comment in the comment section bottom of the page
    And The User Click on the "Add comment" button
    Then The user verify that the addition of a new comment
    And The user click on the "Delete" icon-button
    Then The User verify that the new comment has been deleted

  @ONB2-220
  Scenario: TC ONB2-220 The user should be able to create a new onboarding record by filling in all the required information
    And The user click on the "New Onboarding" button top right corner of the page
    And The User fills a  Personal Information Area
    And The User fills a  Company Registration Area
    And The User fills a  Resources Area
    And The User select a Completion Date at The Latest
    And The User Click on the "Save & Complete" button
    And The User Click on the "Confirm" button
    Then The User verify that the onboarding record has been created in the List of Onboardings

  @ONB2-221
  Scenario: TC ONB2-221 The user should be able to save a new onboarding record by filling in all the required information
    And The user click on the "New Onboarding" button top right corner of the page
    And The User fills a  Personal Information Area
    And The User fills a  Company Registration Area
    And The User fills a  Resources Area
    And The User select a Completion Date at The Latest
    And The User Click on the "Save" button
    Then The User then verify that the onboarding registration status is saved as draft

  @ONB2-222
  Scenario: TC ONB2-222 The user should not be able to create a new onboarding record without filling in and saving all required information
    And The user click on the "New Onboarding" button top right corner of the page
    And The User fills a  Personal Information Area
    And The User fills a  Company Registration Area
    And The User fills a  Resources Area
    And The User Click on the "Back" button
  # Then The User verify that the onboarding record hasn’t been created

  @ONB2-277
  Scenario: TC ONB2-277 The user should not be able to create a new onboarding record  by filling in all the required information except one section
    And The user click on the "New Onboarding" button top right corner of the page
    And The user fills in all fields on the page except personal title section
    And The User Click on the "Save & Complete" button
    And The User Click on the "Confirm" button
    Then The user then verifies that the toast message has been seen that the registration process did not take place

  @ONB2-303
  Scenario: TC ONB2-303 The mini-calendar should be available in the "Completion Date at The Latest"section
    And The user click on the "New Onboarding" button top right corner of the page
    And The user clicks on the Completion Date section in the Company Registration
    Then The User verify that the mini calendar is opened

  @ONB2-212
  Scenario: TC ONB2-212 The job in the Drafts list should be able to be saved by changing one of the personal information
    And The User click on "Drafts" tab under the List of Onboardings headline
    And And The User click on edit icon in the Actions section of first element of list
    And The user changing one of the personal information
    And The User Click on the "Save" button
    Then The User verify that the change has been saved

  @ONB2-214
  Scenario: TC ONB2-214 The job in the Drafts list should be able to be saved by changing one of the Company Registration
    And The User click on "Drafts" tab under the List of Onboardings headline
    And And The User click on edit icon in the Actions section of first element of list
    And The user changing one of the Company Registration
    And The User Click on the "Save" button
    Then The User verify that the change has been saved

  @ONB2-219
  Scenario: TC ONB2-219 The job in the Drafts list should not be able to be changed once it has been completed without one of the personal details being changed and saved
    And The User click on "Drafts" tab under the List of Onboardings headline
    And And The User click on edit icon in the Actions section of first element of list
    And The user changing one of the personal information
    And The User Click on the "Back" button
    Then The User verify that no changes have occured

  @ONB2-215
  Scenario: TC ONB2-215 The job in the Drafts list should be able to be saved by changing one of the Resources
    And The User click on "Drafts" tab under the List of Onboardings headline
    And And The User click on edit icon in the Actions section of first element of list
    And The user changing one of the Resources
    And The User Click on the "Save" button
    Then The User verify that the change has been saved

  @ONB2-216
  Scenario: TC ONB2-216 The job in the Drafts list should be able to be saved by changing Complatetion Date at The Latest
    And The User click on "Drafts" tab under the List of Onboardings headline
    And And The User click on edit icon in the Actions section of first element of list
    And The user changing one of the Completion Date At the Latest
    And The User Click on the "Save" button
    Then The User verify that the change has been saved

  @ONB2-218
  Scenario: TC ONB2-218 The job in the Drafts list should be able to be saved and complate
    And The User click on "Drafts" tab under the List of Onboardings headline
    And The User checked the FirstName of List first element
    And And The User click on edit icon in the Actions section of first element of list
    And The User Click on the "Save & Complete" button
    And The User Click on the "Confirm" button
    And The User click on "Completed Requests" tab under the List of Onboardings headline
    Then The User verify that the job is seen in the complated Requests List

    @ONB2-302
    Scenario: TC ONB2-302 The mini-calendar should be available in the first start date section
      And The user click on the "New Onboarding" button top right corner of the page
      And The user clicks on the The First Working Day section in the Company Registration
      Then The User verify that the mini calendar is opened

    @ONB2-297
    Scenario: TC ONB2-297 The user should be able to create a new company site in the "Company registration" section when making a new onboarding
      And The user click on the "New Onboarding" button top right corner of the page
      And The User click on plus + button near to "Company Site" in the Company Registration section
      Then The User verify that the modal is opened