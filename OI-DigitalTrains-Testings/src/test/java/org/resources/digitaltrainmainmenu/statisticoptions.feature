@smoke @sanity @Regression
Feature: To check the main webpage statistics under fuctionality

Scenario: To check the project button working or not
Given User have to launch browser and URL,click login button
And User have to enter the user name and password,click submit button
When User have to click the statistics project button
And User have to enter project url
Then User have to click back button

Scenario: To check the sim button working or not
Given User have to click the sim button
When User have to enter project url
Then User have to click back button

Scenario: To check the trains button working or not
Given User have to click the statistics trains button
When User have to enter trains url
Then User have to click back button

Scenario: To check the vehicles button working or not
Given User have to click the statistics vehicle button
When User have to enter vehicles url
Then User have to click back button

Scenario: To check the bufferstops button working or not
Given User have to click the statistics bufferstop button
When User have to enter bufferstop url
Then User have to click back button

Scenario: To check the gauges button working or not
Given User have to click the statistics gauges button
When User have to enter gauges url
Then User have to click back button

Scenario: To check the routprofile button working or not
Given User have to click the statistics routprofile button
When User have to enter routprofile url
Then User have to click back button

Scenario: To check the couplinginterface button working or not
Given User have to click the statistics coupling interface button
When User have to enter coupling interface url
Then User have to click back button

Scenario: To check the devices button working or not
Given User have to click statistics devices button
When User have to enter devices url
Then User have to close the tab

