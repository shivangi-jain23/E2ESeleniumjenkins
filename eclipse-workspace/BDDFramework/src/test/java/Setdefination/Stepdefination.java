package Setdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import Automation_assersion.Compare;
import Newpackageforbaseclass.Createdriverinstance;
import cucumber.api.java.en.*;
import packageforPageclass.loginpage;

public class Stepdefination{
	
		
		WebDriver driver;
		loginpage login;
		
		@Given("^User is on login page$")
		public void user_is_on_login_page() throws Throwable{
			
			Createdriverinstance testdriver= new Createdriverinstance();
			driver= testdriver.createbrowser();
			
		}
			
		@When("^Enter valid user name$")
		public void enter_valid_user_name() throws Throwable {
			login = new loginpage(driver);
			login.LoginUserID("shivangi");
					
		}

		@When("^Enter valid password$")
		public void enter_valid_password() throws Throwable {
		   login.Loginpassword("passowrd"); 
		}

		@When("^click on submit button$")
		public void click_on_submit_button() throws Throwable {
		 login.Submitbutton();   
		}

		@Then("^User should be able to login successfully$")
		public void user_should_be_able_to_login_successfully() throws Throwable {
			Compare assersion = new Compare();
			Assert.assertTrue(assersion.validateURL(driver, "https://www.facebook.com/"));
		}
	
		@When("^Enter invalid user name$")
		public void enter_invalid_user_name() throws Throwable {
			login = new loginpage(driver);
			login.LoginUserID("test");
				
		}

		@When("^Enter invalid password$")
		public void enter_invalid_password() throws Throwable {
			login.Loginpassword("test"); 
		}

		@Then("^User should not be able to login successfully$")
		public void user_should_not_be_able_to_login_successfully() throws Throwable {
			Compare assersion = new Compare();
			Assert.assertTrue(assersion.validateelementbyxpath(driver, "test"));
		}

	}


