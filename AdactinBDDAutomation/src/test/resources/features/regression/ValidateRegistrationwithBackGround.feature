Feature: To validate registration functionality

@smoke @wip0606


Scenario: To validate login using valid credentials

Given User Launches the "chrome" browser
And User launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz0806" in textbox using xpath "//input[@name='username']"
And user enters text 'reyaz123"' in textbox using xpath "//input[@name='password']"
And user clocks on login button using xpath "//input[@name='login']"
Then user validates title to be "Adactin.com - Search Hotel"

Scenario: To validate login using InValid Username 

Given User Launches the "chrome" browser
And User launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz0807" in textbox using xpath "//input[@name='username']"
And user enters text 'reyaz123"' in textbox using xpath "//input[@name='password']"
And user clocks on login button using xpath "//input[@name='login']"
Then user validates title to be "Adactin.com - Hotel Reservation System"


Scenario: To validate login using Invalid Password

Given User Launches the "chrome" browser
And User launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz0806" in textbox using xpath "//input[@name='username']"
And user enters text 'reyaz12"' in textbox using xpath "//input[@name='password']"
And user clocks on login button using xpath "//input[@name='login']"
Then user validates title to be "Adactin.com - Hotel Reservation System"


Scenario: To validate login using Invalid Username and Password

Given User Launches the "chrome" browser
And User launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz0807" in textbox using xpath "//input[@name='username']"
And user enters text 'reyaz12"' in textbox using xpath "//input[@name='password']"
And user clocks on login button using xpath "//input[@name='login']"
Then user validates title to be "Adactin.com - Hotel Reservation System"

