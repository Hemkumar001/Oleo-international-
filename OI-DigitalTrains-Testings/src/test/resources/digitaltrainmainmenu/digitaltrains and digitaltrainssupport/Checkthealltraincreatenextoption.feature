@Regression
Feature: Check the create train next options working or not

Scenario: User have to check the mainline create train next options
Given User have to launch browser and testurl
And User have to enter username and password,click submit button
When User have to click train option enter in train url
And User have to click createtrain button
And User have to click mainline train and click next
Then User have to check the now the page is show the review the interfaces

Scenario: User have tio check the high speed create train next option
Given User have to click train option enter in train url
And User have to click createtrain button
When User have to click the high speed train and click next
Then User have to check the now the page is show the review the interfaces

Scenario: User have tio check the freight train create train next option
Given User have to click train option enter in train url
And User have to click createtrain button
When User have to click the freight train and click next
Then User have to check the now the page is show the review the interfaces

Scenario: User have tio check the metro create train next option
Given User have to click train option enter in train url
And User have to click createtrain button
When User have to click the metro train and click next
Then User have to check the now the page is show the review the interfaces

Scenario: User have tio check the light train create train next option
Given User have to click train option enter in train url
And User have to click createtrain button
When User have to click the light train and click next
And User have to check the now the page is show the review the interfaces
Then User have to close the tab