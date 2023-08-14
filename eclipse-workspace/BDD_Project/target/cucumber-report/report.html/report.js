$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/NewDetails.feature");
formatter.feature({
  "line": 1,
  "name": "How old are you?",
  "description": "",
  "id": "how-old-are-you?",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Inovke Browser and Enter the URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open the browser and enter the url \"https://howoldru.m-messiah.cc/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://howoldru.m-messiah.cc/",
      "offset": 48
    }
  ],
  "location": "HomePage.user_should_open_the_browser_and_enter_the_url(String)"
});
formatter.result({
  "duration": 5802410500,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Submit blank Name and  Birthday",
  "description": "",
  "id": "how-old-are-you?;submit-blank-name-and--birthday",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@TC_04"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User should enter Your Name \"\" and Your Birthday \"001994-05-04\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User click on Submit btn",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Name Error message should display",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    },
    {
      "val": "001994-05-04",
      "offset": 50
    }
  ],
  "location": "HomePage.user_should_enter_Your_Name_and_Your_Birthday(String,String)"
});
formatter.result({
  "duration": 367912800,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.user_click_on_Submit_btn()"
});
formatter.result({
  "duration": 910148200,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.name_Error_message_should_display()"
});
formatter.result({
  "duration": 127205500,
  "status": "passed"
});
});