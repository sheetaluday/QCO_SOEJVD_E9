package Assignments123;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        WebElement webele=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/../../../../../..//span[@class='a-price-whole']"));   
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", webele);
		
		System.out.println(webele.getText());
	}

}
