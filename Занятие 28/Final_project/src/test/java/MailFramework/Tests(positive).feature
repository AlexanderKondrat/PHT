Feature: Test mail 
Scenario Outline: Open page 
	Given I am on a page "<URL>" 
	Then I see the enter button 
	And  I exit 
	Examples: 
		| URL                 | 
		| https://www.mail.ru | 
		
		
Scenario Outline: Enter to account (correct) 
	Given I am on a page "<URL>" 
	Then I see the enter button 
	When I input login and password "<Login>" "<Password>" 
	Then I enter to account 
	And  I exit 
	Examples: 
		| URL                 |    Login        |       Password      |
		| https://www.mail.ru | sasha1911@bk.ru |  |
		
Scenario Outline: Exit to account 
	Given I am on a page "<URL>" 
	Then I see the enter button 
	When I input login and password "<Login>" "<Password>" 
	Then I enter to account 
	When I click at exit 
	Then I see the enter button 
	And  I exit 
	Examples: 
		| URL                 |    Login        |       Password      |
		| https://www.mail.ru | sasha1911@bk.ru |  |	
		
Scenario Outline: Send message 
	Given I am on a page "<URL>" 
	Then I see the enter button 
	When I input login and password "<Login>" "<Password>" 
	Then I enter to account 
	When I send message "<Recepiete>" "<Topic>" "<Text>" 
	Then I see message sent 
	And  I exit 
	Examples: 
		| URL                 |    Login        |       Password      |   Recepiete      | Topic  |   Text    |
		| https://www.mail.ru | sasha1911@bk.ru |  | _sasha1911@bk.ru | TEST  | Test Test|
		
		
Scenario Outline: letter in spam 
	Given I am on a page "<URL>" 
	Then I see the enter button 
	When I input login and password "<Login>" "<Password>" 
	Then I enter to account 
	When I sent letter in Spam 
	Then I see that send/delete successully 
	And  I exit 
	Examples: 
		| URL                 |    Login        |       Password      |
		| https://www.mail.ru | sasha1911@bk.ru |  |			
		
Scenario Outline: letter from spam 
	Given I am on a page "<URL>" 
	Then I see the enter button 
	When I input login and password "<Login>" "<Password>" 
	Then I enter to account 
	When I sent letter from Spam 
	Then I see that send/delete successully 
	And  I exit 
	Examples: 
		| URL                 |    Login        |       Password      |
		| https://www.mail.ru | sasha1911@bk.ru |  |
		
Scenario Outline: Delete letter
	Given I am on a page "<URL>" 
	Then I see the enter button 
	When I input login and password "<Login>" "<Password>" 
	Then I enter to account 
	When I delete letter
	Then I see that send/delete successully 
	And  I exit 
	Examples: 
		| URL                 |    Login        |       Password      |
		| https://www.mail.ru | sasha1911@bk.ru |  |						
		
		
		
		
		
		
		
		
		
		
		
		