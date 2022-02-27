Feature: LeafTaps login functionality

Scenario Outline: Login with positive credentials
Given Open the chrome browser
And Load the application url <url>
And Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Homepage should be displayed

Examples:
|url|username|password|
|'http://leaftaps.com/opentaps'|'Demosalesmanager'|'crmsfa'|
|'http://leaftaps.com/opentaps'|'DemoCSR'|'crmsfa'|


Scenario: Login with negative credentials
Given Open the chrome browser
And Load the application url 'http://leaftaps.com/opentaps/control/main'
And Enter the username as 'demo'
And Enter the password as 'crmsfa'
When Click on login button
But Error message should be displayed