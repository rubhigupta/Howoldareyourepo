Feature: How old are you? 

Background: Inovke Browser and Enter the URL
Given User should open the browser and enter the url "https://howoldru.m-messiah.cc/"
@TC_01
Scenario: Submit your Name and Birthday  
Given User should enter Your Name "Rubhi" and Your Birthday "001994-05-04"
When User click on Submit btn
Then User should see your Name and Age appears on the Screen

@TC_02
Scenario:  Submit Your Name and incorrect Birthday
Given User should enter Your Name "Rubhi" and Your Birthday "1994-05-04"
When User click on Submit btn
Then Birthday Error message should display

@TC_03
Scenario:  Submit blank Name and blank Birthday
Given User should enter Your Name "" and Your Birthday ""
When User click on Submit btn
Then Name and Birthday Error message should display

@TC_04
Scenario:  Submit blank Name and  Birthday
Given User should enter Your Name "" and Your Birthday "001994-05-04"
When User click on Submit btn
Then Name Error message should display