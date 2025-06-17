Feature: This file holds the search functionality.

Scenario: To validate Google Search
Given User launch app URL "https://www.google.co.in/"
When the User enters data in search box "Sachin"
And hit Enter
Then the valid search result should display