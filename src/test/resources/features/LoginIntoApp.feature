Feature: Login Function

#Scenario: Valid Login
#Given User is login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display home page

#Scenario: Invalid Login
#Given User is login page
#When User enters "tomsmith" and "SuperSecret"
#Then Should display error page

#Scenario Outline: Valid Login
#Given User is test login page
#When User enters "<username>" and "<password>"
#Then Should display success message
#
#Examples:
#	| username | password |
#	| tomsmith | SuperSecretPassword! |
#	| tomsmith | SuperSecret |

Scenario Outline: Valid Login
Given User is test login page
When User enters login credentails
	|	username | password	|
	| tomsmith | SuperSecretPassword! |
Then Should display success message

