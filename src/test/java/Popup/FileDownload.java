package Popup; //success exectuing 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver(); 
		// for maximizing 
		driver.manage().window().maximize();
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		// to open the browser 
		driver.get("https://demoapp.skillrary.com/feedback.php");
		WebElement Invoice= driver.findElement(By.xpath("//input[@name='downloadInvoice']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(" arguments[0].scrollIntoView();",Invoice);
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", Invoice);

	}

}
