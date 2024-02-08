@Regression
Feature: Check the coupler assembly deformation device 

Scenario: Chack the coupler assembly deformation after save the data are missing or not
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click devices button
And User have to enter devices url
And User have to click create device button
When User have to click the coupler assembly deformation option
And User have to fill the coupler assembly deformation device name and datas
And User have to click the coupler assembly deformation save button 
And User have to reopen the coupler assembly deformation device
And User have to check the coupler assembly deformation data
Then User have to close the tab