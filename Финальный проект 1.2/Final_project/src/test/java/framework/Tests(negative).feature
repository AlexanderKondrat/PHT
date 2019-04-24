@NegativeTests 
Feature: Test mail (negative)

Scenario: Enter to account (not correct) 
	Given I am on a page 
	Then I see the enter button 
	When I input not correct login and password 
	Then I see a error 
	And  I exit
		
Scenario: Send message 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I send not correct message
	Then I see message doesn't sent 
	And  I exit

		
		
		
		
		
		
		
		
		
		
		