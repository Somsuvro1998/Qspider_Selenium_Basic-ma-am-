package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	//delaration
	//address of email text field
	@FindBy(id="email")
	private WebElement emailTf;
	//address of password text field
	@FindBy(name="pass")
	private WebElement passwordTf;
	//address of login button
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	//initialization
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	//getter methods

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//Businesss libraries
	public void emailTextfield(String data) {
		emailTf.sendKeys(data);
	}
	public void passwordtextfield(String data) {
		passwordTf.sendKeys(data);
	}
	public void loginButton() {
		loginBtn.click();
	}
	
	

	
	
	
	
	
	
	
	

}
