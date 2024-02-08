@Regression
Feature: Check the functionality of the simulation pdf report

Scenario: Check the functionality of the running train simulation pdf report generator
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the project button
And User have to click the DVRS one option
When User have to mouse over the running train simulation
And User have to click Running train simulation action button
And User have to click the Running train view result simulation option
And User have to click the simulation pdf report option
And User have to click the generate option
Then User have to close the tab
