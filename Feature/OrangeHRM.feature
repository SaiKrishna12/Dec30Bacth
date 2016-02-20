Feature: Login and logout functionality of OrangeHRM

Scenario: Verify login functionality

	Given the browser is launched and we open the url
	When we enter the username and password
	And we click on the login button
	Then it should diplay the welcome admin msg
	
Scenario: Verfiy logout functionality
	When we click on welcome admin
	And click on Logout
	Then home page shoould be diplayed