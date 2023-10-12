package TestNG_Failing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
 @Test
 public void Fb()
 {
	 WebDriverManager.edgedriver().setup();
		// opens the empty browser
	  WebDriver driver = new EdgeDriver(); 
		// for maximizing 
		driver.manage().window().maximize();
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vffd");
 }
}
