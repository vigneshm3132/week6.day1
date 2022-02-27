Feature: Leaftap delete lead functionality

Scenario: Login with positive credentials and delete Lead
Given Open the chrome browser
Given Load the application url 'http://leaftaps.com/opentaps/control/main'
Given Enter the username as 'democsr'
Given Enter the password as 'crmsfa'
Given Click on login button
Given Click on CRMSFA link
Given Click on leads tab
Given Click on find contact button
Given Click on phone tab button
Given Enter the phone number
Given Click on the find contact submit button
Given Click on the lead to be deleted
When Click on delete button
Then Lead should be deleted
