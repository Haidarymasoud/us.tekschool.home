package pageObjectPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BasePractice;

public class RegisterNAPageObject extends BasePractice{
	
	public RegisterNAPageObject () {
		PageFactory.initElements(driver, this);
	}
		@FindBy (xpath = "//a[@title='My Account']")
		private WebElement MyAccount;
		public void MyAccount () {
			MyAccount.click();
		}
		@FindBy (linkText = "Register")
		private WebElement Register;
		public void Register () {
			Register.click();
		}
		
		@FindBy (name = "firstname")
		private WebElement FirstName;
		public void FirstName (String name) {
			FirstName.sendKeys(name);
			return;
		}
		
		@FindBy (xpath = "//input[@name='lastname']")
		private WebElement LastName;
		public void LastName (String Lastname) {
			LastName.sendKeys(Lastname);
		}
		
		@FindBy (name = "email")
		private WebElement Email;
		public void Email (String email) {
			Email.sendKeys(email);
		}
		
		@FindBy (xpath = "//div//input[@name='telephone']")
		private WebElement Telephone;
		public void Telephone () {
			Telephone.sendKeys("4445587789");
		}
		
		@FindBy (xpath = "//input[@name='password']")
		private WebElement Password;
		public void Password (String pass) {
			Password.sendKeys(pass);
		}
		
		@FindBy (xpath = "//input[@name='confirm']")
		private WebElement Confirm;
		public void Confirm (String repass) {
			Confirm.sendKeys(repass);
		}
		@FindBy (xpath = "//input[@name='agree']")
		private WebElement ClickCheck;
		public void ClickCheck () {
			ClickCheck.click();
		}
		@FindBy (xpath = "//input[@type='submit']")
		private WebElement Submit;
		public void Submit() {
			Submit.submit();
		}
		@FindBy (linkText = "Login")
		private WebElement ClickLogin;
		public void ClickLogin () {
			ClickLogin.click();
		}
		@FindBy (xpath = "//input[@name='email']")
		private WebElement EnterEmail;
		public void EnterEmail (String email) {
			EnterEmail.sendKeys(email);
		}
		@FindBy (xpath = "//input[@name='password']")
		private WebElement EnterPassword;
		public void EnterPassword (String password) {
			EnterPassword.sendKeys(password);
		}
		@FindBy (xpath = "//input[@type='submit']")
		private WebElement LoginButton;
		public void LoginButton () {
			LoginButton.click();
		}
		

}
