Feature: To validate login functionality in web
Scenario: To validate login using valid credentials

Given User Launches the "chrome" browser
And User launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz0806" in textbox using xpath "//input[@name='username']"
And user enters text 'reyaz123"' in textbox using xpath "//input[@name='password']"
And user clocks on login button using xpath "//input[@name='login']"
Then user validates title to be "Adactin.com - Search Hotel"

