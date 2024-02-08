@Regression
Feature: Check the Functionality of creating train options after usage checking

Scenario: Check the functionality of bogie view usage assembly option
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the bogies button
When User have to click the assambly option
And User have mouseover the y type bogie
And User have to click the y type action button
And User have to click the y type view usage option
And User have to click the view usage view button
Then User have to close the tab

Scenario: Check the functionality of vehicle view usage 
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the vehicle button
And User have to mouseover the vehicle option
When User have to click the vehicle action button
And User have to click the vehicle view usage option
And User have to click the vehicle view option
Then User have to close the tab

Scenario: Check the functionality of train view usage
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click train option enter in train url
When User have to mouseover the train option
And User have to click the train action button
And User have to click the train view usage option
And User have to click the train view option
Then User have to close the tab
 
 
Scenario: Check the functionality of simulation view usage
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the project button in main menu
When User have to click the DVRS one project button
And User have to mouseover the running train simulation
And User have to click the project acton button
And User have ro click the project view usageusage option
And User have to click the project view option
Then User have to close the tab




