Feature: Contact Us Page 
  As an end user
  I want a contact us page
  So that I can find out more about QAWorks exciting services!!

Scenario: Valid Submission 
	Given I am on the QAWorks Site 
	When  I navigate to contact page 
	And   I enter the following information 
	    | Fields  | Elements                                  |
		| name    | j.Bloggs                                  |
		| email   | j.Bloggs@qaworks.com                      |
		| subject | test automation                           |
		| message | please contact me I want to find out more |
	Then  I should be able to contact QAWorks
	
Scenario: Invalid Submission (Requires Validating Fields)
	Given I am on the QAWorks Site
	When  I navigate to contact page
	And   I enter the following information 
	    | Fields  | Elements                                  |
		| name    | j.Bloggs1234                              |
		| email   | j@Bloggs.qaworks.com                      |
		| subject | test automation                           |
		| message | please contact me I want to find out more |
	Then  I should not be able to contact QAWorks
	
Scenario: Contact page unavailable (Internet cut off / Site load)
	Given I am on the QAWorks Site
	When  I am trying to navigate to contact page
	Then  Contact us page not available
	
Scenario: Input information format hints (non fiunctional requirement)
	Given I am on the QAWorks Site
	When  I navigate to contact page
	And   I try to guess what format inputs would take
	Then  It may take a significant time for me to fill in the form

Scenario: QAWorks Site unavailable
	Given I am trying to locate QAWorks Site
	When  I type the QAWorks Site URL
	Then  QAWorks Site unavailable