package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup(); // Fire fox driver
		//opens the edge browser
		WebDriver driver=new EdgeDriver();
          //maximizing statement.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		 
		 
		WebElement element= driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		 element.click();
		 Thread.sleep(5000);
		WebElement FemaleRadio= driver.findElement(By.xpath("//input[@value='1']"));
		 FemaleRadio.click();
		 if(FemaleRadio.isSelected()) {
				System.out.println("pass");
				FemaleRadio.click();
			}
			else
			{
				System.out.println("Fail");
			} 
		
		
		
		

	}

}
