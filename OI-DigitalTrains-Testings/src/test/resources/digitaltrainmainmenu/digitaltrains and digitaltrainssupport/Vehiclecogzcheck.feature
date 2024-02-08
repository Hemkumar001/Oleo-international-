@Regression
Feature: Check the functionality of the vehicle CoG Z

Scenario: Check the vehicle suspension Cog Z is not allow the bellow the wheel diameter values
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the vehicle button
When User have to mouseover the my vehicle option
And User have to click the action button in the my vehicle and click edit option
And User have to click the my vehicle suspension option
And User have to enter bellow the wheel diameter value it throw the error
Then User have to above or equel the wheel diameter after click the save without error to save


