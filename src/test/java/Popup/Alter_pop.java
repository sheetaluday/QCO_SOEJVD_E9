package Popup;  // successfully executed

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class Alter_pop {

	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		WebElement plus=driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Thread.sleep(3000);
		Actions a= new Actions(driver);
		a.doubleClick(plus).perform();
		WebElement cart=driver.findElement(By.xpath("//button[text()=' Add to Cart']"));
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript(" arguments[0].scrollIntoView();",cart);
		Thread.sleep(4000);
		js2.executeScript("arguments[0].click();", cart);
		
		//handling pop up
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		al.getText();
		//al.accept();
		al.dismiss(); //it cancels the pop up message 

		
	
		
		
		
		
		
		
		
		
		
	}

}
