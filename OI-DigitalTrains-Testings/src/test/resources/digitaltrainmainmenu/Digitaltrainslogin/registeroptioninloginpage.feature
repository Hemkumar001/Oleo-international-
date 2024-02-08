@smoke @sanity @Regression
Feature: Check the functionality of login page register option 

Scenario: Check the login page register option
Given User have to launch browser and Url
And User have to click the sign up button
And User have to click the monthly option and select the proceed to next step option
And User have to enter details and select the agree option
When User have to click the proceed to payment button
And User have to enter the card details 
And User have to click the pay now button
Then User have to close the tab
