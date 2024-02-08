@Regression
Feature: Check the same name showing or not in the coupling interface 

Scenario: Check the functionality of creating pivote assemble
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click devices button
And User have to enter devices url
And User have to click create device button
And User have to click the pivot assembly option
And User have to send the device dimention details
And User have to click the pivot assemble save button
Then User have to close the tab

Scenario: Check the functionality of creating coupling interface
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the coupling interface option and its enter coupling interface url
And User have to click create couplin interface button
When User have to click the select template dropdown 
And User have to click select coupling interface and click blank auto coupler interface option
And User have to click the pivot assambly add button
And User have to click the select the choose from library option adding the pivot assemble
And User have to click the personal library H pivot after attach the device
And User have to click coupling interface threeD view
And User have to click coupling interface create button
Then User have to close the tab

