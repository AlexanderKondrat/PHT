Feature: Test mail 
Scenario Outline: Open page 
	Given I am on a page 
	Then I see the enter button 
	And  I exit 
	Examples: 
		|| 
		|| 
		
		
Scenario Outline: Enter to account (correct) 
	Given I am on a page  
	Then I see the enter button 
	When I input login and password
	Then I enter to account 
	And  I exit 
	Examples: 
		|  |
		|  |
		
Scenario Outline: Exit to account 
	Given I am on a page
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I click at exit 
	Then I see the enter button 
	And  I exit 
	Examples: 
		|  | 
		|  | 	