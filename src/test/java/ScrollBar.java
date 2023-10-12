import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
          //maximizing statement.
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.amazon.in/");
		
		WebElement career= driver.findElement(By.xpath("//a[text()='Careers']"));
		//down casting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(" arguments[0].scrollIntoView();",career);
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", career);
		
		
		
		
		
		
		
		

	}

}
