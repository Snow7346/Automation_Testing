Feature: Validate the google title

@Title
Scenario: To validate google title
Given The User Launch the Googel URL
When The User gets Page Title
Then The User validate Page Title
@Gmail
Scenario: To validate Gmail Link
Given The User Launch the Google URL
When The User click on Gmail Link
Then The Gmail Page should be opened