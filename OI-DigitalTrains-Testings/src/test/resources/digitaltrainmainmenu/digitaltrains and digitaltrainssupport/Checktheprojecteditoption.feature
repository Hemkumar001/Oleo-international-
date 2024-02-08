@Regression
Feature: Check the functionality of edit project option

Scenario: User have to create the project option
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
When User have to click the project button in main menu
And User have to click the prject option
Then  User have to fill the DVRS Three project name and click to save 

Scenario: User have to check the project edit option
Given User have to mouseover the DVRS Three project name 
And User have to click the DVRS Three action button
When User have to click the DVRS Three project edit button
Then User have to edit the DVRS Three project name and click the save button

Scenario: User have to check the project delete option
Given User have to mouseover the DVRS Three project name 
And User have to click the DVRS Three action button
When User have to click the DVRS Three project delete button
And User have to click the conform project delete button
Then User have to close the tab 
    
