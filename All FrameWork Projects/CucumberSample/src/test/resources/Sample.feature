@Feature1
Feature: To validate the login functionality of facebook application

Background:  
Given To launch the chrome browser and maximize the window


@Sanity
Scenario: To validate login with valid username and invalid password
When To launch the url of the facebook application
And To pass valid username in email field
But To pass invalid password in password field
And To click the login button
And To check whether navigate to homepage or not
Then To Close the browser

@Regresion
Scenario Outline: To Validate the positive and negative combination of login functionality
When User has to hit the facebook url
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click the login button
Then User has to close the browser

Examples:
|emaildatas           |passworddatas|
|poorni12aab@gmail.com|12334352543  |
|12abpoori@gmail.com  |984338519    |
|abc@gmail.com        |poorni12     |
|nanthini@gmai.com    |984333       |





