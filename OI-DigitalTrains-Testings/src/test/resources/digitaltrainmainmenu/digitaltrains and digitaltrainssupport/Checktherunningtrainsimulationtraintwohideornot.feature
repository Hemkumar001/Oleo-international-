@Regression
Feature: Check the functionality of the running train simulation option

Scenario: Check the Running train simulation train two option hide or not
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the project button
And User have to click the dvrs one option 
When User have to mouseover the running train simulation option and click the action
And User have to click the running train edit option
And User have to click the traintwo option and select the identical train option load train select form library
Then User have to close the tab