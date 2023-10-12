package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataProviders {
@DataProvider
public Object[][] getData()
{
	Object[] [] a=new Object[3][2];
	a[0][0]="sheetal";
	a[0][1]="Parab";
			a[1][0]="java";
			a[1][1]="Selenium";
					a[2][0]="Qspider";
					a[2][1]="Trainer";
					
					return a;
}
@Test(dataProvider="getData")

public void facebook(String data,String data1
		) {

	 WebDriverManager.edgedriver().setup();
		// opens the empty browser
	  WebDriver driver = new EdgeDriver(); 
		// for maximizing 
		driver.manage().window().maximize();
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://facebook.com/");
		driver.findElement(By.id("email")).sendKeys(data);
		driver.findElement(By.id("password")).sendKeys(data1);
		
}
}
