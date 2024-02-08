@sanity @Regression
Feature: Check the train to train impact simulation options

Scenario: Check the functionality of train to train impact
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the project button in main menu
And User have to mouseover the DVRS two and click the action button
And User have to click the DVRS two create simulation option
When User have to enter the DVRS two simulation name
And User have to enter the DVRS two simulation speed
And User have to fill the train one all data in DVRS two
And User have to fill the train two all data in DVRS two
And User have to click the DVRS two run button
And User have to click the DVRS two simulation result button
And User have to scroll down force and displacement in DVRS two
And User have to click the DVRS two threeD view button
Then User have to close the tab


