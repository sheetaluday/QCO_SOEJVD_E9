package WebElement;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Location{

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement emailtf=driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println(emailtf.getAttribute("placeholder"));
		
		//using get location()
		
		   org.openqa.selenium.Point coOrdinates = emailtf.getLocation();
		
		//System.out.println(coOrdinates);
		int x= coOrdinates.getX() ;
	int y= coOrdinates.getY();
	
	System.out.println(x+"="+ "x");
	System.out.println(y+"="+ "y");
		//Check Console for answers
		
		
		
		
		
	}

}
