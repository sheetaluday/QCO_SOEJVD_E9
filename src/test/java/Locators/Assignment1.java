package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 20);

        driver.get("https://en-gb.facebook.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).submit();
        WebElement Radio=driver.findElement(By.xpath("//label[@class='_58mt']"));
		
     /*   if(Radio.isSelected())
		{
			System.out.println("Pass");
			Radio.click();
		}
		
		else
		{
			System.out.println("Fail");
		}
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
