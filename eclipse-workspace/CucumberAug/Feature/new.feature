Feature: Hello OrangeHRM
  Scenario Outline: Login into OrnageHRM
    Given I want to Login with valid credential
    When User enter "<Username>", "<Password>"
    Then I verify the login Successfully

    Examples: 
      | Username | Password 		|
      | Admin 	 | admin123 		|
      | Admin 	 | admin123 		|
