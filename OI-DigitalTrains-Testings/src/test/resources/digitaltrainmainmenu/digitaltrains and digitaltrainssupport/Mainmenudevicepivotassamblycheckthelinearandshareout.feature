@Regression
Feature: Check the functionality of the device creation of the pivot assambly

Scenario: User have to check the linear and shearout option after creation it is select or not 

Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click devices button
And User have to enter devices url
And User have to click create device button
And User have to click the pivot assembly option
And User have to click pivot assembly choose library 
When User have to click the auto coupler option and select the public libray box generic type
And User have to click select pivot assembly template option
And User have to click the pivot assambly linear option and select the personal library donut option
And User have to click the sharout option and select personal library vanday barath select template
And User have to fill the pivot assambly name and save button
And User have to mouseover the vanday barath pivot and click the action button and click the review option
And User have to check the linear and shearout selected or not
Then User have to close the tab