Feature: This feature file holds the scenario of Automation_Exercise
@Smoke
Scenario: To validate login functionality with valid credentials
Given The user launch app URL "https://www.automationexercise.com/login"
When The user enters email "arunprasadcbe2001@gmail.com" and password "ArunSpooky"
When The user submits login credentials
Then The user validates logged in Successfully
@Sanity
Scenario: To validate login functionality with invalid credentials
Given The user launch app URL "https://www.automationexercise.com/login"
When The user enters email "arunprasadcbe21@gmail.com" and password "ArunSpooky"
When The user submits login credentials
Then The user validate logged in successfully
@Regression
Scenario Outline: To validate the login functionality with invalid credentails
Given The user launch the application URL "<URL>"
When The User enter email "<Username>" and password "<Password>"
When The User submit the login credentials
Then The User validate log in successfully
    
 Examples: 
      | URL                                  | Username                | Password  |
      | https://automationexercise.com/login | nitingupta300@gmail.com | Smart@123 |