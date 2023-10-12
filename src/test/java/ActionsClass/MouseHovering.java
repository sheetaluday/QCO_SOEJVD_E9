package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup(); //set the edge driver
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.snapdeal.com/");
		
		//address of sign in 
		WebElement signIn=driver.findElement(By.xpath("//span[text()='Sign In']"));
		//create an object for actions class
		Actions a=new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(3000);
		WebElement Reg=driver.findElement(By.xpath("//span[text()='Register']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Reg);
	}

}
