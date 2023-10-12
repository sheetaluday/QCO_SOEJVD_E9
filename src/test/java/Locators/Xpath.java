package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.facebook.com/");
		
		//address of email text field using x path method
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sheetal");
		//address of  password text field using x path contains attributes
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("fsggs");
		//address of forgotten password  using x path text
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
				//address of forgotten password  using x path text
			//WebElement wb=driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]"));
			//Thread.sleep(2000);
			//wb.click();
					
				

	}

}
