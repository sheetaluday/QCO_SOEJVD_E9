package POM;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
//declaration
	//address of email text field
	@FindBy(id="email")
	private WebElement emailTF;
	//address of password text field
	@FindBy(name="pass")
	private WebElement passwordTF;
	//address of login button field
	@FindBy(xpath="//button[@name='login']")
		private WebElement loginBtn;
	
	//initialization
	
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	//Getter methods
	
	

	public WebElement getEmailTF() {
		return emailTF;
	}

	
	

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void emailTextfield(String data)
	{
		emailTF.sendKeys(data);
	}
	public void passwordTextfield(String data)
	{
		passwordTF.sendKeys(data);
	}
	public void loginButton()
	{
		loginBtn.click();
	}
}


	
	

		
		
