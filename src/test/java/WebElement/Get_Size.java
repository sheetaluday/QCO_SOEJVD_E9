package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Size {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement emailtf=driver.findElement(By.xpath("//input[@id='email']"));
		Dimension size=emailtf.getSize();
		int h=size.getHeight();
		int w=size.getWidth();
		System.out.println(h+ "="+"Height");
		System.out.println(w+ "="+"Width");

	}

}
