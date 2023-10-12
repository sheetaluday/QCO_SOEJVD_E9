package Locators;


import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathtraversing2 {

	public static void main(String[] args)  {
		
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			
		    driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			WebDriverWait wait=new WebDriverWait(driver,10);
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("sheetal_t19@yahoo.co.in");
	WebElement Login =driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));   //button[@name='login']"));
			
		//wait.until(ExpectedConditions.elementToBeClickable(login));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Login);
	    // login.click();
			//System.out.println(value.getText());
	}

}
