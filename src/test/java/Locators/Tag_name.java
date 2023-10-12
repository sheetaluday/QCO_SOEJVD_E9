package Locators; // fetch all the links in a web page - interview question

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tag_name {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.facebook.com/"); 
		driver.findElement(By.id("email")).sendKeys("Sheetal");
		//address of password text field
		driver.findElement(By.name("pass")).sendKeys("Sheetal");
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        for (WebElement b:allLinks)
        {
        	System.out.println(b.getText());
        }
        
	}

}
