@PositiveTests 
Feature: Test mail (positive)
Scenario: Open page 
	Given I am on a page 
	Then I see the enter button 
	And  I exit 
	
		
		
Scenario: Enter to account (correct) 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	And  I exit 
	 
		
Scenario: Exit to account 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I click at exit 
	Then I see the enter button 
	And  I exit 

		
Scenario: Send message 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I send message 
	Then I see message sent 
	And  I exit 
	
		
		
Scenario: letter in spam 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I sent letter in Spam 
	Then I see that send/delete successully 
	And  I exit 
	
Scenario: letter from spam 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I sent letter from Spam 
	Then I see that send/delete successully 
	And  I exit 
	
		
Scenario: Delete letter 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I delete letter 
	Then I see that send/delete successully 
	And  I exit 
	
Scenario: Open new letter 
	Given I am on a page 
	Then I see the enter button 
	When I input login and password 
	Then I enter to account 
	When I check new letter 
	Then I see that head's letter 
	And  I exit 
							
		
		
		
		
		
		
		
		
		
		
		
		