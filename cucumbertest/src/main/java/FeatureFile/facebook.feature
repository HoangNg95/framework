Feature: Facebook Signin

  Background:
  Given I want to navigate to facebook
  
  Scenario Outline: Giving valid email and password
   
    And I need to give un "<emailtxt>"
    And I need to give password "<password>"
    Then I need to click on signin button
		
		Examples:
		 |emailtxt|password|
    |abc@yahoo.com|aaaaaa|
    |def@yahoo.com|bbbbbb|
     |hello@yahoo.com|ccccc|
 
