@Regression
Feature: Check the functionality of simulation transducers option

Scenario: Check the enable the part in the teansducers option
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the project button in main menu
And User have to click the DVRS one and mouseover the running train simulation
And User have to click the simulation under action button and click edit simulation option
When User have to click to enable the simulation dynamic suspension
And User have to click the running simulation transducser button 
And User have to click the running simulation dynamic suspension click desable all part
Then User have to click the running simulation dynamic suspension click enable all part

Scenario: Check the select vehicle option in the transducers
Given User have to click the vehicle one and select the display detailed bogie on threeD animation
And User have to click the vehicle two and select the display detailed bogie on threeD animation
When User have to click the vehicle three and select the display detailed bogie on threeD animation
And User have to click the vehicle four and select the display detailed bogie on threeD animation
And User have to click the save transducer after click to the simulation save button
And User have to click the after transducer run the simulation and click the Simulation result
And User have to click the after transducer threeD button and click run button
Then User have to close the tab
#
#Scenario: Check the select vechicle and disable the dynamic suspension
#Given User have to launch browser and testurl
#And User have to enter username and password,click submit button
#And User have to click the project button in main menu
#And User have to click the DVRS one and mouseover the running train simulation
#And User have to click the simulation under action button and click edit simulation option
#And User have to click the running simulation transducser button 
#When User have to click the vehicle one and select the display detailed bogie on threeD animation
#And User have to click the vehicle two and select the display detailed bogie on threeD animation
#And User have to click the vehicle three and select the display detailed bogie on threeD animation
#And User have to click the vehicle four and select the display detailed bogie on threeD animation
#And User have to click the save transducer after click to the simulation save button
#And User have to click to disable the simulation dynamic suspension
#Then User have to click the save simulation button and close the tab