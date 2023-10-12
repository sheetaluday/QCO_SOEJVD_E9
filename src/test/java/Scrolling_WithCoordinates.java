import java.util.concurrent.TimeUnit; //successfully executed

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_WithCoordinates {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
          //maximizing statement.
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.amazon.in/");
		//address of career web element
		WebElement career=driver.findElement(By.xpath("//a[text()='Careers']"));
		Point coOrdinates=career.getLocation();
		int x=coOrdinates.getX();
		int y=coOrdinates.getY();
		
		// Down casting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(" window.scrollBy("+x+","+y+")");
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", career);
		
		
		
		
		
		

	}

}
