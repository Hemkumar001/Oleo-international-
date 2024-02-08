@Regression
Feature: Check the functionality of the sliding buffer stop checking the edit fabrication contact option

Scenario: User have to check buffer stop contact option
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click buffer stop button
And User have mouse over view to the three point sliding bufferstop
And User have to click the bufferstop action and view bufferstop button
When User have to click the edit fabrication option
And User have to click the contact type option box
And User have to select the side contact type option
And User have to click the geometry option and fill the unfiled option
And User have to click the bufferstop apply button
And User have to click the bufferstop done button
Then User have to close the tab
