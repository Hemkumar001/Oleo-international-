@Regression
Feature: User have to check the functionality of the three D model adding option

Scenario: User have to add the three d model in the vehicle setting
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the vehicle button
When User have to mouseover the my vehicle option
And User have to click the action button in the my vehicle and click edit option
And User have to click the vehicle setup option
And User have to click the vehicle three D model option
And User have to select the three D model and save the vehicle
Then User have to close the tab

Scenario: User have to remove the three d model in the vehicle setting
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
And User have to click the vehicle button
When User have to mouseover the my vehicle option
And User have to click the action button in the my vehicle and click edit option
And User have to click the vehicle setup option
And User have to deselect the three D model and save the vehicle
Then User have to close the tab
#
#Scenario: User have to check the routeprofile three model adding option
#Given User have to launch browser and testurl
#And User have to enter username and password,click submit button
#And User have to click the route profile option
#And  User have to enter the route profile url
#When User have to mouseover the tunneladded reverse cure route profile and click the action
#And User have to click the tunneladded reverse cure route profile edit button
#And User have to click the three D model route profile option
#And User have to select the three D model in the route profile and save
#Then User have to close the tab
#
#Scenario: User have to check the routeprofile deselect the three D model in the routeprofile
#Given User have to launch browser and testurl
#And User have to enter username and password,click submit button
#And User have to click the route profile option
#And  User have to enter the route profile url
#When User have to mouseover the tunneladded reverse cure route profile and click the action
#And User have to click the tunneladded reverse cure route profile edit button
#And User have to click the three D model route profile option
#And User have to deselect the three D model in the route profile and save
#Then User have to close the tab
#
#
