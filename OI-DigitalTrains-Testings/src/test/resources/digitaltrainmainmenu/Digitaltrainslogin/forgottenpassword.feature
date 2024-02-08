Feature: User have to check the forgotten password fuctionality 
@smoke @sanity @Regression
Scenario: User have to check the forgotten password button
Given User have to launch browser and Url
And User have to click the forgotten button
And User have to enter forgotten page
Then User have to close the tab

 @sanity @Regression
Scenario: User have to check the back to login button
Given User have to launch browser and Url
And User have to click the forgotten button 
When User have to click back to login button
Then User have to enter login main page
And User have to close the tab

@sanity @Regression
Scenario: User have to check the Forgotten functionality
Given User have to launch browser and Url
And User have to click the forgotten button
When User have to enter email address
And User have to click the submit button
Then User have to get msg for our login page
And User have to close the tab




