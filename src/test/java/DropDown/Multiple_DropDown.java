package DropDown; //control + Shift+ o for import statement

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_DropDown {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("https://demoapp.skillrary.com/"); 
		WebElement dD=driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(dD);
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		Thread.sleep(4000);
        s.selectByValue("199");
        Thread.sleep(4000);
        //s.selectByVisibleText("INR 300 - INR 399  ( 1 )  "); // this will give no such element exception that's right because the developers made a mistake not you 
        Thread.sleep(4000);
        s.deselectByIndex(0);
        s.deselectByValue("199");
       // s.deselectByVisibleText("INR 300 - INR 399  ( 1 )  ");
        List<WebElement>values= s.getAllSelectedOptions();
        for(WebElement b: values)
        {
        	System.out.println(b.getText());
        }
        
        
	}

}
