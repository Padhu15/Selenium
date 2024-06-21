Feature: To validate registration functionality

@smoke @wip0606
Scenario: To validate registration using  valid details 

Given User Launches the "chrome" browser
And User launch app using url "https://adactinhotelapp.com/"
When user clicks on link using xpath "//a[text()='New User Register Here']"
And user enters text "ravi0606"	in textbox using xpath "//input[@name='username']"
And user enters text "ravi123"	in textbox using xpath "//input[@name='password']"
And user enters text "ravi123"	in textbox using xpath "//input[@name='re_password']"
And user enters text "ravi kumar s"	in textbox using xpath "//input[@name='full_name']"
And user enters text "ravikumar.s@gmail.com"	in textbox using xpath "//input[@name='email_add']"
And user enters text "exitlity"	in textbox using xpath "//input[@name='captcha']"