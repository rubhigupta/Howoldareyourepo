Feature: Launch Amazon and Launch Successfully

  Background: Hi I m background i m running before every scenario

  Scenario: Search Product on Amazon Page
    Given I have to launch Amazon page successfully "https://www.amazon.in/"
    When User Search an Product "Iphone 13"
    Then Product should be successfully display
	  