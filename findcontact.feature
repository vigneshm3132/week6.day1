Feature: Leaftap find contact functionality

Scenario: Login with positive credentials and find contact
Given Open the chrome browser
Given Load the application url 'http://leaftaps.com/opentaps/control/main'
Given Enter the username as 'democsr'
Given Enter the password as 'crmsfa'
Given Click on login button
Given Click on CRMSFA link
Given Click on create contact tab
Given Click on find contact tab button
Given Click on email tab
Given Enter the emailid as 'babu@testleaf.com'
When Click on find contact submit button
Then Contacts should be displayed