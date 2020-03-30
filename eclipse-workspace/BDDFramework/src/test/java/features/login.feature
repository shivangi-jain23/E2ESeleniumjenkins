 @test
 Feature: facebook login functionality
 Scenario: Login facebook with valid user
 Given User is on login page
 When Enter valid user name
 And Enter valid password
 And click on submit button
 Then User should be able to login successfully
  
  Scenario: Login facebook with invalid user
 Given User is on login page
 When Enter invalid user name
 And Enter invalid password
 And click on submit button
 Then User should not be able to login successfully