package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_singleDd {        // executed successfully

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
		driver.get("https://www.amazon.in/"); 
		WebElement dD=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//handling drop down
		Select s=new Select(dD);
		s.selectByIndex(5);
		Thread.sleep(4000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(4000);
		s.selectByVisibleText("Books");
		System.out.println(s.isMultiple());
		List<WebElement>all =s.getOptions();
		System.out.println(all.size());
		for(WebElement b:all)
		{
			System.out.println(b.getText());
			
		}
		
		
		
		

	}

}
