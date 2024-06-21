Feature: To validate registration functionality

@smoke @wip0606
Scenario: To validate registration using  valid details 

Given User Launches the "chrome" browser
And User launch app using url "https://adactinhotelapp.com/"
When user clicks on link using xpath "//a[text()='New User Register Here']"
And user enters text below details in the form

|Username |Password | Confirm Password| Fullname | Email Id | Captcha |
| Padmaja15 | Padhu123 | Padhu123 | PadmajaS | sanigantipadmaja@gmail.com | SPAV |
