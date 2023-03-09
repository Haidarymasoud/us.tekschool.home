
Feature: Register New Account In TekSchool Retail Webpage

@RegisterNA

  Scenario: Select register 
  	Given i click on my account  
    And i want to click on register button
    And write my first name <name>
    And write my last name <Lastname>
    And write my email address <email>
    And write my telephone number <phone>
    And enter my password <pass>
    Then re-enter my passwor <repass>
    Then click check box
    Then click on continue button 
    
    	Examples: 
    	    |	name | Lastname | email | phone | pass | repass|
    	    |Masoud| Haidary  |ma447gg@gmail.com | 4445587789 | kkkkk5544 | kkkkk5544| 
 @LoginNA
	Scenario: login to the account
	
	Given i click on my account  
	Given i click on login button
	Then enter email address
	Then enter my password
	And click on login icon