package POM_Practise; // Executed Successfully 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.FacebookLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver(); 
		// for maximizing 
		driver.manage().window().maximize();
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		// to open the browser 
		driver.get("https://www.facebook.com/");
		//Object creation
		FacebookLoginPage fb1=new FacebookLoginPage(driver);
		fb1.emailTextfield("sheetal");
		fb1.passwordTextfield("Parab");
		fb1.loginButton();
		
	}

}
