@Regression
Feature: Check the functionality of the contact profile looping 

Scenario: Check the how many time to looped in the contact profile option
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the wheel rail option
And User have to click the contact option
When User have to click the contact profile option review option under the action button
And User have to chcek the loop count of review option is showing the contact profile option
Then User have to close the tab
