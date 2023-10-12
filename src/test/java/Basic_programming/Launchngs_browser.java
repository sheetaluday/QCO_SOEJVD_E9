package Basic_programming; // Done with Ma'am

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchngs_browser {

	public static void main(String[] args) throws Throwable
	{
		//edge driver related statement
		WebDriverManager.edgedriver().setup(); //webDrivermanager is setting up edge driver
		//opens the empty edge browser
		WebDriver driver=new EdgeDriver();
	
			Thread.sleep(3000);
		
           //maximizing the window
		driver.manage().window().maximize();
	}

}
