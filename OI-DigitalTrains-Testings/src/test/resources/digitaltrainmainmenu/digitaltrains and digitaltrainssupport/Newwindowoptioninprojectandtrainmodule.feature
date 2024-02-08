@Regression
Feature: Check the functionality of newwindow options in project and train module

Scenario: User have to check the simulation under the new window option
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the project button
And User have mouseover the running train simulation option
When User have to click the action and edit simulation button
And User have to click the first train new window option and check the train module
And User have to click the route profile new window option and check the route profile module
And User have to click the train two or bufferstop option and click the route profile new window option


Scenario: User have to check the Train under the new window option
Given User have to click the train option and mouse over the my train
And User have to click the my train edit option
And User have to click the vehicle new window option and check the vehicle module
And User have to click the left coupling inter face new window option and check the coupling interface module
And User have to click the right coupling inter face new window option and check the coupling interface module
Then User have to close the tab


