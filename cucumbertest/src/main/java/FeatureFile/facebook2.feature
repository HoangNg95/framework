Feature: Facebook Signin

  Background:
  Given I want to navigate to facebook
  
 

  Scenario: reset password
    And reset the password
    Then I need to put my mobile number "<mobile>"
		Examples:
		 |mobile|
    |6091111111|
    |6092222222|
    |60933333333|
 