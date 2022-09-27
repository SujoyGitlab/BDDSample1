Feature: Google Page2 Search Function

Scenario: Cypress Search
Given User is on google home page
When User search Cypress Tutorial
Then Should display Cypress result page
#And Should have Java tutorial pdf
#But Should not have Selenium Java pdf