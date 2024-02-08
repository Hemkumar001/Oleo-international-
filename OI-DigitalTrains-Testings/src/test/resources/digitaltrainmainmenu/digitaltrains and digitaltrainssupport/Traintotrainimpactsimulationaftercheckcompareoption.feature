@sanity @Regression
Feature: Check the simulation compare simulation option

Scenario: Check the functionality of compare simulations
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the project button in main menu
And User have to click the DVRS two project mouseover the simulation
And User have to click the train one and train two simulation action button
And User have to click the the simulation compare option
When User have to first select the project and select the library option
And User have to click compare selected button
And User have to scroll down the graph view
And User have to click the graph option and select the force time and scroll down
And User have to click the graph option and select the velocity time and scroll down
And User have to click the graph option and select the acceleration time and scroll down
And User have to click the graph option and select the displacement time and scroll down
And User have to click the graph overview option
Then User have to close the tab


