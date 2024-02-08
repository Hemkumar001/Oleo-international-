@Regression
Feature: Check the mirror input field option of the digitaltrains Bogies

Scenario: Check the functionality of bogies bush mirror the top and bottom fields
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the bogies button
When User have to click the assambly option
And User have to click the create bogie option
And User have to enter air spring two bogies name and create
And User have to click the air spring add button
And User have to click the air spring bush option
And User have to enter bush the top x input field and check the bottom x input field is refelecting the same data
And User have to enter bush the top y input field and check the bottom y input field is refelecting the same data
Then User have to enter bush the top z input field and check the bottom z input field is refelecting the same data


Scenario: Check the functionality of bogies airspring mirror top and bottom fields
Given User have to click the air spring add button
And User have to click the air spring option
When User have to enter Airspring the top x input field and check the bottom x input field is refelecting the same data
And User have to enter Airspring the top y input field and check the bottom y input field is refelecting the same data
Then User have to cancel the air spring button


Scenario: Check the functionality of bogies shearspring mirror top and bottom fields
Given User have to click the air spring add button
And User have to the shear spring option
And User have to enter shear spring x y values
When User have to enter Shearspring the top x input field and check the bottom x input field is refelecting the same data
And User have to enter Shearspring the top y input field and check the bottom y input field is refelecting the same data
Then User have to click the shearspring cancel button

Scenario: Check the functionality of bogies constraint mirror top and bottom fields
Given User have to click the air spring add button
And User have to the constraint option
And User have to enter constraint x y z values
And User have to enter constraint the top x input field and check the bottom x input field is refelecting the same data
And User have to enter constraint the top y input field and check the bottom y input field is refelecting the same data
And User have to enter constraint the top z input field and check the bottom z input field is refelecting the same data
Then User have to click the constraint cancel button

Scenario: Check the functionality of bogie delete option
Given User have to click the bogies button
And User have to click the assambly option 
When User mouseover the airspring second bogie and click the action
And User have to click the airspring second bogie delete button
Then User have to close the tab