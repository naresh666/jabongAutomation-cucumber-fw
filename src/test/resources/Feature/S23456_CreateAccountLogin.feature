Feature: Verify login account Functionality

Scenario Outline: verify user login scenario
	Given user launch browser
	When user enter url
	And user click on signin link 
	And user enter email address as "<emailAddress>"
	And user enter password as "<password>"
	And user click on signin button
	Then user should see account name as "<userName>"
	Examples:
	|emailAddress        |password     |userName   |
	|nareshan23@gmail.com|nani6652	   |HEY, NARESH|

Scenario Outline: verify user redirec jabong.com page to myntra.com page
	Given user launch browser
	When user enter url
	And user click on myntra link and user redirect to myntra home page
	Then user should see myntra website title as "<expectedTitle>"
	Examples:
	|expectedTitle|
	|Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra|
	
Scenario Outline: verify jeans page in myntra website
	Given user launch browser
	When user enter url
	And user click on myntra link and user redirect to myntra home page
	And mouse over on men
	And click on jeans
	Then user should see Jeans for men page "<expectedLabel>"
	Examples:
	|expectedLabel|
	|Jeans For Men|