@Feature2
Feature: To validate the login functionality of github application



@SanityTest
Scenario: To validate login with valid username and invalid password
Given To launch the chrome browser and maximize the window
When To launch the url of the facebook application
And To pass valid username in email field
But To pass invalid password in password field
And To click the login button
And To check whether navigate to homepage or not
Then To Close the browser


