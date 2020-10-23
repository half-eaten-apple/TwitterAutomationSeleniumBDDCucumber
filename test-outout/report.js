$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/twitterTest.feature");
formatter.feature({
  "line": 1,
  "name": "QA automation solution for below requirements",
  "description": "",
  "id": "qa-automation-solution-for-below-requirements",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3093300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "QA automation solution for Twitter Automation using BDD and Selenium",
  "description": "",
  "id": "qa-automation-solution-for-below-requirements;qa-automation-solution-for-twitter-automation-using-bdd-and-selenium",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens twitter Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password and clicks on login button",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accname"
      ],
      "line": 7
    },
    {
      "cells": [
        "cpdas5425@gmail.com",
        "Teradata@1234",
        "das_chandika"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Navigate profile page of logged user and upload a profile picture",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Update BIO field in profile section as Selenium Automation user",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user Update Location field in profile section as Houston, Texas",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user Update Website field in profile section as twitter.com",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Fetch BIO field ,location and website and check if the submit values got updated on the profile page",
  "rows": [
    {
      "cells": [
        "UserBio",
        "UserLoc",
        "UserWebsite"
      ],
      "line": 14
    },
    {
      "cells": [
        "Selenium Automation user",
        "Houston, Texas",
        "twitter.com"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user Opens the twitter page of The Times of India and retrieve the tweets that were published in last 2 hrs",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefnition.user_opens_twitter_login_page()"
});
formatter.result({
  "duration": 18229643000,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 12110311300,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 15124886400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.user_enters_bio_on_profile_page()"
});
formatter.result({
  "duration": 2541204500,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.user_enters_Location_on_profile_page()"
});
formatter.result({
  "duration": 1478448000,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.user_enters_Website_on_profile_page()"
});
formatter.result({
  "duration": 1943468900,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.fetch_and_veify_user_details(DataTable)"
});
formatter.result({
  "duration": 7091319600,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.user_opens_TOI_Website()"
});
formatter.result({
  "duration": 1828713100,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.close_the_browser()"
});
formatter.result({
  "duration": 7543304900,
  "status": "passed"
});
formatter.after({
  "duration": 299600,
  "status": "passed"
});
});