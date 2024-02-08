@Regression
Feature: Check the functionality of the sliding buffer stop adding the friction shoes

Scenario: User have to check the attach the friction shoe functions
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click buffer stop button
And User have mouse over view to the three point sliding bufferstop
And User have to click the bufferstop action and view bufferstop button
When User have to click the friction shoe plus button
And User have clear the elenemt under frame box and fill the data
And User have to click the bufferstop friction attach option
And User have to click the buffer stop friction conform save option
Then User have to click then done button after edit bufferstop


Scenario: User have to check the detach option buffer stop
Given User have mouse over view to the three point sliding bufferstop
And User have to click the bufferstop action and view bufferstop button
When User have to click the friction shoe edit button
And User have to click the bufferstop friction shoe detach option 
And User have to click to conform save button for detach firction shoes
And User have to click then done button after edit bufferstop
Then User have to close the tab

