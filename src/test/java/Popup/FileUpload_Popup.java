package Popup; // not uploading the resume

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_Popup {

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
		driver.get("https://www.foundit.in/"); 
		WebElement resume=driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(" arguments[0].scrollIntoView();",resume);
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", resume);
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\sheet\\Desktop\\Manual Testing _ sheetal2023\\Resume");
		System.out.println("Done");
	}

}
