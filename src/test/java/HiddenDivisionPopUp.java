import java.util.concurrent.TimeUnit; // executed success

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sheet\\eclipse-workspace\\QCO_SOEJVD_E9\\src\\main\\resources\\chromedriver.exe");
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
		driver.get("https://www.redbus.in/"); 
		//address of sign in
		WebElement date=driver.findElement(By.xpath("//span[text()='Date']"));
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript(" arguments[0].scrollIntoView();",date);
		Thread.sleep(4000);
		js2.executeScript("arguments[0].click();", date);
		driver.findElement(By.xpath("//div[text()='Sep']/ancestor::div[@class='sc-jzJRlG dPBSOp']//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw)"));
		
		
		
	
	}

}
//div[text()='Sep']/ancestor::div[@class='sc-jzJRlG dPBSOp']//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw'