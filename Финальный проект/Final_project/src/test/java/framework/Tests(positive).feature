@PositiveTests 
Feature: Test mail 
Scenario Outline: Open page 
	Given I am on a page 
	Then I see the enter button 
	And  I exit 
	Examples: 
		|  | 
		|  | 
		
		
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
		
Scenario Outline: Send message 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I send message 
	Then I see message sent 
	And  I exit 
	Examples: 
		|  | 
		|  | 
		
		
Scenario Outline: letter in spam 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I sent letter in Spam 
	Then I see that send/delete successully 
	And  I exit 
	Examples: 
		|  | 
		|  |			
		
Scenario Outline: letter from spam 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I sent letter from Spam 
	Then I see that send/delete successully 
	And  I exit 
	Examples: 
		|  | 
		|  |
		
Scenario Outline: Delete letter 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I delete letter 
	Then I see that send/delete successully 
	And  I exit 
	Examples: 
		| | 
		| |			
		
Scenario Outline: Open new letter 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I check new letter 
	Then I see that head's letter 
	And  I exit 
	Examples: 
		| | 
		| |							
		
		
		
		
		
		
		
		
		
		
		
		