@Regression
Feature: User have to check the vehicle drive and braking characteristics options

Scenario: Check the functionality of adding the vehicle braking and drive characteristics
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
When User have to click the vehicle button
And User have to mouseover my vehicle option and click the action button
And User have to click the braking characteristics box and select the type
And User have to click the drive characteristics box and select the type 
And User have to click the vehicle save button
Then User have to close the tab


