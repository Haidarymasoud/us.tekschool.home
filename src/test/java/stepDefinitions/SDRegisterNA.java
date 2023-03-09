package stepDefinitions;

import org.apache.velocity.runtime.log.Log;
import org.openqa.selenium.support.PageFactory;

import core.BasePractice;
import io.cucumber.java.en.*;
import pageObjectPractice.RegisterNAPageObject;
import utilities.Utils;

public class SDRegisterNA extends BasePractice{
		
	RegisterNAPageObject RNA = new RegisterNAPageObject ();
		
		@Given ("i click on my account")
		public void i_click_on_my_account () {
		RNA.MyAccount();
		logger.info("Clicked Successfully");
		}
		
		@And("i want to click on register button")
		public void i_want_to_click_on_register_button() {
		    RNA.Register();
		    logger.info("Sucessfully Clicked On Register Button");
		}

		@And("write my first name Masoud")
		public void write_my_first_name_masoud() {
		    RNA.FirstName("masoud");
		    logger.info("Entered Name Successfully");
		}

		@And("write my last name Haidary")
		public void write_my_last_name_haidary() {
		    RNA.LastName("haidary");
		}

		@And("write my email address ma447gg@gmail.com")
		public void write_my_email_address_magmail_com() {
		    RNA.Email("ma447gg@gmail.com");
		    logger.info("Email entered successfully");
		}

		@And("write my telephone number 4445587789")
		public void write_my_telephone_number() {
		    RNA.Telephone();
		    logger.info("Telephone number entered successfully");
		    }

		@And("enter my password kkkkk5544")
		public void enter_my_password_kkkkk5544() {
		    RNA.Password("kkkkk5544");
		    logger.info("Password entered successfully");
		}

		@Then("re-enter my passwor kkkkk5544")
		public void re_enter_my_passwor_kkkkk5544() {
		    RNA.Confirm("kkkkk5544");
		    logger.info("Re-enter password done successfully");
		}
		@Then("click check box")
		public void click_check_box() {
		    RNA.ClickCheck();
		}
		@Then("click on continue button")
		public void click_on_continue_button() {
			RNA.Submit();
			Utils.takeScreenshotForStep();
		}
		@Given("i click on login button")
		public void i_click_on_login_button() {
		    RNA.ClickLogin();
		    logger.info("Clicked the button sucessfully");
		}

		@Then("enter email address")
		public void enter_email_address() {
		    RNA.EnterEmail("ma447gg@gmail.com");
		    logger.info("Email entered successfully");
		}

		@Then("enter my password")
		public void enter_my_password() {
		    RNA.EnterPassword("kkkkk5544");
		}

		@Then("click on login icon")
		public void click_on_login_icon() {
		    RNA.ClickLogin();
		    Utils.takeScreenshotForStep();
		}

		
		
		
		
		
	}
	
	


