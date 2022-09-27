Feature: Handling large string

Scenario: Providing Comments
Given User is on Registration page
When User enters comments
"""
Hello Welcome

Greetings!!

Thanks for the service.

Regards,
TestUser

"""
Then User will be registered