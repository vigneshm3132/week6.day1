Feature: Leaftap edit lead functionality

Scenario: Login with positive credentials and edit Lead
Given Open the chrome browser
Given Load the application url 'http://leaftaps.com/opentaps/control/main'
Given Enter the username as 'democsr'
Given Enter the password as 'crmsfa'
Given Click on login button
Given Click on CRMSFA link
Given Click on leads tab
Given Click on find contact button
Given Enter the firstname as 'Vignesh'
Given Click on the find contact submit button
Given Click on first lead on search
Given Click on edit lead button
When Click on update button
Then Edit lead should be successful