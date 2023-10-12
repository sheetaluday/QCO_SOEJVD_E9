package WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
		Thread.sleep(3000);
	    List<WebElement>allValues=driver.findElements(By.xpath("//li[@data-view-type='1']"));
	     Thread.sleep(3000);
	     System.out.println(allValues.size());
	     for(WebElement b: allValues) {
	     System.out.println(b.getText());
	     }
		 Thread.sleep(3000);
		 driver.close();
		 }

}
