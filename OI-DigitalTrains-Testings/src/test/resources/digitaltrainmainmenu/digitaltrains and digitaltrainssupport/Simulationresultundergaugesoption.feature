@Regression
Feature: Check the functionality of gauges option under the simulation

Scenario: Add the vechicle gauge in the vehicle creation 
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the vehicle button
When User have to mouseover the my vehicle option
And User have to click the action button in the my vehicle and click edit option
And User have to click the vehicle gauges box under my vehicle and select the Y type gauge
Then User have to click save button vehicle under the simulation result gauges option

Scenario: Add the train updated vehicle 
Given User have to click train option under the simulation result gauges
And User have to mouseover my tain option and click the action button
When User have to click edit button in tain option
And User have to click the select vehicle box and select the my vehicle option
Then User have to click the save button and conform to save updated tain

Scenario: Chcek the simulation result under gauges option
Given User have to click the project button in main menu
And User have to click the DVRS one and mouseover the running train simulation
And User have to click the simulation under action button and click edit simulation option
When User have to select the name of the train and select the name of the route profile
And User have to click the save and run simulation and click simulation results
And User have to click the simulation result gauges option
And User have to click the simulation result clearance and three D swept path option
And User have to click the fullscreen option and click the play button 
Then User have to click the close the fullscreen option and close the tab

