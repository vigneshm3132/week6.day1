Feature: Leaftap create contact functionality

Scenario: Login with positive credentials and create contact
Given Open the chrome browser
Given Load the application url 'http://leaftaps.com/opentaps/control/main'
Given Enter the username as 'democsr'
Given Enter the password as 'crmsfa'
Given Click on login button
Given Click on CRMSFA link
Given Click on create contact tab
Given Click on create contact menu button
Given First name as 'Vignesh'
Given Last name as 'Munusamy'
When Click on create contact button
Then Contact should be created