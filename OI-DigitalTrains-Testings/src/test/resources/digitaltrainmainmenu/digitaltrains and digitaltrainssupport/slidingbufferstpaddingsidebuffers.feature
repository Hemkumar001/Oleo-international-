@Regression
Feature: Check the functionality of the sliding buffer stop adding the sidebuffers

Scenario: User have to check the attach the side buffers functions
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click buffer stop button
And User have mouse over view to the three point sliding bufferstop
And User have to click the bufferstop action and view bufferstop button
And User have to click the bufferstop side buffer add button
When User have to click the gashydraulic option and choose from library option
And User have to click the public library option and select saas type
And User have to click the sidebuffer select template button
And User have to click the side buffer attach button
And User have to click the after adding the side buffer three D option
And User have to click the side buffer added buffer stop done button
Then User have to close the tab

Scenario: User have to check the detach the sidebuffer functions
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click buffer stop button
And User have mouse over view to the three point sliding bufferstop
And User have to click the bufferstop action and view bufferstop button
And User have to click the bufferstop side buffer detach add button
When User have to click the sidebuffer detach button 
Then User have to close the tab

