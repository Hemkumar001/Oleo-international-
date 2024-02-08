#@Regression
#Feature: Check the functionality of invoice mail details
#
#Scenario: Check the functionality of basic invoice mail details present or not
#Given User have to launch browser and MailHog url
#And User have to click the first mail 
#And User have to click the payonline button in MailHog
#And User have to switch to the window and enter username and password click the submit button
#And User have to enter the mail check the invoice date 
#And User have to check the due date
#And User have to check the invoice number
#When User have to check the amount due
#And User have to check the card number field
#And User have to check the expiry date field
#And User have to check the CVC field
#And User have to check the country option
#Then User have to chcek the paynow button
#
#Scenario: Check the functionality of card filling time it show card brand visa icon
#Given User have to fill the visa card number details
#When User have to see the visa icon showing the side
#Then User have to clear the card details
#
#Scenario: Check the functionality of card filling time it show card brand master card icon
#Given User have to fill the master card number details
#When User have to see the master card icon showing the side
#Then User have to clear the card details
#
#Scenario: Check the functionality of card filling time it show card brand American express icon
#Given User have to fill the American express number details
#When User have to see the American express icon showing the side
#Then User have to clear the card details
#
#Scenario: Check the functionality of card filling time it show card brand discover icon
#Given User have to fill the discover number details
#When User have to see the discover icon showing the side
#Then User have to clear the card details
#
#Scenario: Check the functionality of card filling time it show card brand dinerscard icon
#Given User have to fill the dinerscard number details
#When User have to see the dinerscard icon showing the side
#Then User have to clear the card details
#
#Scenario: Check the functionality of card filling time it show card brand unionpay icon
#Given User have to fill the unionpay number details
#When User have to see the unionpay icon showing the side
#Then User have to clear the card details