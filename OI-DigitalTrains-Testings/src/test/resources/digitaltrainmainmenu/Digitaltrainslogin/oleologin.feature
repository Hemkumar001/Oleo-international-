Feature: To validate Login Functionality of Digital trains Application

@smoke @sanity @Regression
Scenario Outline:
 To Validating Login by Using different Credantials

Given User have to enter digital trains login chrome browser
When User have to enter "<username>" and "<password>"
And User have to click login button
Then User have to reach Invalid credentials page 


Examples:
|username                       |password   |
|hemkumard@digitaltrains.online |Password!12|
|hemkuamrd@oleo.co.in           |hem@123    |
|hemkumardd@oleo.co.in          |Password!12|
|hemkumardd@oleo.co.in          |hem@123    |
|                               |Password!12|
|hemkumard@oleo.co.in           |           |
|                               |           |

