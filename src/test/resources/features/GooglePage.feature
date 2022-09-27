Feature: Google Page Search Function

Scenario: Java Search
Given User is on google home page
When User search Java Tutorial
Then Should display Java result page
#And Should have Java tutorial pdf
#But Should not have Selenium Java pdf

Scenario: Selenium Search
Given User is on google home page
When User search Selenium Tutorial
Then Should display Selenium result page