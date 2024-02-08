@Regression
Feature: Check the finctionality of the simulation graph options

Scenario: Chcek the graph option present in the simulation result
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the project button in main menu
When User have to mouse over the DVRS two and click the action button in simulation result
And User have to click the view result option in simulation result
Then User have to check the graph option is present or not 

Scenario: Check the graph under option in simulation result
Given User have to click the simulation graph option
When User have to enter simulation result graph url
Then User have to check the dropdown is contain maximun force

Scenario: Check the force graph option
Given User have to click the force graph in simulation result
When User have to scrolldwon the simulation result force graph
Then User have to enter the simulation result force graph URL

Scenario: Check the velocity graph option
Given User have to click the velocity graph in simulation result
When User have to scrolldwon the simulation result velocity graph
Then User have to enter the simulation result velocity graph URL

Scenario: Check the Acceleration graph option
Given User have to click the Acceleration graph in simulation result
When User have to scrolldwon the simulation result Acceleration graph
Then User have to enter the simulation result Acceleration graph URL

Scenario: Check the Displacement graph option
Given User have to click the Displacement graph in simulation result
When User have to scrolldwon the simulation result Displacement graph
Then User have to enter the simulation result Displacement graph URL

Scenario: Check the Energy Balance graph option
Given User have to click the Energy Balance graph in simulation result
When User have to scrolldwon the simulation result Energy Balance graph
Then User have to enter the simulation result Energy Balance graph URL

Scenario: Check the Energy Absorbed graph option
Given User have to click the Energy Absorbed graph in simulation result
When User have to scrolldwon the simulation result Energy Absorbed graph
Then User have to enter the simulation result Energy Absorbed graph URL

Scenario: Check the Energy Stored graph option
Given User have to click the Energy Stored graph in simulation result
When User have to scrolldwon the simulation result Energy Stored graph
Then User have to enter the simulation result Energy Stored graph URL

Scenario: Check the Maximum Force graph option
Given User have to click the Maximum Force graph in simulation result
When User have to scrolldwon the simulation result Maximum Force graph
Then User have to enter the simulation result Maximum Force graph URL


