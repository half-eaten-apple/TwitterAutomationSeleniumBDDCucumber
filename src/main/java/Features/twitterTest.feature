Feature: QA automation solution for below requirements

Scenario: QA automation solution for Twitter Automation using BDD and Selenium

Given user opens twitter Login Page
When user enters username and password and clicks on login button
| username			| password   |  accname  |
| cpdas5425@gmail.com | Teradata@1234 | das_chandika |
When Navigate profile page of logged user and upload a profile picture
Then user Update BIO field in profile section as Selenium Automation user
When user Update Location field in profile section as Houston, Texas
When user Update Website field in profile section as twitter.com
Then user Fetch BIO field ,location and website and check if the submit values got updated on the profile page
| UserBio  |  UserLoc |  UserWebsite |
| Selenium Automation user |  Houston, Texas | twitter.com |
Then user Opens the twitter page of The Times of India and retrieve the tweets that were published in last 2 hrs
Then Close the browser