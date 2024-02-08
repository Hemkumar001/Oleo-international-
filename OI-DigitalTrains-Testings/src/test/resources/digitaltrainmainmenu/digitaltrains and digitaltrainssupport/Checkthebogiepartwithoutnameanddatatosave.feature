@Regression
Feature: Check the functionality of the bogie part save button

Scenario: User have to check without data save the bogie part
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the bogie option and click the bogie part
When User have to click the create bogie part option
And User have to select part and create part button
And User have to fill the part name without data to save button
And User have to check the part able to save or not
Then User have to close the tab

Scenario: User have to check without name save the bogie part
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the bogie option and click the bogie part
When User have to click the create bogie part option
And User have to select part and create part button
And User have to fill the part data without name to save button
And User have to check the with out name part able to save or not
Then User have to close the tab

Scenario: User have to check the bogie part delete option
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the bogie option and click the bogie part
When User have to mouseover the without name simulation 
And User have to click the without data bogie part action button
And User have to click the without data bogie part delete button
Then User have to close the tab
