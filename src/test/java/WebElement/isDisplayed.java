package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplayed {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement emailtf=driver.findElement(By.xpath("//input[@id='email']"));
		if(emailtf.isDisplayed())
		{
			System.out.println("Pass");
			emailtf.sendKeys("fsfdfss");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		
		

	}

}
