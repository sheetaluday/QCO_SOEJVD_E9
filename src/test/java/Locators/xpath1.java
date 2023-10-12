package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://en-gb.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Argos");		
        driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

}
