package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css_selector {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.facebook.com/");
		//address of email text field
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("wedff");         // Cascading style sheet - css
	}

}
