Feature: the

  Scenario Outline: To validate the login functionality with invalid credentails
    Given The user launch the application URL "<URL>"
    When The User enter email "<Username>" and password "<Password>"
    When The User submit the login credentials
     Examples: 
      | URL                                  | Username                | Password  |
      | https://automationexercise.com/login | arunprasadcbe2001@gmail.com |ArunSpooky|