@Regression
Feature: Check the functionality of the vehicle door option

Scenario: Check the functionality of adding the doors in the vehicle

Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the vehicle button
When User have to mouseover the my vehicle option
And User have to click the action button in the my vehicle and click edit option
And User have to click the vehicle doors option
And User have to click the vehicle door plus button
And User have to enter details of the door start and end distance
And User have to click the vehicle door save button
And User have to mouseover the my vehicle option
And User have to click the action button in the my vehicle and click edit option
And User have to click the vehicle three D option
Then User have to close the tab

Scenario: Check the detach option of the door in vehicle

Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the vehicle button
When User have to mouseover the my vehicle option
And User have to click the action button in the my vehicle and click edit option
And User have to click the vehicle doors option
And User have to click the vehicle door save button
Then User have to close the tab
