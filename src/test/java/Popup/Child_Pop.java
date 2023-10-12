package Popup; // successfully executed

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Pop {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.edgedriver().setup();
		// opens the empty browser
		WebDriver driver = new EdgeDriver(); 
		// for maximizing 
		driver.manage().window().maximize();
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// explicit wait
	//	WebDriverWait wait = new WebDriverWait(driver, 20); 
		// to open the browser 
		driver.get("https://skillrary.com"); 
		String parent=driver.getWindowHandle();
	WebElement gears=driver.findElement(By.xpath("//a[text()=' GEARS ']"));

	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(" arguments[0].scrollIntoView();",gears);
		Thread.sleep(4000);
		js.executeScript("arguments[0].click();", gears);
		WebElement essay=driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]"));
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript(" arguments[0].scrollIntoView();",essay);
			Thread.sleep(4000);
			js1.executeScript("arguments[0].click();", essay);
			Set<String> child=driver.getWindowHandles();
			for(String b:child)
			{
				driver.switchTo().window(b);
			}
			driver.findElement(By.id("mytext")).sendKeys("Sheetal");
			Thread.sleep(4000);
			driver.switchTo().window(parent);
			WebElement cate=driver.findElement(By.xpath("//a[text()='CATEGORIES']"));
			 JavascriptExecutor js2=(JavascriptExecutor)driver;
				js2.executeScript(" arguments[0].scrollIntoView();",cate);
				Thread.sleep(4000);
				js2.executeScript("arguments[0].click();", cate);

	}

}
