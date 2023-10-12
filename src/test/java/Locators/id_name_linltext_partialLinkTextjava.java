package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class id_name_linltext_partialLinkTextjava {

	public static void main(String[] args) throws InterruptedException {
		//driver related statement
				WebDriverManager.edgedriver().setup(); // Fire fox driver
				//opens the edge browser
				WebDriver driver=new EdgeDriver();
		          //maximizing statement.
				driver.manage().window().maximize();
				//it opens the application
				driver.get("https://www.facebook.com/"); 
               // address of email text field
				driver.findElement(By.id("email")).sendKeys("Sheetal@gmail.com");
				//address of password text field
				driver.findElement(By.name("pass")).sendKeys("Sheetal");
				//driver.quit();
				//address of login button
				WebElement wb=driver.findElement(By.name("login"));
				Thread.sleep(3000);
				wb.click();
				
	}

}
