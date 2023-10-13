package POM_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {  //successfully executed

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
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
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		driver.switchTo().frame("iframeResult");
		WebElement plus=driver.findElement(By.xpath("//button[text()='Try it']"));
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript(" arguments[0].scrollIntoView();",plus);
		Thread.sleep(4000);
		js2.executeScript("arguments[0].click();", plus);
		
	}

}
