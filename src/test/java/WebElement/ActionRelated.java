package WebElement;  //executed successfully
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionRelated {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com");
		WebElement emailtf=driver.findElement(By.xpath("//input[@id='email']"));
		emailtf.sendKeys("afsfs");
		Thread.sleep(10000);
		emailtf.clear();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
       
	}

}
