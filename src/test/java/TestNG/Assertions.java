package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	WebDriver driver;
 @Test
 public void fb()
 {
	  WebDriverManager.edgedriver().setup();
       driver=new EdgeDriver();
      
      driver.manage().window().maximize();
		
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  driver.get("https://facebook.com/");
	  String title=driver.getTitle();
	  //Hard Assert
	 // Assert.assertEquals(title,"sfsddfs"); //false
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(title,"gdfdf"); //false
	  System.out.println(driver.getCurrentUrl()); // soft assert even if the title is wrong still next line will execute and url facebook will be seen in console
 }
   @Test
     public void quiting()
    {
	 driver.quit();
    }
}
