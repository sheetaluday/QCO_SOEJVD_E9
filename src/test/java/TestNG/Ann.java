package TestNG; // Executed Successfully

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ann {
	WebDriver driver;
	@BeforeMethod
	public void opening()
	{
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
	     driver = new EdgeDriver(); 
		// for maximizing 
		driver.manage().window().maximize();
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// explicit wait
	}

	@AfterMethod
	public void quit()
	{
		driver.close();
	}
	  @Test
	public void facebook(){
		driver.get("https://www.facebook.com/");
		
	}
	  @Test
	  public void amazon ()
	  {
		  driver.get("https://www.amazon.com/");
	  }
	  @Test
	  public void snapdeal()
	  {
		  driver.get("https://www.snapdeal.com/");
	  }
	}

