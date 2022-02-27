Feature: Leaftap create lead functionality

Scenario: Login with positive credentials and create Lead
Given Open the chrome browser
Given Load the application url 'http://leaftaps.com/opentaps/control/main'
Given Enter the username as 'democsr'
Given Enter the password as 'crmsfa'
Given Click on login button
Given Click on CRMSFA link
Given Click on leads tab
Given Click on create lead button
Given Company name as 'ABC PRIVATE COMPANY'
Given First name as 'Vignesh'
Given Last name as 'Munusamy'
When Click on create lead submit button
Then Lead should be created