package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathtraversing {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.amazon.co.uk/s?k=phone&crid=19J0N5AJT6M0N&sprefix=phone%2Caps%2C143&ref=nb_sb_noss_1");  
        driver.findElement(By.xpath("//span[text()='Google Pixel 7a and Pixel 30W Charger Bundle – Unlocked Android 5G Smartphone with Wide-Angle Lens and 24-Hour Battery - Snow (Amazon Exclusive)']/../../../../../..//span[@class='a-price-whole']")).click();   
 
		//System.out.println(value.getText());
	}

}
