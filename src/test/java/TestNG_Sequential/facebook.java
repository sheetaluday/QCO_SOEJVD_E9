package TestNG_Sequential;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
@Test
public void fb() {
	  WebDriverManager.edgedriver().setup();
      WebDriver driver=new EdgeDriver();
      driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com/");
}
}
