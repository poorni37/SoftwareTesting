Feature: To validate the account creation of facebook application

Scenario: To Create a new account

Given To launch the browser and maximize the window
When To launch url of the fb application
And To click the create new account button
And To pass firstname in firstname text box
|poorni|java|sele|framwwork|
#One dimensional map data
And To pass secondname in secondname text box
#Key             value
|firstname1|poorni|
|firstname2|janani|
|firstname3|Nandhu|
And To pass mobilenoor email in email text box
|poorni12ab@gmail.com|9358375827|12abpoorni@gmail.com|
|099845988|989455|1u27837493|
|nandhu@gmail.com|23425|pooorni12343|

#Two
And To create new password using new password text box

|pass1|pass2|pass3|
|28783|iiu382|u2y83|
|2647hu|hdu2h|d2hu3|
|hdg2u|jjwdu2|jwdu|
Then To close the chrome browser
